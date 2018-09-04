/**
 * 
 */
package com.demo.share.ali;

import java.util.Date;

/**
 * Created by youngwa on 2018/9/4.
 *
 */
public class User implements Comparable<User>{
	private Long userId;
	private String userName;
	private Date loginTime;

    public User(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                '}';
    }

    /**
	 * @return the userId

	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the loginTime
	 */
	public Date getLoginTime() {
		return loginTime;
	}
	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

    @Override
    public int compareTo(User o) {
        return this.getUserId().intValue() - o.getUserId().intValue();
    }
}
