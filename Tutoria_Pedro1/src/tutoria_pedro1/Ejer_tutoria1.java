
package tutoria_pedro1;

public class Ejer_tutoria1 {
    public static void main(String[] args) {
        int Max=0, Min=100, cont1=0, cont2=0, cont3=0 ;
        int X[];
        X = new int[40];
        for (int i = 0; i <X.length; i++) {
            X[i]=(int)(Math.random()*200+1);
            System.out.print(X[i]+" ");
            if(Max < X[i])
                Max = X[i];
            if(X[i]<Min)
                Min = X[i];
            if (X[i]<= 50)
                cont1++;
            if (X[i]>50 && X[i]<=100)
                cont2++;
        }
        System.out.println("\n El numero mayor es: "+Max);
        System.out.println(" El numero menor es: "+Min);
    }
}
