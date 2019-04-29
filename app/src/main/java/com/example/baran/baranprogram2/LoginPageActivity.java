package com.example.baran.baranprogram2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginPageActivity extends AppCompatActivity {

    Icon_Manager icon_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if(extras==null){

        }
        if(extras.containsKey("customer_login_page")){
            setContentView(R.layout.customer_login_page);

            ((TextView) findViewById(R.id.login_CName_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_CUsername_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_CPass_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_CRePass_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_CEmail_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));




        }
        if(extras.containsKey("seller_login_page")){
            setContentView(R.layout.seller_login_page);

            ((TextView) findViewById(R.id.login_STitle_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SName_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SUsername_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SPass_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SRePass_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SEmail_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SAddress_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SSenf_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
            ((TextView) findViewById(R.id.login_SPhone_icon)).setTypeface(icon_manager.get_icons("fonts/icons.ttf",this));
        }
    }
}
