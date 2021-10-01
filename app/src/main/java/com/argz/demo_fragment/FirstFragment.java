package com.argz.demo_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn_go_to_second_fragment = view.findViewById(R.id.btn_go_to_second);
        btn_go_to_second_fragment.setOnClickListener(view1 -> {
            EditText editText = view.findViewById(R.id.et_send_message);
            String message = editText.getText().toString();

            Bundle bundle = new Bundle();
            bundle.putString("title", message);

            Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.secondFragment, bundle);
        });
    }
}
