import React from 'react'
class Employee extends React.Component{

    constructor(props){
        super(props)

        this.state={
            firstname:"eswar",
            lastname:"samy",
            email:"eswar@gmail.com"
        }
    }

    updateEmployee(){
        this.setState({
            firstname:"obito",
            lastname:"Uchiha",
            email:"obito@gmail.com"
     })
    }
    render(){
        return (
            <div>
                <h1>Employee details</h1>
                <p>{this.state.firstname}</p>
                <p>{this.state.lastname}</p>
                <p>{this.state.email}</p>
                <button onClick={()=>this.updateEmployee()}>Update Employee</button>
            </div>
        )
    }
}

export default Employee