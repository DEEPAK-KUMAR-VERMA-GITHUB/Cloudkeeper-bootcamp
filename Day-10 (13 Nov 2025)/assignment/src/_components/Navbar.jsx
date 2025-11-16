import { NavLink, useNavigate } from 'react-router-dom';

const Navbar = ({logout}) => {

    const navigate = useNavigate();

    const handleLogout = () => {
        logout();
        navigate('/login', { replace: true });
    }

    const activeStyle = {
        fontWeight: '700',
        color: 'blue',
        textDecoration: 'underline'
    };

  return (
    <nav className="navbar">
      <div className="nav-left">
        <NavLink to="/dashboard/counter" style={({ isActive }) => (isActive ? activeStyle : undefined)}>Counter</NavLink>
        <NavLink to="/dashboard/watch" style={({ isActive }) => (isActive ? activeStyle : undefined)}>Digital Watch</NavLink>
      </div>
      <div className="nav-right">
        <button onClick={handleLogout} className="btn">Logout</button>
      </div>
    </nav>
  )
}

export default Navbar