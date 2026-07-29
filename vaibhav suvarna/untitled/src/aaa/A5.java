package aaa;

public class A5 {
    public static void main(String[]args){
        int num=12345;
        System.out.println(num%10);
        System.out.println(num/10);
         int sum=0;
         while(num!=0){
             int digit=num%10;
             sum=sum+digit;
             num=num/10;
         }
        System.out.println("sum"+sum);
    }
}

