import React from "react";


const ThemeContext = React.createContext('light');

const ThemeProvider = ({ children }) => {
  const [theme, setTheme] = React.useState('light');
  
  const toggleTheme = () => {
    setTheme((prevTheme) => (prevTheme === 'light' ? 'dark' : 'light'));
  };

  return (
    <ThemeContext.Provider value={{ theme, toggleTheme }}>
      {children}
    </ThemeContext.Provider>
  );
}




export const useTheme = () => React.useContext(ThemeContext);

export default ThemeProvider;