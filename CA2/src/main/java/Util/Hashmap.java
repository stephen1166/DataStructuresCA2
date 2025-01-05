package Util;

public class Hashmap{

    private String[] hashTable;
    private int size=-1;

    public Hashmap(int size){
        this.size=size;
        hashTable=new String[size];
    }

    public int hash(String item){
        int total=0;
        for(int i=0;i<item.length();i++){
            total+=item.charAt(i);
        }
        return total%size;
    }

    public void insert(String value){
        int index=hash(value);
        for(int i=0;i<hashTable[index].length();i++){
            if(hashTable[index]==null){
                hashTable[index]=value;
            }
        }
    }
}
