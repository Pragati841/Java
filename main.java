// // import java.util.*;
// // public class main{
// //    public static void FloydsTriangle(int n){
// //       int counter=1;
// //       for(int i=1;i<=n;i++){
// //          for(int j=1;j<=i;j++){
// //             System.out.print(counter+" ");
         
// //          counter++;
// //       }
// //       System.out.println();
// //    }}
// //    public static void main(String args[]){
// //       FloydsTriangle(5);

// //    }
// // }
// import java.util.*;
// public class main{
//    public static void Zero_one_Triangle(int n){
//       for(int  i=1;i<=n;i++){
//          for(int j=1;j<=i;j++){
//             if((i+j)%2==0){
//                System.out.print("1"+" ");
//             }else{
//                System.out.print("0"+" ");
//             }}
//             System.out.println();

         
//       }
//    }
//    public static void main(String args[]){
//       Zero_one_Triangle(5);

//    }
// // }
// import java.util.*;
// import java.util.zip.ZipEntry;
// public class main{
//    public static void Zero_one_Triangle(int n){
//       for(int i=1;i<=n;i++){
//          for(int j=1;j<=i;j++){
//             if((i+j)%2==0){
//                System.out.print("1");
//             }else{
//                System.out.print("0");

//             }
//          }
//          System.out.println();
//       }
//    }
//    public static void main(String args[]){
//       Zero_one_Triangle(5);

//    }

// // }
// import java.util.*;
// public class main{
//    public static void ButterFly_Pattern(int n){
//       for(int i=1;i<=n;i++){
//          //star
//          for(int j=1;j<=i;j++){
//             System.out.print("*");
//          }//space
//          for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//          }
//          //star
//          for(int j=1;j<=i;j++){
//             System.out.print("*");
//          }
//        System.out.println();
         
//       }
   
//    //2nd half
//    for(int i=n;i>=1;i--){
//       //star
//       for(int j=1;j<=i;j++){
//          System.out.print("*");
//       }//space
//       for(int j=1;j<=2*(n-i);j++){
//          System.out.print(" ");
//       }
//       //star
//       for(int j=1;j<=i;j++){
//          System.out.print("*");
//       }
//     System.out.println();
      
//    }
// }
//    public static void main(String args[]){
//       ButterFly_Pattern(5);

//    }
// }
// import java.util.*;
// public class main{
//     public static void Solid_Rhombus(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }for(int j=1;j<=n;j++){
//                 if((i==1)||i==n||j==1||j==n){
//                     System.out.print("*");

//                 }else{
//                     System.out.print(" ");


//                 }
              
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String args[]){
//         Solid_Rhombus(5);

//     }
  
// }
import java.util.*;
// public class main{
//     public static void Diamond_Pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("*");

           

        
//     }
//             System.out.println();
// }
    
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }for(int j=1;j<=(2*i)-1;j++){
//             System.out.print("*");
       

    
// }
//         System.out.println();

// }}
        

// public static void main(String args[]){
// //     Diamond_Pattern(5);
    
// }

// // }
// import java.util.*;
// public class main{
//     public static int getLargest(int numbers[]){
//         int largest=Integer.MAX_VALUE;
//         int Smallest=Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest=numbers[i];

//             }
//             if(Smallest>numbers[i]){
//                 Smallest=numbers[i];

            
               
//         }}
//         System.out.println("smallet value is:"+Smallest);
//         return largest;

//     }
//     public static void main(String args[]){
//         int numbers[]={1,2,32};
//         System.out.println("largest value is:"+getLargest(numbers));

//     }
    
// }
// import java.util.*;
// public class main{
//     public static  int getLargest(int numbers[]){
//         int largest=Integer.MIN_VALUE;
//         // int smallest=Integer.MIN_VALUE;
         

//         for(int i=0;i<numbers.length;i++){
            
//         if(largest<numbers[i]){
//             largest=numbers[i];
//         }
//     }
//         // if(smallest>numbers[i]){
//         //     smallest=numbers[i];
//         // }

//         // }System.out.println(smallest);
//         return largest;

//         }  
    

// //     public static void main(String args[]){
//         int numbers[]={2,13,32,4,333,33};
//         System.out.println("lagestr value is :"+getLargest(numbers));


//     }
// }

// import java.util.*;
// public class main{
//     public static int largest(int numbers[]){
//         int largest=Integer.MIN_VALUE;
//         for(int i=0;i<=numbers.length;i++){
//             largest=numbers[i];
//         }
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[]={2,3,33,4,5};
//         System.out.println(largest(numbers));

//     }
// }
// import java.util.*;
// public class main{
//     public static int BinarySearch(int number[],int key){
//         int start=0;
//         int end=number.length-1;

//         while(start<=end){
//             int mid=(start+end)/2;

//             if(number[mid]==key){//found
//                 return mid;

//             }
//             if(number[mid]<key){//right
//                 start=mid+1;

//             }else{
//                 end =mid-1;//left
            
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]){
//         int numbers[]={2,34,55,56,87};
//         int key=87;
//         System.out.println("index for key is "+ BinarySearch(numbers,key));
//     }
// // // }
// import java.util.*;
// public class main{
//     public static int  linearSearch(int arr[]){
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++)
//         if(largest<arr[i]){
//             largest=arr[i];

        
            
        
//         if(smallest>arr[i]){
//             smallest=arr[i];
//         }
//     }
//         System.out.println("smallest is:"+smallest);
//         System.out.println("largest is:"+largest);
       
