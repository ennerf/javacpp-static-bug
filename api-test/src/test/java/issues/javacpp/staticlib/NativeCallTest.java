package issues.javacpp.staticlib;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class NativeCallTest {

    @Test
    public void testVersion() {
        System.setProperty("org.bytedeco.javacpp.logger.debug", "true");
        assertEquals(0, HelloWorld.fnHelloWorld(-1));
        assertEquals(1, HelloWorld.fnHelloWorld(0));
        assertEquals(2, HelloWorld.fnHelloWorld(1));
    }

}
