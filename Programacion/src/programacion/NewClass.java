
package programacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NewClass {
    public static void main(String[] args) {
        String direccion = "C:\\Users\\Equipo\\Documents\\archivo.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((direccion = br.readLine()) != null){
                System.out.println(direccion);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
