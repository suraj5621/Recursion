class Factorial{
    public static void main(String[] args) {
        int n=6;
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        int a=n*fact(n-1);
        return a;
   }
}