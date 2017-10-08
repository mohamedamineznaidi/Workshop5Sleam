package shop.work.app.workshop5sleam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CountrySelect extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_select);
        final EditText countryName = (EditText) findViewById(R.id.countryeditext);
        Button ok = (Button) findViewById(R.id.okbtn);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (DataSource.checkCountryExists(countryName.getText().toString())) {
                    Intent trik = new Intent(getApplication(), ListUser.class);
                    trik.putExtra("countryName", countryName.getText().toString());
                    startActivity(trik);
                } else
                    Toast.makeText(getApplicationContext(), "Country mouch mawjoud", Toast.LENGTH_LONG).show();
            }
        });
    }
}

