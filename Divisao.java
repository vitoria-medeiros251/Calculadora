public class Divisao extends Operacao { //herdan da classe abstrata operacao e implemmenta o metodo calcular 
    @Override
    public double calcular(double a, double b){
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }

}
