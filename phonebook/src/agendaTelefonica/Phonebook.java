
package agendaTelefonica;

public class Phonebook<GENERIC> {
    Manipulacao vetor[];
    
    Phonebook(){
        vetor = new Manipulacao[26];
        agendaInit();
    }
    
    public void agendaInit(){
        for(int i = 0; i<26; i++){
            vetor[i] = new Manipulacao();
        }
    }
    
    public int hash(String nome){
        nome = nome.toLowerCase();
        int pos = nome.charAt(0);
        return pos - 97;
    }
    
    public void add(String nome, int telefone){
        vetor[hash(nome)].adicionar(nome, telefone);
    }
    public void excluir(String nome){
        vetor[hash(nome)].remover(nome);
        System.out.println("Contato removido!");
    }
    public void buscarContato(String nome){
        vetor[hash(nome)].buscar(nome);
    }
    
    public void exibir(){
        Manipulacao aux = new Manipulacao();
        aux.print();
    }

}
