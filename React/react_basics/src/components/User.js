import { useState } from "react"

const User=()=>{
    //const [firstname,setfirstname]=useState('Eswar')
    //const [lastname,setlastname]=useState('samy')
    //const [email,setemail]=useState('eswar@gamil.com')

    const [user,setuser]=useState(
        {
        firstname:"eswar",
        lastname:"samy",
        email:"eswar@gmail.com"
    }
)

    function updateUser(){
       // setfirstname('obito')
        //setlastname('uchica')
        //setemail('obito@gmail.com')
        setuser({
            firstname:"obito",
            lastname:"uchica",
            email:"uchica@gamil.com"
        })
    }

    return (
        <div>
            <h1>User Details</h1>
            <p>{user.firstname}</p>
            <p>{user.lastname}</p>
            <p>{user.email}</p>
            <button onClick={updateUser}>update User</button>
        </div>
    )
}

export default User