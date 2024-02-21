import React from "react";
import { Link, NavLink } from "react-router-dom";

const Header: React.FC = () => {
  return (
    <header className=" body-font flex flex-row items-center justify-between">
      <div className="pl-5 pt-2">
        <Link to="/">
          <img src="/Logo2.png" alt="" className="w-36 h-auto" />
        </Link>
      </div>

      <div className="">
        <nav className="">
          <Link
            to=""
            className="px-2 hover:bg-gradient-to-t from-royal-blue-800 rounded-md"
          >
            Cliente
          </Link>
          <Link
            to=""
            className="px-2 hover:bg-gradient-to-t from-royal-blue-800 rounded-md"
          >
            Profesional
          </Link>
        </nav>
      </div>

      <div className="pr-3">
        <NavLink
          to="/Login"
          className="py-1 px-3 focus:outline-none hover:bg-gradient-to-t from-royal-blue-800 rounded-md"
        >
          Ingresar
        </NavLink>
        <NavLink
          to="/Register"
          className="py-1 px-3 focus:outline-none hover:bg-gradient-to-t from-royal-blue-800 rounded-md"
        >
          Registrate
        </NavLink>
      </div>
    </header>
  );
};

export default Header;
