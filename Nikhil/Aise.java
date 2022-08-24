import java.util.Scanner;
import java.util.Arrays;
public class Aise {
    //so here i added few lines
    static int[] binary (int num){
        
        int[] code=new int[4];
        int quo,digit,start=0;
        quo=num;
        while(quo!=0){
            digit=quo%2;
            quo/=2;
            code[start]=digit;
            start++;
        }
        reverse(code);
        return code;
    }
    static int[] reverse(int[] code){
        int[] reversed=new int[code.length];
        int start=0;
        int end=code.length-1;
        while(start<end){
            int temp=code[start];
            code[start]=code[end];
            code[end]=temp;
            start++;
            end--;
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter you number");
        int num=sc.nextInt();
        int [] a=binary(num);
        System.out.println(Arrays.toString(a));
       /* int[] arr = new int[]{1,3,4,5};
        reverse(arr,0,arr.length-1);
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println(Arrays.toString(arr));
   
      
    }
    static void reverse(int[] arr,int start,int end){
     //   start=0;
        //end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
    }*/
        
    }
    }      
