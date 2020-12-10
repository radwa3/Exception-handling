import javax.swing.JOptionPane;

public class TestStudent {
	
	public static void main(String[] args){
		
		int numbersOfStudent=0;
		 do{
			 try{
				 String studentnumbers= JOptionPane.showInputDialog("Enter Numbers of Student :");
				     numbersOfStudent =Integer.parseInt(studentnumbers);
				    }
			 catch(NumberFormatException e){
				 JOptionPane.showMessageDialog(null, "please Enter valid Number");
			 }
				 } 
				 while (numbersOfStudent==0); 
		 
    
     
        Student [] students = new Student [numbersOfStudent];
		
      
		for(int i=0; i< numbersOfStudent;i++){
			String name= JOptionPane.showInputDialog("Enter Name of Student :");
			String email= JOptionPane.showInputDialog("Enter Email of Student :");
			String phone = JOptionPane.showInputDialog("Enter Phone of Student :");
			String faculty= JOptionPane.showInputDialog("Enter Faculty of Student :");
		
			Student s1 = new Student(name,email,phone,faculty);
	
			int numbersOfSubjects=0;
			 do{
				 try{
					 String subjectnumbers= JOptionPane.showInputDialog("Enter Numbers of subjects :");
					    numbersOfSubjects =Integer.parseInt(subjectnumbers);
					    }
				 catch(NumberFormatException e){
					 JOptionPane.showMessageDialog(null, "please Enter valid Number");
				 }
					 } 
					 while (numbersOfSubjects==0); 
			
		
			Grade [] grades = new Grade [numbersOfSubjects];
			for(int j=0; j< numbersOfSubjects;j++){
				 int gradeOfSubject=0;
				 
				 String subjectname= JOptionPane.showInputDialog("Enter Name of Subject :");
		
					 do{
				 try{
					 String subjectgrade= JOptionPane.showInputDialog("Enter grade of subject :");
					 gradeOfSubject =Integer.parseInt(subjectgrade);
				 }
				 catch(NumberFormatException e){
					 JOptionPane.showMessageDialog(null, "please Enter valid grade");
				 }
					 } 
					 while (gradeOfSubject==0); 
				
				 
			Grade grade = new Grade(subjectname,gradeOfSubject);
			grades[j]=grade;
			}
			s1.setGrades(grades);
			
			students[i]=s1;
		}
		
		String result="";
		int highgrade =0;
		String subjectname="";
		String studentname="";
		
		
		for(int i=0; i< students.length;i++){
	
		result+="Student numbrer  "+(i+1)+"\n"+"Name is : "+students[i].getName()+"\n"+"Email is : "+students[i].getEmail()+"\n"+" faculty is : "+students[i].getFaculty()+"\n"+"Phone is : "+students[i].getPhone()+"\n";
		result+="****************************************\n";
		
		for(int j=0; j< students[i].getGrades().length;j++){
			result+="subject number  "+(j+1)+"\n"+"Name is:   "+students[i].getGrades()[j].getName()+"\n"+" grade is:   "+students[i].getGrades()[j].getMark()+"\n";
			result+="_____________________________\n";
			
			if (students[i].getGrades()[j].getMark()> highgrade)
				highgrade=students[i].getGrades()[j].getMark();
			    subjectname=students[i].getGrades()[j].getName();
			    studentname=students[i].getName();
			    
			
		}
		
		}
		
		result+="Nmbers of students="+ students.length+"\n";
		result+="High Grade is : "+highgrade+"\n"+"Subject Name is : "+subjectname +"\n"+"Student Name is "+studentname;
	
		
		JOptionPane.showMessageDialog(null, result);
		
	}
}

