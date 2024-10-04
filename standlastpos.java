import java.util.*;
class standlastpos {
    
    public static void main(String args[])
    {
      int a[]={1,2,3,3,3,3,4,5,6};
      Scanner s=new Scanner(System.in);
      System.out.println("enter key");
      int key=s.nextInt();
      int start=0,mid,first=-1,last=-1;
       int end=8;
        while(start<=end){
           mid=(start+end)/2;
            if(a[mid]==key){
                first=mid;
                end=mid-1;
            }
            else if(key<a[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
           
        }
        start=0;
        end=8;
        while(start<=end){
            mid=(start+end)/2;
             if(a[mid]==key){
                 last=mid;
                 start=mid+1;
             }
             else if(key<a[mid]){
                 end=mid-1;
             }
             else{
                 start=mid+1;
             }
            
         }
        System.out.println(first);
        System.out.println(last);
    }
}