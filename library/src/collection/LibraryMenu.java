
package collection;

import java.util.Scanner;

public class LibraryMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        OptionsMenu books = new OptionsMenu();
        int option;
        
        System.out.println("######################################");
        System.out.println("#           Menu Biblioteca          #");
        System.out.println("######################################");     
        System.out.println("#                                    #");
        System.out.println("# 1 - Adicionar Livro ao Acervo      #");
        System.out.println("# 2 - Remover Livro do Acervo        #");
        System.out.println("# 3 - Pesquisar um livro pelo titulo #");
        System.out.println("# 4 - Quantidade de livros do Acervo #");
        System.out.println("# 5 - Listar todos os livros         #");
        System.out.println("# 6 - Livros por Autor               #");
        System.out.println("# 7 - Sair                           #");
        System.out.println("######################################");
        
        do{
        System.out.print("INFORME A OPÇÃO DESEJADA: ");
            option = in.nextInt();
            
            switch(option){
                case 1: books.add();
                        break;
                case 2: books.remove();
                        break;
                case 3: books.search();
                        break;
                case 4: books.librarySize();
                        break;
                case 5: books.listBooks();
                        break;
                case 6: books.searchAuthor();
                        break;
            }
        }while(option!=7);    
    }
}
