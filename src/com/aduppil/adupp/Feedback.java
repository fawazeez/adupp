package com.aduppil.adupp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends Activityclass {
	EditText txtMessage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
		Button butsend = (Button)findViewById(R.id.buttonsend);
		 txtMessage = (EditText)findViewById(R.id.textfeedback);
		butsend.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String message = txtMessage.getText().toString();
				Intent email = new Intent (Intent.ACTION_SEND);
				email.putExtra(Intent.EXTRA_EMAIL, new String[]{"aaduppil@yahoo.com"});
				email.putExtra(Intent.EXTRA_SUBJECT, "Adupp Feedback");
				email.putExtra(Intent.EXTRA_TEXT, message);
				email.setType("message/rfc822");
				startActivity(Intent.createChooser(email, "Choose an Email client"));
				
			}
		});
	}

}
