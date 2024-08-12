import java.util.Scanner;
public class Ex5{

    static boolean isPal(String s) {
        if(s.equals("")){
            return true;
        }
        if(s == null){
            return true;
        }
        if(s.length() == 1){
            return true;
        }
        if(s.length() == 2){
            return false;
        }
        if(s.substring(0). equals(s.substring(s.length()))){
            return isPal(s.substring(1),s.substring(s.length()-1));
        }
        
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Escreva uma palavra ou frase:");
        String s = t.nextLine();
        System.out.println("A palavra/frase " + s + " é um palíndrome? " + isPal(s));
    
    }
}
