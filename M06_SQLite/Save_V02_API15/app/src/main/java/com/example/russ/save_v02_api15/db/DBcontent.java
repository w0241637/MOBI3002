package com.example.russ.save_v02_api15.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Log;

import com.example.russ.save_v02_api15.animalDetailFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Russ on 2/5/2016.
 */
public class DBcontent {

    public String ACincrementer;
    public boolean data_is_set = false;

    /**
     * An array of items.
     */
//    public static List<AnimalItem> ITEMS = new ArrayList<AnimalItem>();
    public static List<AnimalItem> ITEMS;
    public List<AnimalItem> getITEMS() {
        return ITEMS;
    }

    /**
     * A map of items, by ID.
     */
//    public static Map<String, AnimalItem> ITEM_MAP = new HashMap<String, AnimalItem>();
    public static Map<String, AnimalItem> ITEM_MAP;
    public Map<String, AnimalItem> getITEM_MAP() {
        return ITEM_MAP;
    }


    // If you update DATABASE_VERSION, then the DB's onUpgrade() will be called
    private static final String DATABASE_NAME = "AnimalDB";
    private static final int DATABASE_VERSION = 10;

    Context context;
    handleDB dbRaw;

    // Empty Constructor
    public DBcontent() {
    }

    // Constructor to create DB
    public DBcontent(Context context) {
        Log.v("DBcontent", "DBcontent constructor");
        dbRaw = new handleDB(context, DATABASE_NAME, null, DATABASE_VERSION);

        // Add some sample items.
        if (dbRaw.getCount() > 1) {
            Log.v("DBcontent", "DBcontent already rows in DB");

        } else {
            Log.v("DBcontent", "DBcontent no rows in DB...add some");

            AnimalItem a = new AnimalItem("1", "Djarra", "War has been your life for as long as you care to remember. You trained as a youth, studied the use of weapons and armor, learned basic survival techniques, including how to stay alive on the battlefield. You might have been part of a standing national army or a mercenary company, or perhaps a member of a local militia who rose to prominence during a recent war.", ACincrementer);
            dbRaw.addAnimal(a);

            a = new AnimalItem("2", "Kappa", "While you are unarmed or wielding only monk weapons and you aren’t wearing armor or wielding a shield, you can use DEX instead of STR for the attack and damage rolls, you can roll your Martial Arts damage die in place of the normal damage, and when you use the Attack action on your turn, you can make one unarmed strike as a bonus action.", ACincrementer);
            dbRaw.addAnimal(a);

            a = new AnimalItem("3", "Dro'Khar", "You're a giant humanoid cat rouge", ACincrementer);
            dbRaw.addAnimal(a);

            a = new AnimalItem("4", "Tumazara", "You ignore resistance to poison damage, can apply poison to a weapon or piece of ammunition as a bonus action, gain proficiency with poisoner's kit and can create a special poison.", ACincrementer);
            dbRaw.addAnimal(a);

            a = new AnimalItem("5", "Rio", "You are a half-ork who is second in command on the ship formally captained by Gwenevere Stormsword", ACincrementer);
            dbRaw.addAnimal(a);

            a = new AnimalItem("6", "Dungeon Mastea", "You're the world, and the referee", ACincrementer);
            dbRaw.addAnimal(a);

        }



//        animalDetailFragment.ACNum;
//
//                handleDB.setAC(1);

//        dbRaw.update(TableName, cv, "_id = ?", new String[]{id});


//        AnimalItem temp = dbRaw.selectAC("2");
        dbRaw.updateAC(animalDetailFragment.ACNum,animalDetailFragment.IDNum);


        ITEMS = dbRaw.getAllAnimalItems();
        ITEM_MAP = dbRaw.getAllAnimalItemDetails();

        data_is_set = true;

//        dbRaw.getCount();

        Log.v("DBcontent", "ITEMS=" + ITEMS.toString());
        Log.v("DBcontent", "ITEM_MAP=" + ITEM_MAP.toString());
    }

    public String ACcounter() {
        String newNum = null;
        return newNum;
    }

    // Handle closing the DB
    public void onStop() {
        dbRaw.close();
    }


    public int getSize() {
        return dbRaw.getCount();
    }

    /**
     * A Animal item representing a piece of content.
     */
    public class AnimalItem {


        public final String id;
        public final String name;
        public final String details;
        public final String access_count;

        public AnimalItem(String id, String name, String details, String access_count) {
            this.id = id;
            this.name = name;
            this.details = details;
            this.access_count = access_count;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
