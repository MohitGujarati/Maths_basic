package com.company;



import java.util.Scanner;

/*
class Swap_numbers{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A="+a +" "+"B="+ b);
    }
}


 */// without third variable swap a number

/*
class main{
    public static void main(String[] args) {
        int a=10;int b=20;
        System.out.println("before swap "+"a = "+a+" b = "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("a= "+a+" b= "+b);
    }
}

 *///without third variable

/*
class main{
    public static void main(String[] args) {
        int a=1234;
        int count=0;

        while (a!=0){
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}

 *///count no of elements gfg

/*
class palindrome {
    public static void main(String[] args) {

        int n=12332;
        int rev=0;
        int temp=n;

        while(temp!=0){
            int last=temp%10;
            rev=rev*10+last;
            temp=temp/10;
        }
        if (rev==n){
            System.out.println("same");
        }else
            System.out.println("not same");
    }
}

 *///palindrome or not  gfg

/*
class factorial{
    public static void main(String[] args) {
        int n=4;
        int sum=1;

        for (int i=2;i<=4;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }

}

 *///factorial of the number  gfg

/*
class recfact{
   static int funfact(int n){

        if (n==0)
            return 1;

        return n*funfact(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(funfact(n));
    }
}

 *///factorial by recursion gfg

/*
public class Fundamental_of_mathematics {
    public static void main(String[] args) {

        // sum of digit/ two sum(leet code)
        Scanner sc=new Scanner(System.in);
        int[] a={2,3,7,4,8};
        int target = 6;

        for (int i=0; i<a.length;i++)
            for(int j=0;j<a.length;j++)
                if (a[i]+a[j]==target)
                    System.out.println("match found "+"["+a[i]+" , "+a[j]+"]");
    }
}

 */// Two sum ----just for understanding do not use to much time consuming

/*
class A_ToPower_B{
    public static void main(String[] args) {

        int a=2;
        int b=5;
        int result=1;

        while(b>0){
            result=result*a;
            b--;
        }
        System.out.println(result);
    }

}

 *///A^B

/*
class Fibonacci_number{
    public static void main(String[] args) {
        //0 1 2 3 5 8 13..
        int a=0;
        int b=1;
        int c;
        System.out.println(0);
        for (int i=1;i<=10;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}*////fibonacci series


/*
class sum_of_naturalNumber{
    public static void main(String[] args) {


        int till=5;
        int result=0;
        for (int i=0;i<=till;i++){
            result=i+result;
            System.out.println(result);
        }
    }
}*/ ///sum of natural numbers

/*
class sum_of_square{

    static int square(int n) {
        int sum =0;
        for(int i=1;i <= n;i++)
            sum=sum+(i*i);
        return sum;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(square(n));


    }
}
------------------------------------------
  30
 *///square of number

/*
class suquenumber {
    public static void main(String[] args) {
        int n=4;
        int sum=(n*(n+1)*(2*n+1))/6;
        System.out.println(sum);
    }
}

 *///square of number most efficient way normal maths

/*
class Cube_of_number{

    static int cube(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=(i*i*i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(cube(n));
    }
}
---------------------------------
64
*///cube of number

/*
class Armstrong_of_the_number {

    public static void main(String[] args) {
        int num = 153;
        int t1 = num;
        int leng =0;

       //length of number
        while (t1 != 0)
        {
            leng = leng + 1;
            t1 = t1 / 10;
        }


        int t2 = num;
        int rem;
        int arms = 0;

        while (t2 != 0) {
                int sum = 1;
                rem = t2 % 10;
                for (int i = 1; i <= leng; i++) {
                    sum = sum * rem;
                }
                arms = arms + sum;
                t2 = t2 / 10;
            }
        if (arms==num){
            System.out.println(num+" is armstrong");
        }else System.out.println(num+" is NOT armstrong");

        }
    }

-------------------------------------------
        153 is armstrong

 */ //Armstrong number(imp)

/*
class harshad_number{
    public static void main(String[] args) {
        int n=18;
        int c=n,d,sum=0;
        while(c>0){
            d=c%10;
            sum=sum+d;
            c=c/10;
        }
        if (n%sum==0){
        System.out.println(n+" is harshad number");
        }else System.out.println(n+" not a harshad number");

    }
}
*///harshad number

/*
class LCF_HCF{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b,i,sum = 0,min,LCM;
        System.out.println("enter two number ");
        a=sc.nextInt();
        b=sc.nextInt();
        min=a<b ? a:b;
        for (i=1;i<=min;i++)
            if (a%i==0 && b%i==0)
                sum=i;
            LCM=(a*b)/sum;
        System.out.println("HCF is " +a+" "+"and "+  b +" and "+  sum);
        System.out.println("HCF is " + a +"and"+ b +"and"+  LCM);
    }
}
 *///LCF_HCF

