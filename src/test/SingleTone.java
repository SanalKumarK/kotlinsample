package test;

/**
 * Created by Sanal on 3/29/2019.
 */
public class SingleTone {
    private static volatile SingleTone singInstance = null;

    private SingleTone() {
    }

    public static SingleTone getInstance() {
        if(singInstance == null) {
            synchronized (SingleTone.class) {
                if(singInstance == null) {  //Double Checking
                    singInstance = new SingleTone();
                }
            }
        }
        return singInstance;
    }

    public String printMe() {
        return "OM MAHA GANESHAYA NAMAHA...!!!";
    }
}
