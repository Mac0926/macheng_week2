package com.mc.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//返回一个月的月末
		public static Date monthEnd(Date date) {
			//获取一个日历类
			Calendar c = Calendar.getInstance();
			//用传入的日期初始化日历类
			c.setTime(date);
			//让月份+1
			c.set(Calendar.MONTH, 1);
			//调用获取月初的方法 让时间变成月初
			Date monthStart = monthStart(c.getTime());
			c.setTime(monthStart);
			//日期-1
			c.set(Calendar.SECOND, -1);
			return c.getTime();
		}
		
		
		//获取一个月的月初
		public static Date monthStart(Date date) {
			//获取一个日历类
			Calendar c = Calendar.getInstance();
			//用传入的日期初始化日历类
			c.setTime(date);
			//设置为当前日期的月份的第一天
			c.set(Calendar.DAY_OF_MONTH, 1);
			//设置小时
			c.set(Calendar.HOUR_OF_DAY,0);
			//设置分钟
			c.set(Calendar.MINUTE, 0);
			//设置秒
			c.set(Calendar.SECOND, 0);
			return c.getTime();
		}
		
		
		//随机返回一个日期 在start到end之间的一个日期
		public static Date randomDate(Date start,Date end) {
			//获取开始日期的毫秒数
			long t1 = start.getTime();
			//获取结束日期的毫秒数
			long t2 = end.getTime();
			
			long t = (long) ((Math.random()*(t2-t1)+1)+t1);
			
			return new Date(t);
			
		}
		
		
		//根据生日计算年龄
		public static int getAgeByBirthday(Date date) {
			//获取当前系统的日历类
			Calendar c = Calendar.getInstance();
			//获取当前时间的 年月日
			//当前日期的年份
			int nowYear = c.get(Calendar.YEAR);
			//当前日期的月份
			int nowMonth = c.get(Calendar.MONTH);
			//当前日期的具体日子
			int nowDate = c.get(Calendar.DAY_OF_MONTH);
			//用生日初始化日历类
			c.setTime(date);
			//出生的年份
			int birthYear = c.get(Calendar.YEAR);
			//出生的月份
			int birthMonth = c.get(Calendar.MONTH);
			//出生的具体日期
			int birthDate = c.get(Calendar.DAY_OF_MONTH);
			//根据年份计算年龄
			int age = nowYear-birthYear;
			//如果出生的月份大于当前的月份 则age-1
			if(birthMonth>nowMonth) {
				age--;
			}
			//如果月份一致 出生日期大于当前日期 age-1
			if(birthMonth==nowMonth && birthDate>nowDate) {
				age--;
			}
			return age;
		}
}
