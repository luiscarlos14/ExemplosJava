package Lista_Encadeada;

public class TEST {

    public static void main(String[] args) {
        
    Vetor teste = new Vetor();
    
        System.out.println("Testando método 'Verificar se a lista está vazia'");
        teste.verificarListaVazia();
        
        System.out.println("\nExibindo Lista de Alunos 'Exibir todos os alunos' ");
        System.out.println(teste.exibirAlunos());
    
        System.out.println("\nAdicionando no Final!");
        teste.adicionaFinal("Luis");
        System.out.println(teste.exibirAlunos());
        teste.adicionaFinal("Carlos");
        System.out.println(teste.exibirAlunos());
        teste.adicionaFinal("Barros");
        System.out.println(teste.exibirAlunos());
       
        
 
        System.out.println("\nAdicionando no Inicio!");
    
        teste.adicionaInicio("Aquino");
        System.out.println(teste.exibirAlunos());
        teste.adicionaInicio("Sebastião");
        System.out.println(teste.exibirAlunos());
        
  
        System.out.println("\nVerificando Lista Vazia");   
        teste.verificarListaVazia();
       
       
        System.out.println("\n\nRemovendo do Final");
        teste.removeFinal();
        System.out.println(teste.exibirAlunos());
          
        System.out.println("\nBuscando Aluno Antônio");
        teste.encontrarAluno("Antônio");
        System.out.println("\nBuscando Aluno Carlos");
        teste.encontrarAluno("Carlos");
        
         
        System.out.println("\n\nRemovendo do Final");
        teste.removeFinal();
        System.out.println(teste.exibirAlunos());
        
        
        System.out.println("\nRemovendo o Aluno 'Aquino' - Remover um aluno de qualquer posição");
        teste.removeQualQuerPosicao("Aquino");
        
       
        System.out.println(teste.exibirAlunos());
        
        System.out.println("\nVerificando Lista Vazia"); 
        teste.verificarListaVazia();

    
    
   
   
    
       
    }
    
}
