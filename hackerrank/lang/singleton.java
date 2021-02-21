import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private Singleton() {}
    public String str;
    private static Singleton singleton;
    static Singleton getSingleInstance() {
        if (singleton == null)
            singleton = new Singleton();
            
        return singleton;
    }
}