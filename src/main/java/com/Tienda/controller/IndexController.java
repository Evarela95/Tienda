package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import com.Tienda.service.ArticuloService;
import com.Tienda.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@Slf4j   //PARA HACER REGISTROS DE BITACORA EN EL LOG de la consola
public class IndexController {

     @Autowired
    private ArticuloService articuloService;
     
     public String inicioIndex(Model model) {

        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);

        return "index";
    }
}
