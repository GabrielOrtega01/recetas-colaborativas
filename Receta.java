public class Receta {
    private String nombre;
    private String ingredientes;
    private String instrucciones; 

    public Receta(String nombre, String ingredientes, String instrucciones) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
    }

    public void mostrarReceta() {
        System.out.println("Receta: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Instrucciones: " + instrucciones);
    }
}
