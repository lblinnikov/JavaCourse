package org.Collections.Advanced;

import java.util.HashMap;

class HttpRequest {

    public final static HashMap<String, Boolean> request;

    static {
        request = new HashMap<>();

        request.put("PUT", true);
        request.put("POST", true);
        request.put("GET", false);
        request.put("DELETE", false);
    }

    boolean hasBody(String method) {
        return request.get(method);
    }

}
