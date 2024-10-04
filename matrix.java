
public class matrix {
   public static void main(String[] args) {
    int a[]={1,2,3,9,8,5,6,7,4};
       int start=0,end=8,mid,ans=-1;
       while(start<=end){
        mid=start+(end-start)/2;
      
        if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]){
               ans=mid;
        } 
        else if(a[mid]<a[mid-1]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       }
    }
       System.out.println(ans);
   }
