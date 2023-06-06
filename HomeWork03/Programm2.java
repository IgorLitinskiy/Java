import java.util.ArrayList;

//Найти максимальное, минимальное и среднее из списка.

public class Programm2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = Lib.FillRandomArray(20);
        Lib.PrintArray(array);
        int maxElement = findMax(array);
        int minElement = findMin(array);
        Double avgElement = findAvg(array);
        System.out.printf("Максимальное значение: %d \n", maxElement);
        System.out.printf("Минимальное значение: %d \n", minElement);
        System.out.printf("Среднее значемние: %.2f \n", avgElement);
        
    }
    public static int findMax(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    public static int findMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int element : arr){
            if(element < min) min = element;
        }
        return min;
    }
    public static Double findAvg(ArrayList<Integer> arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        Double avg = Double.valueOf(sum)/Double.valueOf(arr.size());
        return avg;
    }
}