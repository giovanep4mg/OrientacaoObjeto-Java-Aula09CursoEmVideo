
package aula09cursoemvideo;

public class Pessoa {
    // >>>   atributos
    private String nome, sexo;
    private int idade;
    
   // >>>   metodo Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
 
    // >>>   metodo especial 
    public void fazerAniver(){
    // vai na variável idade e adiciona mais um na idade colocada
    // vai na variável idade, acrescenta idade + 1 
       this.idade = this.idade + 1;
    }

    
    //   metodos acessores
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
