package Clases;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private int aniosTrabajados;

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public static Empleado fromString(String empleadoString) throws EmpleadoFormatException {
        String[] fields = empleadoString.split("\\s*,\\s*");
        String nombre = null;
        String apellido = null;
        String legajo = null;
        int aniosTrabajados = 0;

        for (String field : fields) {
            String[] parts = field.split("\\s*=\\s*");

            if (parts.length != 2) {
                throw new EmpleadoFormatException("Campo invalido: " + field);
            }

            String key = parts[0].toLowerCase();
            String value = parts[1];

            switch (key) {
                case "nombre":
                    if (value.isEmpty()) {
                        throw new EmpleadoFormatException("Nombre vacio");
                    }
                    nombre = value;
                    break;
                case "apellido":
                    if (value.isEmpty()) {
                        throw new EmpleadoFormatException("Apellido vacio");
                    }
                    apellido = value;
                    break;
                case "legajo":
                    if (value.isEmpty()) {
                        throw new EmpleadoFormatException("Legajo vacio");
                    }
                    legajo = value;
                    break;
                case "aniostrabajados":
                    try {
                        aniosTrabajados = Integer.parseInt(value);
                        if (aniosTrabajados <= 0) {
                            throw new EmpleadoFormatException("Anios trabajados no valido: " + value);
                        }
                    } catch (NumberFormatException e) {
                        throw new EmpleadoFormatException("Anios trabajados no valido: " + value);
                    }
                    break;
                default:
                    throw new EmpleadoFormatException("Campo desconocido: " + key);
            }
        }

        if (nombre == null || apellido == null || legajo == null) {
            throw new EmpleadoFormatException("Faltan campos");
        }

        return new Empleado(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", aniosTrabajados=" + aniosTrabajados +
                '}';
    }
}

