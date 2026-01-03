import logo from './logo.svg';
import './App.css';
import Welcome from './components/welcome';
import Greetings from './components/Greeting';
import {FirstComponents as FC, SecondComponents as SC} from './components/Mycomponents'
import Mycomponent from './components/Mycomponents';
import Helloworld from './components/Helloworld';
import Student from './components/student';
import Employee from './components/Empolyee';
import User from './components/User';
import EventHandling from './components/EventHandling';
import Condtionalrendering from './components/Condtional_Rendering';

function App() {

 /* const student={ //object creation
    firstName :"Itachi",
    lastname:"Uchiha",
    email:'itachi@gmail.com'
  }*/

    //array creation

    //const skills=['HTML','CSS','JS'];
    

  return (
    <div className="App">
     {/* <Welcome name="Eswar"/>
      <Welcome name="samy"/>
      <h1>Hello world</h1>
      <Greetings name="eswar"/>
      <Greetings name="samy"/>
      <FC/>
      <SC />
      <Mycomponent/>
      <Helloworld />
      <Student
      student={student}
      />
      <Student
        data={skills}
      /> 
       <Student
      firstname="samy" 
      lastname="eswar"
      email="rsamy@gmail.com"
      />
      <Employee />
      <User />
      <EventHandling />*/}
      <Condtionalrendering />

    </div>
  );
}

export default App;
