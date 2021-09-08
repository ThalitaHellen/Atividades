/**
 * Crie um programa que leia o nome e a idade digitada pelo usuário, 
 * mais o valor do ingresso de cinema. Se a pessoa for idosa 
 * (idade maior ou igual a 60),  pagará a metade do ingresso.
 */
import java.util.Scanner;
    public class Exercicio2
{
    public static void main(String [] args){
      Scanner ler = new Scanner(System.in);
      
      String nome;
      double valor;
      valor = 10.00;
      int idade;
      
      System.out.println(" Digite Seu nome " );
      nome = ler.nextLine();
      System.out.println(" Digite sua idade " );
      idade = ler.nextInt();
      
      if (idade >= 60) {
          System.out.println(" O valor do ingresso é: " + (valor / 2));
    }
    else{
        System.out.println(" O valor do ingresso é: 10,00 ");
    }
    }
}