import { Link } from 'react-router-dom'

export default function NotFound() {
  return (
    <div className="pagenotfound">
      <h2>404 — Page Not Found</h2>
      <p>The page you requested does not exist.</p>
      <Link to="/dashboard" className="btn">Go to Dashboard</Link>
    </div>
  )
}