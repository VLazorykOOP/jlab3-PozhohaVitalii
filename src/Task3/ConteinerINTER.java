package Task3;

import java.util.ArrayList;

public interface ConteinerINTER {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public default void Add(int A){
        list.add(A);
    }
    public default Integer Get(int Ind){
        return list.get(Ind);
    }
    public default void Show(){
        System.out.println("Arrey now: " + list);
    }
    public abstract void sort();
    public abstract double norm();
}
