
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;

public class ManejoArrayList3 {
    public static void main(String[] args) {

        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        Calificacion c1 = new Calificacion(7.5,"Programacion"); 
        Calificacion c2 = new Calificacion(8.3,"matematicas");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        
        System.out.println("-----------------------------");
        
        // ArrayList
        //ArrayList <Calificacion> profesores2 = new ArrayList<>();
        //profesores2.add(prof1);
        //profesores2.add(prof2);
        ArrayList <Calificacion> calificaciones2 = new ArrayList<>();
        calificaciones2.add(c1);
        calificaciones2.add(c2);
        
        
        for (int i = 0; i < calificaciones2.size(); i++) {
            System.out.printf("%s - %s - %.2f\n", calificaciones2.get(i).obtenerProfesor().obtenerNombre(),
                    calificaciones2.get(i).obtenerNombreMateria(),
            calificaciones2.get(i).obtenerNota());
        }
        
       
    }
}
