package arraylist;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        // създаване на ArrayList от целочислени елементи
        ArrayList<Integer> arr = new ArrayList<>();

        // добавяне на елементи
        arr.add(11);
        arr.add(22);
        arr.add(33);
        arr.add(44);
        arr.add(55);

        // разпечатване на листа
        System.out.println("Content of ArrayList : " + arr);
        System.out.println();

        // премахване на елемент (по индекс)
        System.out.println("Remove element at index [2]");
            arr.remove(2);
        System.out.println("Content of ArrayList : " + arr);
        System.out.println();

        // премахване на елемент (по стойност)
        System.out.println("Remove element with value (22)");
            arr.remove(Integer.valueOf(22));
                // или по втори начин : arr.remove(arr.equals(22))
        System.out.println("Content of ArrayList : " + arr);
        System.out.println();

        // вмъкване на елемент
        System.out.println("Add element (66) at index [2] " );
            arr.add(2,66);
        System.out.println("Content of ArrayList : " + arr);
        System.out.println();
    }
}
