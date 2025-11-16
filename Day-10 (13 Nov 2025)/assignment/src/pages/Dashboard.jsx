import React from 'react'
import digitCounterImage from '../assets/digital-counter.png'
import digitalWatchImage from '../assets/digital-watch.png'

const Dashboard = () => {
    return (
        <div className="dashboardContainer">
            <h1>Welcome to the Dashboard</h1>

            <article>
                <p>This is the main dashboard page where you can navigate to different sections using the navigation bar above.
                    Use the <strong>Counter</strong> link to access the Counter page and the <strong>Digital Watch</strong> link to view the Digital Watch page.
                    You can log out at any time by clicking the "Logout" button in the navigation bar.</p>


                <div className='imageContainer' >
                    <img src={digitCounterImage} alt="Digital Counter" />
                    <img src={digitalWatchImage} alt="Digital Watch" />
                </div>

            </article>

        </ div>



    )
}

export default Dashboard