package com.example.dimaculangan.dimaculanganquiz1;

/**
 * Created by Aldrin on 28/09/2017.
 */

public class CodeName {
    private String codename;
    private int logo;

    public CodeName(int logo, String codename) {
        this.codename = codename;
        this.logo = logo;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }
}
