export interface UserProps {
    name: string;
    surname: string;
    mail: string;
    password: string;
    speciality?: Specialities;
}

export interface RegisterFormProps {
    name: string;
    surname: string;
    mail: string;
    password: string;
    speciality?: Specialities;
    userType: UserType;
}

export interface UserTypeSelectorProps {
    onSelectedUserType: (userType: UserType) => void;
}

export enum UserType {
    Customer = 'Cliente',
    Professional = 'Profesional',
}

type Specialities = [
    'Abogado',
    'Plomero',
    'Ingeniero',
    'Jardinero',
    'Electricista'
];
