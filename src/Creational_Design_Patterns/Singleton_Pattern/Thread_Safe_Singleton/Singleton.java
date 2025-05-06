package Creational_Design_Patterns.Singleton_Pattern.Thread_Safe_Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from synchronized Singleton!");
    }
}
