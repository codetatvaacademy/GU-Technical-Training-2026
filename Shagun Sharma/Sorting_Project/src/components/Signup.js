import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import loader from '../assets/loader.gif'
import './Signup.css';

const Signup = () => {

    const [userName, setUserName] = useState('');
    const [password, setPassword] = useState('');
    const [email, setEmail] = useState('');
    const [phone, setPhone] = useState(null);
    const [isLoading, setLoading] = useState(false);
    const [hasError, setHasError] = useState(false);
    const [error, setError]= useState('');

    let navigate = useNavigate();

    const submitHandler = (event) => {
        setLoading(true);
        event.preventDefault();
        axios.post('https://mern-api-peach.vercel.app/user/signup', {
            userName: userName,  // changed here
        password: password,
        email: email,
        phone: phone
        }).then(res => {
            setLoading(false);
            console.log(res.data);
            navigate('/login');
        }).catch(err => {
            setLoading(false);
            setHasError(true);
            setError(err.response.data.message);
            console.log(err);
        })
    }


  return (
      <>
          {isLoading && <div>
              <img alt={'hello'}  style={{width:'150px'}} src={loader}/>
          </div>}
          {!isLoading  && <div className="signup-container">
          <h1 className='titles'>Create Account</h1>
          <form onSubmit={submitHandler} className='signup-form'>
              <input type='text' placeholder='username' onChange={(e)=>setUserName(e.target.value)} />
              <br />
              <input type='password' placeholder='password' onChange={(e)=>setPassword(e.target.value)} />
              <br />
              <input type='text' autoComplete='off' placeholder='email' onChange={(e)=>setEmail(e.target.value)} />
              <br />
              <input type='number' placeholder='phone' onChange={(e)=>setPhone(e.target.value)} />
              <br />
                <button type='submit'>Submit</button>
              
          </form>
          </div>}
          {hasError && <div>
              <p style={{color:'red'}}>Error:- {error}</p>
          </div>}
      </>
  )
}

export default Signup
