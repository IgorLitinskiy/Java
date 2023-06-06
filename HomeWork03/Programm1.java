// Дан произвольный список целых чисел, удалить из него все четные числа
import java.util.ArrayList;
public class Programm1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = Lib.FillRandomArray(20);
        Lib.PrintArray(array);
        DeleteEvenNumber(array);
        Lib.PrintArray(array);
    }
   public static void DeleteEvenNumber(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}