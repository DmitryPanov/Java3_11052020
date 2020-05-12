import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static Object ArrayList;

    public static void main(String[] args) {

        Object [] arr = {1.0,"jhjhj",3,'4',true};
        chahgeArray(arr);
        System.out.println(chahgeArray(arr));
        changeElement(arr,1,4);
        System.out.println(Arrays.toString(arr));


    }
    private static void changeElement( Object[] arr, int number1, int number2){
        Object obj = arr[number1];
        arr[number1]= arr[number2];
        arr[number2] = obj;
    }

    private static <T> ArrayList<T> chahgeArray(T[] arr){
        ArrayList<T> array_list = new ArrayList<T>();
        Collections.addAll(array_list, arr);
        return array_list;
    }

}
