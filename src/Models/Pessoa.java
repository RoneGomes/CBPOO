package Models;

//classe abstrata
public abstract class Pessoa {
    
    String cpf;
    
    String nome;  
  
	String dataNascimento;
    
    String instituicao;
   
    String titulacao;
    
    String senha;
    
 
    public String getCpf() {
        return this.cpf;
    }
    
  
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
  
    public String getNome() {
        return this.nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
   
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
   
    public String getInstituicao() {
        return this.instituicao;
    }
    
    
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
 
    public String getTitulacao() {
        return this.titulacao;
    }
    
   
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    
   
    public String  getSenha() {
        return this.senha;
    }
    
   
    public void  setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
