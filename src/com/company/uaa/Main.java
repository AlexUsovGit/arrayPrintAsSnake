package com.company.uaa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*2. объявить двумерный массив 9х9 и заполнить его змейкой
        (построчно - 1-я строка с первого элемента до последнего,
        вторая строка с последнего до первого. и так далее)*/
        int n = 9;
        int m = 9;
        int a = 0;
        int delta = 1;
        int j = 0;
        int  i =0;
        int arr[][] = new int[n][m];
        for (int k = 0;k<n*m; k++){
            arr[i][j] = a++;
            j+=delta;
            if (j==m){
                delta*=-1;
                j+=delta;
                i++;
            }
            if (j<0){
                delta*=-1;
                j+=delta;
                i++;
            }
         }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
