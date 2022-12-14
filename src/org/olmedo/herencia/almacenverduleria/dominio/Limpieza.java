package org.olmedo.herencia.almacenverduleria.dominio;

public class Limpieza extends Producto {
  private String componentes;
  private double litros;

  public Limpieza(String componentes, double litos, String nombre, double precio){
    super(nombre, precio);
    this.componentes = componentes;
    this.litros = litros;
  }

  public String getComponentes(){
    return componentes;
  }
  public double getLitros(){
    return litros;
  }
}
