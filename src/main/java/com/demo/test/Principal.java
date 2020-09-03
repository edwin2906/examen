package com.demo.test;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("userName", "prueba");
		map.put("password", "prueba");
		map.put("logFileFolder", "logFileFolder");
		map.put("dbms", "jdbc:hsqldb:file:prueba, sa");
        Demo demo = new Demo(true, true, true, true, true, true, map);
        demo.LogMessage("Prueba 01", true, true, true);
	}

}
