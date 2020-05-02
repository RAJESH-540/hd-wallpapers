package com.example.hdwallapers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hdwallapers.databinding.ActivityHomeBinding;
import com.example.hdwallapers.databinding.NavigationHeaderBinding;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {
    private ActivityHomeBinding binding;

    private TextView Name, Email;
    private Button logout;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    //

    private FragmentAdapter adapter;
    private NavigationHeaderBinding navigationHeaderBinding;

    public Home() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        // methods

        setSupportActionBar(binding.toolbar);
        setUpNavHeader();
        setFragments();
        clickEventDrawermenu();


//        //
        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if (signInAccount != null) {
            navigationHeaderBinding.name.setText(signInAccount.getDisplayName());
//          navigationHeaderBinding..setText(signInAccount.getEmail());
        }


    }

    private void setUpNavHeader() {
        navigationHeaderBinding = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.navigation_header, binding.navigationView, false);
        binding.navigationView.addHeaderView(navigationHeaderBinding.getRoot());
        toggle = new ActionBarDrawerToggle(this, binding.drawer, binding.toolbar, (R.string.Opn_drawer),
                (R.string.close_drawer));
        binding.drawer.addDrawerListener(toggle);
        //      navigationHeaderBinding.executePendingBindings();
        toggle.syncState();

    }

    @Override
    public void onBackPressed() {
        if (binding.drawer.isDrawerOpen(GravityCompat.START)) {
            binding.drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }


    private void setFragments() {
        adapter= new FragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new CategoryFragment(),"Category");
        adapter.addFragment(new MostPopularFragment(),"Most Popular");
        adapter.addFragment(new LatestFragment(),"Latest");
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }

    private void clickEventDrawermenu() {
        binding.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_logout:
                        FirebaseAuth.getInstance().signOut();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_home:
                        Toast.makeText(Home.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intenthome = new Intent(getApplicationContext(), Home.class);
                        startActivity(intenthome);


                }
                return true;
            }
        });


    }


}

