package org.parallel.utils.misc;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelBaseUtil {

    public static File src;
    public static FileInputStream fileInputStream;
    public static FileOutputStream fileOutputStream;
    public static HashMap<String,FileOutputStream> storeFileOutputStream;
    public static Workbook workbook;
    public static HashMap<String,Workbook>Excels;
    public static HashMap<String,String>filePaths;
    public static Sheet sheet;
    public static CellStyle style;
    public static Cell cell;

    public static void setExcels(String fileName,String filePath){
        try{
            src=new File(filePath);
            fileInputStream=new FileInputStream(src);
            if(filePaths==null){
                filePaths=new HashMap<>();
                filePaths.put(fileName,filePath);
            }else
            {
                filePaths.put(fileName,filePath);
            }
            if(getExtension(filePath).equals("xlsx")){
                workbook=WorkbookFactory.create(fileInputStream);
                if(Excels==null){
                    Excels=new HashMap<>();
                    Excels.put(fileName,workbook);
                }else {
                    Excels.put(fileName,workbook);
                }
            }
        }catch (Exception ae){
            ae.printStackTrace();
        }
    }
    public static String getExtension(String filePath){
        String extention="";
        try{
            for(int i=filePath.lastIndexOf(".")+1;i<filePath.length();i++){
                extention=extention+filePath.charAt(i);
            }
        }catch (Exception ae){
            ae.printStackTrace();
        }return extention;
    }
    public static Workbook getWorkbook(String fileName){
        Workbook workbook=null;
        try{
            for (Map.Entry<String,Workbook> entry: Excels.entrySet()) {
                if(entry.getKey().equals(fileName)){
                    workbook=entry.getValue();
                }
            }
        }catch (Exception ae){
            ae.printStackTrace();
        }if(workbook==null){
            throw new NullPointerException("Invalid file Name");
        }else{
           return workbook;
        }
    }
    public static FileOutputStream getFileOutputStream(String fileName){
        FileOutputStream fileOutputStream=null;
        try{
            for (Map.Entry<String,FileOutputStream> fileOutputStreamEntry: storeFileOutputStream.entrySet()) {
                if(fileOutputStreamEntry.getKey().equals(fileName)){
                    fileOutputStream=fileOutputStreamEntry.getValue();
                }
            }
        }catch (Exception ae){
            ae.printStackTrace();
        }if(fileOutputStream==null){
            throw new NullPointerException("Invalid file Name");
        }else{
            return fileOutputStream;
        }
    }
    public static Sheet getSheet(Workbook workbook,String sheetName){
        Sheet sheet=null;
        try{
            sheet=workbook.getSheet(sheetName);
        }catch (Exception ae){
            ae.printStackTrace();
        }if(sheet==null){
            throw new NullPointerException("Invalid sheetname");
        }else{
            return sheet;
        }
    }
    public static Integer getTotalRowCount(Sheet sheet){
        Integer totalRowCount=0;
        try{
            totalRowCount=sheet.getLastRowNum();
        }catch (Exception ae){
            ae.printStackTrace();
        }return totalRowCount;
    }
    public static Integer getTotalColumnCount(Sheet sheet,Integer rowNo){
        Integer totalColumnCount=0;
        try{
           totalColumnCount= Integer.valueOf(sheet.getRow(rowNo).getLastCellNum());
        }catch (Exception ae){
            ae.printStackTrace();
        }return totalColumnCount;
    }
    public static String getData(Sheet sheet,int rowNo,int colNo){
        String cellValue="";
        CellType cellType;
        try{
            try {
                cellType = sheet.getRow(rowNo).getCell(colNo).getCellType();
            }catch (NullPointerException nullPointerException){
                cellType=CellType.BLANK;
            }
            switch (cellType){
                case STRING:cellValue=sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
                break;
                case BOOLEAN:cellValue=String.valueOf(sheet.getRow(rowNo).getCell(colNo).getBooleanCellValue());
                break;
                case NUMERIC:cellValue=String.valueOf(sheet.getRow(rowNo).getCell(colNo).getNumericCellValue());
                break;
                    default:
                       // System.out.println("Cell not matched");

            }
        }catch (Exception ae){
            ae.printStackTrace();
        }return cellValue;
    }
    public static String getCellValue(Sheet sheet,Integer rowNo,String columnName){
        String cellValue="";
        try {
            for(int i=0;i<sheet.getRow(0).getPhysicalNumberOfCells();i++){
                if(getData(sheet,0,i).equals(columnName));{
                    cellValue=getData(sheet,rowNo,i);
                }
            }
        }catch (Exception ae){
            ae.printStackTrace();
        }return cellValue;
    }
    public static void setData(Sheet sheet,int row,int col,String value){
        try{
            sheet.getRow(row).createCell(col).setCellValue(value);
        }catch (NullPointerException exception){
            sheet.createRow(row).createCell(col).setCellValue(value);
        }
    }
    public static void setData(Sheet sheet,int row,int col,Boolean value){
        try{
            if(getTotalRowCount(sheet)==row-1){
                sheet.createRow(row).createCell(col).setCellValue(value);
            }else{
                sheet.getRow(row).createCell(col).setCellValue(value);
            }

        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
    public static void setData(Sheet sheet,int row,int col,Integer value){
        try{
            if(getTotalRowCount(sheet)==row-1){
                sheet.createRow(row).createCell(col).setCellValue(value);
            }else{
                sheet.getRow(row).createCell(col).setCellValue(value);
            }

        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
    public static void setData(Sheet sheet,int row,int col,Double value){
        try{
            if(getTotalRowCount(sheet)==row-1){
                sheet.createRow(row).createCell(col).setCellValue(value);
            }else{
                sheet.getRow(row).createCell(col).setCellValue(value);
            }

        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
    public static void openFile(String fileName) throws IOException {
        String filePath=filePaths.get(fileName);

        src=new File(filePath);
        fileOutputStream=new FileOutputStream(src);
        if(storeFileOutputStream==null){
            storeFileOutputStream=new HashMap<>();
            storeFileOutputStream.put(fileName,fileOutputStream);
        }else {
            storeFileOutputStream.put(fileName,fileOutputStream);
        }

    }
    public static void closeFile(String fileName) throws IOException {
        getWorkbook(fileName).write(getFileOutputStream(fileName));
        getWorkbook(fileName).close();
        getFileOutputStream(fileName).close();
    }
    public static void setCellBGColor(Workbook workbook,Sheet sheet,int rowNo,int colNo,String bgColor,Cell cell) {
        style = workbook.createCellStyle();
        if (bgColor.equals("GREEN")) {
            style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
        } else if (bgColor.equals("RED")) {
            style.setFillBackgroundColor(IndexedColors.RED.getIndex());
        }
        style.setFillPattern(FillPatternType.BIG_SPOTS);
        cell.setCellStyle(style);
    }


















    














    



}
