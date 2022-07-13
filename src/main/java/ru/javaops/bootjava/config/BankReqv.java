package ru.javaops.bootjava.config;

import ru.javaops.bootjava.Lang;

public class BankReqv {
    Lang lagueg;

    public Lang getLagueg() {
        return lagueg;
    }

    public void setLagueg(Lang lagueg) {
        this.lagueg = lagueg;
    }

    String lg;

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public BankReqv(String lg) {
        this.lg = lg;
    }

    public BankReqv() {
    }

    public BankReqv(Lang lagueg) {
        this.lagueg = lagueg;
    }
}
