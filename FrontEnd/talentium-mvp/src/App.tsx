//import React, { useState } from "react";
import Footer from "./screens/Footer";
import { AppRouter } from "./routers/AppRouter";
import Header from "./screens/Header";

const App: React.FC = () => {
  
  return (
    <>
      <AppRouter />

      <div>
        <Header />
      </div>
      
      <div>
        <Footer />
      </div>
    </>
  );
};

export default App;
