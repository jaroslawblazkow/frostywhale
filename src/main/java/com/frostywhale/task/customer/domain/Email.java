package com.frostywhale.task.customer.domain;

import com.frostywhale.task.DomainValidationException;
import org.apache.commons.validator.routines.EmailValidator;

public class Email {
    private final String email;

    private Email(String email) {
        validate();
        this.email = email;
    }

    private void validate() {
        if (!EmailValidator.getInstance().isValid(email)) {
            throw new DomainValidationException();
        }
    }

    public static Email of(String email) {
        return new Email(email);
    }
}
