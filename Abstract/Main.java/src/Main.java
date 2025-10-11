//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Circulo circulo = new Circulo("Azul", 3);
        Retangulo retangulo = new Retangulo("Verde", 4.0, 5.0);


        circulo.exibirDetalhes();
        retangulo.exibirDetalhes();
    }
}