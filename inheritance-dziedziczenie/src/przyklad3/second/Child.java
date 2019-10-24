package przyklad3.second;

import przyklad3.first.Parent;

import java.lang.reflect.Parameter;

/**
 * Created by Piotr on 2019-10-24
 */
public class Child extends Parent {
    public Child() {
        name = "Hello"; //wszystko ok. name ma specyfikator protected
//        value = 5; // błąd ple value nie jest dziedziczone w klasie Child
    }

}
