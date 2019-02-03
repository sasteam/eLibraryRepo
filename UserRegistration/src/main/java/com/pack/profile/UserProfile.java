/**
 * 
 */
package com.pack.profile;

import java.util.List;

/**
 * @author Suman
 *
 */
public class UserProfile {
public String suggestUserIdFromName(String firstName,String lastName) {
	StringBuilder sb=new StringBuilder(30);
	return sb.append(firstName.substring(0, 4).toLowerCase()).append(lastName.substring(0, 4).toLowerCase()).toString();
}

public String createUserId(List<String> userList,String suggestedUserId) {
	String userId=suggestedUserId;
	for(int i=0;i<100;i++) {
		if(userList.contains(userId)) {
			userId=suggestedUserId+i;
		}
	}
	userList.add(userId);
	return userId;
	
}
}
