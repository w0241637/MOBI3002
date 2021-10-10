/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.russ.m05_fragments_v01;

//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ArticleFragment extends Fragment {
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {

        // If activity recreated (such as from screen rotate), restore
        // the previous article selection set by onSaveInstanceState().
        // This is primarily necessary when in the two-pane layout.
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.article_view, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        // During startup, check if there are arguments passed to the fragment.
        // onStart is a good place to do this because the layout has already been
        // applied to the fragment at this point so we can safely call the method
        // below that sets the article text.
        Bundle args = getArguments();
        if (args != null) {
            // Set article based on argument passed in
            updateArticleView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition != -1) {
            // Set article based on saved instance state defined during onCreateView
            updateArticleView(mCurrentPosition);
        }
    }

    public void updateArticleView(int position) {
        // Use article or article fragmnent, depending on what's there
        // if acticle...1-pane
        // if article_fragment...2 panes

        //TextView article = (TextView) getActivity().findViewById(R.id.article);
        TextView article = (TextView) this.getView().findViewById(R.id.article);
        TextView frag = (TextView) this.getView().findViewById(R.id.article_fragment);
//        TextView frag02 = (TextView) this.getView().findViewById(R.id.article_fragment02);



        if (article != null) {
            Log.v("Fragments", "article exists - 1 pane");

            // not null, set the article text
            article.setText(Characters.Info[position]);
        } else {
            Log.v("Fragments", "article is null, use fragment - 2 panes");

            if (frag != null) {
                frag.setText(Characters.Info[position]);

            } else {
                Log.v("Fragments", "ERROR.... both article and article_fragment are null");
            }

            // access textview as a fragment...track it down from this object
//            ((TextView) this.getView().findViewById(R.id.article_fragment)).setText(Ipsum.Articles[position]);
//            View v1 = this.getView();
//            View v2 = v1.findViewById(R.id.article_fragment);
//            TextView v3 = (TextView) v2;
//            v3.setText(Ipsum.Articles[position]);
        }

        mCurrentPosition = position;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current article selection in case we need to recreate the fragment
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}