package nesada.c4q.nyc.KeyboardKeyTest;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nesada.c4q.nyc.imagetest.R;
import nesada.c4q.nyc.KeyboardKeyTest.adapter.KeyboardKeysAdapter;
import nesada.c4q.nyc.KeyboardKeyTest.backend.ApiResponse;

/**
 * Created by nesadakoca on 1/11/17.
 */


public class ImageView {
    private final View mRoot;
    private final RecyclerView mRecyclerView;

    public ImageView(LayoutInflater inflater, ViewGroup parent) {
        mRoot = inflater.inflate(R.layout.fragment_main, parent,false);
        mRecyclerView = (RecyclerView) mRoot.findViewById(R.id.list);
    }

    public View getLayout() {
        return mRoot;
    }

    public void setData(Context context, ApiResponse data) {
        KeyboardKeysAdapter adapter = new KeyboardKeysAdapter(data, mRoot);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}