package targetsistemas;

import java.util.Scanner;
 
public class Target1e2 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // Questao1
        int indice = 13;
        int soma = calculateSum(indice);
        System.out.println("O valor de SOMA: " + soma);
        
        
        
        
        
        //Questao2
        System.out.print("Informe um numero: ");
        int number = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        boolean isFibonacci = isFibonacciNumber(number);
        if (isFibonacci) {
            System.out.println("O numero " + number + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + number + " nao pertence a sequencia de Fibonacci.");
        }
        scanner.close();
        
        
        
    }
    
    //funcao da q1
    public static int calculateSum(int indice) {
        int soma = 0;
        int k = 0;
        
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        
        return soma;
    }
    
    
    //funcao da q2
    public static boolean isFibonacciNumber(int number) {
        if (number < 0) return false; 
        if (number == 0 || number == 1) return true; 
        
        int a = 0;
        int b = 1;
        int next = a + b;

        
        while (next <= number) {
            if (next == number) {
                return true; 
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false; 
    }
    
}
