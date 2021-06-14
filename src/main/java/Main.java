import fruits.Apple;
import fruits.Box;
import fruits.Orange;

import java.util.ArrayList;

public class Main {
    public static void printArray(Object[] array)
    {
        for (Object element:array)
        {
            System.out.print(element+" ,");
        }
        System.out.println();
    }

    public static void Job1(Object[] array,int index1, int index2){
        if (array.length<=index1||array.length<=index2||index1<0||index2<0){
            System.out.println("Index выходит за пределы массива");
            return;
        }
        Object temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static ArrayList<Object> convert(Object[] array){
        ArrayList<Object> result = new ArrayList();
        for (Object element:array)
        {
            result.add(element);
        }
        return result;
    }

    public static void main(String[] args) {
        //задача 1
        Integer[] abs = {1,2,3,4,5,6,7,8,9};
        Job1(abs,0,1);
        Job1(abs,8,7);
        printArray(abs);

        //задача 2
        ArrayList<Object> intArrayList = convert(abs);
        System.out.println(intArrayList);

        //задача 3
        Box box1 = new Box();
        System.out.println("Коробка 1-"+box1);
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        System.out.println("Коробка 1-"+box1);

        Box box2 = new Box();
        System.out.println("Коробка 2-"+box2);
        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());
        System.out.println("Коробка 2-"+box2);

        Box box3 = new Box();
        box3.add(new Orange());
        box3.add(new Orange());
        box3.add(new Orange());
        box3.add(new Orange());
        System.out.println("Коробка 3-"+box3);

        box1.pour(box2);
        System.out.println("Коробка 1-"+box1);
        System.out.println("Коробка 2-"+box2);


    }
}
