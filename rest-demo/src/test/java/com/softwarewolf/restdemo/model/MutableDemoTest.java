package com.softwarewolf.restdemo.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MutableDemoTest {

    @Test
    void create_new_mutable_demo() {
        MutableDemo mDemo = new MutableDemo(UUID.randomUUID().toString(), "ImmutableDemo Title", "ImmutableDemo", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", LocalDateTime.of(2024, 6, 16, 0, 0, 0), LocalDateTime.of(2024, 6, 16, 0, 0, 0));
        mDemo.setId(UUID.randomUUID().toString());
        mDemo.setTitle("MutableDemo Title");
        mDemo.setDescription("MutableDemo");
        mDemo.setUrl("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        mDemo.setStartDate(LocalDateTime.of(2024, 6, 16, 0, 0, 0));
        mDemo.setEndDate(LocalDateTime.of(2024, 6, 16, 1, 0, 0));

        assertNotNull(mDemo);
        assertEquals("MutableDemo Title", mDemo.getTitle());
    }
}
