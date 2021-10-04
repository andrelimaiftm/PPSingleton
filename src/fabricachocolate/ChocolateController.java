package fabricachocolate;

public class ChocolateController {
    public static void main(String[] args) {
        ChocalateBoiler caldeirao = ChocalateBoiler.getInstance();
        caldeirao.encher();
        caldeirao.ferver();
        caldeirao.drenar();

        //retorna a instancia ja criada
        ChocalateBoiler caldeirao2 = ChocalateBoiler.getInstance();
    }
    
}
