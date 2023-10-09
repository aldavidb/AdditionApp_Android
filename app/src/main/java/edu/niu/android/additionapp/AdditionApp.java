/************************************************************************
 *   Class Name: AdditionApp.java                                       *
 *   Purpose: This class is the Model for the Android app. It handles   *
 *            instantiation of the AdditionApp class, which takes 2     *
 *            numbers, sets their values from either a constructor or   *
 *            setter function, and can call a total function to add     *
 *            both numbers together and return that sum.                *
 ************************************************************************/

package edu.niu.android.additionapp;

public class AdditionApp {
    private int num1;   //Gotten from user input, used to calculate sum
    private int num2;   //Gotten from user input, used to calculate sum

    //Public constructor used to instantiate AdditionApp class
    public AdditionApp(int num1, int num2)
    {
        setNum1(num1);
        setNum2(num2);
    }

    //Return value of num1
    public int getNum1()
    {
        return num1;
    }

    //Set value of num1
    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    //Return value of num2
    public int getNum2()
    {
        return num2;
    }

    //Set value of num2
    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    //Add num1 and num2 and return the sum
    public int total()
    {
        return num1 + num2;
    }
}
