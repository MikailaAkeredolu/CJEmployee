package io.mikaila.yahooweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Guid {
    public Guid(){

    }

    @Override
    public String toString() {
        return "Guid{" +
                "isPermalink='" + isPermalink + '\'' +
                '}';
    }

    public String getIsPermalink() {
        return isPermalink;
    }

    public void setIsPermalink(String isPermalink) {
        this.isPermalink = isPermalink;
    }

    private String isPermalink;
}
