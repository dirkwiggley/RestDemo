package com.softwarewolf.restdemo.repository;

import com.softwarewolf.restdemo.model.MutableDemo;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class DemoRepository {

    private final List<MutableDemo> demos = new ArrayList<>();

    public DemoRepository() {
        System.out.println("In repo constructor");
        demos.add(new MutableDemo(UUID.randomUUID().toString(), "MutableDemo Title One", "MutableDemo", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", LocalDateTime.of(2024, 6, 16, 0, 0, 0), LocalDateTime.of(2024, 6, 16, 0, 0, 0)));
        demos.add(new MutableDemo(UUID.randomUUID().toString(), "MutableDemo Title Two", "MutableDemo", "https://www.youtube.com/watch?v=hZE5e41UpIM", LocalDateTime.of(2024, 6, 17, 0, 0, 0), LocalDateTime.of(2024, 6, 17, 0, 0, 0)));
        demos.add(new MutableDemo(UUID.randomUUID().toString(), "MutableDemo Title Three", "MutableDemo", "https://www.youtube.com/watch?v=lcOxhH8N3Bo", LocalDateTime.of(2024, 6, 17, 0, 0, 0), LocalDateTime.of(2024, 6, 18, 0, 0, 0)));
    }

    public List<MutableDemo> findAll() {
        System.out.println("In findAll");
        if (demos.isEmpty())
            System.out.println("demos is empty");
        return demos;
    }

    public MutableDemo findById(String id) {
        for (MutableDemo demo : demos) {
            if (Objects.equals(demo.getId(), id)) {
                return demo;
            }
        }
        return null;
    }

    public int getSize() {
        return demos.size();
    }

    public List<String> findIds() {
        List<String> ids = new ArrayList<String>();
        for (MutableDemo demo : demos) {
            ids.add(demo.getId());
        }
        return ids;
    }

    public void update(MutableDemo updatedDemo) {
        System.out.println("In repo update");
        for (int index = 0; index < demos.size(); index++) {
            MutableDemo demo = demos.get(index);
            if (Objects.equals(demo.getId(), updatedDemo.getId())) {
                demos.set(index, updatedDemo);
                return;
            }
        }
    }

    public void insert(MutableDemo newDemo) {
        demos.add(newDemo);
    }

    public void delete(String id) {
        for (int index = 0; index < demos.size(); index++) {
            MutableDemo demo = demos.get(index);
            if (Objects.equals(demo.getId(), id)) {
                demos.remove(index);
                return;
            }
        }
    }
}
