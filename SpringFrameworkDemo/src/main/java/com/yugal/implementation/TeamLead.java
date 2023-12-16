package com.yugal.implementation;

import com.yugal.interfaces.TeamAble;

public class TeamLead implements TeamAble {
    public void job() {
        System.out.println("TeamLead is assisting");
    }

    @Override
    public void position() {
        System.out.println("Mid level postion");
    }
}