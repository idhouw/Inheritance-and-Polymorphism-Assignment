public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(String warna, double sisi) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Luas: " + hitungLuas());
    }
}
