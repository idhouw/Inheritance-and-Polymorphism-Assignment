public class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Luas: " + hitungLuas());
    }

}
