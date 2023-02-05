// java if,else,elseif:

// java a>b program

// import java.util.*;

// public class java7 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("equal");
//         }
//         else{
//             if(a>b){
//                 System.out.println("a is greater");
//             }
//             else{
//                 System.out.println("b is greater");
//             }
//         }
//     }
// }
// then apply else if

import java.util.*;

public class java7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equals");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}