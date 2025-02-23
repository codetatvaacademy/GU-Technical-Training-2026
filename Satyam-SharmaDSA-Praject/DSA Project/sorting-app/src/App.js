import React from 'react';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import SortingVisualizer from '../src/components/Sorting';
import './App.css';
import RootLayout from './components/RootLayout';
import Signup from './components/Signup';
import Login from './components/Login';
import {isLogin} from '../src/util/checkAuth'

const router = createBrowserRouter([
  { path: 'login', element: <Login /> },
  {path:'signup',element:<Signup/>},
  {path: '', loader:isLogin, element: <RootLayout />, children: [
      {path: '', element: <SortingVisualizer/>},
      {path: 'sorting', element: <SortingVisualizer/>},
    
  ] },
]);

function App() {
  return (
    <RouterProvider router={router}></RouterProvider>
  );
}

export default App;
