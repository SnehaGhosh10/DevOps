package org.example.class_based;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {

    @Value("1570")
    private int bikeid;

    @Value("BMW")
    private String bikename;

    @Value("black")
    private String color;

    @Override
    public String toString() {
        return "Bike [bikeid=" + bikeid + ", bikename=" + bikename + ", color=" + color + "]";
    }

}
