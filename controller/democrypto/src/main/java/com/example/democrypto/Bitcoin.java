package com.example.democrypto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bitcoin {

    private Ticker ticker;
    private String timestamp;
    private boolean success;
    private String error;

    public Bitcoin(){

    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "ticker=" + ticker +
                ", timestamp='" + timestamp + '\'' +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
