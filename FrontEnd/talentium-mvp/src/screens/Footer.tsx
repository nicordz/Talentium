import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';

const Footer = () => {
  const currentYear = new Date().getFullYear();
  const [email, setEmail] = useState('');

  useEffect(() => {
    const storageEmail = localStorage.getItem('mail');
    if (storageEmail) {
      setEmail(JSON.parse(storageEmail));
    }
  }, []);


  const handleSubmit = () => {
    setEmail('');
  }

  return (
    <footer className="bg-white/45 text-gray-800 p-4 mt-8">
      <div className="grid grid-cols-2 sm:grid-cols-4 gap-4 pl-4">
        <div>
          <Link to="/">
            <img src="/Logo2.png" alt="" className="w-48 h-auto" />
          </Link>
        </div>
        <div>
          <h4 className="text-lg font-bold mb-2">Links</h4>
          <ul>
            {!email ? (
              <>
                <li>
                  <Link to="/Login">Ingresar</Link>
                </li>
                <li>
                  <Link to="/Register">Registrate</Link>
                </li>
              </>
            ) : (
              <li>
                  <button
                    type="submit"
                    onClick={ handleSubmit}
                  >Cerrar sesión</button>
              </li>
            )}
          </ul>
        </div>
        <div>
          <h4 className="text-lg font-bold mb-2">+Info</h4>
          <ul>
            <li>
              <Link to="/acerca-de">Acerca de</Link>
            </li>
            <li>
              <Link to="/preguntas-frecuentes">Preguntas Frecuentes</Link>
            </li>
            <li>
              <Link to="/terminos-y-condiciones">Términos y condiciones</Link>
            </li>
          </ul>
        </div>
        <div>
          <h4 className="text-lg font-bold mb-2">Contacto</h4>
          <p>Dirección: Calle Pichincha n°1234</p>
          <p>Teléfono: 111-111-1111</p>
          <p>Email: contacto@talentium.com</p>
        </div>
        <div className="col-span-full mt-4 text-right">
          <span className="text-sm font-semibold">
            &copy;{currentYear} No Country - Team C16-84-FT-JAVA.
          </span>
        </div>
      </div>
    </footer>
  );
};

export default Footer;
