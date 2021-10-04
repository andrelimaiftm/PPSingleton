package bd;

public class ClienteBD {

    public static void main(String[] args) {
        ConexaoBD bd = ConexaoBD.getInstance();
        System.out.println(bd.getInstance());
        ////o codigo necessario

        //sera a mesma instancia de bd
        ConexaoBD bdNovo = ConexaoBD.getInstance();
        System.out.println(bdNovo.getInstance());
    }
    
}
