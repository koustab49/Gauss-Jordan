import java.io.*;
public class GaussJordan
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of variables in the equations");
		int s= Integer.parseInt(in.readLine());
		double arr[][]= new double[s][s+1];
		System.out.println("Enter the values in the augmented matrix");
		int i,j;
    	        for(i=0;i<s;i++)
		{
			for(j=0;j<s+1;j++)
			{
				arr[i][j]= Double.parseDouble(in.readLine());
			}
		}
		System.out.println("The matrix that you have entered is ");
		for(i=0;i<s;i++)
		{
			for(j=0;j<s+1;j++)
			{
				System.out.print(arr[i][j] +"  ");
			}
                        System.out.println();
		}
                GaussJordan ob = new GaussJordan();
                ob.evaluate(arr,s);
	}
         void evaluate(double a[][], int n)
         {
           double k,m;
           int r,row,col,i;
            for(r=0;r<n;r++)
           {
              k=a[r][r];
              for(col=0;col<n+1;col++)
              {
                a[r][col]=a[r][col]/k;
              }
              for(row=0;row<n;row++)
              {
                if(row!=r)
                {
                  m=a[row][r];
                  for(col=0;col<n+1;col++)
                  {
                   a[row][col]=a[row][col]- m*a[r][col];
                  }
                }
              }
           }
           System.out.println("The Value of the variables are respectively:-  ");
           for(i=0;i<n;i++)
            {
              System.out.println(a[i][n]);
            }
          }
}        