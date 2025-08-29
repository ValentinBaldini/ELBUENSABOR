import "./users.css";
import { getUsuarios } from "../../../services/UserServices";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import type { Usuario } from "../../../Interfaces/Usuario";

const Users = () => {
  const navigate = useNavigate();
  const [usuarios, setUsuarios] = useState<Usuario[]>([]);

  useEffect(() => {
    const getUsers = async () => {
      const userData = await getUsuarios();
      if (userData) {
        console.log("users:", userData);
        setUsuarios(userData);
      }
    };

    getUsers();
  }, []);

  return (
    <div className="users-container">
      <div className="div-users">
        <div>
          <div className="header-title">
            <h1>Usuarios</h1>
            <button onClick={() => navigate("/dashboard/addUser")}>
              <span className="material-icons">add</span>Agregar usuario
            </button>
          </div>
          <div className="table-users-container">
            <table>
              <thead>
                <tr>
                  <th>#</th>
                  <th>Nombre</th>
                  <th>Apellido</th>
                  <th>Email</th>
                  <th>Nombre de usuario</th>
                  <th>Rol</th>
                </tr>
              </thead>
              <tbody>
                {usuarios.map((usuario, i) => (
                  <tr key={i}>
                    <td>{i + 1}</td>
                    <td>
                      {usuario.cliente
                        ? usuario.cliente.nombre
                        : usuario.empleado.nombre}
                    </td>
                    <td>
                      {usuario.cliente
                        ? usuario.cliente.apellido
                        : usuario.empleado.apellido}
                    </td>
                    <td>
                      {usuario.cliente
                        ? usuario.cliente.email
                        : usuario.empleado.email}
                    </td>
                    <td>{usuario.username}</td>
                    <td>{usuario.perfil}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Users;
