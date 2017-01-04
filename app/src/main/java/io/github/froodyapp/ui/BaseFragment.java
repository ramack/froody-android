package io.github.froodyapp.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public abstract class BaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    public abstract String getFragmentTag();

    public abstract boolean onBackPressed();
}