//         return largest;



//     }
//     public static void main(String args[]){
//         int arr[]={1,2,3,35,66};
//         System.out.println(linearSearch(arr));

//     }
// }
// import java.util.*;
// public class main{
//     public static int BinarySearch(int arr[],int key){
//         int start=0;
//         int end=arr.length-1;

//         while(start<end){
//             int mid=(start+end)/2;
//             if(arr[mid]==key){
//                 return mid;

//             }
//             if(arr[mid]<=key){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }

//         }
//         System.out.println();
//         return -1;

//     }
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//         int key=1;
//         System.out.println("found at index"+BinarySearch(arr, key));


//     }
// // }
// import java.util.*;
// public class main{
//     public static int LinearSeach(int arr){
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//          for(int i=1;i<arr.length;i++){
//             if(largest<arr[i]){
//                 largest=arr[i]

         

//          }if(smallest>arr[i]){
//             smallest=arr[i];
//          }
      

//         }
//         System.out.println();
//         return largest;

//     }
//     public static void main(String args[]){
//         int arr[]={1,23,455,567,77};

//     }
// }

//  import java.util.*;
//  public class main{                                                              
//     public static void SubArray(int arr[]){
//         int ts=0;
//         for(int i=0;i<arr.length;i++){
//             int start=i;
//             for(int j=i;i<arr.length;j++){
//                 int end=j;

//                 for(int k=start;k<end;k++){
//                     System.out.print(arr[k]+" ");


//                 }
//                 ts++;
            
//                 System.out.println();
//             }
//             System.out.println("total subarray ="+ts);
//         }

//  }
//     public static void main(String args[]){
//     int arr[]={1,2,4,5,6};
//     SubArray(arr);
//     }
//  }


// import java.util.*;
// public class main{

//     public static void PrintSubArray(int arr[]){
//         int ts=0;
//         for(int i=0;i<arr.length;i++){
//             int start=i;

        
//         for(int j=i;i<arr.length;i++){
//             int end=j;
            
        
//         for(int k=start;k<=end;k++){
//             System.out.print(arr[k]);

//         }
//         ts++;
//         System.out.println();

//     }
//     System.out.println();
// }
//     System.out.println("total subArray"+ts);
// }
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
// //         PrintSubArray(arr);


//     }
// // }

// import java.util.*;
// public class main{
//     public static void PrintSubArray(int arr[]){
//         int ts=0;
//         for(int i=0;i<arr.length;i++){
//             int start=i;
//             for(int j=i;j<arr.length;j++){
//                 int end=j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(arr[k]+" ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println(ts);

//     }
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//         PrintSubArray(arr);

//     }
// }3
// import java.util.*;
// public class main{
//     public static void rotateArray(int arr,int N){
//         int start=0;
//         int end=N-1;
//         while(start<end){
//             int mid=(start+end)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }if(arr[mid]<=target){
//                 end =mid-1;
//             }else{
//                 start=mid+1;

//             }
//         }
//         return -1;


        
//     public static void main(String args[]){
        
//         int arr[]={1,2,3,4,5,6,7};

//     }
    
// }
// import java.util.*;
// public class main{
//     public static int trappingWater(int height[]){
//         int leftMaxi[]=new int[height.length];
//         leftMaxi[0]=height[0];
//         for(int i=1;i<height.length;i++){
//             leftMaxi[i]=Math.max(height[i],leftMaxi[i-1]);
//         }
//     //calculate right maxi boundry
//         int rightMaxi[]=new int[height.length];
//         rightMaxi[height.length-1]=height[height.length-1];
//         for(int i=height.length-2;i>=0;i--){
//             rightMaxi[i]=Math.max(height[i],rightMaxi[i+1]);
//         }

//         int trappedWater=0;
//         //loop
//         for(int i=0;i<height.length;i++){
//             int waterLevel=Math.min(leftMaxi[i],rightMaxi[i]);
//             trappedWater+=waterLevel-height[i];
//         }
//         return trappedWater;

//     }

// public static void main(String args[]){
//     int height[]={4,2,0,6,3,2,5};
//     System.out.println(trappingWater(height));
// }
// }
