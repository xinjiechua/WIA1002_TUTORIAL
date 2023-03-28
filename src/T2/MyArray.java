package T2;

/*
2. Create a class called MyArray that has two methods, a main method that creates 3 arrays of
a) integer containing the numbers 1,2,3,4 and 5
b) string containing names, Jane, Tom and Bob
c) character containing alphabet, a, b and c
and a generic method listAll that displays the list of arrays.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray <E> {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jane", "Tom", "Bob"));
        ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('a', 'b', 'c'));

        MyArray.listAll(numbers);
        MyArray.listAll(names);
        MyArray.listAll(alphabet);
    }

    public static <E> void listAll(ArrayList <E> list){
        for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
