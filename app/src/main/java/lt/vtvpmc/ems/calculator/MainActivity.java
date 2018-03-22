package lt.vtvpmc.ems.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText Number1, Number2;
    Button add, subtract, multiply, divide;
    float result_Num;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        result = (TextView)findViewById(R.id.ats);
        Number1 = (EditText)findViewById(R.id.pirmas);
        Number2 = (EditText)findViewById(R.id.antras);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_Num = num1 + num2;
                result.setText(String.valueOf(result_Num));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_Num = num1 - num2;
                result.setText(String.valueOf(result_Num));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_Num = num1 / num2;
                result.setText(String.valueOf(result_Num));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_Num = num1 * num2;
                result.setText(String.valueOf(result_Num));
            }
        });

    }
}