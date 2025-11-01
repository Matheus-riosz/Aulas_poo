public class Calculadora  {
    public void dividir (int a, int b){
        if (b ==0) {
            throw new DividirPorZeroException("Não é possivel dividir por zero");
        }
        int c = a / b;
    }
}
