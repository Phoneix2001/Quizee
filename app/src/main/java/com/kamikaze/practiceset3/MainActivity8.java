package com.kamikaze.practiceset3;



import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity8 extends AppCompatActivity {
private DrawerLayout drawerLayout;
Toolbar toolbar;
NavigationView navigationView;
ActionBarDrawerToggle drawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
       TabLayout tabLayout = findViewById(R.id.tabLayout);
       TabItem tabitem =findViewById(R.id.Monster) ;
       TabItem tabitem2 =findViewById(R.id.Pokemon) ;
       TabItem tabitem3 =findViewById(R.id.OnePiece) ;
       ViewPager viewPager = findViewById(R.id.viewPager);
        //Toolbar
toolbar= findViewById(R.id.toolbar34);
drawerLayout=findViewById(R.id.drawerlayout);
setSupportActionBar(toolbar);
this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       getSupportActionBar().setHomeButtonEnabled(true);

        mypageradapter mypageradapter =new mypageradapter(getSupportFragmentManager(),tabLayout.getTabCount());
       viewPager.setAdapter(mypageradapter);
      //   this command is to set view pager with tab layout
        tabLayout.setupWithViewPager(viewPager);
        navigationView =findViewById(R.id.nVView);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        setupDrawerContent(navigationView);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectDrawerItem(item);
                return true;
            }
        });
    }

    private void selectDrawerItem(MenuItem item) {
        Fragment fragment =null;
        Class fragmentclass;
        switch (item.getItemId()){
            case R.id.Naruto:
                fragmentclass =nav_Naruto.class;
                break;
            case R.id.Sasuke:
                fragmentclass = nav_Sasuke.class;
                break;
            case R.id.Sakura:
                fragmentclass = nav_sakura.class;
                break;
            default:
                fragmentclass =nav_Naruto.class;
        }
        try {
            fragment =(Fragment) fragmentclass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();

        }

        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.framelayout,fragment).commit();
        item.setChecked(true);
        setTitle(item.getTitle());
        drawerLayout.closeDrawers();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}