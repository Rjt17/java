import java.util.Scanner;

public class array_searching {
    public static void main(String[] args) {
        int [] arr = new int[5];
        for (int x=0; x<5; x++){
            arr[x] = x;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int number = sc.nextInt();
        boolean flag = false;
        for (int element: arr){
            if (element == number){
                System.out.println("element is in array");
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Element not present in array");
        }
    }
}