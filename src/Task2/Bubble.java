package Task2;
import java.math.*;
public class Bubble extends Conteiner {

    @Override
    public double norm() {
        return 0;
    }
    @Override
    public void sort() {
        boolean swapped = true;
        int n = list.size();
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i-1) > list.get(i)) {
                    // swap elements at index i-1 and i
                    int temp = list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        }

    }
    public boolean equals(Bubble obj){
        boolean A = true;
        if (this.list.size()==0) return false;
        if (obj.list.size()==0)return  false;
        if(this.list.size()!=obj.list.size()){
            return false;
        }
        for(int i=0;i<list.size();i++){
            if(this.list.get(i)!=obj.list.get(i)){
                A=false;
            }
        }
        return A;
    }

    public double foreach(){
        int sum = 0;
        double result;
        for (Integer a: list){
            sum+=a;
        }
        result = Math.sqrt((double) sum);
        System.out.println(result);
        return  result;
    }
}
