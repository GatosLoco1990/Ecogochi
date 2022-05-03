import perfiles.Usuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡Bienvenido a ecogochi!");
        System.out.println("Presiona 1 para iniciar sesión o 2 para registrarte.");
        int n = teclado.nextInt();
        switch (n) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }

    }

    public static void BorrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
