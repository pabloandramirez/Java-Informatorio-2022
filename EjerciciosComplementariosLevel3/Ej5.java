import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import java.util.Map;


public class Ej5 {
    
    public static class Alumno {
        private String nombre;
        private String apellido;
        private LocalDate nacimiento;
        
        public Alumno (String nombre, String apellido, LocalDate nacimiento){
            this.nombre = nombre;
            this.apellido = apellido;
            this.nacimiento = nacimiento;
        }
    
        public String getNombre(){
            return nombre;
        }
    
        public String getApellido(){
            return apellido;
        }
    
        public LocalDate getNacimiento(){
            return nacimiento;
        }

        public static Integer calcularEdad(LocalDate nacimiento){
            LocalDate fechaActual = LocalDate.now();
            Period edadEnAños = Period.between(nacimiento , fechaActual); 
            return edadEnAños.getYears();
        }
        
    }
 public static void main(String[] args) {

        List<Alumno> listaAlumnos = List.of(
            new Alumno("Poncio", "Pilatos", LocalDate.of(1991, 03, 11)),
            new Alumno("Alma", "Espinoza", LocalDate.of(1991, 12, 15)),
            new Alumno("Debora", "Dora", LocalDate.of(1997, 7, 4)),
            new Alumno("Armando", "Barreda", LocalDate.of(1994, 9, 9)),
            new Alumno("Esteban", "Quito", LocalDate.of(1996, 3, 20))
        );

        Map<String, Integer> mapAlumnos = listaAlumnos.stream()
            .collect(Collectors.toMap(alumno -> alumno.getApellido() + " " + alumno.getNombre(),
             alumno -> Alumno.calcularEdad(alumno.getNacimiento())));
        
        System.out.println(mapAlumnos);
    }
        
        
}