import React from 'react';
import { useSelector, useDispatch } from 'react-redux';


import { useNavigate } from 'react-router-dom';

import NavBar from '../pages/navbar';
import Footer from '../AdminAccess/footer';
import { decreaseQuantity, increaseQuantity, removeFromCart } from '../redux/cartSlice';
import { FaMinusCircle, FaPlusCircle, FaTrash } from 'react-icons/fa';




const Cart = () => {
  
  const navigate = useNavigate()
  const dispatch = useDispatch();
  
  const handleRemoveItem = (itemId, itemName) => {
    
    dispatch(removeFromCart(itemId));
    
    
  };  
  const cartItems = useSelector(state => state
    .cart.foodItem);
  

  const handleIncreaseQuantity = (itemId) => {
    dispatch(increaseQuantity(itemId));
  };
  
  const handleDecreaseQuantity = (itemId) => {
    dispatch(decreaseQuantity(itemId));
  };
  
  
  const totalAmount = cartItems.reduce((acc,foodItem) => {
    return acc + foodItem.price * foodItem.quantity;
  }, 0);
  
  return (
    <div className='main'>
      <NavBar/>
      {cartItems.length === 0 ? (
        <p>Your cart is empty. </p>
      ) : (
        <div>
          <div className='cart-title-container'>
            <h1 className='cart-title primary'>CART</h1>
            
          </div>
          <div className='shadow bg-white cart-table-container'>
           
                {cartItems.map((foodItem) => (
                  <div key={foodItem.id} className="card">
                    <div className="card-img">
                      <img
                        src={foodItem.img}
                        alt={foodItem.foodname}
                        width="180px"
                        height="200px"
                      /></div>
                    <div className="card-info">
                      <p className="text-title">{foodItem.foodname}</p>
                    </div>
                      <span className='d-flex-r'>
                        <button className='data-btn-mini bg-white shadow' onClick={() => handleDecreaseQuantity(foodItem.id)}> <FaMinusCircle /> </button>
                        <h3> {foodItem.quantity}</h3>
                        <button className='data-btn-mini bg-white shadow' onClick={() => handleIncreaseQuantity(foodItem.id)}> <FaPlusCircle /> </button>
                      </span>
                   
                      <button className='data-btn-mini bg-white shadow' onClick={() => handleRemoveItem(foodItem.id, foodItem.name)}><FaTrash color="#ff0000" /></button>
                    </div>
                ))}
            
          </div>
          <br></br>
          <br></br>
          <p className='cart-total'>Total: ₹{totalAmount}</p>
        </div>
      )}


      <Footer />
    </div>
  );
};

export { Cart };