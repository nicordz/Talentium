const Footer = () => {
  return (
    <footer className="bg-white/45 p-4 mt-8 rounded-lg shadow-lg">
      <div className="grid grid-cols-2 sm:grid-cols-4 gap-4 pl-4">
        <div>
          <h4 className="text-lg font-bold mb-2">Links</h4>
          <ul className="text-gray-500">
            <li>
              <a href="#">LogIn</a>
            </li>
            <li>
              <a href="#">Registrate como Cliente</a>
            </li>
            <li>
              <a href="#">Registrate como Profesional</a>
            </li>
            <li>
              <a href="#">Comprar</a>
            </li>
          </ul>
        </div>
        <div>
          <h4 className="text-lg font-bold mb-2">Profesionales</h4>
          <ul className="text-gray-500">
            <li>
              <a href="#">Abogados</a>
            </li>
            <li>
              <a href="#">Plomeros</a>
            </li>
            <li>
              <a href="#">Electricistas</a>
            </li>
            <li>
              <a href="#">Buscar más...</a>
            </li>
          </ul>
        </div>
        <div>
          <h4 className="text-lg font-bold mb-2">+Info</h4>
          <ul className="text-gray-500">
            <li>
              <a href="#">Blog</a>
            </li>
            <li>
              <a href="#">Guía de usuario</a>
            </li>
            <li>
              <a href="#">FAQ</a>
            </li>
          </ul>
        </div>
        <div>
          <h4 className="text-lg font-bold mb-2">Contacto</h4>
          <p className="text-gray-500">Dirección: Calle Pichincha n°1234</p>
          <p className="text-gray-500">Teléfono: 111-111-1111</p>
          <p className="text-gray-500">Email: contacto@talentium.com</p>
        </div>
      </div>
    </footer>
  );
};

export default Footer;
