package com.user.client;

import com.user.search.UserSearch;

public class AdvancedUserSearch extends UserSearch
{
	 public String serarch(String mebId) {//100 --xyz
		 //NO DB
		 //Call Weservice get results 
		 System.out.println("Search from AdvancedUserSearch");
		 return "abc";
	}
	 
	 public String getnameT(String email){
		 return "xyz";
	 }
}
