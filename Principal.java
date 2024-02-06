import java.util.Date;
import java.text.SimpleDateFormat;

Public class Principal{
	public static void main(String[]args){
	
		System.out.println("Hola mundo");
		obtenerFechaYHoraActual();
	
	}
	
 	public static void obtenerFechaYHoraActual() {
   	   
        	Date fechaActual = new Date();

        	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        	String fechaHoraFormateada = formato.format(fechaActual);
        	System.out.println("La fecha y hora actual es: " + fechaHoraFormateada);
    	}

}
