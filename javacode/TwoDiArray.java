package javacode;

public class TwoDiArray {

    public static void main(String args[]){
        int a[][] = {
            {0, 1, 2, 3, 4, 5},
                {1, 4, 5, 6, 7, 8}
        };
        System.out.println("two d array length "+a.length);
        for(int i =0;i<a.length;i++){

            for(int j=0; j<a[i].length; j++){
                System.out.println(a[i][j]);
            }

        }

    }
}
