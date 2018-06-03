package com.personal;

public class MahaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstants.FIRST_NAME+"Maha");
		System.out.println(ProfileConstants.LAST_NAME +"Eswari");
		System.out.println(ProfileConstants.AGE+"21");
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("My hobbies is watching news and reading history books");
	}

}
