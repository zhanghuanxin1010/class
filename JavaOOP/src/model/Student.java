package model;

public class Student {
	
		public String name;
		public String sex;
		public int age;
		public int number;
		
		public  Student(String name,String sex,int age,int number)
		{
			this.name=name;
			this.age=age;
			this.sex=sex;
			this.number=number;
		}
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}


		
		
		
		
		
		


}
