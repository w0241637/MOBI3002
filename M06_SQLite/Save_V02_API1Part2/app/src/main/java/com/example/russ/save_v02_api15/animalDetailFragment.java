package com.example.russ.save_v02_api15;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Replace default data with mine
//import com.example.russ.save_v02.dummy.DummyContent;
import com.example.russ.save_v02_api15.db.DBcontent;
import com.example.russ.save_v02_api15.db.handleDB;

/**
 * A fragment representing a single animal detail screen.
 * This fragment is either contained in a {@link animalListActivity}
 * in two-pane mode (on tablets) or a {@link animalDetailActivity}
 * on handsets.
 */
public class animalDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";
    public static String ACNum;
    public static String IDNum;

    /**
     * The dummy content this fragment is presenting.
     */
//    private DummyContent.DummyItem mItem;
      private DBcontent.AnimalItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public animalDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DBcontent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Log.v("animalDetailFragment", "onCreate mItem=" + mItem.toString());
            Log.v("animalDetailFragment", "onCreate mItem.name=" + mItem.name);
            Log.v("animalDetailFragment", "onCreate mItem.id=" + mItem.id); // use this?
            Log.v("animalDetailFragment", "onCreate mItem.access_count=" + mItem.access_count);
            Log.v("animalDetailFragment", "onCreate mItem.details=" + mItem.details);
            Log.v("animalDetailFragment", "onCreate mItem.last_accessed=" + mItem.last_accessed);



            System.out.println("times accessed: " + mItem.access_count + "<- times fragment accessed");


//            handleDB.getAnimalItem(Integer.parseInt(mItem.id));

            ACNum = mItem.access_count;
            IDNum = mItem.id;
            System.out.println(ACNum + "<- ACNUM look here");



            getUserAC(mItem.access_count);
            getUserID(mItem.id);



            // increment here?

//        getCalledItem(){}


//            try {
//                int mItemACInt = Integer.parseInt(mItem.access_count);
//                Log.v("animalDetailFragment", "mItemACInt" + mItemACInt);
//
//            } catch(NumberFormatException e) {
//                System.out.println("Could not parse " + e);
//            }




            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.name);
            }
        }
    }


    public String getUserAC(String ac){
        return ac;
    }

    public String getUserID(String id){
        return id;
    }

//    public static String UserCalledItem(String ac) {
////        int i = handleDB.getAC();
//        if (ac == null){
//            ac = "0";
//            System.out.println("Tim, no null handler yet");
//        }
//
//        int i = Integer.parseInt(ac);
//        i++;
//        String.valueOf(i);
////        handleDB.setAC(i++);
//        return ac;
//    }

//    public static String getNewAC(){
//        String x = "";
//        return x;
//    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.animal_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.animal_detail)).setText(mItem.details);
        }

        return rootView;
    }
}
