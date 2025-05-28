
package DAO;

import DTO.CadastroClientesDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class CadastroClientesDAO {
    
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CadastroClientesDTO> lista = new ArrayList<>();
    public void cadastrarClientes(CadastroClientesDTO objCadastroClientesdto){
    
        String sql = "insert into Clientes (nome, Telefone, Cpf, Rg, Cidade, Email, Senha) values (?,?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroClientesdto.getNome());
            pstm.setString(2, objCadastroClientesdto.getTelefone());
            pstm.setString(3, objCadastroClientesdto.getCpf());
            pstm.setString(4, objCadastroClientesdto.getRg());
            pstm.setString(5, objCadastroClientesdto.getCidade());
            pstm.setString(6, objCadastroClientesdto.getEmail());
            pstm.setString(7, objCadastroClientesdto.getSenha());
            
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, " cadastroClientesDAO Cadastrar " + erro);
        }
        
    }
    
    public ArrayList<CadastroClientesDTO> PesquisarClientes(){
        String sql = "Select * from Clientes";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                CadastroClientesDTO objcadastroClientesDTO = new CadastroClientesDTO();
                objcadastroClientesDTO.setIdClientes(rs.getInt("idClientes"));
                objcadastroClientesDTO.setNome(rs.getString("nome"));
                objcadastroClientesDTO.setTelefone(rs.getString("Telefone"));
                objcadastroClientesDTO.setCpf(rs.getString("Cpf"));
                objcadastroClientesDTO.setRg(rs.getString("Rg"));
                objcadastroClientesDTO.setCidade(rs.getString("Cidade"));
                objcadastroClientesDTO.setEmail(rs.getString("Email"));
                objcadastroClientesDTO.setSenha(rs.getString("Senha"));
                
                
                lista.add(objcadastroClientesDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null," cadastroClientesDAO Pesquisar " + erro);
        }
        return lista;
    }
    
    public void alterarClientes(CadastroClientesDTO objCadastroClientesdto){
        String sql = "update Clientes set nome = ?, Telefone = ?,Cpf = ?, Rg = ? , Cidade = ? , Email = ? , Senha = ? where idClientes = ?";
    
         conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroClientesdto.getNome());
            pstm.setString(2, objCadastroClientesdto.getTelefone());
            pstm.setString(3, objCadastroClientesdto.getCpf());
            pstm.setString(4, objCadastroClientesdto.getRg());
            pstm.setString(5, objCadastroClientesdto.getCidade());
            pstm.setString(6, objCadastroClientesdto.getEmail());
            pstm.setString(7, objCadastroClientesdto.getSenha());    
            pstm.setInt(8, objCadastroClientesdto.getIdClientes());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Alterar Cadastro " + erro);
        }
        
    }
    
    public ArrayList<CadastroClientesDTO> PesquisarClientesPorNome(String nome) throws Exception {
    ArrayList<CadastroClientesDTO> lista = new ArrayList<>();

    String sql = "SELECT * FROM Clientes WHERE nome LIKE ?";

    Connection conn = new ConexaoDAO().conectaBD();
    PreparedStatement pstm = conn.prepareStatement(sql);
    pstm.setString(1, "%" + nome + "%");

    ResultSet rs = pstm.executeQuery();

    while (rs.next()) {
        CadastroClientesDTO cliente = new CadastroClientesDTO();
        cliente.setIdClientes(rs.getInt("idClientes"));
        cliente.setNome(rs.getString("nome"));
        cliente.setTelefone(rs.getString("Telefone"));
        cliente.setCpf(rs.getString("Cpf"));
        cliente.setRg(rs.getString("Rg"));
        cliente.setCidade(rs.getString("Cidade"));
        cliente.setEmail(rs.getString("Email"));
        cliente.setSenha(rs.getString("Senha"));

        lista.add(cliente);
    }

    return lista;
}
public void excluirCliente(int id) throws Exception {
    String sql = "DELETE FROM Clientes WHERE idClientes = ?";

    Connection conn = new ConexaoDAO().conectaBD();
    PreparedStatement pstm = conn.prepareStatement(sql);
    pstm.setInt(1, id);

    pstm.execute();
    pstm.close();
}

    public ResultSet autenticacaoUsuario(CadastroClientesDTO objClientesdto) {
        Connection conn;
conn = new ConexaoDAO().conectaBD();
        
        try{
            String sql = "Select * from Clientes Where Email = ? and Senha = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientesdto.getEmail());
            pstm.setString(2, objClientesdto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch (SQLException erro ){
            JOptionPane.showMessageDialog(null, "CadastroClientesDTO:" + erro);
            return null;
        }
    }
        

    
 
}


