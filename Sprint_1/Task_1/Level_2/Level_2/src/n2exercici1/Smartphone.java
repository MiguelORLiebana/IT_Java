package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge  {

    Smartphone(String marca, String model){
        this.marca = marca;
        this.model = model;
    }
    public void fotografiar(){
        System.out.println("S’està fent una foto");
    }

    public void alarma(){
        System.out.println("Està sonant l’alarma");
    }
}
