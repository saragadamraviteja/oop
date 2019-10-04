class OrderedList extends AbstractList {
    public void add(int item) {
        list[size++] = item;
        // int[] arr = new int[];
        int temp;
        for (int i = 0; i < size - 1; i++) {
            temp = list[i];
            if (temp > list[i]) {
                list[i] = list[i+1];
                list[i+1] = temp;
            }    
        } 
        // size += 1; 
    }
}