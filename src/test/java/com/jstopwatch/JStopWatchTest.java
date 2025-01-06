package com.jstopwatch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JStopWatchTest {
    // TODO: remove init code.
    @Test void appHasAGreeting() {
        JStopWatch classUnderTest = new JStopWatch();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
