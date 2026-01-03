const Student=(props)=>{
    const {firstName,lastname,email}=props


    return (
    <div>
        <h1>Student details</h1>
      {/*  <p>Student first name:{props.student.firstName}</p>
        <p>student last name:{props.student.lastname}</p>
        <p>Student email address:{props.student.email}</p>
        <p>the skills is:{props.data}</p>
        */}
       {/* <p>the skills is:{props.data}</p>*/}
       
        <p>Student first name:{firstName}</p>
        <p>student last name:{lastname}</p>
        <p>Student email address:{email}</p>
       
        </div>
        );
}

export default Student