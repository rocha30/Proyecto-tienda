public class ProductoElectronico extends Producto{
    private int GarantiaMeses;

    public ProductoElectronico (String nombre, String descripcion, String categoria, double precio, String Urlfoto, int garantiaMeses){
        this.GarantiaMeses = garantiaMeses;

    }
}
