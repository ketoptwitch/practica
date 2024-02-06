import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner

Public class Principal{
	public static void main(String[]args){
	
		System.out.println("Hola mundo");
		obtenerFechaYHoraActual();
		Scanner scanner = new Scanner(System.in);
		
        	System.out.print("Ingrese el número de usuarios a crear: ");
        	int numeroUsuarios = scanner.nextInt();
        	
        	Usuario[] usuarios = crearUsuarios(numeroUsuarios);
        	
         	System.out.println("Información de Usuarios:");
         	
        	for (int i = 0; i < usuarios.length; i++) {
            	System.out.println("Usuario " + (i + 1) + ":");
            	System.out.println("Nombre: " + usuarios[i].nombre);
            	System.out.println("Apellidos: " + usuarios[i].apellidos);
            	System.out.println("Email: " + usuarios[i].email);
            	System.out.println();
	}
	
	
	
 	public static void obtenerFechaYHoraActual() {
   	   
        	Date fechaActual = new Date();

        	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        	String fechaHoraFormateada = formato.format(fechaActual);
        	System.out.println("La fecha y hora actual es: " + fechaHoraFormateada);
    	}
    	
    	public static Usuario[] crearUsuarios(int numeroUsuarios) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[numeroUsuarios];

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Ingrese la información del Usuario " + (i + 1) + ":");
            Usuario usuario = new Usuario();

            System.out.print("Nombre: ");
            usuario.nombre = scanner.nextLine();

            System.out.print("Apellidos: ");
            usuario.apellidos = scanner.nextLine();

            System.out.print("Email: ");
            usuario.email = scanner.nextLine();

            usuarios[i] = usuario;
        }

        return usuarios;
    }

}
