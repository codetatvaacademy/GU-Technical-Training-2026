import React from 'react';
import './App.css';
import Header from './Components/Header/Header.jsx';
import Foot from './Components/Footer/Foot.jsx';
import Content from './Components/Contents/Content.jsx';
import {DarkModeProvider} from './DarkModeContext.jsx';


function App() {
  return (
    <>
      <Header />
      <Content />
      <Foot />
    </>
  );
}

export default App;
