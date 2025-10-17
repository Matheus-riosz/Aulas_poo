public class Pato implements Voavel, Nadavel {
    public String nome;

    public Pato (String nome){
        this.nome = nome;
    }

    @Override
    public void nadar(){
        System.out.println(nome +" está nadando a "+ VELOCIADADE_MAIXMA + " km/h.");
    }
    @Override
    public void voar(){
        System.out.println(nome + " está voando a " + ALTITUDE_MAXIMA +" metros acima do solo.");
    }
}
