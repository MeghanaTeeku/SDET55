package myProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class DemoProj {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int random=ran.nextInt(500);
		String expdata="QspRR"+random;
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();  
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expdata);
		//driver.findElement(By.xpath("//input[@name='teamSize']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Pradeep");
		WebElement ele = driver.findElement(By.xpath("(//select)[2]"));
	
		Select se=new Select(ele);
		se.selectByIndex(2);
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		Driver dd=new Driver();
		DriverManager.registerDriver(dd);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
		Statement state = con.createStatement();
	   String query= "select *from project where project_name='"+expdata+"';";
	   ResultSet res = state.executeQuery(query);
	  // System.out.println(res.getMetaData());
	  while(res.next()) {
	   //String act="QspRR";
		 String act = res.getString(4);
	   if(act.equals(expdata))
	   {
		   System.out.println("Project is present");
	   }
	   else
	   {
		   System.out.println("Not present");
	   }
	}
		//con.close();
}}
