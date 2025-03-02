class hcf{
    public static void main(String[] args) {
        int a=8,b=6;
        gcd(a,b);

    }
    public static void gcd(int a, int b){
         
         while(b!=0){
            int temp=b;
            b=a % b;
           
            a=temp;
         }
         System.out.println(a); 
    }
}