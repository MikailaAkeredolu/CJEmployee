package com.example.demotimeseries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Stock {

   @JsonProperty("Meta Data")
   private MetaData metadata;

   @JsonProperty("Time Series (1min)")
   private TimeSeries timeSeries;

   public Stock(){

   }
   public MetaData getMetadata() {
      return metadata;
   }

   public void setMetadata(MetaData metadata) {
      this.metadata = metadata;
   }

   public TimeSeries getTimeSeries() {
      return timeSeries;
   }

   public void setTimeSeries(TimeSeries timeSeries) {
      this.timeSeries = timeSeries;
   }

   @Override
   public String toString() {
      return "Stock{" +
              "metadata=" + metadata +
              ", timeSeries=" + timeSeries +
              '}';
   }


}
