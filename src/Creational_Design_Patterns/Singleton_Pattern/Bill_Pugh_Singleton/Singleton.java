package Creational_Design_Patterns.Singleton_Pattern.Bill_Pugh_Singleton;

public class Singleton {
    private Singleton() {
    }

    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return Holder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from Bill Pugh Singleton!");
    }
}
