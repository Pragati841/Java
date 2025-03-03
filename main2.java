// import java.util.*;
// public class array{
//     public static int trappingWater(int height[]){
//         int n=height.length;
//         int leftMaxi[]=new int[n];
//         leftMaxi[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftMaxi[i]=Math.max(height[i],leftMaxi[i-1]);
//         }
//     //calculate right maxi boundry
//         int rightMaxi[]=new int[n];
//         rightMaxi[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMaxi[i]=Math.max(height[i],rightMaxi[i+1]);
//         }

//         int trappedWater=0;
//         //loop
//         for(int i=0;i<n;i++){
//             int waterLevel=Math.min(leftMaxi[i],rightMaxi[i]);
//             trappedWater+=waterLevel-height[i];
//         }
//         return trappedWater;

//     }
 
// public static void main(String args[]){
//     int height[]={4,2,0,6,3,2,5};
//     System.out.println(trappingWater(height));
// }
// // }
// import java.util.*;
// public class array{
//     public static int BuyAndSellStocks(int Prices[]){
//         int maxiProfit=0;
//         int BP=Integer.MAX_VALUE;

//         for(int i=0;i<Prices.length;i++){
//             if(BP<Prices[i]){
//                 int Profit=Prices[i]-BP;
//                 maxiProfit=Math.max(maxiProfit,Profit);

 
//         }else{
//             BP=Prices[i];
//         }
//         }
//         return maxiProfit;
//     }

//     public static void main(String args[]){
//         int Prices[]={7,1,5,3,6,4};
//         System.out.println(BuyAndSellStocks(Prices));


//     }
// }
// // import java.util.*;

// // public class main2{
// //     public static void CheckNum(int nums[]){
// //         int ans=0;
// //         for(int i=0;i<nums.length;i++){
// //             ans+=i;
// //             if(nums[i]==ans){
// //               System.out.println("true");
// //             }else{
// //                 System.out.println("false");
// //             }}
        
// //         }
// //     public static void main(String args[]){
// //         int nums[]={1,2,3,1};
// //         CheckNum(nums);

// //     }
// // }
// // import java.util.*;
// // public class main2{

// //     public static int BuyAndSellStocks(int height[]){
// //         int n=height.length;
// //         int maxiProfit=0;
// //         int Bp=Integer.MAX_VALUE;

        
// //         for(int i=0;i<n;i++){
// //             if(Bp<Prices[i]){
// //                 int p=Prices[i]-Bp;
// //                 maxiProfit=Math.max(maxiProfit,Profit);


// //             }else{
// //                 Bp=Prices[i];

// //             }

// //         }
// //         return maxiProfit;
// //     }
// //     public static void main(String arg[]){
// //         int Prices[]={7,1,5,3,6,4};
// //         System.out.println(BuyAndSellStocks(Prices));

// //     }
// // // }
// import java.util.*;
// public class main2{
//     public static int ContainDuplicate(int arr[]){
//         var hashmap={};
//         for(int i=0;i<arr.length;i++){
//             if(hashmap[arr[i]]){//already
//                 return true;


//             }else{
//                 hashmap[arr[i]]=true;//add it 

//             }
//         }
//      return false;
//     }
//     public static void main(String args[]){
//         int arr[]={1,2,1,3,5};

//     }
// }    
