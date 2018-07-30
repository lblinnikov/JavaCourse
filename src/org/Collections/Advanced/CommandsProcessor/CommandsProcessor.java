package org.Collections.Advanced.CommandsProcessor;

public class CommandsProcessor {

    private static String command;

    public static void main(String... arg) {

        Runtime runtime = Runtime.getRuntime();

        try
        {

            String[] cmd = new String[2];
            cmd[0] = "notepad";
            cmd[1] = "File.java";

            runtime.exec(cmd);

            System.out.println("File.java opening in Notepad");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }

}
