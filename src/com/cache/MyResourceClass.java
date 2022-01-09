package com.cache;

import java.util.List;

public class MyResourceClass {


    public List<SomeData> getDataList() {

        return null;
    }
}

class SomeData{

    int code;
    String someDataVal;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSomeDataVal() {
        return someDataVal;
    }

    public void setSomeDataVal(String someDataVal) {
        this.someDataVal = someDataVal;
    }
}