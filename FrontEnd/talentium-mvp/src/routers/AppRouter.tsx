import React, { useState } from "react";
import { Routes, Route, BrowserRouter } from "react-router-dom";
import Login from "../components/Login";
import Navbar from "../screens/Navbar";
import UserTypeSelector from "../components/UserTypeSelector";
import RegisterForm from "../components/RegisterForm";
import { UserType } from "../interfaces/RegisterFormTypes";
import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

export const AppRouter: React.FC = () => {
  const [userType, setUserType] = useState<UserType | null>(null);

  const handleSelectedUserType = (SelectedUserType: UserType) => {
    setUserType(SelectedUserType);
  };

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Navbar />} />
        <Route path="/Login" element={<Login />} />
        <Route
          path="/Register"
          element={
            <div className="flex bg-gradient-to-b from-[#4069E4] to-white h-screen justify-center items-center p-4">
              <ToastContainer />
              {userType === null ? (
                <UserTypeSelector onSelectedUserType={handleSelectedUserType} />
              ) : (
                <RegisterForm
                  userType={userType}
                  name=""
                  surname=""
                  mail=""
                  password=""
                />
              )}
            </div>
          }
        />
      </Routes>
    </BrowserRouter>
  );
};
