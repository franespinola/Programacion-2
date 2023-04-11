import java.util.HashSet;
import java.util.Set;
import Clases.Empleado;
import Clases.EmpleadoSet;
public class Main {
    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<>();
        empleados.add(new Empleado("Juan", "Perez", 123, 5));
        empleados.add(new Empleado("Maria", "Garcia", 456, 7));
        empleados.add(new Empleado("Pedro", "Gonzalez", 789, 3));
        empleados.add(new Empleado("Julian", "Castillo", 235, 4));
        empleados.add(new Empleado("Julian", "Castillo", 235, 4));

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        Set<EmpleadoSet> empleadosSet = new HashSet<>();

        EmpleadoSet empleadoSet1 = new EmpleadoSet("Juan", "Perez", 123, 5);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("Pedro", "González", 789, 3);
        EmpleadoSet empleadoSet3 = new EmpleadoSet("Pedro", "González", 789, 3);
        EmpleadoSet empleadoSet4 = new EmpleadoSet("Juan", "Perez", 123, 5); // duplicado
        EmpleadoSet empleadoSet5 = new EmpleadoSet("Luis", "Martínez", 456, 4);

        empleadosSet.add(empleadoSet1);
        empleadosSet.add(empleadoSet2);
        empleadosSet.add(empleadoSet3);
        empleadosSet.add(empleadoSet4);
        empleadosSet.add(empleadoSet5);

        System.out.println("\nEmpleadosSet:");
        for (EmpleadoSet empleadoSet : empleadosSet) {
            System.out.println(empleadoSet);

        }
    }

}