
package GenericSimpleList;

public class Nodo <GENERIC> {
    
    private GENERIC data;
    private Nodo<GENERIC> next;

    public Nodo(GENERIC data) {
        this.data = data;
    }
    
    public GENERIC getData() {
        return data;
    }

    public void setData(GENERIC data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return this.data + "";
    };
    
    
    
}
