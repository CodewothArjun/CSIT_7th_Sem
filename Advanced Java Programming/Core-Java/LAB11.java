public class LAB11 {
    // ── BoxDemo.java ──────────────────────────────────────
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10, 5, 3, 2.5);
        BoxWeight b2 = new BoxWeight(4, 4, 4, 1.0);
        System.out.println("--- Box 1 ---");
        b1.display();
        System.out.println("--- Box 2 ---");
        b2.display();
    }
}

// ── Box.java ──────────────────────────────────────────
class Box {
    double length, breadth, height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double getVolume() {
        return length * breadth * height;
    }
}

// ── BoxWeight.java ────────────────────────────────────
class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h); // call superclass constructor
        weight = w;
    }

    void display() {
        System.out.println("Volume : " + getVolume());
        System.out.println("Weight : " + weight + " kg");
    }
}
