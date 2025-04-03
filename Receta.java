public class Receta {
    private String nombre;
    private String[] ingredientes;
    private String instrucciones;
    
    public Receta(String nombre, String[] ingredientes, String instrucciones) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
    }
    
    public String getNombre() { 
        return nombre; 
    }

    public String[] getIngredientes() { 
        return ingredientes; 
    }

    public String getInstrucciones() { 
        return instrucciones; 
    }

    public void mostrarReceta() {
        System.out.println("\n📌 Receta: " + nombre);
        System.out.println("🍽 Ingredientes: " + String.join(", ", ingredientes));
        System.out.println("📖 Instrucciones: " + instrucciones);
    } // ✅ Se cerró correctamente la llave que faltaba
}

