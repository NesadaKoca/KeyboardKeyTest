package nesada.c4q.nyc.KeyboardKeyTest.adapter;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nesada.c4q.nyc.KeyboardKeyTest.SecondActivity;
import nesada.c4q.nyc.KeyboardKeyTest.backend.KeyboardKey;
import nesada.c4q.nyc.imagetest.R;

/**
 * Created by nesadakoca on 1/11/17.
 */


public class KeyboardKeysViewHolder extends RecyclerView.ViewHolder {
    private final View mRoot;
    private final TextView mName;

    public KeyboardKeysViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mRoot = itemView;
        mName = (TextView) mRoot.findViewById(R.id.name);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.keyboardkey_viewholder, parent, false);
    }

    public void bind(final KeyboardKey key) {
        mName.setText(key.getName());
        int textColor = Color.parseColor(key.getTextColor());
        mName.setTextColor(textColor);
        mRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), SecondActivity.class);
                intent.putExtra(SecondActivity.URL, key.getUrlPath());
                v.getContext().startActivity(intent);
            }
        });

    }
}