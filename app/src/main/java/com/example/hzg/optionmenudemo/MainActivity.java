package com.example.hzg.optionmenudemo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        通过xml来添加项目
//        getMenuInflater().inflate(R.menu.menu_main,menu);

//        通过动态添加菜单项
//        menu.add(groupId,itemId,order,title);(分组用的Id，区分Item用的id，排序，文字描述)；
        menu.add(1, 100, 1, "菜单一");

        MenuItem item=menu.add(1, 101, 1, "菜单二");
        item.setTitle("通过代码设置的标题");
        item.setIcon(R.mipmap.ic_launcher);//在api大于等于11，不显示图标

        menu.add(1, 102, 1, "菜单三");
        menu.add(1, 103, 1, "菜单四");
        menu.add(1, 104, 1, "菜单五");
        menu.add(1, 105, 1, "菜单七");
        menu.add(1, 106, 1, "菜单六");
        menu.add(1, 107, 1, "菜单八");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.menu_item1:
//                Toast.makeText(this, "点击菜单一", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menu_item2:
//                Toast.makeText(this, "点击菜单二", Toast.LENGTH_SHORT).show();
//                break;
            case 100:
//                Toast.makeText(this, "点击菜单一", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                item.setIntent(intent);
                break;
            case 101:
                Toast.makeText(this, "点击菜单二", Toast.LENGTH_SHORT).show();
                break;
            case 102:
                Toast.makeText(this, "点击菜单三", Toast.LENGTH_SHORT).show();
                break;
            case 103:
                Toast.makeText(this, "点击菜单四", Toast.LENGTH_SHORT).show();
                break;
            case 104:
                Toast.makeText(this, "点击菜单五", Toast.LENGTH_SHORT).show();
                break;
            case 105:
                Toast.makeText(this, "点击菜单六", Toast.LENGTH_SHORT).show();
                break;
            case 106:
                Toast.makeText(this, "点击菜单七", Toast.LENGTH_SHORT).show();
                break;
            case 107:
                Toast.makeText(this, "点击菜单二", Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
