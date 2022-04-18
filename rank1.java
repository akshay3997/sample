package com.company;
import java.util.*;
public class rank1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int max=0;
        int[] marks=new int[N];

        for(int i=0;i<N;i++){
            marks[i]=sc.nextInt();
        }
    for(int i=0;i<N;i++){

            if(marks[i]>max){
                max=marks[i];

        }
    }
    }
}
