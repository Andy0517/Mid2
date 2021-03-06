package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int SPEC_FUNC = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SPEC_FUNC){
            Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
        }
    }

    public void fun1(View view){
        Intent intent = new Intent(this,Func1Activity.class);
        startActivity(intent);
    }
    public void fun2(View view){
        Intent intent = new Intent(this,Func2Activity.class);
        startActivity(intent);
    }
    public void fun3(View view){
        Intent intent = new Intent(this,Func3Activity.class);
        startActivityForResult(intent,SPEC_FUNC);
    }


    public void fun4(View view){
        Intent intent = new Intent(this,Func4Activity.class);
        startActivity(intent);
    }
    public void fun5(View view){
        Intent intent = new Intent(this,Func5Activity.class);
        startActivity(intent);
    }
    public void fun6(View view){
        Intent intent = new Intent(this,Func6Activity.class);
        startActivity(intent);
    }
    public void fun7(View view){
        Intent intent = new Intent(this,Func7Activity.class);
        startActivityForResult(intent,SPEC_FUNC);
    }

    public void fun8(View view){
        Intent intent = new Intent(this,Func8Activity.class);
        startActivityForResult(intent,SPEC_FUNC);
    }
}
