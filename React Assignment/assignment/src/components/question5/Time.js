import React, { useState } from "react";
import "./Style.css";

const Time = () => {
  let time = new Date().toLocaleTimeString();
  let date = new Date().toLocaleDateString();

  const [ctime, setTime] = useState(time);
  const [showdate, setShowdate] = useState(true);

  const updateTime = () => {
    let time = new Date().toLocaleTimeString();

    setTime(time);
  };

  setInterval(updateTime, 1000);

  return (
    <div className="main">
      <form className="basic">
        <h2 className="message">Digital Clock</h2>

        <label className="switch">
          <input type="checkbox" onClick={() => setShowdate(!showdate)} />
          <span className="slider round"></span>
        </label>
        <div className="time-container">
          <h1 className="time">{ctime}</h1>
          <h3 className="date" hidden={showdate}>
            {date}
          </h3>
        </div>
      </form>
    </div>
  );
};

export default Time;
