package com.example.mck.tourguideapp_krakow;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FamousPlacesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.place1_title, R.string.place1_description,
                R.drawable.img_place_1));
        words.add(new Word(R.string.place2_title, R.string.place2_description,
                R.drawable.img_place_2));
        words.add(new Word(R.string.place3_title, R.string.place3_description,
                R.drawable.img_place_3));
        words.add(new Word(R.string.place4_title, R.string.place4_description,
                R.drawable.img_place_4));
        words.add(new Word(R.string.place5_title, R.string.place5_description,
                R.drawable.img_place_5));
        words.add(new Word(R.string.place6_title, R.string.place6_description,
                R.drawable.img_place_6));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
