package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by xy on 2017/1/3.
 * cs 61B lecture-2 example, maybe here missed the close(); method
 */
public class IoTest {

    public static void main(String[] arg) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bf.readLine());
        bf.close();
    }

}

//result, I write hello and press enter, console output hello and the program ends and exits.