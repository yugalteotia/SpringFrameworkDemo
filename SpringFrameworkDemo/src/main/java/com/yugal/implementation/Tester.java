package com.yugal.implementation;

import com.yugal.interfaces.TeamAble;
import org.springframework.stereotype.Component;

//@Component
//  OR
@Component("tester")
public class Tester implements TeamAble {
    @Override
    public void position() {
        System.out.println("Parallel to coder");
    }

    public void job() {
        System.out.println("Testing the application to find bugs");
    }
}