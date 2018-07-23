package org.Collections.Advanced;

import java.util.HashMap;

public class LangConverter {

    public final static HashMap<String, Boolean> input;

    static {
        input = new HashMap<>();

        input.put("yes", true);
        input.put("true", true);
        input.put("y", true);
        input.put("on", true);

        input.put("no", false);
        input.put("false", false);
        input.put("n", false);
        input.put("off", false);
    }

    public Boolean langConverter(String value){
        return input.getOrDefault(value.toLowerCase(), null);
    }

}
