package test;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Sanal on 3/29/2019.
 */
public class ConstructingObjects {

    public static Boolean valueOf(boolean b) {
        return b? Boolean.TRUE : Boolean.FALSE;
    }
}
