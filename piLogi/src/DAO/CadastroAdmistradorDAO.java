
package DAO;



import DTO.CadastroAdmistradorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroAdmistradorDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CadastroAdmistradorDTO> lista = new ArrayList<>();

    public void cadastrarAdmistrador(CadastroAdmistradorDTO objCadastroAdmistradordto){
        String sql = "INSERT INTO Admistrador (Nome, Email, Senha) VALUES (?, ?, ?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroAdmistradordto.getNome());
            pstm.setString(2, objCadastroAdmistradordto.getEmail());
            pstm.setString(3, objCadastroAdmistradordto.getSenha());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAdmistradorDAO Cadastrar: " + erro);
        }
    }

    public ArrayList<CadastroAdmistradorDTO> pesquisarAdmistradores(){
        String sql = "SELECT * FROM Admistrador";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                CadastroAdmistradorDTO objAdmDTO = new CadastroAdmistradorDTO();
                objAdmDTO.setIdClientes(rs.getInt("idadmistrador"));  
                objAdmDTO.setNome(rs.getString("Nome"));
                objAdmDTO.setEmail(rs.getString("Email"));
                objAdmDTO.setSenha(rs.getString("Senha"));

                lista.add(objAdmDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroAdmistradorDAO Pesquisar: " + erro);
        }

        return lista;
    }

    public void alterarAdmistrador(CadastroAdmistradorDTO objCadastroAdmistradordto){
        String sql = "UPDATE Admistrador SET Nome = ?, Email = ?, Senha = ? WHERE idadmistrador = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroAdmistradordto.getNome());
            pstm.setString(2, objCadastroAdmistradordto.getEmail());
            pstm.setString(3, objCadastroAdmistradordto.getSenha());
            pstm.setInt(4, objCadastroAdmistradordto.getidadmistrador());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroAdmistradorDAO Alterar: " + erro);
        }
    }

    public void excluirAdmistrador(int id) throws Exception {
        String sql = "DELETE FROM Admistrador WHERE idadmistrador = ?";

        conn = new ConexaoDAO().conectaBD();
        pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);

        pstm.execute();
        pstm.close();
    }

    public ResultSet autenticacaoAdmistrador(CadastroAdmistradorDTO objAdmDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM Admistrador WHERE Email = ? AND Senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAdmDTO.getEmail());
            pstm.setString(2, objAdmDTO.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroAdmistradorDAO Autenticação: " + erro);
            return null;
        }
    }

    public ArrayList<CadastroAdmistradorDTO> pesquisarAdmistradoresPorNome(String nome) throws Exception {
        ArrayList<CadastroAdmistradorDTO> lista = new ArrayList<>();

        String sql = "SELECT * FROM Admistrador WHERE nome LIKE ?";
        Connection conn = new ConexaoDAO().conectaBD();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, "%" + nome + "%");

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            CadastroAdmistradorDTO adm = new CadastroAdmistradorDTO();
            adm.setIdClientes(rs.getInt("idadmistrador"));
            adm.setNome(rs.getString("Nome"));
            adm.setEmail(rs.getString("Email"));
            adm.setSenha(rs.getString("Senha"));

            lista.add(adm);
        }

        return lista;
    }
}


