package com.example.m05guifragments.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createPlaceholderItem(i));
//        }
        addItem(new PlaceholderItem("1", "Djarra", "War has been your life for as long as you care to remember. You trained as a youth, studied the use of weapons and armor, learned basic survival techniques, including how to stay alive on the battlefield. You might have been part of a standing national army or a mercenary company, or perhaps a member of a local militia who rose to prominence during a recent war."));
        addItem(new PlaceholderItem("2", "Tumazara", "You ignore resistance to poison damage, can apply poison to a weapon or piece of ammunition as a bonus action, gain proficiency with poisoner's kit and can create a special poison."));
        addItem(new PlaceholderItem("3", "Kappa", "While you are unarmed or wielding only monk weapons and you aren’t wearing armor or wielding a shield, you can use DEX instead of STR for the attack and damage rolls, you can roll your Martial Arts damage die in place of the normal damage, and when you use the Attack action on your turn, you can make one unarmed strike as a bonus action."));
        addItem(new PlaceholderItem("4", "Dro-Khar", "You're a giant humanoid cat rouge"));
        addItem(new PlaceholderItem("5", "Rio", "You are a half-ork who is second in command on the ship formally captained by Gwenevere Stormsword "));
        addItem(new PlaceholderItem("6", "Dungeon Master", "You're the world, and the referee"));

    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static PlaceholderItem createPlaceholderItem(int position) {
        return new PlaceholderItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String id;
        public final String content;
        public final String details;

        public PlaceholderItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}