import { Suspense } from "react";
import { AppRouter } from "./routers/AppRouter";
import LoadingPage from "./screens/LoadingPage"


const App: React.FC = () => {
  return (
    <>
      <Suspense fallback={<LoadingPage/>}>
 <AppRouter />
      </Suspense>
    </>
  );
};

export default App;
