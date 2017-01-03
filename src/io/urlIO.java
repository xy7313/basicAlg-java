package io;
import java.net.*;
import java.io.*;

/**
 * Created by xy on 2017/1/3.
 * cs 61B lecture-2 example, maybe here missed the close(); method
 */
public class urlIO {
    public static void main(String[] arg) throws Exception {
        URL u = new URL("http://www.google.com/");
        InputStream ins = u.openStream();
        InputStreamReader isr = new InputStreamReader(ins);
        BufferedReader whiteHouse = new BufferedReader(isr);
        while (whiteHouse.readLine() != null) {
            System.out.println(whiteHouse.readLine());
        }
    }
}
