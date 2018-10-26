package com.istone.codetest.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringData {

    private String s;

    public StringData(String s) {
        this.s = s;
    }

    @JsonProperty("response")
    public String getString() {
        return this.s;
    }

}
