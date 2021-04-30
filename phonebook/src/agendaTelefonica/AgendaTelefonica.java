
package agendaTelefonica;

public class AgendaTelefonica {

  
    public static void main(String[] args) {
        Phonebook teste = new Phonebook();
        
        teste.add("Ana", 988785652);
        teste.add("Bruno", 988785652);
        teste.add("Marta", 988785652);
        teste.vetor[0].print();
        
        
        teste.excluir("Ana");
        
        teste.vetor[1].print();
        
        System.out.println("");
        teste.buscarContato("Marta");
    }
    
}
