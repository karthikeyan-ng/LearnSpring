/**
 * 
 */
package com.techstack.spring.di.collections.merging;

import java.util.Properties;

/**
 * @author KARTHIKEYAN N
 *
 */
public class ParentBean {
	
	private Properties adminEmails;
	
	public Properties getAdminEmails() {
		return adminEmails;
	}
	
	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}
	
	public String getEmailFor(String key) {
		return this.adminEmails.getProperty(key);
	}

}
