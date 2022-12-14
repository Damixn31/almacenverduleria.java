package org.olmedo.herencia.almacenverduleria.dominio;

public class Producto {
  // Atributos
  protected String nombre;
  protected double precio;

  // Constructor
  public Producto(String nombre, double precio){
    this.nombre = nombre;
    this.precio = precio;
  }

  // Getter
  public String getNombre(){
    return nombre;
  }
  public Double getPrecio(){
    return precio;
  }

}
