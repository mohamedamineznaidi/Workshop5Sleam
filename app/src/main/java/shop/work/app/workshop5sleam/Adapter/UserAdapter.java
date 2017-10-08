package shop.work.app.workshop5sleam.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import shop.work.app.workshop5sleam.Entity.User;
import shop.work.app.workshop5sleam.R;

/**
 * Created by Asus on 08/10/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>  {

    private List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }
    @Override
    public UserAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserAdapter.MyViewHolder holder, int position) {
        holder.name.setText(users.get(position).getName());
        holder.country.setText(users.get(position).getCountry());
    }

    @Override
    public int getItemCount()  {
        return users.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, country;

        public MyViewHolder(View view) {
            super(view);
            // textview from layout
            name = (TextView) view.findViewById(R.id.name);
            country = (TextView) view.findViewById(R.id.country);

        }
    }
}
