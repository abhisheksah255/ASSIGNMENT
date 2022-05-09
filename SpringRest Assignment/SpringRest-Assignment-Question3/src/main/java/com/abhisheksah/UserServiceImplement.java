package com.abhisheksah;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService{

	List<UserDetail>data;
	public UserServiceImplement() {
		data=new ArrayList<>();
		data.add(new UserDetail(234567,"Uttar Pradesh","Lucknow","India"));
		data.add(new UserDetail(678901,"Paris","Germany","Europe"));
		data.add(new UserDetail(226007,"Punjab","Jalandhar","India"));
		data.add(new UserDetail(665718,"Bihar","Saran","India"));
		data.add(new UserDetail(120005,"Uttar Pradesh","Varanasi","India"));
		
	}
	@Override
	public List<UserDetail> getDetail() {
		return data;
	}
	@Override
	public UserDetail getDetailbyZipcode(long zipcode) {
		UserDetail detail=null;
		for(UserDetail userDetail:data)
		{
			if (userDetail.getZipcode()==zipcode) {
				detail=userDetail;
				break;
			}
		}
		return detail;
	}


}
