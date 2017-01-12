package nesada.c4q.nyc.KeyboardKeyTest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nesada.c4q.nyc.KeyboardKeyTest.backend.Backend;
import nesada.c4q.nyc.KeyboardKeyTest.helper.Consumer;
import nesada.c4q.nyc.KeyboardKeyTest.backend.ApiResponse;

/**
 * Created by nesadakoca on 1/11/17.
 */


public class MainFragment extends Fragment {

    private ImageView mView;
    private Backend mBackend;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mBackend = new Backend(getContext());
    }
    @Override
    public void onStart(){
        super.onStart();
        mBackend.downloadData(buildDownloadReceiver());
    }

    private Consumer<ApiResponse> buildDownloadReceiver() {
        return new Consumer<ApiResponse>() {
            @Override
            public void accept(ApiResponse data) {
                mView.setData(getContext(), data);
            }
        };
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        mView = new ImageView(inflater, parent);
        return mView.getLayout();
    }
}