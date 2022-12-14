package org.olmedo.herencia.almacenverduleria;

import org.olmedo.herencia.almacenverduleria.dominio.*;
public class AlmacenVerduleria {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];
        productos[0] = new Fruta(200.00, "amarillo", "naranja", 1200d);
        productos[1] = new Fruta(500.00, "verde", "kiwi", 4000d);
        productos[2] = new Limpieza("destergente", 1.0, "patito", 2300d);
        productos[3] = new Limpieza("lavandina", 2.0, "musculo", 3340d);
        productos[4] = new Lacteo(200, 20, "leche", 1000d);
        productos[5] = new Lacteo(300, 26, "yogurt", 2000d);
        productos[6] = new NoPerecible(190, 14, "lentejas", 2000d);
        productos[7] = new NoPerecible(290, 30, "arverjas", 1500d);

        for(Producto p: productos){
          System.out.println("------------" + p.getClass().getSimpleName() + "-------------------");
          System.out.println("Nombre: " + p.getNombre());
          System.out.println("Precio: " + p.getPrecio());

          if(p instanceof Fruta) {
            System.out.println("Peso: " + ((Fruta) p).getPeso());
            System.out.println("Color: " + ((Fruta) p).getColor());

          } else if(p instanceof Limpieza){
            System.out.println("Componentes: " + ((Limpieza) p).getComponentes());
            System.out.println("Litros: " + ((Limpieza) p).getLitros());
          } else if(p instanceof Lacteo){
            System.out.println("Cantidad: " + ((Lacteo) p).getCantidad());
            System.out.println("Proteinas: " + ((Lacteo) p).getProteinas());
          } else if(p instanceof NoPerecible){
            System.out.println("Contenido: " + ((NoPerecible) p).getContenido());
            System.out.println("Calorias: " + ((NoPerecible) p).getCalorias());
          }
        }


    }
}
