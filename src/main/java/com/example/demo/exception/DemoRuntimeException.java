package com.example.demo.exception;

public class DemoRuntimeException extends RuntimeException {
    public DemoRuntimeException() {
    }

    public DemoRuntimeException(String message) {
        super(message);
    }

    public DemoRuntimeException(String message, Throwable cause) { super(message, cause); }

    public DemoRuntimeException(Throwable cause) { super(cause); }
}
