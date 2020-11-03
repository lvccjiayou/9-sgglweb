package com.landa.nameplatesystem.pojo;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Nameplate implements Serializable {

    private Integer id;

    private String displaydate;

    private String minbarcode;

    private String maxbarcode;

    private String unitcode;

    private String linetype;

    private String printornot;

    private Integer barcodenum;

    private TalCustomercode talCustomercode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplaydate() {
        return displaydate;
    }

    public void setDisplaydate(String displaydate) {
        this.displaydate = displaydate;
    }

    public String getMinbarcode() {
        return minbarcode;
    }

    public void setMinbarcode(String minbarcode) {
        this.minbarcode = minbarcode;
    }

    public String getMaxbarcode() {
        return maxbarcode;
    }

    public void setMaxbarcode(String maxbarcode) {
        this.maxbarcode = maxbarcode;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype;
    }

    public String getPrintornot() {
        return printornot;
    }

    public void setPrintornot(String printornot) {
        this.printornot = printornot;
    }

    public Integer getBarcodenum() {
        return barcodenum;
    }

    public void setBarcodenum(Integer barcodenum) {
        this.barcodenum = barcodenum;
    }

    public TalCustomercode getTalCustomercode() {
        return talCustomercode;
    }

    public void setTalCustomercode(TalCustomercode talCustomercode) {
        this.talCustomercode = talCustomercode;
    }

    @Override
    public String toString() {
        return "Nameplate{" +
                "id=" + id +
                ", displaydate='" + displaydate + '\'' +
                ", minbarcode='" + minbarcode + '\'' +
                ", maxbarcode='" + maxbarcode + '\'' +
                ", unitcode='" + unitcode + '\'' +
                ", linetype='" + linetype + '\'' +
                ", printornot='" + printornot + '\'' +
                ", barcodenum=" + barcodenum +
                '}';
    }
}