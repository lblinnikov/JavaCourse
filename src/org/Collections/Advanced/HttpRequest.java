package org.Collections.Advanced;

import java.util.HashMap;

class HttpRequest {

    static HashMap<String, Boolean> getRequest() {
        HashMap<String, Boolean> request = new HashMap<>();

        request.put("PUT", true);
        request.put("POST", true);
        request.put("GET", false);
        request.put("DELETE", false);

        return request;
    }

    boolean hasBody(String method) {
        return getRequest().get(method);
    }

}
