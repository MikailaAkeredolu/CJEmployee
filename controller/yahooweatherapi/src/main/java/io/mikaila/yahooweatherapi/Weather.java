package io.mikaila.yahooweatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

   private  Query query;

   public Weather(){

   }

//   public Weather(Query query) {
//      this.query = query;
//   }

   public Query getQuery() {
      return query;
   }

   public void setQuery(Query query) {
      this.query = query;
   }

   @Override
   public String toString() {
      return "Weather{" +
              "query=" + query +
              '}';
   }

}