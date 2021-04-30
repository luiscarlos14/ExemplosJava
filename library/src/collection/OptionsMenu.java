
package collection;

import java.util.Scanner;

public class OptionsMenu {
    Scanner in = new Scanner(System.in);
    
    private Pilha aux;
    
    OptionsMenu(){
        aux = new Pilha();
    }
    
    public void add(){
        
        System.out.print("Informe o Nome do Livro: ");
            String livro = in.nextLine();
        System.out.print("Informe o Nome do Autor: ");
            String autor = in.nextLine();
            
        aux.addBook(livro, autor);
        System.out.println("Livro Adicionado!!!\n");
            
    }
    
    public void remove(){
        
        listBooks();
        
        System.out.print("Informe o nome do Livro a ser removido:  ");
            String name = in.nextLine();
        aux.removeBook(name);
        System.out.println("Livro Removido!\n");
    
    }
    
    public void search(){
        System.out.print("Informe o Titulo do Livro: ");
            String titulo = in.nextLine();
        aux.searchBook(titulo);
        System.out.println("\n");
    }
    
    public void librarySize(){
        System.out.printf("\nA biblioteca possui %d Livros\n",aux.librarySize());
       
    }
    
    public void listBooks(){
       System.out.println("\nLista de Livros do Acervo");
       System.out.println("**************************");
       aux.listBooks();
       System.out.println("**************************");
    }
    
    public void searchAuthor(){
        
        System.out.print("Informe o Nome do Autor: ");
            String autor = in.nextLine();
        aux.searchBooksAuthor(autor);

    
    }
    
}
