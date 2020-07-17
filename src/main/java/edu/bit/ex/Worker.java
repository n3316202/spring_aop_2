package edu.bit.ex;

public class Worker {

	private String name;
	private int age;
	private String job;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void getWorkerInfo() {
		System.out.println("ï¿½ì” ?”±ï¿? : " + getName());
		System.out.println("ï¿½êµ¹ï¿½ì”  : " + getAge());
		System.out.println("ï§žê³¸ë¾? : " + getJob());
	}
	
}
