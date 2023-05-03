
import java.util.Arrays;
class RevArray 
{
	public static void main(String[] args)
	{
		int temp ;
		int [] a = {3 , 5 , 6 , 7 , 5 } ;
		System.out.println(Arrays.toString(a));
		for(int i = 0 , k = a.length-1 ; i<k; i++ , k--)
			 temp = a[i] ;
		     a[i] = a[k] ;
			 a[k] = temp ;
			 System.out.println(Arrays.toString(a));
	}
}