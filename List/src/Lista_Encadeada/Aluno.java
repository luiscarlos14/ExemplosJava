package Lista_Encadeada;

public class Aluno {
    private String nome;
    private Aluno next;
    
    Aluno(String nome) {
	super();
	this.nome = nome;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getNext() {
        return next;
    }

    public void setNext(Aluno next) {
        this.next = next;
    }
    
    //    
    
}
