public class insertionsort {
    public static void main(String[] args) {
     int a[]={5,2,8,4,7,1},temp;
     for(int i=0;i<4;i++){
        for(int j=i+1;j>=0;j--){
            if(a[j]>a[j+1]){
            temp=a[j+1];
            a[j+1]=a[j];
            a[j]=temp;               
            }
        }
     }
     for(int i=0;i<6;i++){
     System.out.println(a[i]);
    }
}
}
