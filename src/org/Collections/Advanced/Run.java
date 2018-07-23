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
        LangConverter langConverter = new LangConverter();

        System.out.println(langConverter.langConverter("YeS"));
        System.out.println(langConverter.langConverter("yES"));
        System.out.println(langConverter.langConverter("Y"));
        System.out.println(langConverter.langConverter("ON"));

        System.out.println(langConverter.langConverter("no"));
        System.out.println(langConverter.langConverter("FaLSe"));
        System.out.println(langConverter.langConverter("n"));
        System.out.println(langConverter.langConverter("oFF"));


        System.out.println(langConverter.langConverter("ASqdweasdqwesd"));


    }
}

