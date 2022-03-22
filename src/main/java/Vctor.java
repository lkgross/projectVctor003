import java.util.Arrays;

public class Vctor {

    private double[] elements;

    public Vctor(double[] arr) {
        elements = new double[arr.length];
        // Use a loop to copy the elements of the parameter
        // into the field elements.
        for (int i = 0; i < arr.length; i++) {
            elements[i] = arr[i];
        }
    }

    public int getDimension() {
        return elements.length;
    }

    @Override
    public String toString() {
        return "Vctor{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public double geometricLength() {
        double value = 0;
        for (int i = 0; i < elements.length; i++) {
            value += Math.pow(elements[i], 2.0);
        }
        return Math.sqrt(value);
    }

    public Vctor addVector(Vctor other){
        Vctor vect = new Vctor(other.elements);
        for (int i = 0; i < elements.length; i++) {
            vect.elements[i] = elements[i] + other.elements[i];
        }
        return vect;
    }

    public double dotProduct(Vctor v2) {
        if (elements.length != (v2.elements).length) {
            throw new IllegalArgumentException();
        }
        double value = 0.0;
        for (int i = 0; i < elements.length; i++)
            value += elements[i] * v2.elements[i];
        return value;
    }


}
