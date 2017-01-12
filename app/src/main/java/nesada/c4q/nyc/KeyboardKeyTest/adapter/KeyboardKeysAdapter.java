package nesada.c4q.nyc.KeyboardKeyTest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

import nesada.c4q.nyc.KeyboardKeyTest.backend.KeyboardKey;
import nesada.c4q.nyc.KeyboardKeyTest.backend.ApiResponse;

/**
 * Created by nesadakoca on 1/11/17.
 */



public class KeyboardKeysAdapter extends RecyclerView.Adapter {
    private final List<KeyboardKey> mData;
    private final View mFragmentView;

    public KeyboardKeysAdapter(ApiResponse data, View fragmentView) {
        mData = data.getKeys();
        mFragmentView = fragmentView;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new KeyboardKeysViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        KeyboardKeysViewHolder viewHolder = (KeyboardKeysViewHolder) holder;
        viewHolder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
