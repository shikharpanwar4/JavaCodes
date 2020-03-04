package com.company;
        import java.io.*;

public class Demo implements Serializable {
    int i = 10;
    static int j = 20;
    transient int k = 30;
    transient final int l = 40;
}
