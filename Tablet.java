package com.example.lesson21;

public class Tablet extends AbstractComputer {
    private String keyboardTypeByDefault;
    private String processorArchitecture;

    Tablet(String keyboardTypeByDefault, String processorArchitecture) {
        this.keyboardTypeByDefault = keyboardTypeByDefault;
        this.processorArchitecture = processorArchitecture;
    }

    @Override
    public String getKeyboardType() {
        return keyboardTypeByDefault;
    }

    @Override
    public void setKeyboardType(String keyboardTypeByDefault) {
        this.keyboardTypeByDefault = keyboardTypeByDefault;
    }

    @Override
    public void setProcessorArchitecture(String processorArchitecture) {
        this.processorArchitecture = processorArchitecture;
    }

    @Override
    public String getProcessorArchitecture() {
        return processorArchitecture;
    }

    @Override
    public String toString() {
        return "Tablet Specs: " +
                "\n\t" + "Keyboard Type By Default: " + keyboardTypeByDefault +
                "\n\t" + "Processor Architecture: " + processorArchitecture;
    }
}