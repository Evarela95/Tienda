package com.Tienda.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    private Long idArticulo;
    private String detalle;
    private String descripcion;
    private boolean activo;
    private double precio;
    private double existencias;

    public Articulo() {
    }

    public Articulo(Long idCategoria, String detalle, String descripcion, boolean activo, double precio, double existencias) {
        this.idCategoria = idCategoria;
        this.detalle = detalle;
        this.descripcion = descripcion;
        this.activo = activo;
        this.precio = precio;
        this.existencias = existencias;
    }

  

}
