package com.izeye.samples.springbootmicrometerprometheus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * {@link RestController} for {@link Person}.
 *
 * @author Johnny Lim
 */
@RestController
@RequestMapping("/persons")
public class PersonController {

    @GetMapping
    public List<Person> getPersons() throws InterruptedException {
        Thread.sleep(new Random().nextLong(1000));

        if (new Random().nextBoolean()) {
            throw new RuntimeException("Boom!");
        }

        return List.of(new Person("Johnny", "Lim"));
    }

}
