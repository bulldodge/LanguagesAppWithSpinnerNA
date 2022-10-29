/* Natalie Arner
Message Translator App
Translates a greeting into 3 different languages
This is the Welcome Fragment, which leads into all other fragments
*/

package com.example.languagefragmentscrollna;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.widget.Spinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class WelcomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        super.onCreate(savedInstanceState);
        Button btnFindLanguage = view.findViewById(R.id.find_language);
        TextView tvBrands = view.findViewById(R.id.languages);
        Spinner spinnerLanguages = view.findViewById(R.id.lang_choice);

        btnFindLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color = spinnerLanguages.getSelectedItem().toString();

                if (color.equals("English"))
                    Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_messageFragment2);
                else if (color.equals("German"))
                    Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_message2Fragment);
                else if (color.equals("Italian"))
                    Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_message3Fragment);
                else
                    Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_message3Fragment);

            }

        });

        // Inflate the layout for this fragment
        return view;
    }

}