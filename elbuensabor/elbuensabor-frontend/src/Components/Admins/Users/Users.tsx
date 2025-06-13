import "./users.css";

const Users = () => {
  return (
    <div className="users-container">
      <div className="div-users">
        <div>
          <div>
            <h1>Usuarios</h1>
          </div>
          <div className="table-users-container">
            <table>
              <thead>
                <th>#</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Nombre de usuario</th>
                <th>Rol</th>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>Valentin</td>
                  <td>Baldini</td>
                  <td>valentinbaldini28@gmail.com</td>
                  <td>balem20</td>
                  <td>Admin</td>
                </tr>
                <tr>
                  <td>1</td>
                  <td>Valentin</td>
                  <td>Baldini</td>
                  <td>valentinbaldini28@gmail.com</td>
                  <td>balem20</td>
                  <td>Admin</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Users;
