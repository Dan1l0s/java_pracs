package prac_27;

public class Array<T> {
    private T[] array;
    Array(T[] array) {this.array =  array;}
    public void setElement(T obj, int id) {if (id < array.length) array[id] = obj;}
    public T getElement(int i) {return  array[i];}
    public int getSize() {return  array.length;}
    public void print(){
        System.out.println("Type: "+array.getClass().getTypeName());
        for(int i = 0; i< getSize(); ++i)
            System.out.print(getElement(i)+" ");
        System.out.print("\n");
    }
}

