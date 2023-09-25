import React, { useState } from 'react';
import '../css/sidebar.css'
import {
    FaTh,
    FaBars,
    FaShoppingBag,
    FaUserTie,
    FaUsers,
    FaUserShield,
    FaUtensils,
    FaRegHandshake,
    FaMoneyCheckAlt,
    FaChartLine,
    FaComments,
    FaUser,
    FaSignOutAlt
}from "react-icons/fa";
import { NavLink, Outlet } from 'react-router-dom';
import NavBar from '../pages/navbar';
import { useSelector } from 'react-redux';
import Footer from './footer';
import NavAdmin from './navAdmin';

const Sidebar = ({children}) => {
    const[isOpen ,setIsOpen] = useState(true);
    const toggle = () => setIsOpen (!isOpen);
    const menuItem=[
        {
            path:"/sidebar/dash",
            name:"Dashboard",
            icon:<FaTh/>
        },
        {
            path:"/sidebar/adminmanagement",
            name:"Admin Management",
            icon:<FaUserShield/>
        },
        {
            path:"/sidebar/usermanagement",
            name:"User Management",
            icon:<FaUsers/>
        },
        {
            path:"/sidebar/merchantmanagement",
            name:"MerchantManagement",
            icon:<FaUserTie/>
        },
        {
            path:"/sidebar/deliverypartner",
            name:"Delivery Partners",
            icon:<FaShoppingBag/>
        },
        
        {
            path:"/sidebar/transactions",
            name:"Transactions",
            icon:<FaMoneyCheckAlt/>
        },
        
        
        {
            path:"/sidebar/Comments",
            name:"Comments",
            icon:<FaComments/>
        }
    ]
    const user=useSelector((state)=>state.user.user)
    return (
        <>
      
      
                  
        <div className="containered">
           <div style={{width: isOpen ? "300px" : "50px"}} className='sidebar'>
               <div className="top_section">
            {/* <h1><FaUser/></h1> */}
                   <h1 style={{display: isOpen ? "block" : "none"}} className="logo">{user.username}</h1>
                   <div style={{marginLeft: isOpen ? "10px" : "-15px"}} className="bars">
                       <FaBars onClick={toggle}/>
               </div>
               <br></br>
                   </div>
                  
                   <br></br>
               {
                   menuItem.map((item, index)=>(
                       <NavLink to={item.path} key={index} className="link" activeclassName="active">
                           <div className="iconed">{item.icon}</div>
                           <div style={{display: isOpen ? "block" : "none"}} className="link_text">{item.name}</div>
                       </NavLink>
                   ))
               }
               <br>
               </br>
               <br></br>
               <br></br>
              
           </div>
          <main>
              <NavAdmin/>
          <Outlet>
           <div className='child' >
            {children}   </div>
                
           </Outlet>
           </main>
           <Footer/>
        </div>
        </>
    );
};

export default Sidebar;