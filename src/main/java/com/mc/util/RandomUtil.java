package com.mc.util;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {

	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
		public static int random(int min, int max){
			//Random.nextInt(N)--���ķ���ֵ��1��N-1֮��
			Random random = new Random();
			int num = random.nextInt(max-min+1)+min;
			return num;
		}
		
		
		//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
		public static int[] subRandom (int min, int max, int subs){
			int[] x = new int[subs];//��������
			HashSet<Integer> set = new HashSet<Integer>();
			while(set.size()!=subs) {
				set.add(random(min,max));
			}
			//��set ���Ϸ���������
			int i = 0;
			for (Integer integer : set) {
				x[i]=integer;
				i++;
			}
			return x;
		}
		
		
		//����3������1��1-9,a-Z֮�������ַ��� (8��)
		public static char randomCharacter (){
			//�г����е��ַ�
			String str = "0123456789qwertyuiopasdfghjklzxcvbnm1QWERTYUIOPASDFGHJKLZXCVBNM";
			return str.charAt(random(0, str.length()-1));
		}
		
		
		//����4�����ز�������Ϊlength���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
		public static String randomString(int length){
			String str= "";
			for (int i = 0; i < length; i++) {
				str+=randomCharacter();
			}
			return str;
		}
}
