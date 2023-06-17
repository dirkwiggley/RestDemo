package com.softwarewolf.restdemo.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImmutableDemoTest {

    @Test
    void create_new_mutable_demo() {
        ImmutableDemo iDemo = new ImmutableDemo(UUID.randomUUID().toString(), "ImmutableDemo Title", "ImmutableDemo", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", LocalDateTime.of(2024, 6, 16, 0, 0, 0), LocalDateTime.of(2024, 6, 16, 0, 0, 0));

        assertNotNull(iDemo);
        assertEquals("ImmutableDemo Title", iDemo.getTitle());
    }
}
