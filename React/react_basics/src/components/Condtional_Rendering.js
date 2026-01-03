import { useState } from "react"

const Condtionalrendering=()=>{
    const [isLoggedin,setLoggedin]=useState(false)

    let message;

    if(isLoggedin){
        message= <p>welcome, user</p>
    }
    else{
        message= <p>please login</p>
    }

    function handlelogin(){
        setLoggedin(true)
    }
    return <div>{isLoggedin && <p>welcome, user</p> }<br /> <button onClick={handlelogin}>Login</button> </div>
    
}

export default Condtionalrendering