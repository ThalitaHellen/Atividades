
/**
 * Criar um algoritmo onde digita-se:
- Nome do aluno
- Disciplina;
-  Nota1, nota2 e nota3;
- Frequência do aluno;
O programa deverá retornar o nome, a disciplina,
a média final (n1 + n2 + n3 / 3) e se o aluno está aprovado
(aprovado com frequência igual e superior a 75% e média >= 6).
 */
import java.util.Scanner;
public class Exercicio4{
    public static void main(String [] args){
      Scanner ler = new Scanner(System.in);
      
      String nome;
      String disciplina;
      double n1, n2, n3;
      double media;
      int frequencia;
  
      
      System.out.println("Nome do aluno " );
      nome = ler.nextLine();
      
      System.out.println("Disciplina " );
      disciplina = ler.nextLine();
      
      System.out.println("Frequência " );
      frequencia = ler.nextInt();
      
      System.out.println("Nota N1 " );
      n1 = ler.nextDouble();
      
      System.out.println("Nota N2 " );
      n2 = ler.nextDouble();
      
      System.out.println("Nota N3 " );
      n3 = ler.nextDouble();
      
      media = (n1 + n2 + n3) /3;
      
    if (frequencia >= 75 && media >= 6) {
         System.out.println("ALUNO APROVADO!" + "\n" + nome + "\n" + disciplina + "\n" + media);
        
    }
    else{
         System.out.println("ALUNO REPROVADO!" + "\n" +  nome + "\n" + disciplina + "\n" + media  );
    }
      
      
    }
}   