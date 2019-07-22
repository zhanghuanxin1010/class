package main;


	import model.Student;


	 public class main
	 {
	 
		 public  static void main(String[] args)
		 {
			Student student=new Student(null, null, 0, 0);
			student.setName("zhang");
			student.setAge(20);
			student.setNumber(20190715);
			student.setSex("女");
			System.out.println(student.getName());
			System.out.println(student.getSex());
			System.out.println(student.getAge());
			System.out.println(student.getNumber());
				
			
		 }

			
	}



