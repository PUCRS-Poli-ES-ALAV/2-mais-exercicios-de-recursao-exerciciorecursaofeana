import java.util.Scanner;
public class Ex3{
    static int fibonacci(int n) throws Exception{
        if(n <= 1)
        {
            return n;
        }
        if(n < 0){
             throw new Exception("Número inválido");
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) throws Exception {
    Scanner t = new Scanner(System.in);
    System.out.println("Digite a posição que deseja seu Fibonacci");
    int num = t.nextInt();
        System.out.println("O Fibonacci de " + num + " é " + fibonacci(num) );
    }
}