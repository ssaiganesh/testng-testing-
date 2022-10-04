package utilities;

import common.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class testUtils extends BaseTest {
    public String getScreenshot() throws IOException {

        Date currentDate = new Date();
        String screenshotfilename = currentDate.toString().replace(" ","-").replace(":","-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilename + ".png"));
        
        return (screenshotfilename + ".png");
    }
    
    public String convertStatus(int n) {
    	
    	switch(n){
    	case 1:
    		return "Success";
    	case 2:
    		return "Failure";
    	case 3:
    		return "Skip";
    	case 4:
    		return "Sucess Percentage Failure";
    	case 16:
    		return "Started";
    	default:
    		return "Created";
    		
    	}
    	
    }

}
