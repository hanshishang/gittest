package com.ebs.test;

public class Teacher implements Comparable  {
	int num=0;
	String name;
	
	Teacher(String name ,int num){
		this.num=num;
		this.name=name;
	}
	
	public String toString(){
		return "学号："+num+"\t\t姓名："+name;
	}

	@Override
	public int compareTo(Object o) {
		Teacher tc= (Teacher)o;
		//int result = num > tc.num ? 1 : (num == tc.num ? 0 : -1);//升序
		int result;
		System.out.println("num="+num);
		System.out.println("tc.num="+tc.num);
		if( num>tc.num ){
			result=1;
		}else{
			if(num==tc.num){
				result=0;
				
			}else{
				result=-1;
			}
		}
		
		System.out.println("result="+result);
		if(result==0){
			result = name.compareTo(tc.name);
			System.out.println("name=="+name);
			System.out.println("tc.name=="+tc.name);
			System.out.println("相等中result="+result);
		}
		
		return result;
	}

}
