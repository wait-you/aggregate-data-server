/**
  * Copyright 2022 bejson.com 
  */
package cn.wenhe9.aggregatedataserver.domian.city;
import java.util.List;

/**
 * Auto-generated: 2022-06-12 17:16:11
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class CityResponse {

    private String reason;
    private List<Result> result;
    private int error_code;
    public void setReason(String reason) {
         this.reason = reason;
     }
     public String getReason() {
         return reason;
     }

    public void setResult(List<Result> result) {
         this.result = result;
     }
     public List<Result> getResult() {
         return result;
     }

    public void setError_code(int error_code) {
         this.error_code = error_code;
     }
     public int getError_code() {
         return error_code;
     }

}