package com.yugal.implementation;

import com.yugal.interfaces.TeamAble;
import org.springframework.stereotype.Component;

@Component
public class FullStackDev implements TeamAble {
    @Override
    public void position() {
        System.out.println("equivalent to Teamlead more or like Co-leader");
    }

    public void job() {
        System.out.println("to fix all the issues happening with other profiles");
    }
}