import { useState } from 'react';
import { Navigate, Route, Routes } from 'react-router-dom';
import LoginPage from './pages/LoginPage.jsx';

import './App.css';
import ProtectedRoute from './_components/ProtectedRoute.jsx';
import Layout from './pages/Layout.jsx';
import CounterPage from './pages/CounterPage.jsx';
import DigitalWatchPage from './pages/DigitalWatch.jsx';
import NotFound from './pages/NotFound.jsx';
import Dashboard from './pages/Dashboard.jsx';

function App() {
  const checkAuthentication = () => {
    const token = localStorage.getItem('token');
    return token !== null;
  }

  const [isAuthenticated, setIsAuthenticated] = useState(checkAuthentication());
  
  const handleLogin = () => {
    localStorage.setItem('token', 'sample_token');
    setIsAuthenticated(true);
  }
  
  const handleLogout = () => {
    localStorage.removeItem('token');
    setIsAuthenticated(false);
  }
  


  return (

    <Routes>
      
    <Route path='/' element={ <Navigate to="/login" replace /> } />

      <Route 
        path='/login' 
        element={ <LoginPage isAuthenticated={isAuthenticated} onLogin={handleLogin} /> } 
      />

      <Route
        path='/dashboard/*'
        element={
          <ProtectedRoute isAuthenticated={isAuthenticated} >
            <Layout logout={handleLogout} />
          </ProtectedRoute>
        }
      >
        <Route index element={<Dashboard />} />

        <Route path='counter' element={<CounterPage />} />
        <Route path='watch' element={<DigitalWatchPage />} />

        <Route path='*' element={ <NotFound /> } />


      </Route>

      <Route path='*' element={ <NotFound /> } />


    </Routes>
  )
}

export default App

