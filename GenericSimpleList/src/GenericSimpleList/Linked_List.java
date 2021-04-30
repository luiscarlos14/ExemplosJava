
package GenericSimpleList;

public class Linked_List <GENERIC> {
    
    private Nodo<GENERIC> first;
    private Nodo<GENERIC> last;
    private int size;
    
    
    public void add(GENERIC data){
        
        Nodo<GENERIC> no = new Nodo(data);
        
        if(this.first == null){
            this.first = no;
            this.last = no;
            this.size++;
        }
        else{
            this.last.setNext(no);
            this.last = no;
            this.size++;
            }
        }
    
      public void show(){
          
        Nodo element = this.first;  
        
        while(element != null){     
            System.out.println(element.getData());
            element = element.getNext();
        }
    }
      
      public Nodo search (Object data){
        Nodo element = this.first;
        
        while (element != null){
            if(data.equals(element.getData())){
                return element;
            }
            element = element.getNext();
        }
        return null;
    }
      
        public void delete(GENERIC data){
           
        Nodo<GENERIC> previous = null;
        Nodo<GENERIC> current = this.first;
        
        for (int i = 0; i < this.size; i++){
            if(current.getData().equals(data)){
                if(this.size == 1){
                    this.first = null;
                    this.last = null;
                }
                else if(current == this.first){
                    this.first = current.getNext();
                    current.setNext(null);
                }
                else if(current == this.last){
                    this.last = null;
                    previous.setNext(null);
                }
                else{
                    previous.setNext(current.getNext());
                    current = null;
                }
                this.size--;
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }
  
}
