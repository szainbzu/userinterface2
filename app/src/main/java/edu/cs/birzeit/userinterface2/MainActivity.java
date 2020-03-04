package edu.cs.birzeit.userinterface2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swt_onClick(View view) {
        Switch swt = (Switch)view;
        String info = "";
        if(swt.isChecked()){
            info = "Switch is On";
        }
        else{
            info = "Switch is Off";
        }
        printInfo(info);
    }

    private void printInfo(String info) {
        Toast.makeText(this, info,
                Toast.LENGTH_SHORT).show();
    }
}
