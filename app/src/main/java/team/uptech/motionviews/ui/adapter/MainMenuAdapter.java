package team.uptech.motionviews.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import team.uptech.motionviews.R;

/**
 * Created by Dimas Maulana on 5/8/17.
 * Email : araymaulana66@gmail.com
 */

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.ViewHolder> {

    public LayoutInflater layoutInflater;
    public Context context;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMenu;
        TextView tvMenu;


        public ViewHolder(View itemView) {
            super(itemView);

            imgMenu = (ImageView) itemView.findViewById(R.id.img_item_main);
            tvMenu = (TextView) itemView.findViewById(R.id.tv_item_main);
        }
    }
}
