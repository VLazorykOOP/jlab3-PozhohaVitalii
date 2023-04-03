package Task2;
import java.util.ArrayList;
public abstract class Conteiner {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public void Add(int A){
        list.add(A);
    }
    public Integer Get(int Ind){
        return list.get(Ind);
    }
    public void Show(){
        System.out.println("Arrey now: " + list);
    }
    public abstract void sort();
    public abstract double norm();
}
