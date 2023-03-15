public class Dados {
    public static void main(String[] args) {

        Nomes daPessoa = new Nomes();
        daPessoa.cursando = true;
        daPessoa.idade = 32;
        daPessoa.nome = "Josias";   
        
        Faculdade universidade = new Faculdade();
        universidade.curso = "ADS";
        universidade.instituição = "Fasipe";
        universidade.semestre = 3;

        System.out.println(daPessoa.resumoPessoa());

        System.out.println("______________________");
    
        System.out.println(universidade.resumoFaculdade());
    
    
    }
}
