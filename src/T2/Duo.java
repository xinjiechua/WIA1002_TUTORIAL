package T2;

public class Duo <A,B>{
    private A first;
    private B second;

    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo <>("ABC",123);
        Duo<Double,Double> points = new Duo<>(3.33,8.88);

        System.out.println("First: " + sideShape.first + " Second: " + sideShape.second);
        System.out.println("First: " + points.first + " Second: " + points.second);
    }
}
