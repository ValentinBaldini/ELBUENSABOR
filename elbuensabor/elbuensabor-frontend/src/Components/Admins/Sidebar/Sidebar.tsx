import "./sidebar.css";
import { useNavigate, useLocation } from "react-router-dom";

const Sidebar = () => {
  const navigate = useNavigate();
  const location = useLocation();

  const handleNavigate = (path: string) => {
    navigate(path);
  };

  return (
    <aside className="sidebar-container">
      <div className="admin-sidebar">
        <span className="material-icons">dashboard</span>
        <h3>Administración</h3>
      </div>
      <hr className="hr-sidebar" />
      <div>
        <ul className="ul-sidebar">
          <li
            onClick={() => handleNavigate("/dashboard")}
            className={location.pathname === "/dashboard" ? "active-link" : ""}
          >
            <span className="material-icons">groups</span>Usuarios
          </li>
          <li
            onClick={() => handleNavigate("/dashboard/orders")}
            className={
              location.pathname === "/dashboard/orders" ? "active-link" : ""
            }
          >
            <span className="material-icons">receipt</span>Pedidos
          </li>
          <li
            onClick={() => handleNavigate("/dashboard/products")}
            className={
              location.pathname === "/dashboard/products" ? "active-link" : ""
            }
          >
             <span className="material-icons">fastfood</span>Productos
          </li>
          <li
            onClick={() => handleNavigate("/dashboard/ingredients")}
            className={
              location.pathname === "/dashboard/ingredients"
                ? "active-link"
                : ""
            }
          >
            <span className="material-icons">fastfood</span>Ingredientes
          </li>
          <li
            onClick={() => handleNavigate("/dashboard/categories")}
            className={
              location.pathname === "/dashboard/categories" ? "active-link" : ""
            }
          >
            <span className="material-icons">category</span>Rubros
          </li>
        </ul>
      </div>
    </aside>
  );
};

export default Sidebar;
