/**
 * 
 */
public class List extends AbstractList {
    public List() {
        super();
    }
    public List(int capacity) {
        super(capacity);
    }
    public void add(int item) {
        if (size == list.length) {
           resize();
            }
        list[size++] = item; 
        }

    public void add(int index, int item) {
        if (list.length == size) {
            resize();
        }
        if (index < size && index >= 0) {
        // size++;
        for (int i = size; i > index; i--) {
            list[i] =  list[i -1];
        }
        list[index] = item;
        size++;
    }
}
    public void addAll(List lst) {
        // TODO
        // Your code goes here.
        if (list.length == size) {
            resize();
        }
        for (int i = 0; i < lst.size; i++) {
            add(lst.list[i]);
        }
        
    }
    public void addAll(int[] arr ){
        // TODO
        // Your code goes here.
        if(list.length == size) {
            resize();
        }
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
        
    }

}
