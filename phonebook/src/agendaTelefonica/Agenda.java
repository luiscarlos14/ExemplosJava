
package agendaTelefonica;

public class Agenda<GENERIC> {
    
    private GENERIC nome;
    private GENERIC telefone;
    private Agenda<GENERIC> prox;
    
    Agenda(){}

    public GENERIC getNome() {
        return nome;
    }

    public void setNome(GENERIC nome) {
        this.nome = nome;
    }

    public GENERIC getTelefone() {
        return telefone;
    }

    public void setTelefone(GENERIC telefone) {
        this.telefone = telefone;
    }

    public Agenda getProx(){
        return prox;
    }
  
    public void setProx(Agenda prox){
        this.prox = prox;
    }

  
    
}
