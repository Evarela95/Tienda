package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
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
    private ClienteDao clienteDao;

    @GetMapping("/")

    public String inicio2(Model model) {
        log.info("Ahora se usa arquitectura MVC"); // esta linea sirve para desplegar inmformacion en el log de la consola

       /* String mensaje = "Estamos en semana 4";
        model.addAttribute("texto", mensaje);

        Cliente cliente = new Cliente("Jonathan", "Brenes", "jbrenes@gmail.com", "88888");
        model.addAttribute("cliente", cliente);

        Cliente cliente2 = new Cliente("Jon", "BRuno", "jbrenes@gmail.com", "98989");
        Cliente cliente3 = new Cliente("Jony", "BRunu", "jbrkenes@gmail.com", "998989");

        var clientes = Arrays.asList(cliente, cliente2, cliente3);
        // var clientes = Arrays.asList();*/
       
       var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);

        return "index";
    }

}
