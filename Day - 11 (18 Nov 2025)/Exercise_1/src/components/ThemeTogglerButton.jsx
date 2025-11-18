import React from 'react'
import { useTheme } from '../context/ThemeProvider';



const ThemeTogglerButton = () => {
    const { theme, toggleTheme } = useTheme();
    const themeTogglerButtonStyles = {
        padding: '10px 20px',
        fontSize: '16px',
        cursor: 'pointer',
        position: 'fixed',
        top: '10px',
        right: '10px',
        backgroundColor: theme === 'light' ? '#333' : '#fff',
        color: theme === 'light' ? '#fff' : '#333',
    };
    return (
        <button onClick={toggleTheme} style={themeTogglerButtonStyles}>
            Switch to {theme === 'light' ? 'dark' : 'light'} mode
        </button>
    );
}
export default ThemeTogglerButton