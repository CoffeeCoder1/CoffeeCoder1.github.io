/* 
 * Downloader tool
 * Made by CoffeeCoder1@Github
 */

import org.apache.http.client.fluent.Request;
import org.apache.commons.io.FilenameUtils;

public class dl {
  public static void main(String[] args) {
    System.out.println("CoffeeCoder1's Downloader Toolkit");
    System.out.println("Cross platform HTTP tools");
  }
  public static void dl(URL url) {
    String name = FilenameUtils.getName(url.getPath());
    
    System.out.println("Downloading " + name + "...");
    
    Request.Get(path).execute().saveContent("/tmp/cc1/dl/" + name);
  }
