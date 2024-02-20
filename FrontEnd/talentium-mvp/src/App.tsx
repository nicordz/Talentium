import { AppRouter } from "./routers/AppRouter";import Footer from "./screens/Footer";
import Header from "./screens/Header";

const App: React.FC = () => {
    return (
        <>
            <AppRouter />

            <Header />

            <Footer />
        </>
    );
};

export default App;
