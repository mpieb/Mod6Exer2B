package Mod6Exer2;

public class NewMain {

    public static void main(String[] args) {
        Empleat empleat1 = new Empleat("Pere Boss", "Cerimonios 2", "586231498", 9000);
        empleat1.setValidarBoss(9000);
        
        //Us de poliformisme
        Empleat empleat2 = new NousEmpleats("Toño Junior", "Pere mañà 1", "582147869", 1000);
        empleat2.setValidarJunior(1000);
        
        System.out.println(empleat1);
        System.out.println(empleat2);
    }
    
}
