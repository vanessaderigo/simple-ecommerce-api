package com.vanessa.simpleecommerceapi.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. ID " + id);
    }
}
