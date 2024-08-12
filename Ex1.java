import java.util.Scanner;
public class Ex1 {

static int fatorial(int n){
    if(n == 0){
        return 1;
    }
    if(n == 1)
    {
        return 1;
    }
    return n*fatorial(n-1);
}
public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.println("Digite um número que deseja seu fatorial");
    int num = t.nextInt();
    System.out.println("O fatorial de " + num + " é " + fatorial(num));

}}