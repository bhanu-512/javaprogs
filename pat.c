#include<stdio.h>
int main(){
    int a[10]={4,1,8,7,3},temp;
    temp=a[4];
    for(int i=5;i>0;i--){
        a[i]=a[i-1];
    }
    a[0]=temp;
    for(int i=0;i<5;i++){
        printf("%d",a[i]);
    }
    return 0;
}
