
package GenericSimpleList;

public class Show_LinkedList {

    public static void main(String[] args) {
        
        Linked_List<String> list = new Linked_List<String>();
        
        list.add("Luis");
        list.add("Miguel");
        list.add("Gabriel");
        
        list.show();
        
        list.delete("Miguel");
        
        list.show();
        
        
    }
    
}
