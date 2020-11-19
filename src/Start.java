import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar;
import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("welcome to StudentManagementApp!");
		while(true)
		{
			System.out.println("Press 1 to DISPLAY student");
			System.out.println("Press 2 to ADD student");
			System.out.println("Press 3 to DELETE student");
			System.out.println("Press 4 to UPDATE student");
			System.out.println("Press 5 to EXIT");
			int c = Integer.parseInt(br.readLine());
			if(c==2)
			{
				//ADD student
				System.out.println("Enter Student name : ");
				String name = br.readLine();
				
				System.out.println("Enter Student Phone No. : ");
				String phone = br.readLine();
				
				System.out.println("Enter Student city : ");
				String city= br.readLine();
				
				//CREATE STUDENT object to store student
				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Successfully added....");
				}
				else 
				{
					System.out.println("Something went wrong,try again.....");
				}
				
				//Print the over console
//				System.out.println(st);
				
			}
			
			else if(c==3)
			{
				//DELETE student
				System.out.println("We prefer to check the entire Student Table before performing a DELETE operation");
				System.out.println("Enter the Student id");
				int userId=Integer.parseInt(br.readLine());
				boolean answer = StudentDao.deleteStudentToDB(userId);
				if(answer)
				{
					System.out.println("Successfully deleted....");
				}
				else 
				{
					System.out.println("Something went wrong,try again.....");
				}
			}
			
			else if(c==1)
			{
				//DISPLAY student
				StudentDao.showStudentToDB();
				
			}
			
			else if(c==5)
			{
				//EXIT
				break;
			}
			
			else if(c==4)
			{
				//Update Table
				System.out.println("We prefer to check the entire Student Table before performing a UPDATE operation");
				System.out.println("Enter the Student id to whom you want to UPDATE ");
				int sid= Integer.parseInt(br.readLine());
				System.out.println("What you want to update?");
				System.out.println("Press 1 for Name");
				System.out.println("Press 2 for Phone No.");
				System.out.println("Press 3 for City");
				int op =Integer.parseInt(br.readLine());
				String val="";
				if(op==1)
				{
					System.out.println("Enter the Name");
					val= br.readLine();
				}
				else if(op==2)
				{
					System.out.println("Enter the Phone no:");
					val= br.readLine();
				}
				else if(op==3)
				{
					System.out.println("Enter the City");
					val= br.readLine();
				}
				boolean answer = StudentDao.updateStudentToDB(sid,op,val);
				if(answer)
				{
					System.out.println("Successfully updated....");
				}
				else 
				{
					System.out.println("Something went wrong,try again.....");
				}
			}
		}
		System.out.println("Thankyou for using my application.....");
		System.out.println("see you soon...bye bye");
	}

}
