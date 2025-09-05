package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void hello_returns_expected() {
        assertEquals("Hello CI!", App.hello());
    }
}

