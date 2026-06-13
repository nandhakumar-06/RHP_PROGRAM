import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int M=sc.nextInt();
    int a[]= new int[N];
    int b[]= new int[M];
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<M;i++){
      b[i]=sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int i=0;
    int j=0;
    int c=0;
    while(i<N&&j<M){
      if(2L*a[i]>=b[j]){
        c++;
        j++;
        i++;
      }else{
        i++;
      }
      
    }
    System.out.println(c);
  }
}
