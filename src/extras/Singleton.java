package extras;

public class Singleton {
    protected static Singleton unicaInstancia;

    protected Singleton(){}

    public static synchronized Singleton getInstance(){
        if(unicaInstancia == null){
            unicaInstancia = new Singleton();
        }
        return unicaInstancia;
    }
}
