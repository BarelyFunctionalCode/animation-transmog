package com.animationtransmog;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActionAnimation
{
    DEFAULT("Default"),
    DIG("Dig"),
    HEADBANG("Headbang"),
    TWIRL("Twirl"),
    PLANKMAKE("Plank Make"),
    VENEANCEOTHER("Vengeance Other");

    private final String option;

    @Override
    public String toString()
    {
        return option;
    }
}