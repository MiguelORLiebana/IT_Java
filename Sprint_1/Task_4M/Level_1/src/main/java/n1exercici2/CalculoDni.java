package n1exercici2;

public class CalculoDni {

    public String calcularLletra(Integer numDni){

        if(10000001 <= numDni && numDni < 20000000) {return "A";}
        else if(20000000 <= numDni && numDni < 30000000) {return "B";}
        else if(30000000 <= numDni && numDni < 40000000) {return "C";}
        else if(40000000 <= numDni && numDni < 50000000) {return "D";}
        else if(50000000 <= numDni && numDni < 60000000) {return "E";}
        else if(60000000 <= numDni && numDni < 70000000) {return "F";}
        else if(70000000 <= numDni && numDni < 80000000) {return "G";}
        else if(80000000 <= numDni && numDni < 90000000) {return "H";}
        else if(90000000 <= numDni && numDni < 99999997) {return "I";}
        else return "Z";

    }
}
