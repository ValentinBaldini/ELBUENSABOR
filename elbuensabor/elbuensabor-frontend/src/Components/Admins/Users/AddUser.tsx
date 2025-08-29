import { useState } from "react";
import type { Usuario } from "../../../Interfaces/Usuario";
import { createUser } from "../../../services/UserServices";

const AddUser = () => {
  const [usuario, setUsuario] = useState<Usuario>({
    nombre: "",
    apellido: "",
    telefono: "",
    email: "",
    username: "",
    password: "",
    perfil: "CLIENTE",
    cliente: {
      nombre: "",
      apellido: "",
      telefono: "",
      email: ""
    },
    empleado: {
      nombre: "",
      apellido: "",
      telefono: "",
      email: ""
    }
  });

  const handleChange = (
    e: React.ChangeEvent<HTMLInputElement | HTMLSelectElement>
  ) => {
    const { name, value } = e.target;

    setUsuario((prevUsuario) => ({
      ...prevUsuario,
      [name]: value,
    }));
  };

  const handleSubmit = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    await enviarDatos(usuario);
  };

  const enviarDatos = async (usuario: Usuario) => {
    try {
      console.log("Usuario a enviar:", usuario);
      const newUser = await createUser(usuario);
      if (newUser) {
        console.log("Nuevo usuario creado:", newUser);
      }
    } catch (error) {
      console.error("Error al crear el usuario:", error);
    }
  };

  return (
    <div className="users-container">
      <div className="div-users">
        <div>
          <div className="header-title">
            <h1>Crear usuario</h1>
          </div>
          <div className="form-users-container">
            <form onSubmit={handleSubmit} className="form-add-user">
              <div>
                <label htmlFor="perfil">Rol</label>
                <select
                  name="perfil"
                  id="perfil"
                  value={usuario.perfil}
                  onChange={handleChange}
                >
                  <option value="">Selecciona un rol</option>
                  <option value="CLIENTE">Cliente</option>
                  <option value="CAJERO">Cajero</option>
                  <option value="COCINERO">Cocinero</option>
                  <option value="DELIVERY">Delivery</option>
                </select>
              </div>
              <div>
                <label htmlFor="nombre">Nombre</label>
                <input
                  type="text"
                  name="nombre"
                  id="nombre"
                  value={usuario.nombre}
                  onChange={handleChange}
                />
              </div>

              <div>
                <label htmlFor="apellido">Apellido</label>
                <input
                  type="text"
                  name="apellido"
                  id="apellido"
                  value={usuario.apellido}
                  onChange={handleChange}
                />
              </div>
              <div>
                <label htmlFor="email">Email</label>
                <input
                  type="email"
                  name="email"
                  id="email"
                  value={usuario.email}
                  onChange={handleChange}
                />
              </div>
              <div>
                <label htmlFor="telefono">Teléfono</label>
                <input
                  type="number"
                  name="telefono"
                  id="telefono"
                  value={usuario.telefono}
                  onChange={handleChange}
                />
              </div>
              <div>
                <label htmlFor="username">Nombre de usuario</label>
                <input
                  type="text"
                  name="username"
                  id="username"
                  value={usuario.username}
                  onChange={handleChange}
                />
              </div>
              <div>
                <label htmlFor="password">Contraseña</label>
                <input
                  type="password"
                  name="password"
                  id="password"
                  value={usuario.password}
                  onChange={handleChange}
                />
              </div>
              <input type="submit" value="Crear usuario" />
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AddUser;
