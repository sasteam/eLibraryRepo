package com.test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pack.profile.UserProfile;

public class TestUserProfile {
	private static UserProfile profile;
@BeforeClass
public static void setUpBeforeTestClass() {
	profile=new UserProfile();
}

@Test
public void testSuggestUserIdFromName() {
	String firstName="Manoj";
	String lastName="Kumar";
	String expected="manokuma";
	assertEquals(expected,profile.suggestUserIdFromName(firstName, lastName));
}
@Test
public void testCreateUserId() {
	String suggestedUserId="manokuma";
	List<String> userList=new ArrayList();
	userList.add("manokuma");
	userList.add("manokuma0");
	String expected="manokuma1";
	assertEquals(expected, profile.createUserId(userList, suggestedUserId));
}
@AfterClass
public static void afterTestClass() {
	profile=null;
}
}
