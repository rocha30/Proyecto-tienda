public abstract class  Producto {
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private String Urlfoto;


    public Producto (String nombre, String descripcion, String categoria, String Urlfoto, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.Urlfoto = Urlfoto;
        this.precio = precio;
    }



    public void mostrarDatos(){
        System.out.println("El artículo es " + nombre );
        System.out.println("La descripción del artículo es: " + descripcion);
        System.out.println("Su categoria es : " + categoria);
        System.out.println("El precio es: "+ precio);
        System.out.println("Foto del artículo:" + Urlfoto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return nombre;
    }

    public void setDescripcion(String nombre) {
        this.nombre = nombre;
    }


    public String getCategoria() {
        return nombre;
    }

    public void setCategoria(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUrlfoto() {
        return Urlfoto;
    }

    public void setUrlfoto(String urlfoto) {
        Urlfoto = urlfoto;
    }
}
