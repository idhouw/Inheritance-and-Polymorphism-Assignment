public class Main {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar("Merah", 5.0);
        Lingkaran lingkaran = new Lingkaran(3.0, "Biru");
        Silinder silinder = new Silinder(3.0, 10.0, "Hijau");
        bujurSangkar.printInfo();
        lingkaran.printInfo();
        silinder.printInfo();
    }
}
