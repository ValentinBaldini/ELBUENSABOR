import type { Cliente } from "./Cliente";
import type { Empleado } from "./Empleado";
import type { Rol } from "./Rol";

export interface Usuario {
  nombre: string;
  apellido: string;
  telefono: string;
  email: string;
  username: string;
  password: string;
  perfil: Rol;
  cliente: Cliente,
  empleado: Empleado
}
