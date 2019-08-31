package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Sanal on 7/30/2019.
 */
public class TestProcessing {
    public static void main(String[] args) {
        List<Data_One> list1 = new ArrayList<>();
        List<Data_Two> list2 = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int i=1; i<=100000; i++) {
            list1.add(new Data_One(i,i,i,i));
            list2.add(new Data_Two(i,i,i,i));
        }

        System.out.println("Started Processing...");
        list1.forEach( ele -> {
            Optional<Data_Two> data = list2.stream().filter(list2Ele->
                    (ele.a == list2Ele.a && ele.b == list2Ele.b && ele.c == list2Ele.c)).findFirst();
            if(data.isPresent()) {
                ele.e = data.get().e;
            }
        });
        long count = list1.stream().filter(data -> (data.a != data.e)).count();
        System.out.println("Item Mismatch - " + count + " Time Taken - " + (System.currentTimeMillis() - startTime));
    }
}

class Data_One {
    int a, b, c, d, e;
    public Data_One(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

class Data_Two {
    int a, b, c, e;
    public Data_Two (int a, int b, int c, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
}