package Util;

public class Hashmap<E> {

    private E[] hashTable;

    public Hashmap(int size) {
        hashTable = (E[]) new Object[size];
    }

    public int hash(E item) {
        int total = 0;
        for (int i = 0; i < item.toString().length(); i++) {
            total += item.toString().charAt(i); //Adds the value of the ASCII character to the total
        }

        //Makes sure that the indexes are within the bounds of the hash
        return total % hashTable.length;
    }

    public void insert(E value) {
        int index = hash(value);
        for (int i = 0; i <= hashTable.length; i++) {
            //If the selected index reaches then end of the table go back to the start and try again
            if (hashTable[index] != null) {
                if (index >= hashTable.length - 1) {
                    index = 0;
                } else {
                    index++; //if the selected index is full go to the next one
                }
            } else {
                hashTable[index] = value; //Insert value into the index
                return;
            }
        }
    }
}