import axios from "axios";
import type { Usuario } from "../Interfaces/Usuario";

const BACK_URL = import.meta.env.VITE_BACK_URL;

const api = axios.create({
  baseURL: BACK_URL,
  headers: {
    "Content-Type": "application/json",
  },
});

export const getUsuarios = async () => {
  try {
    const response = await api.get("/api/v1/usuario");
    return response.data;
  } catch (error) {
    console.error("Error al obtener los usuarios:", error);
  }
};

export const createUser = async (usuario: Usuario) => {
  try {
    const response = await api.post("/api/v1/usuario/newUser", {
      ...usuario
    });
    if (response) {
      return response.data;
    }
  } catch (error) {
    console.error("Error al crear el usuario:", error);
  }
};
