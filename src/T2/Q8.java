package T2;

import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();

        numOfCars.add(5);
        milesPerHour.add(66.5);
        display(numOfCars);
        display(milesPerHour);
    }

    public static void display(ArrayList<?>list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        /*
        for(Object i : list){
            System.out.println(i);
        }
        */
    }
}
