import { AppRouter } from "./routers/AppRouter";import Footer from "./screens/Footer";
import Hero from "./screens/Hero";

const App: React.FC = () => {
  return (
    <>
      <AppRouter />

      <div>
        <Hero />
      </div>

      <div>
        <Footer />
      </div>
    </>
  );
};

export default App;
