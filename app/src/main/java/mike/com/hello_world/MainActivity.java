package mike.com.hello_world;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.water);

        Button btnMap = (Button)findViewById(R.id.button_map);
        Button btnOther = (Button)findViewById(R.id.button_other_page);

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Maps", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

        btnOther.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
              Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_LONG).show();
              startActivity(new Intent(MainActivity.this, LoginActivity.class));
          }
        });

    }

}
