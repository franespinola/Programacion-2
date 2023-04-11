import Clases.Persona;
import java.util.*;


public class Main {
    public static void main(String[] args) {
       Main main = new Main();
       main.inicio();

    }
    public void inicio(){

        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("María");
        nombres.add("Ana");
        nombres.add("Luisa");

        List<String> apellidos = new ArrayList<>();
        apellidos.add("Juan");
        apellidos.add("Pedro");
        apellidos.add("María");
        apellidos.add("Ana");
        apellidos.add("Luisa");

        List<Persona> personas = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < nombres.size(); i++) {
            int edadAleatoria = random.nextInt(31) + 20; // Genera un número aleatorio entre 20 y 50
            Persona persona = new Persona(nombres.get(i), apellidos.get(i), edadAleatoria);
            personas.add(persona);
        }

        // Imprime las personas en la lista
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        //Para encontrar la persona más grande en términos de edad en la lista de personas,
        //podemos iterar sobre la lista y comparar la edad de cada persona con la edad de la persona más grande
        //conocida hasta ese momento.
        Persona personaMasGrande = null;
        int edadMasGrande = 0;
        for (Persona persona : personas) {
            if (persona.getEdad() > edadMasGrande) {
                edadMasGrande = persona.getEdad();
                personaMasGrande = persona;
            }
        }
        if (personaMasGrande != null) {
            System.out.println("La persona más grande es: " + personaMasGrande);
        }
    }
}

