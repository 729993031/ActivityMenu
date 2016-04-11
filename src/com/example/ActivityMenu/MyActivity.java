package com.example.ActivityMenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MyActivity extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        SubMenu prog=menu.addSubMenu("启动程序");
        prog.setHeaderIcon(R.drawable.tools);
        prog.setHeaderTitle("选择您要启动的程序");
        MenuItem item=prog.add("查看Swift");
        item.setIntent(new Intent(this,OtherActivity.class));
        return super.onCreateOptionsMenu(menu);
    }
}
