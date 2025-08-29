import { Route, Routes } from "react-router-dom";
import Sidebar from "../Components/Admins/Sidebar/Sidebar";
import Users from "../Components/Admins/Users/Users";
import Orders from "../Components/Admins/Orders/Orders";
import Products from "../Components/Admins/Products/Products";
import AddUser from "../Components/Admins/Users/AddUser";

const AdminRoutes = () => {
  return (
    <>
      <Sidebar />
      <Routes>
        <Route path="" element={<Users />} />
        <Route path="/addUser" element={<AddUser />} />
        <Route path="orders" element={<Orders />} />
        <Route path="products" element={<Products />} />
        <Route path="ingredients" element={<Orders />} />
        <Route path="categories" element={<Orders />} />
      </Routes>
    </>
  );
};

export default AdminRoutes;
