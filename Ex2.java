import java.util.Scanner;
public class Ex2{

    static int somatorio(int n){
        if(n == 0){
            return n;
        }
        return n+somatorio(int n-1);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o número que deseja seu somatório:");
        int num = t.nextInt();
        System.out.println("O somatório de " + num + " até 0 é " + somatorio(num));
    
    }
}
