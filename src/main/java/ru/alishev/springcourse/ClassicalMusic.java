package ru.alishev.springcourse;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */

public class ClassicalMusic implements Music {


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
