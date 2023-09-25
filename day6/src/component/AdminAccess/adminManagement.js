import React, { useEffect, useState } from "react"; 

import Lottie from 'react-lottie';
import animationData from '../lottie/log.json';
import { Link, useNavigate } from "react-router-dom";  
import { FaEnvelope, FaPhoneAlt, FaUnlock, FaUserTie } from 'react-icons/fa'
import Popup from "../popup/popup";
import Sidebar from "./Sidebar";

export default function AdminManagement()
{
    const defaultOptions = {
        loop: true,
        autoplay: true,
        animationData: animationData,
        rendererSettings: {
          preserveAspectRatio: "xMidYMid slice"
        }
      };
    
   
    const [admin,setAdmin]=useState({
        email:'admin@gmail.com',
        contactNumber:'34567890987654'
    });
    
    
    return(
        <>
  
        <div className="formbg" style={{padding:'20px 20px 20px 20px'}}>
            <div>
          
           
            </div>
            <div className="lottie">
      <Lottie 
	    options={defaultOptions}
        height={500}
        width={490}
        />
    </div>
      
        </div>
        </>
    )
}