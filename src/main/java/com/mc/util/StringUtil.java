package com.mc.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class StringUtil {

	//����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
		//��Ϊtrue ûӴΪfalse
		public static boolean hasLength(String src){
			return src!=null && src.length()>0;
		}
		
		
		//����2���ж�Դ�ַ�������������źͿո�Ҳ��û��ֵ
		public static boolean hasText(String src){	
			return src!=null && src.trim().length()>0;//String ��trim()���� ȥ���ַ�������Ŀո�
		}
		
		
		//����3-1����һ�����ĺ����ַ��� �ַ���������GB2312(�൱�����ļ���)��Χ�ڣ�
		public static String randomChinese() {
			 String str = null;
	         int highPos, lowPos;
	         Random random = new Random();
	         highPos = (176 + Math.abs(random.nextInt(30)));//���룬0xA0��ͷ���ӵ�16����ʼ����0xB0=11*16=176,16~55һ�����֣�56~87��������
	         random=new Random();
	         lowPos = 161 + Math.abs(random.nextInt(94));//λ�룬0xA0��ͷ����Χ��1~94��
	         byte[] bArr = new byte[2];
	        
	         bArr[0] = (new Integer(highPos)).byteValue();
	         bArr[1] = (new Integer(lowPos)).byteValue();
	         try {
	             str = new String(bArr, "GB2312");   //��λ����ϳɺ���
	         } catch (UnsupportedEncodingException e) {
	             e.printStackTrace();
	         }
	             return str;
		}

		
		
		//����3-2�����س���Ϊlength�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
		public static String randomChineseString(int length){
			StringBuilder s = new StringBuilder();
			for (int i = 0; i < length; i++) {
				s.append(randomChinese());
			}
			
			return s.toString();
		}
		
		
		//����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
		public static String generateChineseName(){
			String[] str= {"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʩ","��","��","��","��","��","��","κ","��","��","��","л","��","��","��","ˮ","�","��","��","��","��","��","��","��","��","��","³","Τ","��","��","��","��","��","��","��","��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʱ","��","Ƥ","��","��","��","��","��","Ԫ","��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ","��","��","ë","��","��","��","��","��","�","��","��","��","��","̸","��","é","��","��","��","��","��","��","ף","��","��","��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ","��","ͯ","��","��","÷","ʢ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","֧","��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ","��","��","��","��","��","��","��","��","��","��","��","��","ʯ","��","��","ť","��","��","��","��","��","��","½","��","��","��","��","�","��","��","�L","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɽ","��","��","��","�","��","ȫ","ۭ","��","��","��","��","��","��","��","��","��","��","��","б","��","��","��","��","��","��","��","ղ","��","��","Ҷ","��","˾","��","۬","��","��","��","ӡ","��","��","��","��","ۢ","��","��","��","��","��","��","׿","��","��","��","��","��","��","��","��","��","��","˫","��","ݷ","��","��","̷","��","��","��","��","��","��","��","Ƚ","��","۪","Ӻ","�S","�","ɣ","��","�","ţ","��","ͨ","��","��","��","��","ۣ","��","��","ũ","��","��","ׯ","��","��","��","��","��","Ľ","��","��","ϰ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","»","��","��","ŷ","�","��","��","ε","Խ","��","¡","ʦ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɳ","ؿ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȩ","��","��","��","��","��","��","��","��","��","��","۳","Ϳ","��","��","˧","��","��","��","��","��","��","��","Ĳ","��","٦","��","��","ī","��","��","��","��","��","��","١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����","����","����","�ʸ�","ξ��","����","�̨","��ұ","����","���","����","����","̫��","����","����","����","��ԯ","���","����","����","����","Ľ��","����","����","˾ͽ","˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����","����","���","����","����","����","�ذ�","�й�","�׸�","����","�θ�","����","����","����","����","��","��","����","΢��","����","����","����","����","�Ϲ�"};
			//��ȡ�������
			String firstName = str[RandomUtil.random(0, str.length-1)];
			//��ȡ����
			String lastName = randomChineseString(RandomUtil.random(1, 2));
			
			return firstName+lastName;
		}
		
		//����5���ж�������Ƿ����ֻ���
		public static boolean isPhoneNumber(String src) {
			
			//���ж��ַ��������Ƿ���ֵ
			if(hasText(src)) {
				//�����й��ֻ��ŵĹ���
				String reg = "1[3|5|6|7|8]\\d{9}";
				return src.matches(reg);
			}
			return false;
		}
		
		//����6 �ж��Ƿ������� ��ĸ�����»��߿�ͷ@��ĸ�����»���.��ĸ����  ssss@sdfsd.com
		public static boolean isEmail(String src) {
			//���ж��Ƿ���ֵ
			if(hasText(src)) {
				//��������ĸ�ʽ
				String reg = "\\w+\\@\\w+\\.\\w+";
				return src.matches(reg);
			}
			return false;
		}
}
