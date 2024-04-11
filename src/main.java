public class main {
    public static void main(String[] args) {
        // TODO: Crear instancias de 'ProductoAlimenticio' y 'ProductoElectronico'
        ProductoAlimenticio a = new ProductoAlimenticio("Manzana Fuji", "Manzanas Fuji frescas y jugosas, importadas de huertos orgánicos", "Frutas", "urlfoto", 2.99, "2024-04-20" );
        ProductoElectronico b = new ProductoElectronico("Laptop Lenovo ThinkPad X1 Carbon","Una laptop ultradelgada y ultraligera con un potente rendimiento, perfecta para profesionales en movimiento. Equipada con procesador Intel Core i7, 16 GB de RAM y SSD de 512 GB.", " Computadoras Portátiles", 1999.00,"URL de la foto", 24 );
        // TODO: Utilizar métodos de las instancias para probar su comportamiento

        a.mostrarDatos();
        System.out.println("----------------------------------------");
        b.mostrarDatos();
    }
}
