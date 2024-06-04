package PrimeiroPasso;

public class Operadores {
    public static void main(String[] args) {
        String nome1 = "Lucas cunha";
        String nome2 = new String("Lucas cunha");
        String nome3 = "Lucas de Souza";

        boolean NomeIgual = nome1 == nome2;

        if (nome1 != nome3) {System.out.println("O nome1 é diferente do nome3");
            
        }

        System.out.println("usando o comando EQUALS o nome 1 é igual ao nome 2 "+ nome1.equals(nome2));

        System.out.println("sem usar o comando EQUALS o nome 1 é igual a nome2? "+ NomeIgual);

        int numero1 = 1;
        int numero2 = 2;

        boolean SimouNao = numero1 == numero2;
        
        if (numero1 < numero2) {
            System.out.println("o numero 1 é menor que o numero dois");}

        System.out.println("numero 1 é igual a numero 2? " + SimouNao);}}


