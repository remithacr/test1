package com.qtpselenium.framework.suiteA;

import com.qtpselenium.framework.util.Constants;
import com.qtpselenium.framework.util.Utility;
import com.qtpselenium.framework.util.Xls_Reader;

public class RowCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		Xls_Reader xls =  new Xls_Reader(System.getProperty("user.dir") + "\\Suite.xlsx");
		int row = xls.getRowCount("Suite");
		
		System.out.println(row);
		

	}

}
