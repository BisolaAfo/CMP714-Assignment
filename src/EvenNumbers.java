public class EvenNumbers {

    public static void main(String[]args) {
        int arr[] = {6, 7, 8, 2, 9, 13};

        System.out.println("Evens Numbers Are :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {


                System.out.println(arr[i] + " ");
            }
        }
    }
}
