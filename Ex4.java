import java.util.Scanner;
public class Ex4{

    static int somnum(int k, int j){
        if(k == j){
            return k;
        }
        if(k>j){
            return  j + somnum(k, j+1);
        }
        return k + somnum(k+1, j);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numk = t.nextInt();
        System.out.println("Digite o segundo número:");
        int numj = t.nextInt();
        System.out.println("O somatório de " + numk + " até " + numj + " é " + somnum(numk, numj));
    
    }
}
