
/**
 * Escreva um programa para ler o número de lados de um polígono regular
e a medida do lado (em cm). Calcular e imprimir o seguinte:
 − Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da
    área 
− Se o número de lados for igual a 4 escrever QUADRADO e o valor da
sua área.
 */
import java.util.Scanner;
public class Exercicio6{
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);  
        int lados;
        double medidaLados, base, altura;
        double area;
        
        System.out.println("Digite o numeros de lados: " );
        lados = ler.nextInt();
        
        
                
        
        if (lados == 3){
            System.out.println("Triangulo" );
            System.out.println("Digite a base do triângulo:" );
            base = ler.nextDouble();
            System.out.println("Digite a altura do triângulo:" );
            altura = ler.nextDouble();
            System.out.println("A area do triângulo é:" + (base * altura) );
        }
        else if(lados == 4){
            System.out.println("QUADRADO" );
            System.out.println("_______________________");
            System.out.println("Digite a base do quadrado:" );
            base = ler.nextDouble();
            System.out.println("A area do quadrado é:" + (base * base));
        }
        else{
        System.out.println("Digite o numeros de lados: " );
        lados = ler.nextInt();
        }
    }
}
