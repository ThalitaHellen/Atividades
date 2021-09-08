/**
 * Elabore um algoritmo que leia do teclado o sexo de uma pessoa.
 * Se o sexo digitado for M ou F, escrever na tela “Sexo Masculino ou Feminino!”.  Caso contrário, informar “Terceiro Sexo!”.
 */
import java.util.Scanner;
public class Exercicio3{
    public static void main(String [] args){
        String sexo;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o seu gênero");
        sexo = ler.nextLine();
        
        switch (sexo){
            case "F": 
                System.out.println("seu gênero é feminino");
            break;
            
            case "f": 
                System.out.println("seu gênero é feminino");
            break;
            
            case "M":
                System.out.println("seu gênero é masculino");
            break;
            
            case "m":
                System.out.println("seu gênero é masculino");
            break;
            
            default:
                System.out.println("seu gênero é terceiro");
        }
    }
}