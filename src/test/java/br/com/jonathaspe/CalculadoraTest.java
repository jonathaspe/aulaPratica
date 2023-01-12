package br.com.jonathaspe;

public class CalculadoraTest {
    public static void main(String[] args){
        CalculadoraTest calculadora = new CalculadoraTest();

        System.out.println(retornarNumeroDez());
        System.out.println(somarDoisNumeros(20, 30));
        System.out.println(calculadora.somarDoisNumeros(23, 25));
    }

    public static int retornarNumeroDez(){
        return 10;
    }

    public static int somarDoisNumeros(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }
}
