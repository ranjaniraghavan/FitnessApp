package com.example.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        EditText firstName = findViewById(R.id.editTextText);
        EditText lastName = findViewById(R.id.editTextText2);
        EditText email = findViewById(R.id.editTextText3);
        TextView newFirstName = findViewById(R.id.textView);
        TextView newLastName = findViewById(R.id.textView2);
        TextView newEmail = findViewById(R.id.textView3);

        String to_update = "Names: " + firstName.getText().toString();
        newFirstName.setText(to_update);
        to_update = "Last Name: " + lastName.getText().toString();
        newLastName.setText(to_update);
        to_update = "Email: " + email.getText().toString();
        newEmail.setText(to_update);
    }

    @SuppressLint("SetTextI18n")
    public void getSum(View view) {
        EditText firstNumber = findViewById(R.id.editTextNumber);
        EditText secondNumber = findViewById(R.id.editTextNumber2);
        TextView thirdNumber = findViewById(R.id.textView4);

        try {
            int sum = Integer.parseInt(firstNumber.getText().toString()) +
                    Integer.parseInt(secondNumber.getText().toString());
            thirdNumber.setText(Integer.toString(sum));
        } catch (NumberFormatException e) {
            thirdNumber.setText("Invalid Input");
        }
    }

    public void openDashboard(View view) {
        Intent intent = new Intent(this, dashActivity.class);
        startActivity(intent);
    }
}

public class dashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard); // Ensure you create this layout
    }

    public void openPedometer(View view) {
        Intent intent = new Intent(this, pedometerActivity.class);
        startActivity(intent);
    }

    public void signIn(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}
