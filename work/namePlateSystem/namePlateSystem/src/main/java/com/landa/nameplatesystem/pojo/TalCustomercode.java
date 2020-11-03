package com.landa.nameplatesystem.pojo;

import java.io.Serializable;

public class TalCustomercode implements Serializable {
    private String cUnitcode;

    private String model;

    private String customercode;

    private static final long serialVersionUID = 1L;

    public String getcUnitcode() {
        return cUnitcode;
    }

    public void setcUnitcode(String cUnitcode) {
        this.cUnitcode = cUnitcode == null ? null : cUnitcode.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getCustomercode() {
        return customercode;
    }

    public void setCustomercode(String customercode) {
        this.customercode = customercode == null ? null : customercode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cUnitcode=").append(cUnitcode);
        sb.append(", model=").append(model);
        sb.append(", customercode=").append(customercode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}