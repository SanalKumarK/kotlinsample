package test;

import java.io.Serializable;

/**
 * Created by Sanal on 3/29/2019.
 */
public enum EnumSingleTone {

    ENUM_SINGLE_TONE(1);
    int val = 0;

    EnumSingleTone(int val) {
        this.val = val;
    }

    public int printme() {
        return val++;
    }
}
