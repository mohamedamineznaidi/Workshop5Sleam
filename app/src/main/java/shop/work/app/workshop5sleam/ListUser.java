package shop.work.app.workshop5sleam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import shop.work.app.workshop5sleam.Adapter.UserAdapter;

public class ListUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);
        TextView txt =(TextView)findViewById(R.id.countrynametxt);
        txt.setText(getIntent().getExtras().getString("countryName"));
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        // organise items vertically
        rv.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rv.setItemAnimator(new DefaultItemAnimator());
        // set the Adapter and get user list from the data source
        UserAdapter usersAdapter = new UserAdapter(DataSource.getUsersByCountry(getIntent().getExtras().getString("countryName")));
        rv.setAdapter(usersAdapter);
    }
}