package bd;

public class ConexaoBD {

    private volatile static ConexaoBD instance;

    private ConexaoBD(){

    }

    public static ConexaoBD getInstance(){
        if(instance == null){
            synchronized(ConexaoBD.class){
                if(instance == null){
                    instance = new ConexaoBD();
                }
            }
        }
        return instance;
    }
    
}
