//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Passaro passaro = new Passaro("Papagaio ");
    passaro.voar();
        System.out.println("<==========================>");

    Voavel voador = passaro;
    voador.voar();

        Pato pato = new Pato ("Pato Donald ");
        pato.voar();
        pato.nadar();
    }
}
