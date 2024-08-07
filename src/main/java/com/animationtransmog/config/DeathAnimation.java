package com.animationtransmog.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DeathAnimation
{
    DEFAULT("Default"),
    PLANK("Plank"),
    BLAZE("Blaze"),
    MELT("Melt"),
    VAPORIZE("Vaporize");


    private final String option;

    @Override
    public String toString()
    {
        return option;
    }
}