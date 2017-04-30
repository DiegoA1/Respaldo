
package tallerlab04;

public class Alumno {
    
    DatosAlumno DAlumno = new DatosAlumno();
    
    public static void Mostrar() {
        
    }
    
    public static void Guardar(String r, String a, String n, String c) {
        String rut = null;
        String apellido = null;
        String nombre = null;
        String correo = null;
        if (validarRut(rut) == true){
            
        }
    }
    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
        rut =  rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
 
        char dv = rut.charAt(rut.length() - 1);
 
        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
        s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
        validacion = true;
        }
 
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    
}
