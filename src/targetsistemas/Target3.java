/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package targetsistemas;

/**
 *
 * @author zelen
 */
public class Target3 {
    public static void main(String[] args) {
        //valores de faturamento diário, não encontrei o json ou xml disponível como fonte dos dados do faturamento mensal;
        double[] faturamentoDiario = {1000.0, 2000.0, 0.0, 1500.0, 3000.0, 0.0, 0.0, 2500.0, 0.0, 1800.0,
                                      2200.0, 0.0, 0.0, 2700.0, 1600.0, 0.0, 2100.0, 0.0, 0.0, 2300.0,
                                      0.0, 0.0, 2400.0, 0.0, 0.0, 2500.0, 0.0, 2900.0, 0.0, 3000.0};

        
        double menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
        double maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
        double mediaMensal = calcularMediaMensal(faturamentoDiario);
        int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoDiario, mediaMensal);

        
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Numero de dias com faturamento acima da media mensal: " + diasAcimaDaMedia);
    }

    // calcular o menor valor de faturamento
    public static double calcularMenorFaturamento(double[] faturamento) {
        double menor = 999999999.99;
        for (double valor : faturamento) {
            if (valor > 0 && valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    //calcular o maior valor de faturamento
    public static double calcularMaiorFaturamento(double[] faturamento) {
        double maior = -999999999.99;
        for (double valor : faturamento) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    // calcular a média mensal dos faturamentos
    public static double calcularMediaMensal(double[] faturamento) {
        double soma = 0.0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                soma += valor;
                diasComFaturamento++;
            }
        }

        if (diasComFaturamento == 0) {
            return 0.0; 
        }

        return soma / diasComFaturamento;
    }

    // contar o número de dias com faturamento acima da média mensal
    public static int contarDiasAcimaDaMedia(double[] faturamento, double media) {
        int contador = 0;
        for (double valor : faturamento) {
            if (valor > media) {
                contador++;
            }
        }
        return contador;
    
    }
}
