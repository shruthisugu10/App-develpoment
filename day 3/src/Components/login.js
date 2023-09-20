import React, { useState } from "react"; 
import Lottie from "react-lottie";
import './login.css'
import animationData from './foodbg.json';
import { Link } from "react-router-dom";


export default function Login()
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
        password:''
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

<div>
            <form className="form">
             <h1 className="heading">LOGIN</h1>
                <div><label>Username :</label>
                <input className="inp" type="text" required placeholder="Username" name="username" value={user.username} onChange={handlechange}></input>
                </div>
                <br></br>
                <div><label>Password :</label>
                <input className="inp" type="password" required placeholder="Password" name="password" value={user.password} onChange={handlechange}></input>
                </div>
                <div>
                    <br></br>
                    <br></br>
                    <button type="submit" className="button">Login</button>
                    <br></br>
                    <br></br>
                    <div>
                    Does not have an account? <Link to="/signup" style={{color:'white'}}>Signup</Link></div>
                </div>
            </form>
            </div>
        </div>
    )
}