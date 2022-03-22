public class Main {

    public static void main(String[] args) {
        double[] arr = {-1, 0, 1, 0, 0, 0};
        double[] arr2 = {2, 3, 4, 3, 2, 2};
        Vctor vect1 = new Vctor(arr);
        Vctor vect2 = new Vctor(arr2);
        System.out.println(vect1.toString());
        System.out.println(vect1.getDimension());
        System.out.println(Math.sqrt(1 + 4 + 9 + 4));
        System.out.println(vect2.geometricLength());
        System.out.println(vect1.geometricLength());
        System.out.println(Math.sqrt(7));
        System.out.println(vect1.dotProduct(vect2));
        System.out.println(vect1.addVector(vect2));
    }
}
