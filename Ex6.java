import java.util.Scanner;
public class Ex6 {
    static String convertBin(int n){
        String numBin = "";
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "1";
        }
        if(n/2 == 0){
            return numBin;
        }
        if(n < 0 ){
            throw new IllegalArgumentException("Número inválido");
        }
        
        return numBin.concat(String.valueOf(convertBin(n/2) + (n%2)));
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número que deseja seu binário");
        int num = t.nextInt();
        System.out.println("O número binário de " + num + " é " + convertBin(num));
    }
}
