package fabricachocolate;

public class ChocalateBoiler {
    private boolean vazio;
    private boolean fervendo;
    private static ChocalateBoiler unicaInstancia;

    private ChocalateBoiler(){
        this.vazio = true;
        this.fervendo = false;
    }

    public static ChocalateBoiler getInstance(){
        if(unicaInstancia == null){
            System.out.println("Criando a unica instacia do Chocolate Boiler");
            unicaInstancia = new ChocalateBoiler();
        }
        System.out.println("Retornando a instancia do Chocolate Boiler");
        return unicaInstancia;
    }

    public void encher(){
        if(isVazio()){
            this.vazio = false;
            this.fervendo = false;
            //enche o caldeirão com uma mistura de chocolate com leite
        }        
    }

    public void drenar(){
        if(!isVazio() && isFervendo()){
            //ele esvaziar o caldeirão de leito com chocolate
            this.vazio = true;
        }
    }

    public void ferver(){
        if(!isVazio() && !isFervendo()){
            this.fervendo = true;
        }
    }
    

    /**
     * @return boolean return the vazio
     */
    public boolean isVazio() {
        return vazio;
    }

    /**
     * @param vazio the vazio to set
     */
    public void setVazio(boolean vazio) {
        this.vazio = vazio;
    }

    /**
     * @return boolean return the fervendo
     */
    public boolean isFervendo() {
        return fervendo;
    }

    /**
     * @param fervendo the fervendo to set
     */
    public void setFervendo(boolean fervendo) {
        this.fervendo = fervendo;
    }

}
