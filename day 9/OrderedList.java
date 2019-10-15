class OrderedList extends AbstractList {
    public void add(int item) {
        list[size++] = item;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i; j >0; j--) {
            if (list[j] < list[j-1]) {
                temp = list[j];
                list[j] = list[j - 1];
                list[j - 1] = temp;
            }  
        }  
        } 
    }
}
