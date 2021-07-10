package Mod6Exer2;

//Declaració de clase empleat
public class Empleat{
    //Declaració de variables de classe
    protected String name;
    protected String adress;
    protected String phone;
    protected double salaryMonth;
    protected double aument;
    
    //Declaració del constructor i paràmetres 
    public Empleat(String name, String adress, String phone, double salaryMonth){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.salaryMonth = salaryMonth;
    }
    
    //Declaració setters i getters
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return  name;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return  phone;
    }
    
    
    //Mètodes setter de validació
    public void setValidarBoss(double salaryMonth) throws ArithmeticException{
        if(salaryMonth > 8000){
            aument = salaryMonth * 1.5;
        } else {
            throw new ArithmeticException("El sou del Boss té que ser major " +
                    "de 8000 euros!");
        }
    }
    
    public void setValidarManager(double salaryMonth) throws ArithmeticException{
        if(salaryMonth >= 3000 && salaryMonth < 5000){
            aument= salaryMonth * 1.1;
        } else {
            throw new ArithmeticException("El sou d´un Manager oscil.la " +
                    "entre 3000 i 4999 euros!");
        }
    }
    
    public void setValidarVolunteer(double salaryMonth) throws ArithmeticException{
        if(salaryMonth == 0){
            aument = salaryMonth;
        } else {
            throw new ArithmeticException("El Volunter no cobra!");
        }
    }
    
    public void setValidarSenior(double salaryMonth) throws ArithmeticException{
        if(salaryMonth >= 2700 && salaryMonth < 4000){
            aument = salaryMonth * 0.85;
        } else {
            throw new ArithmeticException("El sou d´un Senior oscil.la " +
                    "entre 2700 i 3999 euros!");
        }
    }
    
    public void setValidarMind(double salaryMonth) throws ArithmeticException{ 
        if(salaryMonth >= 1800 && salaryMonth < 2500){
            aument = salaryMonth * 0.9;
        } else {
            throw new ArithmeticException("El sou d´un Mind oscil.la " +
                    "entre 1800 i 2499 euros!");
        }
    }
    
    public void setValidarJunior(double salaryMonth) throws ArithmeticException{
        if(salaryMonth >= 900 && salaryMonth < 1599){
            aument = salaryMonth * 0.95;
        } else {
            throw new ArithmeticException("El sou d´un Junior oscil.la " + 
                    "entre 900 i 1599 euros!");
        }
    }
    
    public double getSouTotal(){
        return aument;
    }
    
    //Mètode getter per llistar les dades del empleat per consola
    @Override
    public String toString(){
        return "name=" + name + ", adress=" + adress + ", phone=" + phone +
                ", SalaryPerMonth=" + salaryMonth + ", totalP=" + aument;
    }

}
    
