package doj.ca.gov.excelparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;

public class StopDataExcelParser {
	

	public static void main(String[] args) {
		ExcelDao excelDao = new ExcelDao();
		StopData stopData = null;
		Workbook workbook = null;
		String filepath = "excel/Ravikanth.xlsx";
		FileInputStream inputStream=null;
		try {
			inputStream = new FileInputStream(new File(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> itr = sheet.iterator();

		while (itr.hasNext()) {
			Row row = itr.next();
			if (row.getRowNum() >= 1) {
				Iterator<Cell> cell = row.iterator();
				 stopData = new StopData();
				while (cell.hasNext()) {
					Cell nextCell = cell.next();
					int columnIndex = nextCell.getColumnIndex();
					System.out.println("CellType-"+nextCell.getCellType());
					switch(columnIndex) {
					case 0: 
						System.out.println(nextCell);
						stopData.setAgency_ORI((String)getCellValue(nextCell));
					break;
					case 1: 
						System.out.println(nextCell);
						stopData.setLEA_batchID((String)getCellValue(nextCell));
					break;
					case 2: 
						System.out.println(nextCell);
						stopData.setLEA_Record_ID((String)getCellValue(nextCell));
					break;
					case 3: 
						System.out.println(nextCell);
						
						stopData.setDateofStop(nextCell.getDateCellValue());
					break;
					case 4: 
						System.out.println(nextCell);
						stopData.setStarttimeofStop(getTimeValue(nextCell.getDateCellValue()));
					break;
					case 5: 
						System.out.println(nextCell);
						stopData.setDurationofstop((Integer)getCellValue(nextCell));
					break;
					case 6: 
						System.out.println(nextCell);
						stopData.setResp_to_svc_call((Boolean)getCellValue(nextCell));
					break;
					case 7: 
						System.out.println(nextCell);
						stopData.setOfficer_UID(getCellValue(nextCell).toString());
					break;
					case 8: 
						System.out.println(nextCell);
						stopData.setOfficeryearsofexperience((Integer) getCellValue(nextCell));
					break;
					case 9: 
						System.out.println(nextCell);
						stopData.setOfficertypeofassignment(getCellValue(nextCell).toString());
					break;
					case 10: 
						System.out.println(nextCell);
						stopData.setOfficerotherassignmenttype((String) getCellValue(nextCell));
					break;
					case 11: 
						System.out.println(nextCell);
						stopData.setLocationdescription((String) getCellValue(nextCell));
					break;
					case 12: 
						System.out.println(nextCell);
						stopData.setClosestCity((String) getCellValue(nextCell));
					break;
					case 13: 
						System.out.println(nextCell);
						stopData.setK12school((Boolean) getCellValue(nextCell));
					break;
					case 14: 
						System.out.println(nextCell);
						stopData.setK12Schoolname((String) getCellValue(nextCell));
					break;
					case 15: 
						System.out.println(nextCell);
						stopData.setEthnicity_Set(setSetValues((nextCell)));
					break;
					case 16: 
						System.out.println(nextCell);
						stopData.setGender_Key((String) getCellValue(nextCell).toString());
					break;
					case 17: 
						System.out.println(nextCell);
						stopData.setGendernonconforming((String) getCellValue(nextCell));
					break;
					case 18: 
						System.out.println(nextCell);
						stopData.setLGBT((Boolean) getCellValue(nextCell));
					break;
					case 19: 
						System.out.println(nextCell);
						stopData.setAge((Integer) getCellValue(nextCell));
					break;
					case 20: 
						System.out.println(nextCell);
						stopData.setLimitedenglish((Boolean) getCellValue(nextCell));
					break;
					case 21: 
						System.out.println(nextCell);
						//stopData.setDisability_Set(setSetValues(nextCell));
					break;
					case 22: 
						System.out.println(nextCell);
						stopData.setStopforastudent((Boolean) getCellValue(nextCell));
					break;
					case 23: 
						System.out.println(nextCell);
						stopData.setPriReasonforStop_Key( getCellValue(nextCell).toString());
					break;
					case 24: 
						System.out.println(nextCell);
						stopData.setReasonforstopnarrative((String) getCellValue(nextCell));
					break;
					case 25: 
						System.out.println(nextCell);
						stopData.setTrafficviolation_ID(getCellValue(nextCell).toString());
					break;
					case 26: 
						System.out.println(nextCell);
						stopData.setTraffic_Violation_Offense_CD((Integer) getCellValue(nextCell));
					break;
					case 27: 
						System.out.println(nextCell);
						stopData.setEDU_CD_sec_ID((String) getCellValue(nextCell));
					break;
					case 28: 
						System.out.println(nextCell);
						stopData.setEDU_CD_Subdiv_ID((String) getCellValue(nextCell));
					break;
					case 29: 
						System.out.println(nextCell);
						//stopData.setSuspicion_offense_CD((Integer) getCellValue(nextCell));
					break;
					case 30: 
						System.out.println(nextCell);
						//stopData.setSuspicion_subType_Set(setSetValues(nextCell));
					break;
					case 31: 
						System.out.println(nextCell);
						//stopData.setAction_Set(setMapValues(nextCell));
					break;
					case 32: 
						System.out.println(nextCell);
						stopData.setBasis_for_Search_Set(setSetValues(nextCell));
					break;
					case 33: 
						System.out.println(nextCell);
						stopData.setBasisforsearchnarrative((String) getCellValue(nextCell));
					break;
					case 34: 
						System.out.println(nextCell);
						stopData.setBasis_for_Property_Seizure_Set(setSetValues(nextCell));
					break;
					case 35: 
						System.out.println(nextCell);
						stopData.setPropety_Seized_Set((setSetValues(nextCell)));
						
					break;
					case 36: 
						System.out.println(nextCell);
						//stopData.setContraband_or_Evidence_Set(setSetValues(nextCell));
					break;
					case 37: 
						System.out.println(nextCell);
					//	stopData.setResult_of_Stop_Set(result_of_Stop_Set);
					break;
									
					
						}
					
					}
				}
			}
		excelDao.insertData(stopData);
		}
	
	private static Map<String, Boolean> setMapValues(Cell nextCell) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object getCellValue(Cell cell) {
		switch(cell.getCellType()){
		case Cell.CELL_TYPE_BOOLEAN:
			return cell.getBooleanCellValue();
		
		case Cell.CELL_TYPE_NUMERIC:
			double value = cell.getNumericCellValue();
			int intValue = (int) value;
			return Integer.valueOf(intValue);
		
		
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();
		case Cell.CELL_TYPE_BLANK:
			//do
		return null;
		case Cell.CELL_TYPE_ERROR:
			//do
		return null;
		
		}
		return null;
	}
	public static java.sql.Date getDateValue(Date date) {
		return new java.sql.Date(date.getTime());
	}
	public static java.sql.Time getTimeValue(Date date) {
		return new java.sql.Time(date.getTime());
	}
	public static Set<String> setSetValues(Cell cell) {
		Set<String> values = new HashSet<String>();
		
		String cellValue =(String) getCellValue(cell);
		StringTokenizer tokenizer = new StringTokenizer(cellValue, ",");
		while (tokenizer.hasMoreElements()) {
			String token = (String) tokenizer.nextElement();
			values.add(token);			
		}
		
		return values;
		
	}
}

