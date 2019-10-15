import java.util.Arrays;
public abstract class AbstractList implements ListInterface {
    int [] list;
    int size;
    AbstractList() {
        list = new int [10];
        size = 0;
    }
     
    public int size() {
        return size;
    }

    public int get(int index) {
        if (index >= 0 && index < size){
        return list[index];
        }
        return -1;
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++){
        if (item == list[i]) {
            return i; 
        } 
        } return -1;
    }

    public boolean contains(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
        } return false;
    }

    public void remove (int index) {
        if (size > index) {
        for (int i = index; i < size; i++) {
            list[i] = list[i+1];
            }
            list[size--] = 0;
        }
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size-1; i++) {
        str += list [i] + "," ;
       }
       str += list[size -1] + "]";
       return str;
}

public int[] resize(int[] arr) {
    return Arrays.copyOf(arr, 2*size);
}
}

