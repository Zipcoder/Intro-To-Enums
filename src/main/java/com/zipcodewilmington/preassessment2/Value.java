package com.zipcodewilmington.preassessment2;

public class Value<T>
{
    private T value;

    public Value(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}
