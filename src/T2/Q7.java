package T2;

import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        allTransportation(vehicle, transportation);
    }

    public static <E> void allTransportation(ArrayList<E>list, ArrayList<? super E> list2){}

    //or  public static <E> void allTransportation(ArrayList<? extends E>list, ArrayList<E> list2){}
}
