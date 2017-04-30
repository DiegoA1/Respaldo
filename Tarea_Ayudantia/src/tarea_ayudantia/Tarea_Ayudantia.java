
package tarea_ayudantia;

import java.util.Scanner;


public class Tarea_Ayudantia {

    public static void main(String[] args) {
        menu();
    }
    
    public static String ingresoOperacion() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingresar operacion a realizar");
        String op = intro.nextLine();
        return op;
    }
    
    public static int verificar(String opera) {
        int op=opera.indexOf("+");
        if(op!=-1){
            return 1;
        }else{
            op = opera.indexOf("-");
            if(op!=-1){
                return 2;
            }else{
                op=opera.indexOf("*");
                if(op!=-1){
                    return 3; 
                }else{
                    op=opera.indexOf("/");
                    if(op!=-1){
                        return 4;
                    }else{
                        op=opera.indexOf("^");
                        if(op!=-1){
                            return 5;
                        }
                    }
                }
            }
        }
        return 6;
    }
   
    public static void realizarop(int ope, String operacion) {
        operacion = operacion.replaceAll("\\s", "");
        switch (ope) {
            case 1:
                String suma[] = crear1(operacion);
                validarN(suma);
                Result(suma, ope);
                break;
            case 2:
                String resta[] = crear2(operacion);
                validarN(resta);
                Result(resta, ope);
                break;
            case 3:
                String multi[] = crear3(operacion);
                validarN(multi);
                Result(multi, ope);
                break;
            case 4:
                String div[] = crear4(operacion);
                validarN(div);
                Result(div, ope);
                break;
            case 5:
                String pot[] = crear5(operacion);
                validarN(pot);
                Result(pot, ope);
                break;
            default:
                System.out.println("***Error***");
        }
    }

    public static String[] crear1(String operacion) {
        String op1[] = operacion.split("\\+");
        return op1;
    }

    public static String[] crear2(String operacion) {
        String op2[] = operacion.split("\\-");
        return op2;
    }

    public static String[] crear3(String operacion) {
        String op3[] = operacion.split("\\*");
        return op3;
    }

    public static String[] crear4(String operacion) {
        String op4[] = operacion.split("/");
        return op4;
    }

    public static String[] crear5(String operacion) {
        String op5[] = operacion.split("^");
        return op5;
    }
    
    public static void Result(String[] operacion, int Vverificado) {
        double numero1 = Double.valueOf(operacion[0]);
        double numero2 = Double.valueOf(operacion[1]);
        double result;
        switch (Vverificado) {
            case 1:
                result = numero1 + numero2;
                System.out.println(result);
                break;
            case 2:
                result = numero1 - numero2;
                System.out.println(result);
                break;
            case 3:
                result = numero1 * numero2;
                System.out.println(result);
                break;
            case 4:
                result = numero1 / numero2;
                System.out.println(result);
                break;
            case 5:
                result = Math.pow(numero1 , numero2);
                System.out.println(result);
                break;
            default:
                System.out.println("***Error***");;
        }
        
        
    }

    private static void validarN(String[] operacion) {
        boolean Vnum1=operacion[0].matches("[a-zA-Z]");
        boolean Vnum2=operacion[1].matches("[a-zA-Z]");
        
        if(Vnum1 == true || Vnum2 == true){
            System.out.println("***Error***");
            menu();
        }
    }

    private static void menu() {
       String operacion = ingresoOperacion(); 
       int Vverificado = verificar(operacion);
       realizarop(Vverificado, operacion);
    }
    
}
