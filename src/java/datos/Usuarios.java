package datos;

/**
 *
 * @author Carlos Loaeza
 */
public class Usuarios {

    private String usuarios[][] = {{"Carlos Loaeza", "123456"}, {"jesus", "56789"}, {"loaeza", "123456"}, {"gutierrez", "56789"}};

    public boolean autenticar(String user, String pass) {
        boolean autenticado = false;
        for (int i = 0; i < usuarios.length; i++) {
            if (user.equals(usuarios[i][0]) && pass.equals(usuarios[i][1])) {
                autenticado = true;
            }
        }
        return autenticado;
    }
}
