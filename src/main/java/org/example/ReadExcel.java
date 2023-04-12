package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

import static java.lang.Integer.*;

public class
ReadExcel {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "company.xlsx";
        System.out.println(path);

        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheetAt(0);
        String val = sh.getRow(0).getCell(0).getStringCellValue();
        int lastRow = sh.getLastRowNum();
        System.out.println(val);
        System.out.println(lastRow);
        {
            System.out.println("...........excel assignment 1............");


            for (int i = 1; i < lastRow; i++) {

                String City = sh.getRow(i).getCell(3).getStringCellValue();
                if (City.equals("Bangalore")) {
                    String name = sh.getRow(i).getCell(0).getStringCellValue();
                    String role = sh.getRow(i).getCell(1).getStringCellValue();
                    System.out.println(name + "--" + role);


                }
            }
        }

        {
            System.out.println("........excel assignment 2.......");


            for (int i=1;i<=lastRow;i++){
                double Age = sh.getRow(i).getCell(2).getNumericCellValue();
                System.out.println(Age);
                if(Age>24){
                    String Name = sh.getRow(i).getCell(0).getStringCellValue();
                    String city = sh.getRow(i).getCell(3).getStringCellValue();
                    System.out.println(Name + "--" + city);
                }



                }

            }

        {
            System.out.println("......assignment 3.......");



            for(int i=1;i<=lastRow;i++){
                Date dob = sh.getRow(i).getCell(4).getDateCellValue();
              System.out.println(dob);


              //  System.out.println(db);

            //    if(db==2020){
                    String name=sh.getRow(i).getCell(0).getStringCellValue();
                    String job = sh.getRow(i).getCell(1).getStringCellValue();
                    System.out.println(name + "---" + job);
                }

            }
        }


        }
















