package webdriverdemo;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverLab {
	
	public static String testPorcentaje(String a,String b) {
		WebDriver driver = new EdgeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("http://www.calculator.net/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      driver.findElement(By.id("cpar1")).sendKeys(a);
	      driver.findElement(By.id("cpar2")).sendKeys(b);
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();
	      String result;
	      try { result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      }catch(org.openqa.selenium.NoSuchElementException e){
	    	  result =  "No existe";
	      }
	      //System.out.println(result);
	      driver.close();
	      return result;
	}
	@Test
	public void pruebaNegativos(){
		assertEquals("-2", testPorcentaje("-10","20"));
		assertEquals("-957.6",testPorcentaje("40","-2394"));
	}
	@Test
	public void pruebaErrores(){
		assertEquals("No existe",testPorcentaje("-10","xd"));
		assertEquals("No existe",testPorcentaje("npi","873"));	
	}
	@Test
	public void pruebaLimites(){
		assertEquals("-3.4234583684466E+19",testPorcentaje("-10000000000000000000000","0.3423458368446637736636373"));
		assertEquals("8.0502727266E-63",testPorcentaje("0.0000000000000000000000000000000000000000000000000000000000009","0.8944747474"));
		
	}
	
	public void main(String[] args) {
		pruebaNegativos();
		pruebaErrores();
		pruebaLimites();
		return;
   }
}