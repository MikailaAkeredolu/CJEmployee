package com.example.demotimeseries;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

//hash map unsorted
//treemap natural order A-Z
//linked hash map based on insertion order


@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeSeries {

    public TimeSeries(){

    }

    //@JsonIgnore
    private Map<String, Interval> days = new LinkedHashMap<>();

    @JsonAnySetter
    public void setDays(String time, Interval value){
        days.put(time,value);
    }

    @JsonAnyGetter
    public Map<String, Interval> getDays() {
        return days;

    }

    @Override
    public String toString() {
        return "TimeSeries{" +
                "days=" + days +
                '}';
    }

}




// add getDays() if you need only values
// and if you need list, can use new ArrayList(days.values())
//    @JsonIgnore
//    public Collection<Interval> getDays(){
//        return days.values();
//    }