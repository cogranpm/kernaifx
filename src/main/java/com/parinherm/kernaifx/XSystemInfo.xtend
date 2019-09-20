package com.parinherm.kernaifx

class XSystemInfo {
	
	def static String javaVersion(){
		return System.getProperty("java.version")
	}
	
	def static String javafxVersion() {
		return System.getProperty("javafx.version")
	}
}