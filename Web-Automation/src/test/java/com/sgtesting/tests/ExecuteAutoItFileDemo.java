package com.sgtesting.tests;

public class ExecuteAutoItFileDemo {
    public static void main(String[] args) {
        executeFile();
    }

    private static void executeFile()
    {
        try
        {
            Runtime.getRuntime().exec("D:\\GitQARepository2\\CurrentWorkspace\\AutoIT\\FirstTestInAutoIt.exe");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
