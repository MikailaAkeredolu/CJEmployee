package com.example.bitcoinapp;

public class Markets {
private String market;

public Markets(){

}

    @Override
    public String toString() {
        return "Markets{" +
                "market='" + market + '\'' +
                ", price='" + price + '\'' +
                ", volume=" + volume +
                '}';
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private String price;
private double volume;
}
