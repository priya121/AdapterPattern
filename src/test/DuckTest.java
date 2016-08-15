package test;

import main.Duck;
import main.MallardDuck;
import main.TurkeyAdapter;
import main.WildTurkey;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuckTest {
    WildTurkey turkey = new WildTurkey();
    Duck duck = new MallardDuck();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    @Test
    public void duckQuacks() {
        assertEquals(duck.quack(), "Quack");
    }

    @Test
    public void duckSaysImFlying() {
        assertEquals(duck.fly(), "I'm flying");
    }
    
    @Test
    public void turkeyGobbles() {
        assertEquals(turkey.gobble(), "Gobble gobble");
    }

    @Test
    public void turkeyFliesAShortDistance() {
        assertEquals(turkey.fly(), "I'm flying a short distance");
    }

    @Test
    public void turkeyCanUseDuckInterface() {
        assertEquals(testDuck(turkeyAdapter), "Gobble gobble, I'm flying a short distance");
    }

    public String testDuck(Duck duck) {
        return duck.quack() + ", " + duck.fly();
    }

}
