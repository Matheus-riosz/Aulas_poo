
public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Cachorro("Fido"));
        animais.add(new Gato("Mia"));
        animais.add(new Gato("Tom"));




        for (Animal animal : animais) {
            animal.dormir();
            animal.fazerSom();
        }
    }
}
