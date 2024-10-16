import java.util.Scanner;
public class Ex5{

    static boolean isPal(String s) {
        if(s.equals("")){
            return true;
        }
        if(s.equals(null)){
            return false;
        }

        if(s.length() == 1){
            return true;
        }

        if((s.charAt(0) != s.charAt(s.length()-1))){
            return false;
        }
        
        return isPal(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Escreva uma palavra ou frase:");
        String s = t.nextLine();
        System.out.println("A palavra/frase " + s + " é um palíndrome? " + isPal(s));
    
    }
}
