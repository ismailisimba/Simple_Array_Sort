
package sort;

public class Sort {


    public static void main(String[] args) {
        int arr[]={7,19,15,1,2,6,1,15,15,1};
        int i=0;
        int sum=0;
        int repeat=0;
        int num=0;
        int size=10;
        int indexes=9;
 
        while (i<=indexes){
            num=arr[i];
            for(int index=0;index<=indexes;index++){
                if (num<arr[index]){
                  sum=sum+1;  
                }else if(num==arr[index]){
                    repeat=repeat+1;
                }
            }
            int newsize=size-repeat;
          
            if(sum==newsize) {
                break;
            }
            sum=0;
            repeat=0;
            i++;
        }
    
    System.out.println("Smallest value is "+num);
    
    }
    
}
