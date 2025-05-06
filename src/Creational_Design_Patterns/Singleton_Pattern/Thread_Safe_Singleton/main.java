package Creational_Design_Patterns.Singleton_Pattern.Thread_Safe_Singleton;

public class main {
    public static void main(String args[]) throws InterruptedException {
        Singleton singleton = Singleton.getInstance();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                singleton.showMessage();
                System.out.println(singleton);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                singleton.showMessage();
                System.out.println(singleton);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
