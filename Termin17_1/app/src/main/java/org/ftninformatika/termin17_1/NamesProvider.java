package org.ftninformatika.termin17_1;

import java.util.ArrayList;
import java.util.List;

public class NamesProvider {

    private static List<String> names;

    public static List<String> getNames() {

        if (names == null) {
            names = new ArrayList<>();
            names.add("Pera");
            names.add("Mika");
            names.add("Djoka");
        }
        return names;
    }
}
