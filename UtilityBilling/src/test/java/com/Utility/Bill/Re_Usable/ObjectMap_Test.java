package com.Utility.Bill.Re_Usable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap_Test {
    
    Properties prop;
     
    public ObjectMap_Test (String strPath) {
         
        prop = new Properties();
         
        try {
            FileInputStream fis = new FileInputStream(strPath);
            prop.load(fis);
            fis.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
  

	public By getLocator(String strElement) throws Exception {
        
        // retrieve the specified object from the object list
        String locator = prop.getProperty(strElement);
        // System.out.println(locator);
        // extract the locator type and value from the object
        String locatorType = locator.split(":")[0];
        String locatorValue = locator.split(":")[1];
         
        // for testing and debugging purposes
      //  System.out.println(">>>>Retrieving object of type '" + locatorType + "' and value '" + locatorValue + "' from the object map");
         
        // return a instance of the By class based on the type of the locator
        // this By can be used by the browser object in the actual test
        if(locatorType.toLowerCase().equals("id"))
            return By.id(locatorValue);
          if(locatorType.toLowerCase().equals("name"))
            return By.name(locatorValue);
          if((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
            return By.className(locatorValue);
          if((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
            return By.className(locatorValue);
          if((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
            return By.linkText(locatorValue);
          if(locatorType.toLowerCase().equals("partiallinktext"))
            return By.partialLinkText(locatorValue);
          if((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
            return By.cssSelector(locatorValue);
          if(locatorType.toLowerCase().equals("xpath"))
            return By.xpath(locatorValue);
        else
            throw new Exception("Unknown locator type '" + locatorType + "'");
    }
}