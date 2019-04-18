/**
 * @Title:  Config.java
 * @Package: com.asiainfo.config
 * @Description: TODO
 * @author: chenzq
 * @date:   2019年3月3日 下午1:57:26
 * @Copyright: Copyright(c) 2019 jaesonchen.com Inc. All rights reserved. 
 */
package com.asiainfo.config;

/**   
 * @Description: TODO
 * @author chenzq  
 * @date 2019年3月3日 下午1:57:26
 * @version V1.0  
 */
public class DBConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
    
    public String getDriverClassName() {
        return driverClassName;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "DBConfig [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
                + ", password=" + password + "]";
    }
}
