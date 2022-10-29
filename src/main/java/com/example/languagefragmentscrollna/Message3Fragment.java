/* Natalie Arner
Message Translator App
Translates a greeting into 3 different languages
This is the Message 3 Fragment, which returns Italian
*/
package com.example.languagefragmentscrollna;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Message3Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message3, container, false);
    }
}