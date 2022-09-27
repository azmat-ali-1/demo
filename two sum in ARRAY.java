import java.util.Scanner;
public class Main
{   
    static int[] sort(int[]a,int t){
        int start=0;
        int end=a.length-1;
       while(start<end){if(a[start]+a[end]==t){
             int[] b={start,end};
             return b;}
         
   else if(a[start]+a[end]<t){
     start++;
   }
   else{end--;}
          
   return b; } 
   
        public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 int n = sc.nextInt();
         int t = sc.nextInt();
		 int[] a = new int[n];
		 for(int i =0;i<n;i++){ a[i]=sc.nextInt(); } 
		int [] b= sort(a,t);
		if (b.length==2){
		    System.out.println(start+" "+end);
		}
		
    } 
}
