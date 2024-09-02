/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package targetsistemas;

/**
 *
 *  RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53
 */
public class Target4 {
    public static void main(String[] args) {
        double fatSP = 67836.43;
        double fatRJ = 36678.66;
        double fatMG = 29229.88;
        double fatES = 27165.48;
        double fatOutros = 19849.53;
        double sum = 0;
        
        // Calcula o faturamento total
        sum = fatSP + fatRJ + fatMG + fatES + fatOutros;
        
        // Calcula e imprime as porcentagens de faturamento
        System.out.printf("SP: %.2f%%\n", (fatSP / sum) * 100);
        System.out.printf("RJ: %.2f%%\n", (fatRJ / sum) * 100);
        System.out.printf("MG: %.2f%%\n", (fatMG / sum) * 100);
        System.out.printf("ES: %.2f%%\n", (fatES / sum) * 100);
        System.out.printf("Outros: %.2f%%\n", (fatOutros / sum) * 100);
        
    }
    
    
}
