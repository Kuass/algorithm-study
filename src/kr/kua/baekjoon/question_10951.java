package kr.kua.baekjoon;

import java.util.Scanner;

public class question_10951 {
    public static void main(String[] args){
        var in = new Scanner(System.in);

        while(in.hasNextInt()){
            var a = in.nextInt();
            var b = in.nextInt();
            System.out.println(a+b);
        }

        in.close();
    }
}