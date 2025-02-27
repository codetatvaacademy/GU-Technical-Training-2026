import './header.css'
import React, { useState } from 'react';
import '../button.css'; 

function Header(){
    const [isDarkMode, setIsDarkMode] = useState(false);

    const toggleMode=()=>{
        setIsDarkMode(!isDarkMode);
        if (!isDarkMode) {
            document.body.classList.add('dark-mode');
        } else {
            document.body.classList.remove('dark-mode');
        }
    };

    return (
        <header className={isDarkMode ? 'dark' : 'light'}>
            <h1>Sorting Visualizer</h1>
            <button onClick={toggleMode}>
             {isDarkMode ? 'Light Mode' : 'Dark Mode'}
            </button>
        </header>
    );
}

export default Header