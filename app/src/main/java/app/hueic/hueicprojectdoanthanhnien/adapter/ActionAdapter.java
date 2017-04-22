package app.hueic.hueicprojectdoanthanhnien.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.hueic.hueicprojectdoanthanhnien.R;
import app.hueic.hueicprojectdoanthanhnien.model.Action;

/**
 * Created by kenhoang on 4/22/17.
 */

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvIndex;
        public TextView tvAction;
        public ViewHolder(View itemView) {
            super(itemView);
            //TextView
            tvIndex = (TextView) itemView.findViewById(R.id.tvIndex);
            tvAction = (TextView) itemView.findViewById(R.id.tvHoatDong);
        }
    }
    private List<Action> mAction;

    public ActionAdapter(List<Action> mAction) {
        this.mAction = mAction;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View authorView = inflater.inflate(R.layout.item_recycleview_action, parent, false);
        ViewHolder viewHolder = new ViewHolder(authorView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Action action = mAction.get(position);
        TextView tvIndex = holder.tvIndex;
        TextView tvHoatDong = holder.tvAction;
        tvIndex.setText(position + 1 + ".");
        tvHoatDong.setText(action.getNameAction());
    }
    //Return the total count of items
    @Override
    public int getItemCount() {
        return mAction.size();
    }
}
