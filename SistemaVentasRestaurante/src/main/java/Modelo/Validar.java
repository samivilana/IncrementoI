package Modelo;

public class Validar {
	private static final String patronNombre = "^[a-zA-Z]+$";
    private static final String patronApellido = "^[a-zA-Z]";
    private static final String patronDireccion = "^[a-zA-Z0-9\\s]+(\\s+[a-zA-Z0-9\\s]+)*$";
    private static final String patronCorreo = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
	public static boolean validarNombre(String nombre) {
		return nombre.matches(patronNombre);
	}
	public static boolean validarApellido(String apellido) {    
	   return apellido.matches(patronApellido);
	}
	    
	public static boolean validarDireccion(String direccion) {
		int longitudMinima = 5;
	    int longitudMaxima = 100;
	        
	    if (direccion.length() < longitudMinima || direccion.length() > longitudMaxima) {
	        return false;
	    }
	        return direccion.matches(patronDireccion);
	    }
	    
	public static boolean validarCedula(String cedula) {
        String patron = "^[0-9]{10}$";
        if (!cedula.matches(patron)) {
            return false;
        }
        int digitoVerificador = Character.getNumericValue(cedula.charAt(9));
        int suma = 0;

        for (int i = 0; i < 9; i++) {
        	int digito = Character.getNumericValue(cedula.charAt(i));
	            if (i % 2 == 0) {
	                digito *= 2;
	                if (digito > 9) {
	                    digito -= 9;
	                }
	            }
	            suma += digito;
	        }

	        int residuo = suma % 10;
	        int resultadoEsperado = (residuo == 0) ? 0 : 10 - residuo;

	        return digitoVerificador == resultadoEsperado;
	    }
	    private static boolean validarDigitos(String entrada) {
	        return entrada.matches("0\\d{9}\"");
	    }
		private static boolean validarCorreoElectronico(String correo) {
	        return correo.matches(patronCorreo);
	    }
}
