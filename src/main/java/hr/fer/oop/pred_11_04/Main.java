package hr.fer.oop.pred_11_04;

public class Main {
    public static void main(String[] args) {
        Pair<?, ?> pair1 = new Pair<>(false, 4.5);
        Pair<?, ?> pair2 = new Pair<>("a", 2);
        Pair.printAll(pair1, pair2);
    }
}
