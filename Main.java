import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // prob1:
    int num = 0;
    int sum = 0;
    while (num != -1){
      System.out.print("Enter a number (Type -1 to stop): ");
      num = sc.nextInt();
      sum += num;
    }
    sum++;
    System.out.println("Sum: " + sum);

    // prob2:
    num = 0;
    int max = Integer.MIN_VALUE;
    int i = 0;
    System.out.print("How many numbers do you want to input?: ");
    int count = sc.nextInt();
    while ((i < count)){
      System.out.println("Enter a numer: ");
      num = sc.nextInt();
      if (num > max)
      {
        max = num;
      }
      i++;
    }
    System.out.println("Max: " + max);

    // prob3:
    System.out.println("Input a word:");
    String str = sc.nextLine();
    int index = 0;
    while (index < str.length()){
      if (index % 3 != 2){ //not the third letter
        System.out.println(str.substring(index, index+1)); // would print every letter
      }
      index ++;
    } 
    /* C a l c u l a t o r
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 0 1 2 0 1 2 0 - mod 3
     */
  }
}
