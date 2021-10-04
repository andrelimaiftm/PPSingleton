package extras;

public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton f = CoolerSingleton.getInstance();
        Singleton b = HotterSingleton.getInstance();
        System.out.println(f);
        System.out.println(b);
    }
}
