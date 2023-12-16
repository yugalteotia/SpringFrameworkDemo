package com.yugal.implementation;

import com.yugal.interfaces.TeamAble;

public class Coder implements TeamAble {
    public void job() {
        System.out.println("Coder is coding");
    }

    @Override
    public void position() {
        System.out.println("Lowest position but most important");
    }
}