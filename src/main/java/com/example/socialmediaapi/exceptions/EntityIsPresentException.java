package com.example.socialmediaapi.exceptions;

import jakarta.persistence.PersistenceException;
import lombok.Data;

@Data
public class EntityIsPresentException extends PersistenceException {
    private final String message;

    public EntityIsPresentException(String message){
        this.message = message;
    }
}
