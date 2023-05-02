package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

}
