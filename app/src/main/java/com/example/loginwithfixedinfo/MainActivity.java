package com.example.loginwithfixedinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    String name;
    String password;



    public void makeText (String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }


    public void loginButton (View view) {

        EditText usernameText = (EditText) findViewById(R.id.usernameText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);



        name = usernameText.getText().toString();
        password= passwordText.getText().toString();

            if (name.isEmpty()) {

                makeText("Please enter a username");

            } else if (name.equals(name) != name.equals("damilola")) {

                makeText("Please enter a valid username");

            }

            else if (password.isEmpty()) {

                makeText("Please enter your password");

            }

            else if (password.length() < 6 || password.length() > 6) {

                makeText("Your password must be 6 characters");

            }

            else if (password.equals(password) != password.equals("qwerty")) {

                makeText("Please enter the correct 6 characters");

            }

               else if (name.equals("damilola") && password.equals("qwerty")) {

                    makeText("Login Successful");

                    usernameText.getText().clear();
                    passwordText.getText().clear();

            }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}
