package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUpScenario() {
        System.out.println("Before Hooks");
    }

    @After
    public void tearDown() {
        System.out.println("After Hooks");
    }


}
