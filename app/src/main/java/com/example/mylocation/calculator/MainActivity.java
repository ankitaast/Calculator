package com.example.mylocation.calculator;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bequal,bclr,add,sub,mul,div;
    float val1,val2,r;
    Boolean addition, subtraction,multiply,division;
    boolean  is_op;
    char ch_op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        is_op = false;
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);

        t1=findViewById(R.id.rs);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        ba=findViewById(R.id.b10);
        bequal=findViewById(R.id.be);
        bclr=findViewById(R.id.bcl);
        add=findViewById(R.id.badd);
        sub=findViewById(R.id.bsub);
        mul=findViewById(R.id.bmul);
        div=findViewById(R.id.bdiv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"1"));
                else
                 e1.setText(e1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"1"));
                else
                    e1.setText(e1.getText()+"1");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"1"));
                else
                    e1.setText(e1.getText()+"1");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"1"));
                else
                    e1.setText(e1.getText()+"1");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"1"));
                else
                    e1.setText(e1.getText()+"1");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"1"));
                else
                    e1.setText(e1.getText()+"1");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"7"));
                else
                    e1.setText(e1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"8"));
                else
                    e1.setText(e1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"9"));
                else
                    e1.setText(e1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_op)
                    e2.setText((e2.getText()+"0"));
                else
                    e1.setText(e1.getText()+"0");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ch_op = '+';
               is_op=true;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch_op = '-';
                is_op=true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch_op = '*';
                is_op=true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch_op = '/';
                is_op=true;
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(e1.getText().toString());
                val2=Float.parseFloat(e2.getText().toString());

                switch (ch_op){
                    case '+':t1.setText(String.valueOf(((val1+val2))));break;
                    case '-':t1.setText(String.valueOf(((val1-val2))));break;
                    default:return;
                }
                ch_op = ' ';
                is_op=false;
                e1.setText("");
                e2.setText("");
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }

        });

    }
}
