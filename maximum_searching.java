public class maximum_searching {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int max = 0;
        for (int element:arr){
            if (element>max){
                max = element;
            }
        }
        System.out.printf("maximum element is %d", max);
    }
}
