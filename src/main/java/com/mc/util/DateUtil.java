package com.mc.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//����һ���µ���ĩ
		public static Date monthEnd(Date date) {
			//��ȡһ��������
			Calendar c = Calendar.getInstance();
			//�ô�������ڳ�ʼ��������
			c.setTime(date);
			//���·�+1
			c.set(Calendar.MONTH, 1);
			//���û�ȡ�³��ķ��� ��ʱ�����³�
			Date monthStart = monthStart(c.getTime());
			c.setTime(monthStart);
			//����-1
			c.set(Calendar.SECOND, -1);
			return c.getTime();
		}
		
		
		//��ȡһ���µ��³�
		public static Date monthStart(Date date) {
			//��ȡһ��������
			Calendar c = Calendar.getInstance();
			//�ô�������ڳ�ʼ��������
			c.setTime(date);
			//����Ϊ��ǰ���ڵ��·ݵĵ�һ��
			c.set(Calendar.DAY_OF_MONTH, 1);
			//����Сʱ
			c.set(Calendar.HOUR_OF_DAY,0);
			//���÷���
			c.set(Calendar.MINUTE, 0);
			//������
			c.set(Calendar.SECOND, 0);
			return c.getTime();
		}
		
		
		//�������һ������ ��start��end֮���һ������
		public static Date randomDate(Date start,Date end) {
			//��ȡ��ʼ���ڵĺ�����
			long t1 = start.getTime();
			//��ȡ�������ڵĺ�����
			long t2 = end.getTime();
			
			long t = (long) ((Math.random()*(t2-t1)+1)+t1);
			
			return new Date(t);
			
		}
		
		
		//�������ռ�������
		public static int getAgeByBirthday(Date date) {
			//��ȡ��ǰϵͳ��������
			Calendar c = Calendar.getInstance();
			//��ȡ��ǰʱ��� ������
			//��ǰ���ڵ����
			int nowYear = c.get(Calendar.YEAR);
			//��ǰ���ڵ��·�
			int nowMonth = c.get(Calendar.MONTH);
			//��ǰ���ڵľ�������
			int nowDate = c.get(Calendar.DAY_OF_MONTH);
			//�����ճ�ʼ��������
			c.setTime(date);
			//���������
			int birthYear = c.get(Calendar.YEAR);
			//�������·�
			int birthMonth = c.get(Calendar.MONTH);
			//�����ľ�������
			int birthDate = c.get(Calendar.DAY_OF_MONTH);
			//������ݼ�������
			int age = nowYear-birthYear;
			//����������·ݴ��ڵ�ǰ���·� ��age-1
			if(birthMonth>nowMonth) {
				age--;
			}
			//����·�һ�� �������ڴ��ڵ�ǰ���� age-1
			if(birthMonth==nowMonth && birthDate>nowDate) {
				age--;
			}
			return age;
		}
}
