public class Main {
    public static void main(String[] args) {
        System.out.println(fakIterativ(1));


        for(int i=0;i<5;i++)
            System.out.print(fakIterativ(i)+" ");
        System.out.println();
        for(int i=0;i<50;i++)
            System.out.print(fakRekursiv(i)+" ");
    }


    public static long fakIterativ(long n){
        long res=1;
        for(int i=1;i<=n;i++)
            res*=i;
        return res;
    }

    public static long fakRekursiv(long n){
        if(n==0)
            return 1;
        else
            return n*fakRekursiv(n-1);

    }
}











