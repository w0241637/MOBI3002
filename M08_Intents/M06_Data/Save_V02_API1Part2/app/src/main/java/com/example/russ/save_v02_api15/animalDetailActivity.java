package com.example.russ.save_v02_api15;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.EditText;

/**
 * An activity representing a single animal detail screen. This
 * activity is only used narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link animalListActivity}.
 */
public class animalDetailActivity extends AppCompatActivity {

    public String fragmentWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replaced default with my own detail action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

                System.out.println("Fab pressed");
                String message = animalDetailFragment.animalWebsite;
//                String message = "http://www.nscc.ca";
                Log.w("MainActivity-INTENT", "sendMessage: " + message);

                Uri webpage = Uri.parse(message);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Log.w("MainActivity-INTENT", "sendMessage2: " + message);
                startActivity(intent);

            }
        });

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(animalDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(animalDetailFragment.ARG_ITEM_ID));
            animalDetailFragment fragment = new animalDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.animal_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            navigateUpTo(new Intent(this, animalListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
        System.out.println("Fab pressed");
                String message = "http://www.nscc.ca";
        Log.w("MainActivity-INTENT", "sendMessage3-1: " + message);

        Uri webpage = Uri.parse(message);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        Log.w("MainActivity-INTENT", "sendMessage3-2: " + message);
        startActivity(intent);
    }
}
