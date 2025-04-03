import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorRecetas gestor = new GestorRecetas();
        
        try (Scanner scanner = new Scanner(System.in)) { // 🔹 Scanner se cerrará automáticamente
            System.out.println("Ingrese el nombre de la receta:");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese los ingredientes (separados por coma):");
            String[] ingredientes = scanner.nextLine().split("\\s*,\\s*"); // 🔹 Elimina espacios extra

            System.out.println("Ingrese las instrucciones:");
            String instrucciones = scanner.nextLine();
            
            Receta nuevaReceta = new Receta(nombre, ingredientes, instrucciones);
            gestor.agregarReceta(nuevaReceta);
            
            System.out.println("Receta agregada: " + nuevaReceta.getNombre());

            // 🔹 Se muestra la receta completa
            nuevaReceta.mostrarReceta(); 
        } // 🔹 Aquí el Scanner se cierra automáticamente
    }
}
