import { Navigate, useNavigate } from "react-router-dom";

const LoginPage = ({ isAuthenticated, onLogin }) => {

  const navigate = useNavigate();

  function handleLoginClick() {
    onLogin();
    navigate('/dashboard', { replace: true });
  }

  return isAuthenticated ? (
    <Navigate to="/dashboard" replace />
  ) : (
    <div className='loginContainer' >
      <h1>Login Page</h1>
      <button onClick={handleLoginClick}>Login</button>
    </div>
  )
}

export default LoginPage