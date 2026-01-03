import React, { createElement } from "react"

const Helloworld=()=>{
    //const myElement=<h1>Hello World</h1>
   // return React.createElement('div',null,createElement('h1',null,'Hello World'))

   const name="eswar"
   const addtion=2+2;

   function handleClick(){
    alert("button clicked")
    
   }
   return <div><h1 className="title">Title</h1><h2>Sub title</h2><p>Paragraph</p><p>{name}</p><p>{addtion}</p><button onClick={handleClick}>click</button></div>;
    

}
export default Helloworld