import { useState } from "react";
import "./navbar.css";
import { Link } from "react-router-dom";

const Navbar = () => {
  const [isLogin, setIsLogin] = useState(true);
  const [userRole, setUserRole] = useState("admin");

  return (
    <nav className="navbar-container">
      <div className="layout-navbar">
        <div className="navbar-title-container">
          <Link to="/" className="navbar-title-link">
            <span className="material-icons">local_pizza</span>
            <h3 className="navbar-title">El Buen Sabor</h3>
          </Link>
        </div>
        <div className="navbar-auth-container">
          {isLogin ? (
            <>
              {userRole === "admin" ? (
                <div>
                  <Link to="/dashboard" className="navbar-title-link">
                    <span className="material-icons">dashboard</span>
                    <p>Administración</p>
                  </Link>
                </div>
              ) : (
                <div className="cart-container">
                  <button className="cart-btn">
                    <span className="material-icons">shopping_cart</span>Carrito
                  </button>
                </div>
              )}

              <button className="button-account">
                <span className="material-icons account-icon">
                  account_circle
                </span>
                <p>Usuario</p>
                <span className="material-icons">arrow_drop_down</span>
              </button>
            </>
          ) : (
            <button className="auth-btn-nav">Iniciar sesión</button>
          )}
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
