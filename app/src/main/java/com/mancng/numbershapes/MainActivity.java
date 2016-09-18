package com.mancng.numbershapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        class Number {

            int number;

            public boolean isTriangular() {


                int x = 1;
                int triangularNumber = 1;

                while (triangularNumber < number) {

                    x++;

                    triangularNumber = triangularNumber + x;

                }

                if (triangularNumber == number) {
                        return true;
                    } else {
                        return false;
                }
            }

            public boolean isSquare() {

                int y = 1;
                int squareNumber = 1;

                while (squareNumber < number) {

                    y++;

                    squareNumber = y * y;

                }

                if (squareNumber == number) {

                        return true;
                    } else {
                        return false;
                }
            }
        }


    public void submitNumber(View view){

            EditText enterNumber=(EditText)findViewById(R.id.txtNumber);

            String message = "";

            if (enterNumber.getText().toString().isEmpty()) {

                message = "Please enter a number!";

            } else {

                Number myNumber = new Number();



                myNumber.number = Integer.parseInt(enterNumber.getText().toString());

                if (myNumber.isSquare()) {

                    if (myNumber.isTriangular()) {

                        message = myNumber.number + " is both triangular and square!";

                    } else {

                        message = myNumber.number + " is square but not triangular.";
                    }

                } else {

                    if (myNumber.isTriangular()) {

                        message = myNumber.number + " is triangular but not square.";

                    } else {

                        message = myNumber.number + " is neither square nor triangular!";
                    }
                }
            }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            }

}

