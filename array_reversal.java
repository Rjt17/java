public class array_reversal {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] temp = new int[5];
        int j = 0;
        for (int x=arr.length-1; x>=0; x--){
            temp[j] = arr[x];
            j++;
        }
        for(int element:temp){
            System.out.print(element);
            System.out.print(" ");
        }
    }
}
