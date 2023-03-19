import java.util.*;
public class Ordena { 
    public static void main(String[] args) {
        Scanner infor = new Scanner (System.in);
        int x, y, z;

        System.out.print("Digite o valor de x = ");
        x = infor.nextInt();
        System.out.print("Digite o valor de y = ");
        y = infor.nextInt();
        System.out.print("Digite o valor de z = ");
        z = infor.nextInt();

        if (x > y){
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        }else {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);

        System.out.println("Seus valores foram ordenados");
    
        

    

        
        }
        
    
    }
}