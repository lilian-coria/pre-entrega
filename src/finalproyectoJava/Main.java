package finalproyectoJava;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Articulo> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menu de articulos ---");
            System.out.println("1. Crear articulo");
            System.out.println("2. Listar articulos");
            System.out.println("3. Modificar articulos");
            System.out.println("4. Eliminar articulos");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> crearArticulo();
                case 2 -> listarArticulo();
                case 3 -> modificarArticulo();
                case 4 -> eliminarArticulo();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 5);
    }

    public static void crearArticulo() {
        int id = 0;
        boolean validoId = false;

        while (!validoId) {
            System.out.print("ID: ");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                validoId = true;
            } else {
                System.out.println("Error: Debe ingresar un número válido para el ID");
                sc.next();
            }
        }

        sc.nextLine();
        String nombre = "";
        boolean validoNombre = false;

        while (!validoNombre) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();

            if (!nombre.trim().isEmpty()) {
                validoNombre = true;
            } else {
                System.out.println("Error: El nombre no puede estar vacío");
            }
        }

        double precio = 0;
        boolean validoPrecio = false;

        while (!validoPrecio) {
            System.out.print("Precio: ");
            if (sc.hasNextDouble()) {
                precio = sc.nextDouble();
                if (precio > 0) {
                    validoPrecio = true;
                } else {
                    System.out.println("Error: El precio debe ser mayor a 0");
                }
            } else {
                System.out.println("Error: Debe ingresar un número válido para el precio");
                sc.next();
            }
        }

        Articulo nuevo = new Articulo(id, nombre, precio);
        lista.add(nuevo);
        System.out.println("Articulo agregado");
    }

    public static void listarArticulo() {
        if (lista.isEmpty()) {
            System.out.println("No hay articulos cargados");
        } else {
            for (Articulo articulo : lista) {
                articulo.mostrar();
            }
        }
    }

    public static void modificarArticulo() {
        int id = 0;
        boolean validoId = false;

        while (!validoId) {
            System.out.print("ID del artículo a modificar: ");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                validoId = true;
            } else {
                System.out.println("Error: Debe ingresar un número válido para el ID");
                sc.next();
            }
        }

        for (Articulo a : lista) {
            if (a.getId() == id) {
                sc.nextLine();
                String nuevoNombre = "";
                boolean validoNombre = false;

                while (!validoNombre) {
                    System.out.print("Nuevo nombre: ");
                    nuevoNombre = sc.nextLine();
                    if (!nuevoNombre.trim().isEmpty()) {
                        validoNombre = true;
                    } else {
                        System.out.println("Error: El nombre no puede estar vacío");
                    }
                }
                a.setNombre(nuevoNombre);

                double nuevoPrecio = 0;
                boolean validoPrecio = false;

                while (!validoPrecio) {
                    System.out.print("Nuevo precio: ");
                    if (sc.hasNextDouble()) {
                        nuevoPrecio = sc.nextDouble();
                        if (nuevoPrecio > 0) {
                            validoPrecio = true;
                        } else {
                            System.out.println("Error: El precio debe ser mayor a 0");
                        }
                    } else {
                        System.out.println("Error: Debe ingresar un número válido para el precio");
                        sc.next();
                    }
                }
                a.setPrecio(nuevoPrecio);

                System.out.println("Artículo actualizado exitosamente");
                return;
            }
        }

        System.out.println("Artículo no encontrado");
    }

    public static void eliminarArticulo() {
        System.out.print("ID del articulo a eliminar: ");
        int id = sc.nextInt();
        lista.removeIf(a -> a.getId() == id);
        System.out.println("Artículo eliminado si existía.");
    }
}







