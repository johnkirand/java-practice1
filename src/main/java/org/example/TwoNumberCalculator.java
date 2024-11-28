package org.example;

public class TwoNumberCalculator {

    private int num1;
    private int num2;

    public TwoNumberCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sum(){
        return this.num1 + this.num2;
    }

    public int difference(){
        return this.num1 - this.num2;
    }

    public int product(){
        return this.num1 * this.num2;
    }

    public int division(){
        return this.num1 / this.num2;
    }
}
