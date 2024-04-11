import java.awt.*;
import java.security.ProtectionDomain;

public abstract class  Producto {
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private String Urlfoto;


    public Producto (String nombre, String descripcion, String categoria, double precio, String Urfoto ) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.Urlfoto = Urfoto;
    }

    public void mostrarDatos(){
        System.out.println("El artículo es " + nombre );
        System.out.println("La descripción del artículo es: " + descripcion);
        System.out.println("Su categoria es : " + categoria);
        System.out.println("El precio es: "+ precio);
        System.out.println("Foto del artículo:" + Urlfoto);
    }
}
