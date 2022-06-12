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
public class Result {

    private String province_id;
    private String province;
    private List<Citys> citys;
    public void setProvince_id(String province_id) {
         this.province_id = province_id;
     }
     public String getProvince_id() {
         return province_id;
     }

    public void setProvince(String province) {
         this.province = province;
     }
     public String getProvince() {
         return province;
     }

    public void setCitys(List<Citys> citys) {
         this.citys = citys;
     }
     public List<Citys> getCitys() {
         return citys;
     }

}