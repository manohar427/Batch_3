package com.user.client;

import com.user.search.UserSearch;

public class SearchUser {

	public static void main(String[] args) {
		/*UserSearch userSerch = new UserSearch();
		userSerch.serarch("789");*/
		
		UserSearch aduser = new AdvancedUserSearch();
		
		AdvancedUserSearch  u = (AdvancedUserSearch)aduser;
		u.getnameT("UI");
		
		aduser.serarch("789");
	}
}
