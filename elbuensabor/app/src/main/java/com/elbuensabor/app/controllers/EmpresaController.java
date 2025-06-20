package com.elbuensabor.app.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elbuensabor.app.entities.Empresa;
import com.elbuensabor.app.services.EmpresaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/empresa")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{
}
