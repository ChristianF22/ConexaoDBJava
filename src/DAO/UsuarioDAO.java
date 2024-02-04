package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;



import conect.Conexao;
import entity.Usuario;

//Calasse para criar a inserção de dados puchando da calasse Conexao e da classe Usuario
public class UsuarioDAO{
    
    public void cadastrarUsuario(Usuario usuario){
       
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;
        
        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute();
            ps.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
