package org.spartaglobal.tk;

public class App 
{
    public static void main( String[] args )
    {
        StringAnagram stringAnagram = new StringAnagram();
        boolean result = stringAnagram.isAnagram("deg","god");
        System.out.println(result);

    }
}
