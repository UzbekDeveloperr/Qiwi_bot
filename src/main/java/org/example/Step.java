package org.example;

public class Step {
    private String CONVERT="CONVERT";
    private String MAIN="MAIN";
    private String REGISTER_QIWI="REGISTER_QIWI";
    private String REGISTER_UZCARD="REGISTER_UZCARD";
    private String REGISTER_HUMO="REGISTER_HUMO";
    private String CALCULATE="CALCULATE";
    private String CONVERT_UZS="CONVERT_UZS";
    private String CHECK="CHECK";
    private String CONVERT_RUB="CONVERT_RUB";
    private String COURSE_INFO="COURSE_INFO";
    private String USER_INFO="USER_INFO";

    public Step() {
    }

    public Step(String CONVERT, String MAIN, String REGISTER_QIWI, String REGISTER_UZCARD, String REGISTER_HUMO, String CALCULATE, String CONVERT_UZS, String CHECK, String CONVERT_RUB, String COURSE_INFO, String USER_INFO) {
        this.CONVERT = CONVERT;
        this.MAIN = MAIN;
        this.REGISTER_QIWI = REGISTER_QIWI;
        this.REGISTER_UZCARD = REGISTER_UZCARD;
        this.REGISTER_HUMO = REGISTER_HUMO;
        this.CALCULATE = CALCULATE;
        this.CONVERT_UZS = CONVERT_UZS;
        this.CHECK = CHECK;
        this.CONVERT_RUB = CONVERT_RUB;
        this.COURSE_INFO = COURSE_INFO;
        this.USER_INFO = USER_INFO;
    }

    public String getCONVERT() {
        return CONVERT;
    }

    public String getMAIN() {
        return MAIN;
    }

    public String getREGISTER_QIWI() {
        return REGISTER_QIWI;
    }

    public String getREGISTER_UZCARD() {
        return REGISTER_UZCARD;
    }

    public String getREGISTER_HUMO() {
        return REGISTER_HUMO;
    }

    public String getCALCULATE() {
        return CALCULATE;
    }

    public String getCONVERT_UZS() {
        return CONVERT_UZS;
    }

    public String getCHECK() {
        return CHECK;
    }

    public String getCONVERT_RUB() {
        return CONVERT_RUB;
    }

    public String getCOURSE_INFO() {
        return COURSE_INFO;
    }

    public String getUSER_INFO() {
        return USER_INFO;
    }
}
