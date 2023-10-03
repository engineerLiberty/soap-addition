package com.trustBanc.soapapi;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Builder;

@XmlRootElement
@Builder
public class AdditionResponse {
    private int result;
    @XmlElement
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
