
package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;



public class ManejoArrayList4 {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("Sombreros","Saraguro");
        Empresa e2= new Empresa("Ecolac","Loja");
        Empresa e3 = new Empresa("Five","Quito");
        
        ArrayList <Empresa> empresas = new ArrayList<>();
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
        
        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s - %s \n", empresas.get(i).obtenerNombre(),
                empresas.get(i).obtenerCiudad());
        }
        
        
       
    }
}
