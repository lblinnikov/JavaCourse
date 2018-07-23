package org.Collections.Advanced;


class HttpRequestAdvanced extends HttpRequest {

    private String method;

    HttpRequestAdvanced(String method) {
        this.method = method;
    }

    boolean hasBody() {
        return request.get(method);
    }

}
