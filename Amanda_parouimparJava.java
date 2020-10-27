/*Fazer um programar que diferencie um nÃºmero par e um nÃºmero impar
 */
package amanda_parouimpar.java;

import java.util.Scanner;

 /* @Amanda_Vilela*/
public class Amanda_parouimparJava {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero:");
        n = scan.nextInt();
        
        if(n%2==0){
            System.out.println("O numero é Par");
        
        }
        else {
            System.out.println("O número é Impar");
        }
    }
    
}
