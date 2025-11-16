import { useState } from 'react';

const CounterPage = () => {
  const [count, setCount] = useState(0)

  const handleAdd = () => {
    setCount(prev => prev + 1)
  }

  const handleSubtract = () => {
    setCount(prev => prev - 1)
  }

  const resetCounter = () => {
    setCount(0)
  }

  return (
    <div className="counterPage">
      <h2>Digit Counter</h2>
      <div className="counter">
        <h1 className="countDisplay">{count}</h1>
        <div className="actions">
          <button onClick={handleSubtract} style={{ backgroundColor:'darkcyan' }}>−</button>
          <button onClick={handleAdd} style={{ backgroundColor:'darkgreen' }}>+</button>
          <button onClick={resetCounter} style={{ backgroundColor:'darkred' }}>Reset</button>
        </div>
      </div>
    </div>
  )
}

export default CounterPage;