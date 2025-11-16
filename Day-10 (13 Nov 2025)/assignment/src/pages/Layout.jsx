import { Outlet } from "react-router-dom"
import Navbar from "../_components/Navbar"

const Layout = ({ logout }) => {
    return (
        <>
            <Navbar logout={logout} />
            <main className="mainContainer">
                <Outlet />
            </main>
        </>)
}
export default Layout