
package DTO;


public class CadastroPrestadoresDTO {
    
    private String nome, Telefone, Cnpj,  Email,Endereco,Ramo, Senha   ;
    private int idPrestadores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getRamo() {
        return Ramo;
    }

    public void setRamo(String Ramo) {
        this.Ramo = Ramo;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getIdPrestadores() {
        return idPrestadores;
    }

    public void setIdPrestadores(int idPrestadores) {
        this.idPrestadores = idPrestadores;
    }
    
    
    
}
