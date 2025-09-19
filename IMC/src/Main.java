public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Matheus", 105, 1.89);

        Pessoa atleta1 = new Atleta("Victor", 83, 1.76, "Musculação");


        System.out.println("Pessoa comum:");
        p1.mostrarDetalhes();


        System.out.println("Atleta de alto rendimento:");
        atleta1.mostrarDetalhes();
    }
}
