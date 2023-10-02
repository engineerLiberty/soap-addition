package com.trustBanc.soapapi;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
