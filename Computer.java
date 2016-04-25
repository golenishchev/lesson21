package com.example.lesson21;

public interface Computer {
    String getKeyboardType();

    void setKeyboardType(String keyboardTypeByDefault);

    void setProcessorArchitecture(String processorArchitecture);

    String getProcessorArchitecture();
}