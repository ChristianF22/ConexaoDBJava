import entity.Usuario;
import DAO.UsuarioDAO;

public class App {
    public static void main(String[] args) throws Exception {
         
        Usuario u = new Usuario();
        u.setNome("admin");
        u.setLogin("admin");
        u.setSenha("admin123");
        u.setEmail("admin22@gamil.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
