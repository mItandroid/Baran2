package com.example.baran.baranprogram2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TextInputEditText;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private static int CUSTOMER_LOGIN = 1;
    private static int SELLER_LOGIN = 0;
    TextView tv;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_customer_login);

//        Icon_Manager icon_manager = new Icon_Manager();

//        TextInputEditText textInputEditText1 = findViewById(R.id.txt_inp);
//        TextInputEditText textInputEditText2 = findViewById(R.id.txt_inp2);
        Log.i("mylog", "before set");

        ((TextView)findViewById(R.id.tv_fullName_customer)).setTypeface(Icon_Manager.get_icons("fonts/icons.ttf", this));
        ((TextView)findViewById(R.id.tv_userName_customer)).setTypeface(Icon_Manager.get_icons("fonts/icons.ttf", this));
        ((TextView)findViewById(R.id.tv_password_customer)).setTypeface(Icon_Manager.get_icons("fonts/icons.ttf", this));
        ((TextView)findViewById(R.id.tv_rePassword_customer)).setTypeface(Icon_Manager.get_icons("fonts/icons.ttf", this));
        ((TextView)findViewById(R.id.tv_email_customer)).setTypeface(Icon_Manager.get_icons("fonts/icons.ttf", this));
//        ((TextView)findViewById(R.id.tv_toolbar_back)).setTypeface(Icon_Manager.get_icons("fonts/icons.ttf", this));
        Log.i("mylog", "iconset");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("open fa_icon").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                startActivity(new Intent(getApplicationContext(), fa_icon.class));
                return false;
            }
        });

        SubMenu listSubmenu = menu.addSubMenu("Login");
        listSubmenu.add("مشتری").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(getApplicationContext(), LoginPageActivity.class);
                intent.putExtra("customer_login_page", CUSTOMER_LOGIN);
                startActivity(intent);
                return false;
            }
        });

        listSubmenu.add("فروشنده").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(getApplicationContext(), LoginPageActivity.class);
                intent.putExtra("seller_login_page", SELLER_LOGIN);
                startActivity(intent);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);

    }
}
