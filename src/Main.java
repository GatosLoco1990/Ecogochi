import perfiles.Usuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña, correo, nombre;
        Usuario[] usuarios = new Usuario[100];
        usuarios[0] = new Usuario("Ricardo", "tuki", "ricardogandica@hotmail.com");
        usuarios[1] = new Usuario("Jose", "retuki", "correo");
        int x = 2;

        System.out.println("¡Bienvenido a ecogochi!");
        System.out.println("Presiona 1 para iniciar sesión o 2 para registrarte.");
        int n = teclado.nextInt();
        switch (n) {
            case 1:
                System.out.println("Ingresa tu correo y contraseña");
                correo = teclado.next();
                contraseña = teclado.next();

                VerificarUsuario(x, usuarios, contraseña, correo);

                break;
            case 2:
                System.out.println("Ingresa tu nombre, contraseña y correo :D");
                nombre = teclado.next();
                contraseña = teclado.next();
                correo = teclado.next();

                usuarios[x] = new Usuario(nombre, contraseña, correo);
                MostrarMenu(usuarios, x);
                x++;

                break;
            case 3:
                break;
            default:
                break;
        }
        teclado.close();
    }

    public static void BorrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void MostrarMenu(Usuario[] usuarios, int x) {
        System.out.println("Bienvenido de vuelta: " + usuarios[x].getNombre());
    }

    public static void VerificarUsuario(int x, Usuario[] usuarios, String contraseña, String correo) {

        for (int i = 0; i <= x - 1; i++) {
            if (usuarios[i].getCorreo().equals(correo)) {
                if (usuarios[i].getContrasena().equals(contraseña)) {
                    MostrarMenu(usuarios, i);
                    break;
                }
            }
        }
    }
}
