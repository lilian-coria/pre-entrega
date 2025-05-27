package finalproyectoJava;

public class Articulo {
    int id;
    String nombre;
    double precio;

    public Articulo(int idParametro, String nombreParametro, double precioParametro) {
        this.id = idParametro;
        this.nombre = nombreParametro;
        this.precio = precioParametro;
    }
    
    void mostrar() {
    	System.out.println("ID:" + this.id + " | Nombre: " + this.nombre + " | Precio: $" + this.precio );
    }
    
    
    
}



