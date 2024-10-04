 #include<iostream>
#include <climits>
 using namespace std;
int main(){
    int nums={0,0,1,1,1,2,2,3,3,4};
        int j = 1;
        for(int i = 1; i < nums.size(); i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
       for( int i=0;i<j;i++){
      

       }
  }
;


