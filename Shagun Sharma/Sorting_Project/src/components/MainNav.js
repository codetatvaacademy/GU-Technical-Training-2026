import React from 'react';
import { Link, useNavigate } from 'react-router-dom';
import './MainNav.css';

const MainNav = () => {
  let navigate = useNavigate();

  const logoutHandler = () => {
    localStorage.clear();
    navigate('/login');
  };

  return (
    <nav className="main-nav">
      <div className="main-nav__logo">🔷 SortViz</div>
      
      <div className="main-nav__links">
        <Link to="/sorting" className="main-nav__link">Sorting</Link>
        <p className="main-nav__greeting">
          Hello, <strong>{localStorage.getItem('userName') || 'Guest'}</strong>
        </p>
      </div>

      <button className="main-nav__logout" onClick={logoutHandler}>
        Logout
      </button>
    </nav>
  );
};

export default MainNav;
