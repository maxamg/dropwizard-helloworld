package com.github.sullis.dropwizard.helloworld.api;

import java.util.Date;
import java.net.InetAddress;

public class HelloMessage {
	private String message = "Hello";
	private Date timestamp = new Date();
	private String hostname = getMyHostName();

	public String getHostname() {
		return hostname;
	}
	public void setHostname(InetAddress hostname) {
		this.hostname = hostname.toString();
	}

	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String msg) {
		message = msg;
	}

    public String getMyHostName() {
        try {
            return InetAddress.getLocalHost().getHostName().toString();
        } catch (Exception e) { return "error"; }
    }

    private static String getIpAsString(InetAddress address) {
        byte[] ipAddress = address.getAddress();
        StringBuffer str = new StringBuffer();
        for(int i=0; i<ipAddress.length; i++) {
            if(i > 0) str.append('.');
            str.append(ipAddress[i] & 0xFF);                
        }
        return str.toString();
    }

}
