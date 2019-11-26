package com.example.mathoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    EditText etnum1,etnum2,etresult;
    RadioGroup rg;
    RadioButton rbAdd, rbSub,rbMul,rbDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
etnum1 = findViewById(R.id.num1);
etnum2 = findViewById(R.id.num2);
etresult = findViewById(R.id.result);
rg = findViewById(R.id.radio);
//rbAdd = findViewById(R.id.add);
//rbSub =findViewById(R.id.sub);
//rbMul =  findViewById(R.id.mul);
//rbDiv =findViewById(R.id.div);

 rg.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup rg, int id)
    {
        double first = 0,second = 0;
        if(etnum1.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(),"Enter the first number",Toast.LENGTH_LONG).show();
        else
         first = Double.parseDouble(etnum1.getText().toString());

        if(etnum2.getText().toString().equals(""))
          Toast.makeText(getApplicationContext(),"Enter the Second number",Toast.LENGTH_LONG).show();
        else
         second = Double.parseDouble(etnum2.getText().toString());
        double result = 0;
      switch (id){
          case R.id.add:
             result = first+second;
             break;
          case R.id.sub:
              result = first-second;
              break;
          case R.id.mul:
              result = first*second;
              break;
          case R.id.div:
              result = first/second;

      }
      Double res = new Double(result);
      etresult.setText(res.toString());
    }
}
