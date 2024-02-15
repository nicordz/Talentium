const Header = () => {
  return (
    <div className="bg-sky-800 flex items-center justify-between text-white">
      <div className="px-10 text-white text-lg">
        <a href="#">Logo</a>
      </div>
      <ul className="flex flex-row justify-center p-4">
        <li className="px-2 py-2 hover:bg-sky-400 rounded-xl hover:text-black transition-colors">
          <a href="">¿Quieres contratar?</a> 
        </li>
        <li className="px-2 py-2 hover:bg-sky-400 rounded-xl hover:text-black transition-colors">
           <a href="">¿Quieres ser contratado?</a>
        </li>
      </ul>
      <ul className="flex flex-row justify-end">
        <li className="px-3 py-2 hover:bg-sky-400 rounded-xl hover:text-black transition-colors">
          <a href="./Login.tsx">Inicio</a>
        </li>
        <li className="px-10 py-2 hover:bg-sky-400 rounded-xl hover:text-black transition-colors">
          <a href="">Registrate</a> 
        </li>
      </ul>
    </div>
  );
};

export default Header;
