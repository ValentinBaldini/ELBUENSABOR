import { BrowserRouter, Route, Router, Routes } from "react-router-dom";
import ClientRoutes from "./ClientRoutes";
import Navbar from "../Components/Clients/Navbar/Navbar";
import AdminRoutes from "./AdminRoutes";

const AppRoutes = () => {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/*" element={<ClientRoutes />} />
        <Route path="/dashboard/*" element={<AdminRoutes />} />
      </Routes>
    </BrowserRouter>
  );
};

export default AppRoutes;
