package hr.fer.oop.pred_11_04;

public class Pair<U, V> {
    private U first;
    private V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static void printAll(Pair<?, ?>... pairs) {
        for (Pair<?, ?> p : pairs) {
            System.out.println("Prvi: " + p.getFirst().toString());
            System.out.println("Drugi: " + p.getSecond().toString());
        }
    }
}
