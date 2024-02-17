//import React, { useState } from "react";
import Footer from "./screens/Footer";
import { AppRouter } from "./routers/AppRouter";

const App: React.FC = () => {
  
  return (
    <>
      <AppRouter />
      
      <div>
        <Footer />
      </div>
    </>
  );
};

export default App;
