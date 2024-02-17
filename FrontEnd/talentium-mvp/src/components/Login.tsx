import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { LoginForm } from "../interfaces/LoginForm";

const Login: React.FC = () => {
  const navigate = useNavigate();
  const [loginForm, setLoginForm] = useState<LoginForm>({
    email: "",
    password: "",
  });
  const [error, setError] = useState<string>("");

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setLoginForm({ ...loginForm, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();

    if (!loginForm.email || !loginForm.password) {
      setError("Todos los campos son obligatorios");
      return;
    }
    console.log("formulario enviado", loginForm);
    navigate("/home");
  };

  return (
    <div className="bg-gradient-to-b from-[#4069e4] to-white h-screen flex flex-col items-center justify-center p-4 gap-3">
      <form
        action=""
        className="mx-auto w-60 h-52 bg-sky-500 flex flex-col items-center rounded-xl shadow-slate-900 shadow-lg"
        onSubmit={handleSubmit}
      >
        <label className="flex flex-col items-center justify-center m-3 p-4">
          <h2 className="font-bold">Inicia Sesion</h2>
          <input
            type="email"
            id="email"
            name="email"
            placeholder="email"
            value={loginForm.email}
            onChange={handleInputChange}
            className="w-30 rounded-md m-1 px-2 shadow-inner shadow-black"
          />
          <input
            type="password"
            id="password"
            name="password"
            placeholder="contraseña"
            value={loginForm.password}
            onChange={handleInputChange}
            className="w-30 rounded-md m-1 px-2 shadow-inner shadow-black"
          />
          <button
            type="submit"
            className="bg-sky-950 text-white w-30 rounded-md m-1 px-2 shadow-md shadow-black"
          >
            Entrar
          </button>
        </label>
      </form>
      {error && (
        <p className="text-red-600 font-medium">
          Todos los campos son obligatorios
        </p>
      )}
    </div>
  );
};

export default Login;
