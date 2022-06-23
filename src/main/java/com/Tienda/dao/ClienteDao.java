/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.dao;

/**
 *
 * @author esteb
 */
import com.Tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
