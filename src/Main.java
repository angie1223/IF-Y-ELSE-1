
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        char car;
        System.out.print("Introduzca un carácter: ");
        car = (char) System.in.read(); //lee un solo caracter

        if (Character.isUpperCase(car)) 
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }
    }
}
