package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    EditText number1;
    EditText number2;
    Button addButton;
    TextView result;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        number1 = (EditText) view.findViewById(R.id.input1);
        number2 = (EditText) view.findViewById(R.id.input2);
        addButton = (Button) view.findViewById(R.id.actionButton);
        result = (TextView)  view.findViewById(R.id.output1);

        addButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;
                result.setText(Double.toString(sum));
            }
        });
    }
}