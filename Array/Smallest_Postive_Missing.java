class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
       int n=arr.length;
       Arrays.sort(arr);
       int num=1;
       
       for(int i=0;i<n;i++){
           
           if(arr[i]==num && arr[i]>=1){
               
               num++;
               
           }else if(arr[i]>num){
               
               break;
               
           }
          
       }
       
       return num;
      
    } 
}
