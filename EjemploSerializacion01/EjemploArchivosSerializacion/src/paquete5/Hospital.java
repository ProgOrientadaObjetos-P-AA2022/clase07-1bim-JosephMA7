
package paquete5;

import java.io.Serializable;


public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String n, int nc, double p){
        nombre=n;
        numeroCamas=nc;
        presupuesto=p;
    }
    
    public void establecerNombre(String n){
        nombre=n;
        
    }
    public void establecerNumCamas(int n){
        numeroCamas=n;
        
    }
    public void establecerPresupuesto(double n){
        presupuesto=n;
        
    }
    public String obtenerNombre(){
        return nombre;
    }
   public int obtenerNumCamas(){
       return numeroCamas;
   }
   public double obtenerPresupuesto(){
       return presupuesto;
   }
   
}