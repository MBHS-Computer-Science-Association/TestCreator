package com.seeyes4prawjekt; 
import java.io.File;
 public class CurrentWorkingDirectory {
 	String canPath;
 	String absPath;
 public CurrentWorkingDirectory() {
 File directory = new File (".");
 try {
 // System.out.println ("Current directory's canonical path: " 
  canPath = directory.getCanonicalPath(); 
   // System.out.println ("Current directory's absolute  path: " 
  absPath = directory.getAbsolutePath();
 }catch(Exception e) {
 System.out.println(e.getMessage());
  }
 }
 public String getCanonicalPath(){
 	return canPath;
 }
 public String getAbsolutePath(){
 	return absPath;
 }
}
