/************************************************************************
 *   CSCI 322/522                 Assignment 3               Fall 2023   *
 *                                                                       *
 *   App Name: Addition App                                              *
 *                                                                       *
 *   Class Name: MainActivity                                            *
 *                                                                       *
 *   Developer(s): Alexander Bertolasi, Dominic Brooks                   *
 *                                                                       *
 *   Due Date: 10/06/2023                                                *
 *                                                                       *
 *   Purpose: This MainActivity class serves as the entry point          *
 *            of the Android app. It initializes the layout              *
 *            and displays the custom activity_main that utilizes        *
 *            constraint layout, as well as handling the calculateSum    *
 *            function when the Button widget is clicked                 *
 *                                                                       *
 ************************************************************************/

package edu.niu.android.additionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private AdditionApp additionApp;    //Give MainActivity a private AdditionApp variable

    /************************************************************************
     *                                                                      *
     * onCreate Initializes the activity's user interface and layout.       *
     *                                                                      *
     ************************************************************************/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Instantiate a new instance of the AdditionApp variable and set default values to 0
        additionApp = new AdditionApp(0, 0);
        setContentView(R.layout.activity_main);
    }

    /************************************************************************
     *                                                                      *
     * Called when user clicks the Add button                               *
     * Gets user values from EditText, calculates the sum, and displays the *
     * sum to the TextView widget                                           *
     *                                                                      *
     ************************************************************************/
    public void calculateSum(View v)
    {
        //Create log message for developer view
        Log.w("MainActivity", "v = " + v);

        //Find reference to EditText widgets and assign them to corresponding variable
        EditText num1EditText = (EditText)findViewById(R.id.label_num1);
        EditText num2EditText = (EditText)findViewById(R.id.label_num2);

        //Retrieve text entered in EditText widgets and assign them to string variables
        String firstInputNum = num1EditText.getText().toString();
        String secondInputNum = num2EditText.getText().toString();

        //Find reference to TextView widget and assign it to a corresponding variable
        TextView totalTextView = (TextView) findViewById(R.id.sumTotal);

        //Try-Catch block
        try {
            //Convert firstInputNum and secondInputNum to integers
            int finalNum1 = Integer.parseInt(firstInputNum);
            int finalNum2 = Integer.parseInt(secondInputNum);

            //Update the Model
            additionApp.setNum1(finalNum1);
            additionApp.setNum2(finalNum2);

            //Ask Model to calculate sum
            int finalSum = additionApp.total();

            //Update the View with total sum
            totalTextView.setText("" + finalSum);
        }
        catch(NumberFormatException nfe)
        {
            //Error block
        }
    }
}