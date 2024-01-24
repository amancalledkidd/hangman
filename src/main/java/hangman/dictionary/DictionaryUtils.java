package hangman.dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryUtils {
    private static final List<String> words = new ArrayList<>();


    static {
        words.add("Pizza");
        words.add("Galaxy");
        words.add("Jazz");
        words.add("Zephyr");
        words.add("Pyramid");
        words.add("Glow");
        words.add("Quiz");
        words.add("Hyphen");
        words.add("Xylophone");
        words.add("Bizarre");
        words.add("Yacht");
        words.add("Vortex");
        words.add("Waltz");
        words.add("Umbrella");
        words.add("Tranquil");
        words.add("Sphinx");
        words.add("Rhythm");
        words.add("Penguin");
        words.add("Oxygen");
        words.add("Ninja");
        words.add("Majestic");
        words.add("Labyrinth");
        words.add("Kiosk");
        words.add("Jackpot");
        words.add("Igloo");
        words.add("Hazard");
        words.add("Gossip");
        words.add("Fluorescent");
        words.add("Echo");
        words.add("Dwarves");
        words.add("Crypt");
        words.add("Buzz");
        words.add("Axiom");
        words.add("Awkward");
        words.add("Avenue");
        words.add("Antique");
        words.add("Algorithm");
        words.add("Affix");
        words.add("Accordion");
    }

    public static String generateWord() {
        int name = (int) Math.round(Math.random() * words.size());
        return words.get(name);
    }

}
