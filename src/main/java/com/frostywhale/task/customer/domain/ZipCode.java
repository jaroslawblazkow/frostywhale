package com.frostywhale.task.customer.domain;

public class ZipCode {
    private final String code;

    private ZipCode(String code) {
        this.code = code;
    }

    public static ZipCode of(String code) {
        return new ZipCode(code);
    }

}
