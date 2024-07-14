import java.util.Scanner;
public class ArrayPractice {
    //1-5: easy, 6-10: medium, 11-15: hard


    public static void main(String[] args) {
        //1) Find the Maximum and Minimum Elements
        //Write a function to find the maximum and minimum elements in an array.
        //Input: [1, 2, 3, 4, 5]
        //Output: Max: 5, Min: 1
        int[] num = {1,2,3,4,5};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int k: num){
            if (k < min){
                min = k;
            }
            if(k > max){
                max = k;
            }
        }
        System.out.println("Max: " + max + "\n" + "Min: " + min);


        //2)Sum of Array Elements
        //Write a function to find the sum of all elements in an array.
        //Input: [1, 2, 3, 4, 5]
        //Output: 15
        int sum = 0;
       // int[] arr2 = {1,2,3,4,5};
        for(int k: num){
            sum+=k;
        }
        System.out.println("Sum: "+ sum);

        //3) Reverse an Array
        //Write a function to reverse the elements of an array.
        //Input: [1, 2, 3, 4, 5]
        //Output: [5, 4, 3, 2, 1]
        int i=1;
        for(int k: num){
            k = num[num.length-i];
            i++;
            System.out.print(k + " ");
        }

        //4) Check if Array is Sorted
        //Write a function to check if an array is sorted in ascending order.
        //Input: [1, 2, 3, 4, 5]
        //Output: true
        System.out.println("\n");
        int[] nums ={1,3,2,6,5};
        boolean isSorted = false;
        for(int k = 0; k < num.length-1; k++){
            if(num[k] > num[k+1]){
                isSorted = false;
            }
            else{
                isSorted =true;
            }
        }
        System.out.println(isSorted);


        //5) Remove Duplicates from Array
        //
        //Write a function to remove duplicates from an array.
        //Input: [1, 2, 2, 3, 4, 4, 5]
        //Output: [1, 2, 3, 4, 5]

        int[] dupeArr = {1,2,2,3,4,4,5};
        int count = 0;
        for(int n = 0; n < dupeArr.length-1; n++){
            if(dupeArr[n] == dupeArr[n+1]) {
                dupeArr[n + 1] = Integer.MAX_VALUE;
                count++;
            }
        }
        int newLength = dupeArr.length - count;
        int[] fixedArr = new int[newLength];
        int r=0;
        int b= 0;
        while( b < fixedArr.length){
            if(dupeArr[r] != Integer.MAX_VALUE){
                fixedArr[b] = dupeArr[r];
                b++;
            }
            r++;
        }
        for(int k :fixedArr){
            System.out.print(k + " ");
        }




        //6) Rotate Array
        //Write a function to rotate an array to the right by k steps.
        //Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
        //Output: [5, 6, 7, 1, 2, 3, 4]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k value: ");
        int k = scanner.nextInt();
        int[] ogArr={1,2,3,4,5,6,7};
        //          {5,6,7,1,2,3,4};
        int[] temp = new int[ogArr.length];
        int end = ogArr.length - k; //4
        int y=0;
        while(end < ogArr.length && y < ogArr.length){
            temp[y] = ogArr[end];
            end++;
            y++;
        }
        int x = 0;
        while(x < end && y < ogArr.length) {
            temp[y] = ogArr[x];
            x++;
            y++;
        }
        for(int l: temp){
            System.out.println(l + " ");
        }

        //7) Find Missing Number
        //Write a function to find the missing number in an array containing numbers from 1 to n.
        //Input: [1, 2, 4, 5, 6]
        //Output: 3

        int[] missingArr = {1,2,4,5,6};
        int n = 0;
        for(int o =0; o < missingArr.length-1; o++){
            if(missingArr[o+1] - missingArr[o] != 1){
                n= (missingArr[o] + missingArr[o+1])/2;
            }
        }
        System.out.println("n: "+ n);

        //8) Find All Pairs with a Given Sum
        //Write a function to find all pairs in an array that sum to a specific target.
        //Input: arr = [1, 2, 3, 4, 5, 6, 7], target = 8
        //Output: [(1, 7), (2, 6), (3, 5)]

        System.out.println("Enter a target sum: ");//8
        int targetSum = scanner.nextInt();
        int[] sumArr = {1,2,3,4,5,6,7};
       for(int t=0; t < sumArr.length; t++){
            for(int j = t; j < sumArr.length; j++){
            if(sumArr[t] + sumArr[j] == targetSum && sumArr[t] != sumArr[j]){
                System.out.print("(" + sumArr[t] + ", " + sumArr[j] + ") ");
            }
            }
        }
      //9) Product of Array Except Self
        //Write a function that returns an array such that each element at index i is the product of all the elements of the original array except the one at i.
        //Input: [1, 2, 3, 4]
        //Output: [24, 12, 8, 6]
        int[] arr1 = {1,2,3,4};
        int[] productArr =new int[arr1.length];
        int[] tempArr =new int[arr1.length];
        int s = 0;
        for(int q= arr1.length-1; q > 0;q--){
            tempArr[q] = arr1[q];
            arr1[q] = 1;
            while(s < arr1.length) {
                productArr[q] = arr1[q] * arr1[q - s];
                s++;
            }
            arr1[q] = tempArr[q];
        }
      /*  for(int g: productArr){
            System.out.println(g + " ");
        }
*/
        //10) Find Duplicates
        //Write a function to find all duplicate elements in an array.
        //Input: [4, 3, 2, 7, 8, 2, 3, 1]
        //Output: 3, 2
        int[] arr2 = {4,3,2,7,8,2,3,1};
        int count2 = 0;
        for(int h = 0; h < arr2.length; h++){
            for(int d= h+1; d < arr2.length; d++){
                if(arr2[h] ==arr2[d]){
                    System.out.println(arr2[h] + " ");
                    count2++;
                }

            }
        }

        //11)Reverse the array
        int[] preArr = {1, 2, 3, 4};
        int[] reversedArray = new int[preArr.length];
        int e = 0;
        for (int w = preArr.length - 1; w >= 0; w--) {
            reversedArray[w] = preArr[e];
            e++;
        }
        System.out.println("Reversed array is:");
        for (int c : reversedArray) {
            System.out.print(c + " ");
        }

        //12) Find the Maximum Product Subarray
        //Write a function to find the contiguous subarray within a given array (containing at least one number) which has the largest product.
        //Input: [2, 3, -2, 4]
        //Output: 6

        //int maxProduct = 1;
        int[] pArray = {2,3,-2,4};
        int result = pArray[0];
        int length = pArray.length;
        for (int v = 0; v < length; v++) {
            int m = pArray[v];
            for (int j = i + 1; j < length; j++) {
                result = Math.max(result, m);
                m *= pArray[j];
            }
            result = Math.max(result, m);
        }
        System.out.println("\n"+ result);


        }
    }


