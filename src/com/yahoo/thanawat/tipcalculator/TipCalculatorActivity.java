package com.yahoo.thanawat.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipCalculatorActivity extends Activity {
    TextView tvTip;
    EditText etTotalAmount;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        
        tvTip = (TextView) findViewById(R.id.tvTip);
        etTotalAmount = (EditText) findViewById(R.id.etTotalAmount);
    }
    
    public void calculateTip(View v) {
    	
    	if (etTotalAmount.getText().toString().length() == 0) {
        	Toast.makeText(getApplicationContext(), R.string.please_enter_amount, Toast.LENGTH_SHORT).show();
            return;  	
    	}
    	
    	
    	double total = Double.parseDouble(etTotalAmount.getText().toString());
    	double tip=0;
    	
    	switch (v.getId()) {
    	    case R.id.btn10:
    	    	tip = total * 0.1;
    		    break;
    	    case R.id.btn15:
    	    	tip = total * 0.15;
    		    break;
    	    case R.id.btn20:
    	    	tip = total * 0.2;
    		    break;
    	}
    	
    	tvTip.setText(String.format("$%.2f", tip));
        
    }
}
