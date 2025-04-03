public class Receta {
    private String nombre;
    private String ingredientes;

    public Receta(String nombre, String ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public void mostrarReceta() {
        System.out.println("Receta: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
    }
}
