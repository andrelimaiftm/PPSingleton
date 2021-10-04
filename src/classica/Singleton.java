package classica;

public class Singleton {
    private static Singleton unicaInstacia;

    //outras declarações pertinentes a sua implementação

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(unicaInstacia == null){
            unicaInstacia = new Singleton();
        }
        return unicaInstacia;
    }
}
