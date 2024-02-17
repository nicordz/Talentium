import React from "react";
import { Link, NavLink } from "react-router-dom";

const Navbar: React.FC = () => {
  return (
    <nav className="w-full bg-royal-blue-500 p-4 sticky top-0">
      <div className="flex items-center justify-between text-white font-medium">
        <div>
          <Link className="px-10 text-white text-lg" to="/">
            Logo
          </Link>
        </div>

        <div>
          <NavLink
            className="px-2 py-2 hover:bg-royal-blue-600 rounded-xl hover:text-black transition-colors"
            to="#"
          >
            ¿Quieres contratar?
          </NavLink>

          <NavLink
            className="px-2 py-2 hover:bg-royal-blue-600 rounded-xl hover:text-black transition-colors"
            to="#"
          >
            ¿Quieres ser contratado?
          </NavLink>
        </div>

        <div>
          <NavLink
            className="px-3 py-2 hover:bg-royal-blue-600 rounded-xl hover:text-black transition-colors"
            to="/Login"
          >
            Inicio
          </NavLink>

          <NavLink
            className="px-10 py-2 hover:bg-royal-blue-600 rounded-xl hover:text-black transition-colors"
            to="/Register"
          >
            Registrate
          </NavLink>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
