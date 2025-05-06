package Creational_Design_Patterns.Singleton_Pattern.Bill_Pugh_Singleton;

public class main {
    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();
    }
}
