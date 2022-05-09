package com.abhisheksah;

import java.util.List;

public interface UserService {

	
	public List<UserDetail>getDetail();
	public UserDetail getDetailbyZipcode(long zipcode);
}
