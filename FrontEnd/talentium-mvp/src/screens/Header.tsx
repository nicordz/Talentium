const Header: React.FC = () => {
  return (
    <header className="w-full h-96 bg-gradient-to-b from-royal-blue-500 flex flex-col items-start justify-center z-10">
      <div className="grid max-w-screen-xl px-4 py-8 mx-auto lg:gap-8 xl:gap-0 lg:py-16 lg:grid-cols-3">
        <h1 className="max-w-2xl mb-4 text-4xl font-extrabold tracking-tight leading-none md:text-5xl xl:text-6xl dark:text-black">
          ¡Descubre, contrata y compra!
        </h1>
        <p className="max-w-2xl mb-6 font-light text-black lg:mb-8 md:text-lg lg:text-xl dark:text-black">
          Tu centro para seervicios de confianza.
        </p>
        <div className="-z-20 w-full h-auto">
          <img src="/Banner.png" alt="Banner" />
        </div>
      </div>
    </header>
  );
};

export default Header;
