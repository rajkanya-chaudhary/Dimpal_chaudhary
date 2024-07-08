public class Prime_number {
    public static void main(String[] args) {
        int n = 4;
        if(n==2)
        {
            System.out.println(n + " is Prime number");
        }
        else
        {
            boolean isPrime = true;
            for(int i = 2; i<=n-1;i++)
            {
                if(n%i==0)
                {
                    isPrime = false;
                }
            }
            if(isPrime == true)
            {
                System.out.println(n + " is Prime");
            }
            else
            {
                System.out.println(n + " is Not Prime Number");
            }
        }
    }
}
