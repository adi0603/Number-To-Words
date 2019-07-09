import java.util.Scanner;
class Number
{
    static String s[]={"Zero","One","Two","Three","Four","Five","Six","Seven",
                "Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen",
                "Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String s1[]={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty",
                "Ninety"};
    public static String To_Words(int n)
    {
        if(n<=19)
        {
            return s[n];
        }
        else if(n<=99)
        {
            int x=n/10;
            int y=n%10;
            if(n%10==0)
            {
                return s1[x-2];
            }
            else
            {
                return s1[x-2]+" "+s[y];
            }
        }
        else if(n<=999)
        {
            int x=n/100;
            int y=n%100;
            if(n%100==0)
            {
                return s[x]+" Hundred ";
            }
            else
            {
                return s[x]+" Hundred "+To_Words(y);
            }
        }
        else if(n<=99999)
        {
            int x=n/1000;
            int y=n%1000;
            if(n%1000==0)
            {
                return To_Words(x)+" Thousand ";
            }
            else
            {
                return To_Words(x)+" Thousand "+To_Words(y);
            }
        }
        else if(n<=9999999)
        {
            int x=n/100000;
            int y=n%100000;
            if(n%100000==0)
            {
                return To_Words(x)+" Lakh ";
            }
            else
            {
                return To_Words(x)+" Lakh "+To_Words(y);
            }
        }
        else
        {
            int x=n/10000000;
            int y=n%10000000;
            if(n%10000000==0)
            {
                return To_Words(x)+" Crore ";
            }
            else
            {
                return To_Words(x)+" Crore "+To_Words(y);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Number.To_Words(n));
    }
}
    
