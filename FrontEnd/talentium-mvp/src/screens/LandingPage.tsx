import { useEffect, useState } from 'react';
import DashboardCliente from './DashboardCliente';
import Footer from './Footer';
import Header from './Header';
import Hero from './Hero';

const LandingPage = () => {
  const [email, setEmail] = useState('');

  useEffect(() => {
    const storageEmail = localStorage.getItem('mail');
    if (storageEmail) {
      setEmail(JSON.parse(storageEmail));
    }
  }, []);

  return (
    <div className="flex flex-col min-h-screen">
      <Header />
      <main className="flex-grow">
        {!email ? (
          <section className="bg-royal-blue-500 text-white body-font flex-grow">
            <Hero />
            <div className="container mx-auto flex px-5 py-24 md:flex-row flex-col items-center">
              <p> Acá va la info del usuario NO LOGUEADO</p>
            </div>
          </section>
        ) : (
          <>
            <DashboardCliente />
          </>
        )}
      </main>
      <Footer />
    </div>
  );
};

export default LandingPage;
