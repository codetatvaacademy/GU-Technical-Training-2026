import axios from 'axios';
import React, { useState } from 'react'
import {Link, useNavigate } from 'react-router-dom';
import loader from '../assets/loader.gif'
import './Login.css';

const Login = () => {
    const [userName, setUserName] = useState('');
    const [password, setPassword] = useState('');
    const [isLoading, setLoading] = useState(false);
    const [hasError, setHasError] = useState(false);
    const [error, setError]= useState('');

    let navigate = useNavigate();

    const submitHandler = (event) => {
        setLoading(true);
        event.preventDefault();
        axios.post('https://mern-api-peach.vercel.app/user/login', {
            userName: userName,
            password: password
        }).then(res => {
            setLoading(false);
            localStorage.setItem('token', res.data.token);
            localStorage.setItem('userName', res.data.userName);
            console.log(res.data);
            navigate('/sorting');
        }).catch(err => {
            setLoading(false);
            setHasError(true);
            setError(err.response.data.message);
            console.log(err);
        })
    }


  return (
      <>
          {isLoading && <div className="login-container">
              <img alt={'hello'}  style={{width:'150px'}} src={loader}/>
          </div>}
          {!isLoading  && <div className='settings'>
          <h1 className='heading'>Login Account</h1>
          <form className="login-form" onSubmit={submitHandler}>
              <input type='text' placeholder='username' onChange={(e)=>setUserName(e.target.value)} />
              <br />
              <input type='password' placeholder='password' onChange={(e)=>setPassword(e.target.value)} />
              <br />
                <button type='submit'>Submit</button>
              
              </form>
              <p className="no-account">
            Don't have an account? <Link to="/signup">Sign Up</Link>
          </p>
          </div>}
          {hasError && <div>
              <p style={{color:'red'}} className="error-message">Error:- {error}</p>
          </div>}
      </>
  )
}

export default Login
