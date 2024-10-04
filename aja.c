#include<stdio.h>
int main(){
    int a[10]={4,1,8,7,3},f=0,s=0,c=0;
    for(int i=0;i<5;i++){
        if(f<a[i]){
            f=a[i];
        }
    }
    for(int i=0;i<5;i++){
        if(a[i]!=f&&s<a[i]){
            s=a[i];
        }
    }
     for(int i=0;i<5;i++){
        if(a[i]!=s&&c<a[i]&&a[i]!=f){
            c=a[i];
        }
    }

    printf("%d",f);
    printf("\n");
     printf("%d",s);
     printf("\n");
     printf("%d",c);
     return 0;
}