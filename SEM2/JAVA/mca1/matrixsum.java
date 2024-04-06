import java.util.*;
class matrixsum
{
public static void main(String args[])
{
int m, n,i,j;
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the  row size");
m = in.nextInt();
 
System.out.println("Enter the column size");
n = in.nextInt();
 
int arr1[][] = new int[m][n];
int arr2[][] = new int[m][n];
int sum[][] = new int[m][n];
 
System.out.println("Enter the elements of matrix1");
for ( i= 0 ; i <m ; i++ )
{ 
for ( j= 0 ; j < n ;j++ )
{
arr1[i][j] = in.nextInt();
}
}
System.out.println("Enter the elements of matrix2");
for ( i= 0 ; i < m ; i++ )
{
for ( j= 0 ; j <n ;j++ )
{
arr2[i][j] = in.nextInt();
}
}
for ( i= 0 ; i < m ; i++ )
{
for ( j= 0 ; j < n ;j++ )
sum[i][j] = arr1[i][j] + arr2[i][j] ; 
}
System.out.println("Sum of matrices:-");

for ( i= 0 ; i < m ; i++ )
{ 
for ( j= 0 ; j <n ;j++ )
System.out.print(sum[i][j]+"\t");
}
}
}
