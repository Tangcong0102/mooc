package com.diao.course.bean;

/**
 * 鐢ㄦ埛鐨凧avaBean
 *
 */
public class User {
    private String id;
    private String username;
    private String nickName;
    /**0涓轰拱瀹�
     * 1涓哄崠瀹�
     */
    private int usertype;
    private String password;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
