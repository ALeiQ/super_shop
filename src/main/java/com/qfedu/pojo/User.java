package com.qfedu.pojo;

public class User {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column users.uid
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	private Integer uid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column users.uissupper
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	private Byte uissupper;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column users.uaddress
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	private String uaddress;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column users.utel
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	private String utel;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column users.uage
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	private Byte uage;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column users.usex
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	private Byte usex;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column users.uname
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	private String uname;

	private String upassword;

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column users.uid
	 *
	 * @return the value of users.uid
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column users.uid
	 *
	 * @param uid
	 *            the value for users.uid
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column users.uissupper
	 *
	 * @return the value of users.uissupper
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public Byte getUissupper() {
		return uissupper;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column users.uissupper
	 *
	 * @param uissupper
	 *            the value for users.uissupper
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public void setUissupper(Byte uissupper) {
		this.uissupper = uissupper;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column users.uaddress
	 *
	 * @return the value of users.uaddress
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public String getUaddress() {
		return uaddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column users.uaddress
	 *
	 * @param uaddress
	 *            the value for users.uaddress
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress == null ? null : uaddress.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column users.utel
	 *
	 * @return the value of users.utel
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public String getUtel() {
		return utel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column users.utel
	 *
	 * @param utel
	 *            the value for users.utel
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public void setUtel(String utel) {
		this.utel = utel == null ? null : utel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column users.uage
	 *
	 * @return the value of users.uage
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public Byte getUage() {
		return uage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column users.uage
	 *
	 * @param uage
	 *            the value for users.uage
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public void setUage(Byte uage) {
		this.uage = uage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column users.usex
	 *
	 * @return the value of users.usex
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public Byte getUsex() {
		return usex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column users.usex
	 *
	 * @param usex
	 *            the value for users.usex
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public void setUsex(Byte usex) {
		this.usex = usex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column users.uname
	 *
	 * @return the value of users.uname
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column users.uname
	 *
	 * @param uname
	 *            the value for users.uname
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	public void setUname(String uname) {
		this.uname = uname == null ? null : uname.trim();
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uissupper=" + uissupper + ", uaddress=" + uaddress + ", utel=" + utel + ", uage="
				+ uage + ", usex=" + usex + ", uname=" + uname + ", upassword=" + upassword + "]";
	}
	
	
}