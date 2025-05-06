package Creational_Design_Patterns.Factory_pattern;

public class main {

    public static void main(String args[]){
        Computer PC = ComputerFactory.getComputer("PC","2Gb","1Tb","1.2GHz");
        Computer Server = ComputerFactory.getComputer("Server","24Gb","100Tb","5.0GHz");

        System.out.println("Factory PC Config::"+ PC);
        System.out.println("Factory Server Config::"+Server);
    }




}
