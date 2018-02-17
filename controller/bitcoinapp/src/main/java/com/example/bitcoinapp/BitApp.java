package com.example.bitcoinapp;

public class BitApp {
private Ticker ticker;
private String timestamp;

    @Override
    public String toString() {
        return "BitApp{" +
                "ticker=" + ticker +
                ", timestamp='" + timestamp + '\'' +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }

    public BitApp(){

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

    private boolean success;
private String error;



}
