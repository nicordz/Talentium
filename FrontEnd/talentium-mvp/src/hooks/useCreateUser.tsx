import { UserProps } from '../interfaces/RegisterFormTypes';

const useCreateUser = () => {
    const createUser = async (userData: UserProps): Promise<boolean> => {
        const url = 'http://localhost:8080/usuarios';

        try {
            const response = await fetch(url, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(userData),
            });

            if (response.ok) {
                return true; // La respuesta de la API fue exitosa
            } else {
                return false; // Hubo un error al introducir los datos
            }
        } catch (error) {
            console.error('Ocurrió un error:', error);
            return false; // Hubo un error al realizar la solicitud
        }
    };

    return { createUser };
};

export default useCreateUser;
