package org.Collections.Advanced;

import java.util.HashMap;

class LangConverter {

    private static HashMap<String , Boolean> getInput() {
        HashMap<String, Boolean> input = new HashMap<>();

        input.put("yes", true);
        input.put("true", true);
        input.put("y", true);
        input.put("on", true);

        input.put("no", false);
        input.put("false", false);
        input.put("n", false);
        input.put("off", false);

        return input;
    }


    Boolean convert(String value){
        return getInput().getOrDefault(value.toLowerCase(), null);
    }

}
