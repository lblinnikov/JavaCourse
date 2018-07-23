package org.Collections.Advanced;

public class Run {

    public static void main(String... arg) {

        HttpRequest request = new HttpRequest();

        System.out.println(request.hasBody("PUT"));
        System.out.println(request.hasBody("GET"));

        HttpRequestAdvanced advancedRequest1 = new HttpRequestAdvanced("PUT");
        HttpRequestAdvanced advancedRequest2 = new HttpRequestAdvanced("GET");

        System.out.println(advancedRequest1.hasBody());
        System.out.println(advancedRequest2.hasBody());


    }
}

