package org.Collections.Advanced;

public class Run {

    public static void main(String... arg) {

        HttpRequest request = new HttpRequest();


        //1
        System.out.println(request.hasBody("PUT"));
        System.out.println(request.hasBody("GET"));

        HttpRequestAdvanced advancedRequest1 = new HttpRequestAdvanced("PUT");
        HttpRequestAdvanced advancedRequest2 = new HttpRequestAdvanced("GET");

        System.out.println(advancedRequest1.hasBody());
        System.out.println(advancedRequest2.hasBody());

        //2
        LangConverter phrase = new LangConverter();

        System.out.println(phrase.convert("YeS"));
        System.out.println(phrase.convert("yES"));
        System.out.println(phrase.convert("Y"));
        System.out.println(phrase.convert("ON"));

        System.out.println(phrase.convert("no"));
        System.out.println(phrase.convert("FaLSe"));
        System.out.println(phrase.convert("n"));
        System.out.println(phrase.convert("oFF"));


        System.out.println(phrase.convert("ASqdweasdqwesd"));


    }
}

