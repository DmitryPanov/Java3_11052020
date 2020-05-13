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

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        System.out.println(apple1.getWeight());// проверка веса яблока
        Box<Apple> box1 = new Box<>();
        box1.addFruit(apple2);// Добавляем в коробку яблоко
        box1.addFruit(apple3);
        box1.addFruit(apple1);
        System.out.println(box1.getWeight());// Считаем вес коробки

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Orange> box2 = new Box<>();
        box2.addFruit(orange1);
        box2.addFruit(orange2);
//        System.out.println(box2.getWeight());

//        box2.addFruit(orange3);// Для проверки неравенство веса в разных коробках
        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box2.cloneList(box3);//копируем в коробку 3 список из коробки 2

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
