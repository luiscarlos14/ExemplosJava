package collection;

public class Pilha {
    
    private Book[] books;
    private int size;
    
    Pilha(){
        this.books = new Book[3];
        this.size = 0;
    }
 
    public void dinamic(){
         
        Book[] array_auxiliar = new Book[this.books.length*2];
        for (int i = 0; i < this.size; i++){
            array_auxiliar[i] = this.books[i];
        }
        this.books = array_auxiliar;
    }
      
    public void addBook(String title, String author){
       
        Book aux = new Book(title, author);   
        
        if(this.size == (this.books.length)){
            dinamic();
        }
        this.books[this.size] = aux;
          
        this.size++;
        insertionSort();

    }
        
    public void removeBook(String name){
        
        Book[] aux = new Book[books.length -1]; 
        
        int j = 0;
        
        for(int i = 0; i < this.size; i++){
            
            if(books[i].getTitle().toLowerCase().equals(name.toLowerCase())){
                j = j;
            }else{
                aux[j] = this.books[i];
                j++;
            }
        }
        
        this.books = aux;
        size--;

    }
    
    public void insertionSort(){
        
     int n = size;  
     
        for (int j = 1; j < n; j++) {  
            Book key = books[j];  
            int i = j-1;  
            
            while((i > -1) && ( alphabeticalOrder(books[i].getTitle(), key.getTitle()))) {  
                books[i+1] = books[i];  
                i--;  
            }  
            books[i+1] = key;  
        }  
    }
    
    public void searchBook(String title){
        int check = 0;
        
        for(int i = 0; i < this.size; i++){
            if(this.books[i].getTitle().toLowerCase().equals(title.toLowerCase())){
                System.out.println("Livro Encontrado!");
                System.out.println(books[i].toString());
                check++;
                break;
            } 
        }
        if(check == 0){
            System.out.println("Desculpe, o livro buscado não faz parte do acervo.");
        }
    }
    
    
    public int librarySize(){
        return this.size;
    }
    
    public void searchBooksAuthor(String author){
        
        int checker = 0;
        String bookAuthor = "";
              
        for(int i = 0; i < this.size; i++){
           
            if(this.books[i].getAuthor().toLowerCase().equals(author.toLowerCase())){
                bookAuthor = bookAuthor + books[i].getTitle() + "\n";
                checker++;   
            }      
        }
        if (checker == 0) {
            System.out.println("O autor não possui livros no acervo!");        
        } else{
            System.out.println("Livros no acervo escritos por : " + author + "\n");
            System.out.println(bookAuthor);
        }
    }
   
    public void listBooks(){
       
        for(int i = 0; i < this.size; i++){
            
            
           System.out.println(this.books[i].getTitle() + " - "
                              + this.books[i].getAuthor());
           
        }
    }
    
    public boolean alphabeticalOrder(String a, String b){
       
        String name1 = a.toLowerCase(), name2 = b.toLowerCase();
       
        int sizeA = name1.length(), sizeB = name2.length();
        
        boolean result = false;
        
        if(sizeA > sizeB){  
            for(int i = 0; i < sizeB; i++){
                
                if(name1.charAt(i) > name2.charAt(i)){
                    result = true;
                    break;
                } else if(name1.charAt(i) < name2.charAt(i)){
                    result = false;
                    break;
                }    
            } 
        } else{
             for(int i = 0; i < sizeA; i++){
                 
                if(name1.charAt(i) > name2.charAt(i)){
                    result = true;
                    break;
                }else if(name1.charAt(i) < name2.charAt(i)){
                    result = false;
                    break;
                }
            }
        }   
        return result;
    }
   
}
      

