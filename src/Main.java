import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Object [] arr = {1.0,"jhjhj",3,'4',true};
        changeElement(arr,1,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void changeElement( Object[] arr, int number1, int number2){
        Object obj = arr[number1];
        arr[number1]= arr[number2];
        arr[number2] = obj;
    }

}
