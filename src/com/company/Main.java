package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code her
        class Number{

            int number;

            public boolean isSquare(){
                double squareRoot = Math.sqrt(number);

                if(squareRoot == Math.floor(squareRoot)){
                    return true;
                }else {
                    return false;
                }
            }
            public boolean isTriangular(){
                int x = 1;
                int triNumber = 1;

                while (triNumber < number){
                    x++;
                    triNumber = triNumber + x;
                }
                if(triNumber == number){
                    return true;
                } else {
                    return false;
                }
            }
        }
        Number myNumber = new Number();
        myNumber.number = 12;
        System.out.println(myNumber.isSquare());
    }
}
