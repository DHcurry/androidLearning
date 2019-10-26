package com.example.application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    /**
     * 我们从这里开始写第一个Activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        // 可以通过R这个类去通过id查询到button,上面是设置view
        Button button1 = findViewById(R.id.button_1);

        // 这里就是给buttom设置一个点击监视器
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 这里就是设置点击的效果
                Toast.makeText(FirstActivity.this,"click on button1",Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 这里的方法就是创建一个可以操作的menu
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    /**
     * 创建要给menu依据
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // getMenuInflater方法可以得到MenuInflater对象，inflater依据menu的配置文件来创建menu
        getMenuInflater().inflate(R.menu.main,menu);
        // true表示创建的menu显示，否则不显示
        return true;

    }
}
