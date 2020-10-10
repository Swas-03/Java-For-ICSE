import java.util.*;
public class checkPrime
{
  public boolean noFactors(int n)
  {
    boolean check=false;
    int c=0;
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        c++;
      }
    }
     if(c==2)
     {
        check=true;
     }
     return check;
  }
}
