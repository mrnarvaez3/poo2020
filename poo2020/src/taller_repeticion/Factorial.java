package taller_repeticion;

public class Factorial {
    private int numero;
    private int factorial = 1;

    public Factorial(int numero){
        this.numero = numero;
    }
    public int calcularFactorial(){
        for (int i = 1; i <= numero; i++) {
            factorial = i*factorial;
        }
        return factorial;
    }
}
