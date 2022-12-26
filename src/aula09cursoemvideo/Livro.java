
package aula09cursoemvideo;

public class Livro implements Plublicação{
   private String titulo, autor;
   private int totalPag;
   private int pagAtual = 0;
   private boolean aberto = false ;
   private Pessoa leitor;

  
  //>>> metodo Construtor 
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    //>> metodo especial 
    public String detalhes() {
        System.out.println("_____________________________________________________________________");
        return "Livro{" + "titulo=  " + titulo + "\n, autor =" + autor + "\n, totalPag =" + totalPag + "\n, pagAtual =" + pagAtual + "\n, aberto =" + aberto + "\n, leitor =" + leitor.getNome() + '}';
        
    }
   
   
   // >>>  metodo acessores 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
      
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    
   // <<>>> metodos abstratos 
    @Override
    public void abrir() {
        
        this.aberto = true;
    }

    @Override
    public void fechar() {
        
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        
      // se , a pagina escolhida for maior que o total de pagina 
        if(p > this.totalPag){
            
           // vai na pagina atual e diz que é zero
           this.pagAtual = 0 ;
           
         // senão   
        } else {
          
           // vai na pagina atual e coloca o valor escolhido 
           this.pagAtual = p ;
        }
        
    }

    @Override
    public void avancarPag() {
        
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        
        this.pagAtual--;
    }
   
   
   
}