/*
public class Maths {
    //no prime // this is easy and no one will ask you this in interview
    public static void main(String[] args) {

        int []a={1,2,3,4,5,6,7,8,9};

        for (int i=0;i<a.length;i++){
            if (a[i] % 2 ==0 && a[i]>=2){
                System.out.println(a[i]);
            }
            else
                continue;
        }

    }

}

 */ //no prime//not imp

/*
class main{
    public static void main(String[] args) {

        int n=36;

        for (int i=1;i <= Math.sqrt(n) ;i++){

            if (n % i == 0){
            if (n / i == i){
                System.out.println(i);
                }else
                System.out.println(i+" "+n/i);
            }
        }

    }
}

 */ //factorial of a number

/*
class main{
    public static void main(String[] args) {

        int n=4;
        int n2=10;
        int h=1;

        for (int i=1;i<=n;i++){
            if (n%i==0 && n2%i==0){
                h=i;
            }

        }
        System.out.println("HCF " +h);
        }
    }

 */ //HCF

/*
class main{
    public static void main(String[] args) {
        int n=4;
        int n2=10;
        int i, h=1;
        for ( i=1;i<=n;i++) {
            if (n % i == 0 && n % i == 0)
                h = i;
        }
        i=(n*n2)/h;
        System.out.println("LCM is " +h);
    }
}

 */ //LCM

/*
class main{

    private static int main(int n1, int n2) {
        int i=n1%n2;

        while(i!=0){
            n1=n2;
            n2=i;
            i=n1%n2;
        }

        return n2;

    }
    public static void main(String[] args) {

        int n1=20;
        int n2=10;


        System.out.println(""+main(n1,n2));


    }


}

 */ //gcd

/*
class gcd{
    public static void main(String[] args) {

        int a=12;
        int b=15;

        while (a!=b){
            if (a>b){
                a=a-b;
            }else
                b=b-a;
        }if (a==b){
            System.out.println(a);
        }

    }
}

 */// gcd using euclidean algorithm gfg


/*
class gcd{
    static int gfg(int a,int b){
        if (b==0){
            return a;
        }else
            return gfg(b,a%b);
        }

    public static void main(String[] args) {

        System.out.println((gfg(12,15)));

    }
}

 *///gcd using euclidean algorithm gfg  MOST EFFICIENT

/*
class count_Primes{
    // n will be given then
    // Count the number of prime numbers
    // less than a non-negative number, n.(leetcode 204)
    // saved in youtube

    public static void main(String[] args) {
        int n=10;

        if(n<=2) {
            System.out.println("0" +": prime present" );
        }

        boolean[] number= new boolean[n];
        int newlimit=(int)Math.sqrt(n);

        //array of composite=true and flase represents primes

        for(int i=2;i<=newlimit;i++){

            if(number[i]==false){

                //mark all the mutiplies of i as true
                //the first index is fliped to true, is i*i

                for(int j=i*i;j<n;j+=i){
                    number[j]=true;
                }
            }
        }

        int count=0;
        for(int i =2;i<n;i++){
            if(number[i]== false)
                count++;
        }

        System.out.println(count);





    }

}
 *///count prime v-imp

/*
class main{
    public static void main(String[] args) {
        int n=251;
        int res=0;
        while(n>0){
            n=n/5;
            res+=n;

        }
        System.out.println("there are this no of zero: "+res);

    }
}

 *///trailling factorials (find zeros at end aptitude) --starter question better sol

/*
class trailing{
    public static void main(String[] args) {
        int res=0;
        int n=251;
        for (int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        System.out.println(res);
    }
}

 *///trailling factorials --starter question gfg

/*
class main{
    public static void main(String[] args) {
        int[] a={1,2,3,5};

        int ALL_elements=a.length+1;
        int total_sum =ALL_elements * (ALL_elements+1)/2;

        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Missing number is "+(total_sum-sum));
    }
}

 */ //find missing elements

/*
class main{
    public static void main(String[] args) {

        int []a={-2,4,0};

        int step=0;
        int zero = 0;

        for (int i=0;i<a.length;i++){
            //if it is zero
            if(a[i]==0)
            {
                zero=+1;
            }
            //for positive number
            else if (a[i]>0)
            {
                step=step+(a[i]-1);
            }
            //for negative number
            else {
                step=step+(-1-a[i]);

            }
            //for odd set of number

        }
        step=step+zero;

        for (int i=0;i<a.length;i++){
            if (a[i]<0 && a[i] %2 !=0)
            {
                step=step+2;
            }

        }


        System.out.println("Total time to convert the array product to 1 is "+step);


    }
}

 *///Minimum steps to make product equal to 1

/*
class main{

    static int formula(int b){
        int count=0;
        for (int k=1;k*(k+1)<2*b;k++)
        {
            float s=(float) (1.0*b -(k*(k+1))/2)/(k+1);
            if (s-(int)s==0.0)
                count++;

        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(formula(15));
        System.out.println(formula(10));

    }
} *///ways to return count of consecutive numbers

