public class Tareas {

    public static void imprimirTareas() {
        System.out.println("Lista de tareas:");
        System.out.println("- Hacer la compra");
        System.out.println("- Estudiar Java");
        System.out.println("- Sacar al perro");
    }

    public static void agregarTarea(String tarea) {
        System.out.println("Tarea agregada: " + tarea);
    }

    public static void main(String[] args) {
        imprimirTareas();
        agregarTarea("Preparar examen");
    }
}
}