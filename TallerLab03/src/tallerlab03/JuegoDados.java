
package tallerlab03;

public class JuegoDados {
    private Dado juego;
    
    public static void main(String[] args) {
        int n1, n2;
        tirarDado1(n1);
        tirarDado2(n2);
        sumaNumero(n1,n2);
    }
    public static int tirarDado1(int n1) {
        
        return n1;
    }
    public static int tirarDado2(int n2) {
        
        return n2;
    }
    public static void sumaNumero(int n1, int n2) {
        if(n1+n2 == 7){
            System.out.println("Usted a ganado");
        }else{
            System.out.println("Usted pierde");
        }
    }
    
}
