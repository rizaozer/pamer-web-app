import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import "./index.css";

const LoginPage = ({setLoggedIn}) => {

  const navigate = useNavigate();
  const [username, setUsername] = useState("");
  const [passwordValue, setPasswordValue] = useState("");
  const [action, setAction] = useState("Login");
  const [errorMessage, setErrorMessage] = useState("");

  const handleLogin = () => {
    if (username.trim() === "" || passwordValue.trim() === "") {
      setErrorMessage("Username and Password are required.");
    } else if (username === "riza" && passwordValue === "123") {
      setLoggedIn(true);
      navigate('/team');
    } else {
      setErrorMessage("Wrong Username or Password.");
    }
    
  };

  return (
    <div className="container">
      <div className="left-section">
        <h1>PAMER</h1>
        <p>Pharmacy Authorized Medication Reminder</p>
        <button className="book-appointment-btn">BOOK A DEMO</button>
      </div>

      <div className="right-section">
        <h2>PAMER</h2>
        <p>Login</p>
        {errorMessage && <div className="error-message">{errorMessage}</div>}
        <input placeholder="Username" className="input-field" 
        required
        value={username}
        onChange={(e) => setUsername(e.target.value)}
        />
        <input placeholder="Password" type="password" className="input-field" 
        value={passwordValue}
        onChange={(e) => setPasswordValue(e.target.value)}/>
        <div className="bottom-section">
          <a href="#" className="forgot-password">
            Forgot your password?
          </a>
        </div>
        <br />
        <button 
        className="login-btn"
        onClick={handleLogin}
        >LOGIN</button>
      </div>
    </div>
  );
}

export default LoginPage;
