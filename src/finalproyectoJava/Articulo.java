package finalproyectoJava;

public class Articulo {
    private int id;
    private String nombre;
    private double precio;

    public Articulo(int idParametro, String nombreParametro, double precioParametro) {
        this.id = idParametro;
        this.nombre = nombreParametro;
        this.precio = precioParametro;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio);
    }
}
