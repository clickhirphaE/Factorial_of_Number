import java.util.*;
public class Factorial_ofno {
    private static int numbers(int x){
       return 1;
    }
    int fact1=1;
    private static int num1(int y){
         int fact1=1;
       for(int z=y;z>=1;z--){
           fact1=fact1*z;
       }
return  fact1;
    }
    public static void main(String args[]){
         int factno;
        Scanner xx=new Scanner(System.in);
        System.out.println("Please Enter positive Integer number:");
        factno=xx.nextInt();
          if(factno==0 ||factno==1)
        {
            System.out.println("The factorial of "+factno+" is:"+numbers(factno));
        }else if(factno>=2){
            System.out.println("The factorial of "+factno+" is:"+num1(factno));
        }
          else {
              System.out.println("Please enter only +ve integers!");
          }
       }
      }
