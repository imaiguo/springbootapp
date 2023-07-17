package tech.uniontech.springbootapp.mybatis;

import java.io.Serializable;

public class City implements Serializable {
    private String state;
    private String code;

    public String getCode() {
        return code;
    }
    
    public String getState() {
        return state;
    }
}
