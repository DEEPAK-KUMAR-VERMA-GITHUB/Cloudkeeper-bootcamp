import React, { useEffect, useState } from 'react'

function formatTime(d) {
  return d.toLocaleTimeString()
}

export default function DigitalWatchPage() {
  const [time, setTime] = useState(() => formatTime(new Date()))

  useEffect(() => {
    const timerInterval = setInterval(() => {
      setTime(formatTime(new Date()))
    }, 1000)
    return () => clearInterval(timerInterval)
  }, [])

  return (
    <div className="digitalWatchPage">
      <h2>Digital Watch</h2>
      <div className="watch">{time}</div>
    </div>
  )
}