package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {

	//��ȡ�û���Ϣ
	User getUser(Integer id);
	//���ӻ���
	void addScore(Integer id, Integer score);
}
