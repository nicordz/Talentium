import React, { useState } from 'react';
import RegisterForm from './components/RegisterForm';
import Footer from './components/common/Footer';
import UserTypeSelector from './components/UserTypeSelector';
import { UserType } from './interfaces/RegisterFormTypes';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

const App: React.FC = () => {
    const [userType, setUserType] = useState<UserType | null>(null);

    const handleSelectedUserType = (SelectedUserType: UserType) => {
        setUserType(SelectedUserType);
    };

  return (
    <div>
      <div className="flex bg-gradient-to-b from-sky-600 to-white h-screen justify-center items-center p-4">
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
      <div>
        <Footer />
      </div>
    </div>
  );
};

export default App;
