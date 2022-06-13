import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ej6 {
    private static HashSet<Empleado> empleados = new HashSet<>();
    private static Map<Integer, Integer> sueldos = new HashMap<>();

    private static class Empleado{
        private int dni;
        private String nombre;
        private String apellido;
        private int horasTrabajadas;
        private int valorXHora;

        public Empleado(int dni, String nombre, String apellido, int horasTrabajadas, int valorXHora){
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.horasTrabajadas = horasTrabajadas;
            this.valorXHora = valorXHora;
        }

        public int getDni() {
            return dni;            
        }

        public String getNombre(){
            return nombre;
        }

        public String getApellido(){
            return apellido;
        }

        public int getHorasTrabajadas(){
            return horasTrabajadas;
        }

        public int getValorxHora(){
            return valorXHora;
        }


    }

    public static void main(String[] args) {
        empleados.add(new Empleado(34898748, "Pablo", "Ramirez",48, 1500));
        empleados.add(new Empleado(35874812, "Rocio", "Gonzalez", 45, 2000));
        empleados.add(new Empleado(33147894, "Pedro", "Laguna", 38, 1800));

        for (Empleado i : empleados) {
            int sueldoSemana = i.getHorasTrabajadas() * i.getValorxHora();
            sueldos.put(i.getDni(), sueldoSemana);
            System.out.println("El empleado del DNI " + i.getDni() + " del nombre " + i.getNombre() + " y apellido " + i.getApellido() +
            " tiene un sueldo semanal de " + sueldoSemana);
        }
    }
}

