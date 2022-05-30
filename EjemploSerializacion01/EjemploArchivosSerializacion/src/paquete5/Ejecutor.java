
package paquete5;


public class Ejecutor {
    public static void main(String[] args) {
        String nombreArchivo = "Hospital.data";

        Hospital h1 = new Hospital("San Agustin", 3000, 100654.81);
        Hospital h2 = new Hospital("Isidro Ayora", 2300, 2000136.62);
        Hospital h3 = new Hospital("San Luis", 40000, 356000.85);
        

       Hospital[] lista = {h1, h2,h3};

        EscrituraArchivoSecuencial archivo = new
        EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
    }
}

