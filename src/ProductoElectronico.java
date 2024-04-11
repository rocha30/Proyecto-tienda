public class ProductoElectronico extends Producto{
    private int GarantiaMeses;

    public ProductoElectronico (String nombre, String descripcion, String categoria, double precio, String Urlfoto, int garantiaMeses){
        super(nombre, descripcion, categoria, Urlfoto, precio);
        this.GarantiaMeses = garantiaMeses;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El producto tiene:" + GarantiaMeses + "meses de garantía. ");

    }
}
