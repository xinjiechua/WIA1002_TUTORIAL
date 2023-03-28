package T2;

public class Duo <A,B>{
    A first;
    B second;

    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo <>("ABC",123);
        Duo<Double,Double> points = new Duo<>(3.33,8.88);
    }
}
