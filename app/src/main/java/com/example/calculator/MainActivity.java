package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean add,sub,mul,div;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView2;
        Button button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32;
        textView2=findViewById(R.id.textView2);
        button17=findViewById(R.id.button17);
        button18=findViewById(R.id.button18);
        button19=findViewById(R.id.button19);
        button20=findViewById(R.id.button20);
        button21=findViewById(R.id.button21);
        button22=findViewById(R.id.button22);
        button23=findViewById(R.id.button23);
        button24=findViewById(R.id.button24);
        button25=findViewById(R.id.button25);
        button26=findViewById(R.id.button26);
        button27=findViewById(R.id.button27);
        button28=findViewById(R.id.button28);
        button29=findViewById(R.id.button29);
        button30=findViewById(R.id.button30);
        button31=findViewById(R.id.button31);
        button32=findViewById(R.id.button32);

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"1");
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"2");
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"3");
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"4");
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"5");
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"6");
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"7");
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"8");
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"9");
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"0");
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("");
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.valueOf(textView2.getText().toString());
                add=true;
                textView2.setText(null);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().length()!=0){
                 a=Integer.valueOf(textView2.getText().toString());
                 sub=true;
                textView2.setText(null);}

            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().length()!=0){
                 a=Integer.valueOf(textView2.getText().toString());
                 mul=true;
                textView2.setText(null);}
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getText().length()!=0){
                 a=Integer.valueOf(textView2.getText().toString());
                 div=true;
                textView2.setText(null);}
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b=Integer.valueOf(textView2.getText().toString());
                if(add)
                {
                    int c=a+b;
                    textView2.setText(String.valueOf(c));
                }
                if(sub)
                {
                    int c=a-b;
                    textView2.setText(String.valueOf(c));
                }

                if(mul)
                {
                    int c=a*b;
                    textView2.setText(String.valueOf(c));
                }

                if(div)
                {
                    int c=a/b;
                    textView2.setText(String.valueOf(c));
                }

            }
        });
    }
}
