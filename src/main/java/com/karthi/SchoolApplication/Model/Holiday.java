package com.karthi.SchoolApplication.Model;

import lombok.Data;

@Data
public class Holiday {

    private final String DAY;
    private final String REASON;
    private final Type type;

    public enum Type{
        FESTIVAL,FEDERAL
    }

    public Holiday(String DAY, String REASON, Type type) {
        this.DAY = DAY;
        this.REASON = REASON;
        this.type = type;
    }

}
