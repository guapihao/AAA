package com.example.aaaaaaaaaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText total,num;
    Button cal;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total=(EditText)findViewById(R.id.total);
        num=(EditText)findViewById(R.id.num);
        cal=(Button)findViewById(R.id.cal);
        res=(TextView)findViewById(R.id.res);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //res.setText(total.getText()/num.getText());
                if(!TextUtils.isEmpty(total.getText())&&!TextUtils.isEmpty(num.getText())) {
                    float num1 = Integer.parseInt(total.getText().toString());
                    float num2 = Integer.parseInt(num.getText().toString());
                    res.setText("每人所需交钱数目"+String.valueOf(num1 / num2));
                }
                else{
                    Toast.makeText(MainActivity.this, "plase enter every information", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
