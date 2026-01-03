import { useState } from "react"

const EventHandling=()=>{
   const [count,setcount]= useState(0)

   function handleClick(){
    setcount(count+1);

   }
   function handleReset(){
    setcount(0)
   }
   return (
    <div>
        <h1>Event handling Example</h1>
        <p>count:{count}</p>
        <button onClick={handleClick}>Increment count</button>
        <button onClick={handleReset}>Reset</button>
    </div>
   )
}
export default EventHandling