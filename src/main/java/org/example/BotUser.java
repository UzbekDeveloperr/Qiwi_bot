package org.example;

public class BotUser {
    private String qiwi_number;
    private String humo_number;
    private String uzcard_number;
    private String step_user;

    private long check;

    public BotUser() {
    }

    public BotUser(String qiwi_number, String humo_number, String uzcard_number, String step, long check) {
        this.qiwi_number = qiwi_number;
        this.humo_number = humo_number;
        this.uzcard_number = uzcard_number;
        this.step_user = step;
        this.check = check;
    }

    public String getQiwi_number() {
        return qiwi_number;
    }

    public void setQiwi_number(String qiwi_number) {
        this.qiwi_number = qiwi_number;
    }

    public String getHumo_number() {
        return humo_number;
    }

    public void setHumo_number(String humo_number) {
        this.humo_number = humo_number;
    }

    public String getUzcard_number() {
        return uzcard_number;
    }

    public void setUzcard_number(String uzcard_number) {
        this.uzcard_number = uzcard_number;
    }

    public String getStep() {
        return step_user;
    }

    public void setStep(String step) {
        this.step_user = step;
    }

    public long getCheck() {
        return check;
    }

    public void setCheck(long check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "BotUser{" +
                "qiwi_number='" + qiwi_number + '\'' +
                ", humo_number='" + humo_number + '\'' +
                ", uzcard_number='" + uzcard_number + '\'' +
                ", step_user='" + step_user + '\'' +
                ", check=" + check +
                '}';
    }
}
