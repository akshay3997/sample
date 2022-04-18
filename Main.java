package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int Ans=1;
        int X=sc.nextInt();
        int N=sc.nextInt();

    for(int i=0;i<N;i++){
        Ans=Ans*X;
    }
        System.out.println(Ans);
    }
}
