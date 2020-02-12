public class TwoLargestNumbers {

    public void maxTwoNumbers(int[] arr){
        int max1 = 0;
        int max2 = 0;
        for( int n: arr)
        {
            if(max1 < n)
            {
                max2 = max1;
                max1 = n;
            }

            else if(max2 < n)
            {
                max2 = n;
            }
        }
        System.out.println("First Largest Number: " + max1);
        System.out.println("Second Largest Number: " + max2);
    }
    public static void main(String[] args)
    {
        int arr[] = {12,6,8,3,4,-16,24};
        TwoLargestNumbers obj = new TwoLargestNumbers();
        obj.maxTwoNumbers(arr);
    }
}
