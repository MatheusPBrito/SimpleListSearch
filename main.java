import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main (String ... args){
    Scanner input = new Scanner(System.in);
    int[] numberList = {1,5,3,2,19,42,32};
    int chosenNumber = 0;
    boolean containsNumber = false;
    while (true){
      while(true){
        System.out.println("A lista é " + Arrays.toString(numberList));
        System.out.print("Qual item buscar a posição: ");
        if (input.hasNextInt()){
          chosenNumber = input.nextInt();
          break;
        }
        else{
          System.out.println("Valor invalido");
          input.nextLine();
        }
      }

      for (int i = 0; i < numberList.length; i++){
        if (numberList[i] == chosenNumber){
          System.out.println("A posição do item " + numberList[i] + " é " + (i + 1) );
          containsNumber = true;
          break;
        }
        else
          containsNumber = false;
      }

      if(containsNumber == false)
        System.out.println("Não existe esse número na lista");
      else
        break;
    }
  }
}
