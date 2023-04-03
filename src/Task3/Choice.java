package Task3;

public class Choice implements ConteinerINTER{
    @Override
    public void sort() {
        int n = list.size();
        for (int i = n-1; i >= 0; i--) {
            // find the index of the maximum element in the unsorted portion of the list
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            // swap the maximum element with the last element in the unsorted portion of the list
            int temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }

    @Override
    public double norm() {
        int sum = 0;
        double result;
        for (Integer a: list){
            sum+=a;
        }
        result = (double) sum / list.size();
        System.out.println(result);
        return result;
    }
    @Override
    public String toString(){

        return "List elem: " + list.toString() + "  Size of all: " + list.size();
    }
}
