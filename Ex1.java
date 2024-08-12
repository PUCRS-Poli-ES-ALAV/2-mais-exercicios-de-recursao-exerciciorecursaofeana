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
    System.out.println("O fatorial de " + 3 + " é " + fatorial(3));

}}