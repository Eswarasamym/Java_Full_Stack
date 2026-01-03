	package Demo.Controller;
	
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
	
import bean.Student;

@RestController
@RequestMapping("students")
public class StudentController {
		
		//http://localhost:8080/student
				@GetMapping("/student")	
			public ResponseEntity<Student> getStudent(){
					
					Student student=new Student(1, "ramesh", "suresh");
					
					//return new ResponseEntity<>(student,HttpStatus.OK);
					//return ResponseEntity.ok(student);
					return ResponseEntity.ok().header("custom-header", "ramesh").body(student);
					
				}
	/****		public Student getStudent() {
			//Student student=new Student(1, "ramesh", "suresh");
			
			return new Student(1,"Ramesh","suresh");
		}*****/
		
		//http://localhost:8080/students
		@GetMapping
		public List<Student> getStudents(){
			List<Student> students=new ArrayList<Student>();
			students.add(new Student(1,"ramesh","suresh"));
			students.add(new Student(2,"mahesh","dinesh"));
			students.add(new Student(3,"mukesh","ali"));
			students.add(new Student(4,"jinna","mama"));
			
			return students;
			
		}
		//http://localhost:8080/students/1
		//spring boot rest-api with path variable 
		/*@GetMapping("students/{id}")
		public Student studentpathvariable(@PathVariable int id) {
			return new Student(id,"ramesh","suresh");
		}*/
		
		
		@GetMapping("students/{id}/{first-name}/{last-name}")
		
		public ResponseEntity<Student> studentpathvariable(@PathVariable("id") int studentid, @PathVariable("first-name") String firstname,@PathVariable("last-name") String lastname) {
		
			Student student= new Student(studentid,firstname,lastname);
			
			return ResponseEntity.ok(student);
		}
		
		
		/**public Student studentpathvariable(@PathVariable("id") int studentid, @PathVariable("first-name") String firstname,@PathVariable("last-name") String lastname) {
			return new Student(studentid,firstname,lastname);
		}**/
		
		//spring boot rest api with request param 
		//http://localhost:8080/students/query?id=1&firstname=ramesh&lastname=suresh
		
		/**@GetMapping("students/query")
		public Student studentrequest(@RequestParam int id,@RequestParam String firstname,@RequestParam String lastname) {
			
			return new Student(id,firstname,lastname);
		}**/
		
		//Spring  boot rest api with request param 
		//http://localhost:8080/students/query?id=1&firstname=Ramesh&lastname=ramesh
		
		@GetMapping("students/query")
		
		public ResponseEntity<Student> studentRequestVariable(@RequestParam int id, @RequestParam String firstname, @RequestParam String lastname) {
		         
			Student student= new Student(id,firstname,lastname);
			
			return ResponseEntity.ok(student);
		}
		
		//public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstname, @RequestParam String lastname) {
		//	return new Student(id,firstname,lastname);
			
		//}
		
		//spring boot rest api that handles http post request
		//@PostMapping and @RequsetBody
		//@postmapping method is used to  for mapping 
		//http post request onto specfic handler method 
		//http://localhost:8080/students/create
		@PostMapping("students/create")
		//@ResponseStatus(HttpStatus.CREATED)
		public ResponseEntity<Student> createStudent(@RequestBody Student  student) {
			System.out.println(student.getId());
			System.out.println(student.getFirstname());
			System.out.println(student.getFirstname());
			return new ResponseEntity<>(student, HttpStatus.CREATED);
		}
		
		
		
		
		
		/*public Student createStudent(@RequestBody Student  student) {
			System.out.println(student.getId());
			System.out.println(student.getFirstname());
			System.out.println(student.getFirstname());
			return student;
			
		}*/
		
		
		//spring boot rest -api that 
		//handles http put request -updating existing request
		//http://localhost:8080/students/3/update
		@PutMapping("students/{id}/update")
		public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
			System.out.println(student.getFirstname());
			System.out.println(student.getLastname());
			return ResponseEntity.ok(student);
		}
		
		
		/**public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
			System.out.println(student.getFirstname());
			System.out.println(student.getLastname());
			return student;
		}*/
		//http://localhost:8080/students/4/delete
		@DeleteMapping("students/{id}/delete")
		public ResponseEntity<String> deletestudent(@PathVariable("id") int studentId) {
			System.out.println(studentId);
			return ResponseEntity.ok("Student deleted sucvessfully !");
		}
		
		
		
	
	}
