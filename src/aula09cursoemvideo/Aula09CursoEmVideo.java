
package aula09cursoemvideo;

public class Aula09CursoEmVideo {

   
    public static void main(String[] args) {
     // criando um VETOR de pessoas , tres pessoas  
        Pessoa[] p = new Pessoa[3];
     
     // criando um VETOR de livros, são 3 livros 
        Livro[] l = new Livro[3];
        
        
     // criando uma pessoa no vetor "0", passa os parametros 
        p[0] = new Pessoa("Giovani", 34, "Masculino");
        // criando uma pessoa no vetor "1", passa os parametros 
        p[1] = new Pessoa("Guilherme", 12, "Masculino");
        // criando uma pessoa no vetor "2", passa os parametros  
        p[2] = new Pessoa("Maria", 23, "Feminino");
      
        
        
     // criando um livro para o vetor "0", passa os parametros 
        l[0] = new Livro("Aprendendo Java", "Getulio", 100, p[0]);
        // criando um livro para o vetor "0", passa os parametros 
        l[1] = new Livro("Matemática do Futuro", "Giovani", 200, p[1]);
        // criando um livro para o vetor "0", passa os parametros 
        l[2] = new Livro("Cortando a vida ", "Heitor", 300, p[0]);
        
       // mostra os detalhes do livro "0" ...  
         System.out.println(l[0].detalhes());
        
         l[0].abrir();//>>> vai abrir o livro( l[0] ) 
         l[0].folhear(50);// <<>>> vai folhear o livro, passe o parametro da pagina que vc quer ir 
         l[0].getPagAtual();//<<>> informa qual pagina você está .
         l[0].avancarPag();//<<>>> vai avançar a pagina 
         l[0].avancarPag();//<<>>>  vai avança a pagina
       
        
    }
    
}
