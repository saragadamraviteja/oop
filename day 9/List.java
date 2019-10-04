class List extends AbstractList {

    public void add(int item) {
        if (size == list.length) {
            list = resize(list);
        }
        list[size++] = item;
    }
} 