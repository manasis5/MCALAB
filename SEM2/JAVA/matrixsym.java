import java.util.*;
class matrixsym
{  
public static void main(String args[])
{		
int i,j,m,n,flag=1;
Scanner in = new Scanner(System.in);
System.out.println("Enter the  row size");
m = in.nextInt();
System.out.println("Enter the column size");
n = in.nextInt();
int arr1[][] = new int[m][n];
int transpose[][] = new int[m][n];
System.out.println("The elements of the matrix") ;
for(i=0;i<m;i++)
{ 
for(j=0;j<n;j++)
{ 
arr1[i][j] = in.nextInt();
}
}
		
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
transpose[j][i]=arr1[i][j];	
}		
}
if(m==n)
{
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(arr1[i][j]!=transpose[i][j])
{	
flag=0;
break;
}	
}
}
if(flag==0)
{System.out.print("\nThe matrix is not symmetric");
}
else
{
System.out.print("\nThe matrix is symmetric");
}
}	
}
}
