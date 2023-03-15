public class Nomes {
    public static final String Faculdade = null;

    String nome;
    int idade;
    boolean cursando;

    void cursando (){
        if (cursando){
            System.out.println("está cursando");
            return;
        }
        else {
            System.out.println("Trancou");
        }
    }

    String resumoPessoa(){
        return  "O "+ nome + " de " + idade +" anos "+  cursando;
    } 

}
