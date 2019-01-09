package lec1 ;
import java.util.*;
public class Summ {
    public static int maxsumpath(int[] arr,int[] arr1,int m,int n)
    {
        int sum1 = 0,sum2= 0 ; 
        int res = 0 ; 
        int i=0,j=0;
        while(i<m&&j<n)
        {
            if(arr[i]>arr1[j])
            { sum2=sum2+arr1[j];
               j++; }
             else if(arr[i]<arr1[j])
             {
                 sum1+=arr[i]; 
                 i++;
             }
             else
             {
                 if(sum1>=sum2)
                 res=res+sum1 ; 
                 else
                 res=res+sum2 ;
                 while(i<m&&j<n&&arr[i]==arr1[j])
                 {
                 res=res+arr[i] ; 
                 i++; 
                 j++; 
                 }
                 sum1=0 ; 
                 sum2=0;
             }}
            while (i < m)
                sum1  +=  arr[i++];
            while (j < n)
                sum2 +=  arr1[j++];
            if(sum1>=sum2)
                res=res+sum1 ; 
                else
                res=res+sum2 ;
            
            
        
        return res ; 
    }
    public static void main(String args[]) {
     
     Scanner scn = new Scanner(System.in) ; 
     int t= scn.nextInt(); 
     while(t>0)
     {
         int m =scn.nextInt(); 
         int n =scn.nextInt(); 
         int[] arr = new int[m] ;  
         int[] arr1 = new int[n]; 
         for(int i=0;i<m  ;i++)
         {
             arr[i]=scn.nextInt(); 
         }
         for(int j=0;j<n;j++)
         {
             arr1[j]=scn.nextInt(); 
         }
         int ans = maxsumpath(arr,arr1,m,n); 
         System.out.println(ans) ; 
         t-- ;
     }
    }
}
