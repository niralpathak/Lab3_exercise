package com.example.niralpathak.lab3_exercise.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.niralpathak.lab3_exercise.MainActivity;
import com.example.niralpathak.lab3_exercise.R;

/**
 * Created by niralpathak on 4/14/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>
{
    MainActivity mainActivity;

    public JUnit_test()
    {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        EditText firstNum_edit = (EditText) mainActivity.findViewById(R.id.firstNum);
        EditText secondNum_edit = (EditText) mainActivity.findViewById(R.id.secondNum);

        String first = firstNum_edit.getText().toString();
        String second = secondNum_edit.getText().toString();

        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);

        int tempSum = mainActivity.sum(firstNum, secondNum);

        TextView textView = (TextView) mainActivity.findViewById(R.id.result);
        String tester = textView.getText().toString();

        assertEquals(tempSum, firstNum+secondNum);
    }
}
