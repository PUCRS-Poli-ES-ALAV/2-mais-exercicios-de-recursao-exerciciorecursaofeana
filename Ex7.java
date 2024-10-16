import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    static int somArray(List<Integer> a){
        int tam = a.size();
        int soma = 0;
        if(a.size() == 0){
            throw new IllegalArgumentException("Array vazio");}
        if(a.size() == 1){
            return a.get(0);
        }
        return soma + a.get(tam=-1);
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(5);
        a.add(7);
        System.out.println("A soma dos valores do array é " + somArray(a));
    }
    
}
