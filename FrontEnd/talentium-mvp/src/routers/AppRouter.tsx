import { Routes, Route, BrowserRouter } from "react-router-dom";
import Login from "../components/Login";
import Header from "../screens/Header";
import BasicRegistrationForm from "../components/BasicRegistrationForm";
import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

export const AppRouter: React.FC = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<Header />} />
                <Route path='/Login' element={<Login />} />
                <Route
                    path='/Register'
                    element={
                        <div className='flex bg-gradient-to-b from-royal-blue-500 to-white h-screen justify-center items-center p-4'>
                            <ToastContainer />

                            <BasicRegistrationForm
                                name=''
                                surname=''
                                mail=''
                                password=''
                            />
                        </div>
                    }
                />
            </Routes>
        </BrowserRouter>
    );
};
