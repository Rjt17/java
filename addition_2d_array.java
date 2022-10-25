import javax.swing.*;

public class addition_2d_array {
    public static void main(String[] args) {
       int [][] marks1 = {{0,0,0}, {0,0,0}};
       int [][] marks2 = {{1,2,3}, {1,2,3}};
       for (int x=0; x<marks1.length; x++){
           for (int y=0; y<marks1[x].length; y++){
               marks1[x][y] += marks2[x][y];
           }
       }
       for (int x=0; x<marks1.length; x++){
           for (int element : marks1[x]){
               System.out.print(element);
               System.out.print(" ");
           }
           System.out.print("\n");
       }
    }
}
