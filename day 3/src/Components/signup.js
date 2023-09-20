import React, { useState } from "react"; 
import Lottie from "react-lottie";
import animationData from './foodbg.json';
import { Link } from "react-router-dom";

export default function Signup()
{
    const defaultOptions = {
        loop: true, 
        autoplay: true,
        animationData: animationData,
        rendererSettings: {
          preserveAspectRatio: "xMidYMid slice"
        }
      };

    const [user,setUser]=useState({
        username:'',
        password:'',
        Email:''
    });
    const handlechange=(e)=>{
        setUser({
            ...user,[e.target.name]:e.target.value
        });
    }
    
    return(

        <div className="formbg">
            
<div className="bg">
      <Lottie 
        options={defaultOptions}
        height={605}
        width={600}
      />
    </div>


            <form className="form">
             <center>  <h1 className="heading">SIGNUP</h1></center>
                <div><label>username:</label>
                <input className="inp" type="text" required placeholder=" username" name="username" value={user.username} onChange={handlechange}></input></div>
                <br></br>
                <div><label>Email: &emsp; </label>
                <input className="inp" type="Email" required placeholder=" email" name="password" value={user.Email} onChange={handlechange}></input>
                </div>
                <br></br>
                <div><label>password:</label>
                <input className="inp" type="password" required placeholder=" password" name="password" value={user.password} onChange={handlechange}></input></div>
                <div>
                    <br></br>
                    <button type="submit" className="button">Singup</button>
                    <br></br>
                    <br></br>
                    <div>
                    Already have an account <Link to="/" style={{color:'white'}}>Login</Link></div>
                </div>
            </form>
        </div>
    )
}