public class sum_of_numbers {

    public static void main (String[] args) {

        int arr[]= {6, 5, 6, 7, 5, 8, 3, 9, 3};

        int sum=0;
        for(int i=0; i<=arr.length-1; i++){

            sum=sum+arr[i];
        }
        System.out.println("The Sum Of The Array Is:" +sum);


    }
}
