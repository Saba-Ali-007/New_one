import java.util.Scanner;
//9+13+17----n
int series_1(int n){
    int sum=0;
    for(int i=1,term=9;i<=n;i++,term+=4){
        sum+=term;
    }
    return sum;
}
//x^1+x^2+x^3----n
int series_2(int n){
    int sum=0;
    for(int i=1,term=1;i<=n;i++,term*=x){
        sum+=term;
    }
    return sum;
}
//9^2+13^2+17^2----n
int series_3(int n){
    int sum=0;
    for(int i=1,term=9;i<=n;i++,term+=4){
        sum+=term*term;
    }
    return sum;
}
//(1)^3/x+(2)^3/x+(3)^3/x----n
int series_4(int n,int x){
int sum=0;
for(int i=1,term=1;i<=n;i++,term+=1){
    sum+=term*term*term/x;
    return sum;

}
}
//2^x+4^x+6^x----n
int series_5(int n,int x){
    int sum=0;
    for(int i=1,term=2;i<=n;i++,term+=2){
        sum+=Math.pow(term,x);
    }
    return sum;
}
//2/10+4/9+6/8----n
int series_6(int n){
    int sum=0;
    for(int i=1,term=2;i<=n;i++,term+=2){
        sum+=term/(10-i);
    }
    return sum; 
}
public class Arithemetic_series {
    int n;
    System.out.println("Enter the number of terms:");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt(); 
    System.out.println("Enter the value of x:");
    System.out.println("Sum of the series is: " + series_1(n));
    System.out.println("Sum of the series is: " + series_2(n));
    System.out.println("Sum of the series is: " + series_3(n));
    System.out.println("Sum of the series is: " + series_4(n,x));
    System.out.println("Sum of the series is: " + series_5(n));
    System.out.println("Sum of the series is: " + series_6(n));
    
}
