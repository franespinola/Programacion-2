import Clases.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Juan", "Perez", 1234, 5));
        listaEmpleados.add(new Empleado("María", "González", 5678, 3));
        listaEmpleados.add(new Empleado("Pedro", "García", 9012, 8));
        listaEmpleados.add(new Empleado("Laura", "Rodríguez", 3456, 2));
        listaEmpleados.add(new Empleado("Lucas", "Sánchez", 7890, 4));

        Map<String, Empleado> mapaEmpleados = new HashMap<>();
        for (Empleado empleado : listaEmpleados) {
            String clave = empleado.getApellido() + ", " + empleado.getNombre();
            mapaEmpleados.put(clave, empleado);
        }

        for (Map.Entry<String, Empleado> entrada : mapaEmpleados.entrySet()) {
            String clave = entrada.getKey();
            Empleado empleado = entrada.getValue();
            System.out.println(clave + ": " + empleado.toString());
        }
    }
}