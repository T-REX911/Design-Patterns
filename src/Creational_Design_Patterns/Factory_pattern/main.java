package Creational_Design_Patterns.Factory_pattern;

public class main {

    public static void main(String args[]){
        Computer PC = ComputerFactory.getComputer("PC","4Gb","4Tb","2.4GHz");
        Computer Server = ComputerFactory.getComputer("Server","48Gb","100Tb","5.0GHz");

        System.out.println("Factory PC Config::"+ PC);
        System.out.println("Factory Server Config::"+Server);
    }




}
