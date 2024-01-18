import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import "./style/Register.css";

const Register = () => {
  const navigate = useNavigate();
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [email, setEmail] = useState("");
  const [phone, setPhone] = useState();
  const [isTeacher, setTeacher] = useState(false);

  const handleRegister = async () => {
    try {
      const response = await axios.post("http://localhost:8080/register", {
        email,
        username,
        phone,
        password,
        isTeacher,
      });

      console.log(response.data);
      toast.success("Registration successful!");

      navigate("/");
    } catch (error) {
      console.error(error);
      toast.error("An unexpected error occurred. Please try again later.");
    }
  };

  return (
    <>
      <div className="parent">
        <div className="left">
          <div className="column-1">
            <img
              className="logo"
              src="assets/2.png"
              alt="Description of the logo"
            />
            <span className="span">
              <h1 className="text">Sign up to </h1>
              <h2 className="text">Our Webpage Quiz project </h2>
              <div className="Paragraphs">
                <p className="div-1">If you already have an account</p>
                <p className="div-2">
                  You can <Link to="/">Login here!</Link>
                </p>
              </div>
            </span>
          </div>
          <div className="column-2">
            <img
              loading="lazy"
              src="assets/1.png"
              className="img"
              alt="Human"
            />
          </div>
        </div>
        <div className="right">
          <h1 className="div-3">Sign up</h1>
          <input
            type="text"
            className="data"
            placeholder="Enter email"
            onChange={(e) => setEmail(e.target.value)}
          />
          <input
            type="text"
            className="data"
            placeholder="Create a username"
            onChange={(e) => setUsername(e.target.value)}
          />
          <input
            type="text"
            className="data"
            placeholder="Phone number"
            onChange={(e) => setPhone(e.target.value)}
          />
          <input
            type="password"
            className="pass"
            placeholder="Password"
            onChange={(e) => setPassword(e.target.value)}
          />
          <div className="teacher-checkbox">
            <label>
              <input
                type="checkbox"
                checked={isTeacher}
                onChange={() => setTeacher(!isTeacher)}
              />
              Are you a teacher?
            </label>
          </div>
          <button className="register" onClick={handleRegister}>
            Register
          </button>
        </div>
      </div>
      <ToastContainer />
    </>
  );
};
export default Register;
