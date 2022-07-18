package com.ibm.connector.data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfo {
	String id;
	String fname;
	String lname;
	String email;
	String phone;
	String company;
	String comments;
}
