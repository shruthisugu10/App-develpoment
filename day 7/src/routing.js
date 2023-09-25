import React from "react";
import { Navigate, Route, Routes } from "react-router-dom";
import Login from "./component/pages/login";
import Home from "./component/pages/home";
import Register from "./component/pages/register";
import Sidebar from "./component/AdminAccess/Sidebar";
import UserManagement from "./component/AdminAccess/usermanagement";
import MerchantManagement from "./component/AdminAccess/merchantmanagement";
import Transactions from "./component/AdminAccess/transactions";
import Comments from "./component/AdminAccess/comments";
import DeliveryStatus from "./component/AdminAccess/deliverystatus";
import DeliveryPartner from "./component/AdminAccess/deliverypartner";
import { useUser } from "./component/Context/usercontext";
import AdminManagement from "./component/AdminAccess/adminManagement";
import Dash from "./component/AdminAccess/dash";
import LandingPage from "./component/AdminAccess/Landingpage";
import Privacy from "./component/pages/privacy";
import Terms from "./component/pages/terms";
import Faq from "./component/pages/faq";
import NavBar from "./component/pages/navbar";
import Hotels from "./component/Hotels/Hotels";
import Menu from "./component/Hotels/menu";
import { useAdmin } from "./component/Context/adminContext";
import Settings from "./component/pages/settings";
import { Cart } from "./component/Hotels/cart";
const PrivateRoute = ({ children }) => {
  const { isUserLoggedIn } = useUser();
  return isUserLoggedIn ? children : <Navigate to="/login" replace/>;
};

// const PrivateRoute = ({ children }) => {
  //   const { isUserLoggedIn } = useUser();
  //   const navigate = useNavigate();


//   if (isUserLoggedIn && window.location.pathname === "/login") {
   
  //     navigate("/dash");
//     return null;  
//   }

//   return children;
// };
export default function Routing() {
  const {isUserLoggedIn}=useUser();
  

  return (
    <>
   <div>
       
           
          <Routes>
            <Route path='sidebar' element={<Sidebar/>}>
                <Route path="dash" element={<Dash />}/>
                <Route path="adminmanagement" element={<AdminManagement />} />
                <Route path="merchantmanagement" element={<MerchantManagement />} />
                <Route path="usermanagement" element={<UserManagement />} />
              
                <Route path="transactions" element={<Transactions />} />
                <Route path="comments" element={<Comments />} />
              
                <Route path="deliverystatus" element={<DeliveryStatus />} />
                <Route path="deliverypartner" element={<DeliveryPartner />} />
            </Route>
          </Routes>
   
       
        
    </div>
     <div>
     <Routes>
        <Route exact path="/" element={<Home />} />
        <Route path="login" element={<Login />} />
        <Route path="register" element={<Register />} />
        <Route path="landing" element={<PrivateRoute><LandingPage/></PrivateRoute>}/>
        <Route path="navbar" element={<PrivateRoute><NavBar isLoggedIn={isUserLoggedIn}/></PrivateRoute>}/>
        <Route path="hotel" element={<PrivateRoute><Hotels/></PrivateRoute>}/>
        <Route path="menu/:name" element={<PrivateRoute><Menu/></PrivateRoute>}/>
        <Route path="cart" element={<PrivateRoute><Cart/></PrivateRoute>}/>
        <Route path="privacy" element={<Privacy/>}/>
        <Route path="terms" element={<Terms/>}/>
        <Route path="faq" element={<Faq/>}/>
        <Route path="set" element={<Settings/>}/>
     </Routes>
     </div> 
  
     
  
    </>
  );
}
