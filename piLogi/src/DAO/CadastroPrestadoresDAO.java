
package DAO;


import DTO.CadastroPrestadoresDTO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class CadastroPrestadoresDAO {
    
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CadastroPrestadoresDTO> lista = new ArrayList<>();
    public void cadastrarPrestador(CadastroPrestadoresDTO objCadastroPrestadoresdto){
    
        String sql = "insert into Prestadores (Nome, Telefone, Cnpj, Email, Endereco,Ramo,Senha) values (?,?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroPrestadoresdto.getNome());
            pstm.setString(2, objCadastroPrestadoresdto.getTelefone());
            pstm.setString(3, objCadastroPrestadoresdto.getCnpj());
            pstm.setString(4, objCadastroPrestadoresdto.getEmail());
            pstm.setString(5, objCadastroPrestadoresdto.getEndereco());
            pstm.setString(6, objCadastroPrestadoresdto.getRamo());
            pstm.setString(7, objCadastroPrestadoresdto.getSenha());
            
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, " cadastroPrestadorDAO Cadastrar " + erro);
        }
        
    }
    
    public ArrayList<CadastroPrestadoresDTO> PesquisarPrestadores(){
        String sql = "Select * from Prestadores";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                CadastroPrestadoresDTO objcadastroPrestadorDTO = new CadastroPrestadoresDTO();
                objcadastroPrestadorDTO.setIdPrestadores(rs.getInt("idPrestadores"));
                objcadastroPrestadorDTO.setNome(rs.getString("Nome"));
                objcadastroPrestadorDTO.setTelefone(rs.getString("Telefone"));
                objcadastroPrestadorDTO.setCnpj(rs.getString("Cnpj"));
                objcadastroPrestadorDTO.setEmail(rs.getString("Email"));
                objcadastroPrestadorDTO.setEndereco(rs.getString("Endereco"));
                objcadastroPrestadorDTO.setRamo(rs.getString("Ramo"));
                objcadastroPrestadorDTO.setSenha(rs.getString("Senha"));
                
                
                lista.add(objcadastroPrestadorDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null," cadastroClientesDAO Pesquisar " + erro);
        }
        return lista;
    }
    
    public void alterarPrestadores(CadastroPrestadoresDTO objCadastroPrestadoresdto){
        String sql = "update Prestadores set Nome = ?, Telefone = ?,Cnpj = ?, Email = ? , Endereco = ? , Ramo = ? , Senha = ? where idPrestadores = ?";
    
         conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroPrestadoresdto.getNome());
            pstm.setString(2, objCadastroPrestadoresdto.getTelefone());
            pstm.setString(3, objCadastroPrestadoresdto.getCnpj());
            pstm.setString(4, objCadastroPrestadoresdto.getEmail());
            pstm.setString(5, objCadastroPrestadoresdto.getEndereco());
            pstm.setString(6, objCadastroPrestadoresdto.getEmail());
            pstm.setString(7, objCadastroPrestadoresdto.getSenha());    
            pstm.setInt(8, objCadastroPrestadoresdto.getIdPrestadores());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Alterar Cadastro " + erro);
        }
        
    }
    
    public ArrayList<CadastroPrestadoresDTO> PesquisarPrestadoresPorNome(String nome) throws Exception {
    ArrayList<CadastroPrestadoresDTO> lista = new ArrayList<>();

    String sql = "SELECT * FROM Prestadores WHERE Nome LIKE ?";

    Connection conn = new ConexaoDAO().conectaBD();
    PreparedStatement pstm = conn.prepareStatement(sql);
    pstm.setString(1, "%" + nome + "%");

    ResultSet rs = pstm.executeQuery();

    while (rs.next()) {
        CadastroPrestadoresDTO Prestadores = new CadastroPrestadoresDTO();
        Prestadores.setIdPrestadores(rs.getInt("idPrestadores"));
        Prestadores.setNome(rs.getString("Nome"));
        Prestadores.setTelefone(rs.getString("Telefone"));
        Prestadores.setCnpj(rs.getString("Cnpj"));
        Prestadores.setEmail(rs.getString("email"));
        Prestadores.setEndereco(rs.getString("Endereco"));
        Prestadores.setEmail(rs.getString("Ramo"));
        Prestadores.setSenha(rs.getString("Senha"));

        lista.add(Prestadores);
    }

    return lista;
}
public void excluirPrestadores(int id) throws Exception {
    String sql = "DELETE FROM Prestadores WHERE idPrestadores = ?";

    Connection conn = new ConexaoDAO().conectaBD();
    PreparedStatement pstm = conn.prepareStatement(sql);
    pstm.setInt(1, id);

    pstm.execute();
    pstm.close();
}

    public ResultSet autenticacaoUsuarioPrestadores(CadastroPrestadoresDTO objPrestadoresdto) {
        Connection conn;
conn = new ConexaoDAO().conectaBD();
        
        try{
            String sql = "Select * from Prestadores Where Email = ? and Senha = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objPrestadoresdto.getEmail());
            pstm.setString(2, objPrestadoresdto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch (SQLException erro ){
            JOptionPane.showMessageDialog(null, "CadastroPrestadoresDTO:" + erro);
            return null;
        }
    }
        

    
 
}


