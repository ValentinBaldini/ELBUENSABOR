package com.elbuensabor.app.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elbuensabor.app.entities.SucursalEmpresa;
import com.elbuensabor.app.services.SucursalEmpresaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/sucursalEmpresa")
public class SucursalEmpresaController extends BaseControllerImpl<SucursalEmpresa, SucursalEmpresaServiceImpl>{
}
