public class is_sorted {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,5};
        boolean flag = false;
        for(int x=0; x<arr.length-1; x++){
            if (arr[x] > arr[x+1]){
                System.out.println("array is not sorted");
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("array is sorted!!!");
        }
    }
}
