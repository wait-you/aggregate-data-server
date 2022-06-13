/**
  * Copyright 2022 bejson.com 
  */
package cn.wenhe9.aggregatedataserver.domian.weather;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Auto-generated: 2022-06-12 21:9:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Future {

    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date date;
    private String temperature;
    private String weather;
    private Wid wid;
    private String direct;
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setTemperature(String temperature) {
         this.temperature = temperature;
     }
     public String getTemperature() {
         return temperature;
     }

    public void setWeather(String weather) {
         this.weather = weather;
     }
     public String getWeather() {
         return weather;
     }

    public void setWid(Wid wid) {
         this.wid = wid;
     }
     public Wid getWid() {
         return wid;
     }

    public void setDirect(String direct) {
         this.direct = direct;
     }
     public String getDirect() {
         return direct;
     }

}