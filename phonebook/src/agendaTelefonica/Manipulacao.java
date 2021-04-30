
package agendaTelefonica;

public class Manipulacao<GENERIC> {
    
    private Agenda<GENERIC> primeiro;
    private Agenda<GENERIC> ultimo;
    int tamanho;
    
    Manipulacao(){
        primeiro = null;
        ultimo = primeiro;
    }
    
    public void adicionar(GENERIC nome, GENERIC telefone){
        
        if(primeiro == null){
            primeiro = new Agenda();
            ultimo = primeiro;     
            
            Agenda<GENERIC> novo = new Agenda();
            
                novo.setNome(nome);
                novo.setTelefone(telefone);
                novo.setProx(null);
                
            ultimo.setProx(novo);
            ultimo = novo;
            tamanho++;
            
        } else{
            
            Agenda<GENERIC> novo = new Agenda();
            novo.setNome(nome);
            novo.setTelefone(telefone);
            novo.setProx(null);
            ultimo.setProx(novo);
            tamanho++;
        }
        
    }
    
    public void print(){
        Agenda<GENERIC> auxiliar = (Agenda<GENERIC>) primeiro.getNome();
        
        while(auxiliar != null){
            System.out.println("Nome: " + auxiliar.getNome());
            System.out.println("Telefone: " + auxiliar.getTelefone());
            auxiliar = (Agenda<GENERIC>) auxiliar.getProx();
        }
    }
    
    public void remover(GENERIC nome){
        Agenda<GENERIC> drop = (Agenda<GENERIC>) primeiro.getProx();
        
        Agenda<GENERIC> auxiliar = primeiro;
        
        if(!(primeiro == null)){
            while(drop != null){
                if(drop.getNome().equals(nome)){
                    
                    if(drop.getProx() == null){
                        ultimo = auxiliar;
                        ultimo.setProx(null);
                        drop = null;
                        tamanho--;
                        break;
                    }else{
                        auxiliar.setProx(drop.getProx());
                        drop.setProx(null);
                        drop = null;
                        tamanho--;
                        break;
                    }
                }
            drop = (Agenda<GENERIC>) drop.getProx();
            auxiliar = (Agenda) auxiliar.getProx();
            }
        }
    }
    
    public void buscar(GENERIC nome){
        Agenda<GENERIC> auxiliar = (Agenda<GENERIC>) primeiro.getProx();
        int comparador = 0;
           
        while(auxiliar != null){
            if(auxiliar.getNome().equals(nome)){
                System.out.println("Nome: " + auxiliar.getNome());
                System.out.println("Telefone: " + auxiliar.getTelefone());
                comparador = 1;
                break;
            } auxiliar = (Agenda<GENERIC>) auxiliar.getProx();
        } 
        
        if(comparador != 1){
            System.out.println("Palavra não encontrada");
        }
    }
    
    
}
