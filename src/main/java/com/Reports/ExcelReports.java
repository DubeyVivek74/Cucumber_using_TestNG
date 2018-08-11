package com.Reports;

import org.automationtesting.excelreport.Xl;

public class ExcelReports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	Xl.generateReport("C:\\Users\\Lenovo\\Desktop\\Appiumworkspace\\BDD_TestNG\\Reports", "Reportsinexcel.xlsx");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
