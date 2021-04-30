package Lista_Encadeada;

public class Vetor {
    
    private Aluno primeiro;
    private Aluno ultimo;
    
    private int totalAlunos;
    
    public void adicionaFinal(String nome){       
    
        Aluno novo = new Aluno(nome);
		
	if(this.primeiro == null){
            this.primeiro = novo;
            this.ultimo = novo;
	} else {
            this.ultimo.setNext(novo);
            this.ultimo = novo;
	}
        this.totalAlunos++;
    } 
    
    public void removeFinal(){
        
        Aluno auxiliar = primeiro, anterior = primeiro;
   
        if(this.primeiro == null){
            System.out.println("Lista Vazia!");
        } else {
            while(auxiliar.getNext() != null){
                anterior = auxiliar;
                auxiliar = auxiliar.getNext();
            }  
            
            anterior.setNext(null);
            this.ultimo = anterior;
        } 
        this.totalAlunos--;       
    }
    
    public void adicionaInicio(String nome){
        
    Aluno novo = new Aluno(nome), auxiliar = primeiro;
  
    if(this.primeiro == null){
        this.primeiro = novo;
    } else{
          this.primeiro = novo;
          primeiro.setNext(auxiliar);    
        }
    this.totalAlunos++;
    }

    public void removeInicio(){
        
        Aluno atual = primeiro, remover = primeiro;
            
        if(primeiro == null){
            System.out.println("Lista Vazia");
        } else{
            while(atual != null){
                if(atual.getNext().equals(remover.getNext())){
                    if(atual == this.primeiro){
                        this.primeiro = this.primeiro.getNext();
                        atual = null;
                        break;
                    }
                }       
            }
        }
        this.totalAlunos--;
    }
    
    public void removeQualQuerPosicao(String nome){
        
        Aluno anterior = primeiro, atual = primeiro;
    
        if(this.totalAlunos == 0){
            System.out.println("Impossível Excluir! A lista está vazia");
        } else{
            while(atual!=null){
                if(atual.getNome().equals(nome)){
                    if(atual == primeiro){
                        primeiro = primeiro.getNext();
                        atual.setNome(null);
                        break;
                    } else{
                        if(atual == ultimo){
                            ultimo = anterior;
                        }
                        anterior.setNext(atual.getNext());
                        atual.setNome(null);
                        break;
                    }
                } else{
                    anterior = atual;
                    atual = atual.getNext();
                }
            }
        }  
        this.totalAlunos--;
    }
    
    public void encontrarAluno(String nome){
        
        Aluno auxiliar = primeiro;
        int contador = 0;
        
        while(auxiliar != null){
            if (auxiliar.getNome() == nome) {
                contador ++;
                break;
            } else {
                auxiliar = auxiliar.getNext();
            }
        }
        if(contador ==0){
            System.out.printf("O aluno %s não está presente na lista!", nome); 
        }else{
            System.out.printf("O aluno %s está presente na lista!", nome); 
        }
            
    }
   
    public void verificarListaVazia(){
        
        if(this.totalAlunos <=0){
            System.out.println("Lista Vazia!");
        }else{
            System.out.printf("A lista não está vazia! Existem %d aluno(s) matriculado(s)! ", this.totalAlunos);
        }
    }
    
    public String exibirAlunos() {
        
		Aluno print = this.primeiro;
                
		StringBuilder sb = new StringBuilder();
		sb.append("---------------------------\n");
                if(this.totalAlunos == 0){
                   return "Não há Alunos Cadastrados!";
                }else{
		while(print.getNext()!=null) {
//			System.out.println(elemento.getInfo());
			sb.append(print.getNome() + "\n");
			print = print.getNext();
		}
                
		sb.append(print.getNome());
		sb.append("\n---------------------------");
		return sb.toString();
	}
    }
    
  
}
