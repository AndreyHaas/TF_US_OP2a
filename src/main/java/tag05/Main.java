package tag05;

public class Main {
    public static void main(String[] args) {
        EinSingleton instance0 = EinSingleton.getInstance();
        EinSingleton instance1 = EinSingleton.getInstance();
        EinSingleton instance2 = EinSingleton.getInstance();

        System.out.println("i0.equals(i1) is " + instance0.equals(instance1));
        System.out.println("i1.equals(i2) is " + instance1.equals(instance2));
        System.out.println("i2.equals(i0) is " + instance2.equals(instance0));
    }
}
