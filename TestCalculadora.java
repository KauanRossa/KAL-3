import java.util.Scanner;;
public class TestCalculadora {
    public static void main(String[] args) {
        boolean valido = false;
        int num = 0;
     Scanner sc = new Scanner(System.in);
     while (!valido){
        System.out.print("Digite um número: ");
        if (sc.hasNextInt()) {
             num = sc.nextInt();
            valido=true;
        } else { 
        System.out.println("Por favor, digite um número valido.");
        sc.next();
        }
    
    }
    
     
      
    }
}
    

