package team.uptech.motionviews.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import team.uptech.motionviews.R;
import team.uptech.motionviews.ui.StickerSelectActivity;

/**
 * Created by Dimas Maulana on 5/8/17.
 * Email : araymaulana66@gmail.com
 */

public class StickerSelectAdapter extends RecyclerView.Adapter<StickerSelectAdapter.StickerViewHolder> {

    private final List<Integer> stickerIds;
    private final Context context;
    private final LayoutInflater layoutInflater;

    StickerSelectAdapter(@NonNull List<Integer> stickerIds, @NonNull Context context) {
        this.stickerIds = stickerIds;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public StickerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new StickerViewHolder(layoutInflater.inflate(R.layout.sticker_item, parent, false));
    }

    @Override
    public void onBindViewHolder(StickerViewHolder holder, int position) {
        holder.image.setImageDrawable(ContextCompat.getDrawable(context, getItem(position)));
    }

    @Override
    public int getItemCount() {
        return stickerIds.size();
    }

    private int getItem(int position) {
        return stickerIds.get(position);
    }

    class StickerViewHolder extends RecyclerView.ViewHolder {

        ImageView image;

        StickerViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.sticker_image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if (pos >= 0) { // might be NO_POSITION
                        StickerSelectActivity ssa = new StickerSelectActivity();
                        ssa.onStickerSelected(getItem(pos));
                    }
                }
            });
        }
    }
}