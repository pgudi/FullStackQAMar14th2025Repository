package com.sgtesting.tests;
interface University
{
    void showUniversityName(String name);
}

interface College
{
    void showCollegeName(String name);
}

class LVDCollege implements University,College
{
    public void showUniversityName(String name)
    {
        System.out.println("University Name :"+name);
    }

    public void showCollegeName(String name)
    {
        System.out.println("College Name :"+name);
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        University obj1=new LVDCollege();
        obj1.showUniversityName("Bangalore University");

        College obj2= (College) obj1;
        obj2.showCollegeName("LVD College");
    }
}
