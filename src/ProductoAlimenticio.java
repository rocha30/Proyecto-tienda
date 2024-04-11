public class ProductoAlimenticio extends Producto{
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String categoria, String Urlfoto, double precio, String fechaCaducidad) {
        super(nombre, descripcion, categoria, Urlfoto, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La fecha de caducidad es: " + fechaCaducidad);
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
