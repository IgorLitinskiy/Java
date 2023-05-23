// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
import java.util.ArrayList;

public class Program3{
    //public static ArrayList<Integer> arrayMult(int i, int n, int max) {
    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {   
        ArrayList<Integer> list = new ArrayList<Integer>();
        //for (int j = i + 1; j <= max; ++j) {
        //if (j % n == 0) {
        for (int j = i - 1; j >= min; j--) {
        if (j % n != 0) {
            list.add(j);
            }
        }
        return list;
    }
}