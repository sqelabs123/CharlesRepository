package com.Utility.Bill.Re_Usable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class csv {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\r\n";

	public static void Meter_Read(String fileName, String header , String meterNo ,String date,long flat_rate_Read,long Peak_Read,long Shoulder_Read, long Off_Peak_Read, char read_type, String Notes) 
	{
		
		String FILE_HEADER = header;
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new student object list to the CSV file
		 
				fileWriter.append(meterNo);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append((CharSequence) date);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(String.valueOf(flat_rate_Read));
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(String.valueOf(Peak_Read));
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(String.valueOf(Shoulder_Read));
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(String.valueOf(Off_Peak_Read));
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(read_type);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(Notes);
				//fileWriter.append(COMMA_DELIMITER);

			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}
	
	public static void Generic_service(String fileName, String header , String CustomerNo,String des,String prorata_Date, String end_Date, long quantity,String Notes, String Roll_Des, String Unit, long Rate,String isOnceOFF, String ChargesType) {

		
		String FILE_HEADER = header;
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new student object list to the CSV file
		 
	 
			fileWriter.append(CustomerNo);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(  des);
				fileWriter.append(COMMA_DELIMITER);
 
				fileWriter.append(prorata_Date);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(end_Date);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(String.valueOf(quantity));
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(Notes);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(Roll_Des);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(Unit);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(String.valueOf(Rate));
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(isOnceOFF);
				fileWriter.append(COMMA_DELIMITER);
				
				fileWriter.append(ChargesType);
				fileWriter.append(COMMA_DELIMITER);

			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		
	}
	}
	
		public static void Demand_Read(String fileName, String header , String MeterNo,long demandType,String  Date, String Time, long reading) {

			
			String FILE_HEADER = header;
			FileWriter fileWriter = null;
					
			try {
				fileWriter = new FileWriter(fileName);

				//Write the CSV file header
				fileWriter.append(FILE_HEADER.toString());
				
				//Add a new line separator after the header
				fileWriter.append(NEW_LINE_SEPARATOR);
				
				//Write a new student object list to the CSV file
			 
		 
					fileWriter.append(MeterNo);
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append( String.valueOf(demandType));
					fileWriter.append(COMMA_DELIMITER);
	 
					fileWriter.append( Date);
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(Time);
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(String.valueOf(reading));
					//fileWriter.append(COMMA_DELIMITER);

				System.out.println("CSV file was created successfully !!!");
				
			} catch (Exception e) {
				System.out.println("Error in CsvFileWriter !!!");
				e.printStackTrace();
			} finally {
				
				try {
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e) {
					System.out.println("Error while flushing/closing fileWriter !!!");
	                e.printStackTrace();
				}
				
			}
			
		}
			public static void OnceOff(String fileName, String header, Long CustomerNo, String MeterNo) {

				
				String FILE_HEADER = header;
				FileWriter fileWriter = null;
						
				try {
					fileWriter = new FileWriter(fileName);

					//Write the CSV file header
					fileWriter.append(FILE_HEADER.toString());
					
					//Add a new line separator after the header
					fileWriter.append(NEW_LINE_SEPARATOR);
					
					//Write a new student object list to the CSV file
				 
			 
					fileWriter.append(String.valueOf(CustomerNo));
						fileWriter.append(COMMA_DELIMITER);
						
						fileWriter.append(  MeterNo);
						fileWriter.append(COMMA_DELIMITER);
		 
						fileWriter.append("Once-off Charge");
						fileWriter.append(COMMA_DELIMITER);
						
						fileWriter.append("Special Charges");
						fileWriter.append(COMMA_DELIMITER);
						
						fileWriter.append("5/1/2018");
						fileWriter.append(COMMA_DELIMITER);

						fileWriter.append("5/31/2018");
						fileWriter.append(COMMA_DELIMITER);
						
						fileWriter.append(String.valueOf(5));
						fileWriter.append(COMMA_DELIMITER);
						
						fileWriter.append(String.valueOf(0.15));
						fileWriter.append(COMMA_DELIMITER);
						
						fileWriter.append("");
						fileWriter.append(COMMA_DELIMITER);
						
						fileWriter.append('0');
						fileWriter.append(COMMA_DELIMITER);//newly added for new template
						
						fileWriter.append("");
						//newly added for new template
						
						
						


					System.out.println("CSV file was created successfully !!!");
					
				} catch (Exception e) {
					System.out.println("Error in CsvFileWriter !!!");
					e.printStackTrace();
				} finally {
					
					try {
						fileWriter.flush();
						fileWriter.close();
					} catch (IOException e) {
						System.out.println("Error while flushing/closing fileWriter !!!");
		                e.printStackTrace();
					}
					
				}
			}	
				public static void Recurring(String fileName, String header , Long CustomerNo,String MeterNo) {

			String FILE_HEADER = header;
					FileWriter fileWriter = null;
							
					try {
						fileWriter = new FileWriter(fileName);

						//Write the CSV file header
						fileWriter.append(FILE_HEADER.toString());
						
						//Add a new line separator after the header
						fileWriter.append(NEW_LINE_SEPARATOR);
						
						//Write a new student object list to the CSV file
					 
				 
						fileWriter.append(String.valueOf(CustomerNo));
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append(  MeterNo);
							fileWriter.append(COMMA_DELIMITER);
			 
							fileWriter.append("Special Charge");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("Recurring Charge");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("02/04/2020");
							fileWriter.append(COMMA_DELIMITER);

							fileWriter.append("");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("Yes");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("No");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append(String.valueOf(0.15));
							fileWriter.append(COMMA_DELIMITER);

							fileWriter.append("");
							fileWriter.append(COMMA_DELIMITER);
							
							fileWriter.append("0");
							fileWriter.append(COMMA_DELIMITER);
							
							
						System.out.println("CSV file was created successfully !!!");
						
					} catch (Exception e) {
						System.out.println("Error in CsvFileWriter !!!");
						e.printStackTrace();
					} finally {
						
						try {
							fileWriter.flush();
							fileWriter.close();
						} catch (IOException e) {
							System.out.println("Error while flushing/closing fileWriter !!!");
			                e.printStackTrace();
						}
						
					}
				}	
				
				
				
					public static void MeterNumber(String fileName, String header , Long CustomerNo,String Plan,String Meter_no) {

						
						String FILE_HEADER = header;
						FileWriter fileWriter = null;
								
						try {
							fileWriter = new FileWriter(fileName);

							//Write the CSV file header
							fileWriter.append(FILE_HEADER.toString());
							
							//Add a new line separator after the header
							fileWriter.append(NEW_LINE_SEPARATOR);
							
							//Write a new student object list to the CSV file
						 
					 
								fileWriter.append(String.valueOf(CustomerNo));
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append(Plan);
								fileWriter.append(COMMA_DELIMITER);
				 
								fileWriter.append(Meter_no);
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append(String.valueOf(1));
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("7/7/2016");
								fileWriter.append(COMMA_DELIMITER);

								fileWriter.append("HE");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("R");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("No");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append(String.valueOf(1));
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
			
								fileWriter.append("1200-1");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("APT");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("Apartment 7");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append(String.valueOf(24));
								fileWriter.append(COMMA_DELIMITER);	
								
								fileWriter.append("Hermit Park");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("APT");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("Mount Louisa");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("AUSTRALIA");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append(String.valueOf(4814));
								fileWriter.append(COMMA_DELIMITER);	
								
								fileWriter.append("");
								//fileWriter.append(COMMA_DELIMITER);	
								
								
							System.out.println("CSV file was created successfully !!!");
							
						} catch (Exception e) {
							System.out.println("Error in CsvFileWriter !!!");
							e.printStackTrace();
						} finally {
							
							try {
								fileWriter.flush();
								fileWriter.close();
							} catch (IOException e) {
								System.out.println("Error while flushing/closing fileWriter !!!");
				                e.printStackTrace();
							}
							
						}
					}	
public static void GasMeterNumber(String fileName, String header , Long CustomerNo,String Plan,String Meter_no) {

						
						String FILE_HEADER = header;
						FileWriter fileWriter = null;
								
						try {
							fileWriter = new FileWriter(fileName);

							//Write the CSV file header
							fileWriter.append(FILE_HEADER.toString());
							
							//Add a new line separator after the header
							fileWriter.append(NEW_LINE_SEPARATOR);
							
							//Write a new student object list to the CSV file
						 
					             //1
								fileWriter.append(String.valueOf(CustomerNo));
								fileWriter.append(COMMA_DELIMITER);
								//2
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//3
								fileWriter.append(Plan);
								fileWriter.append(COMMA_DELIMITER);
				               //4
								fileWriter.append("Gas"+Meter_no);
								fileWriter.append(COMMA_DELIMITER);
								//5
								fileWriter.append(String.valueOf(1));
								fileWriter.append(COMMA_DELIMITER);
								//6
								fileWriter.append("3/3/2018");
								fileWriter.append(COMMA_DELIMITER);
                                //7
								fileWriter.append("R");
								fileWriter.append(COMMA_DELIMITER);
								//8
								fileWriter.append("1");
								fileWriter.append(COMMA_DELIMITER);
								//9
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//11
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//12
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
							/*	//13
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//14
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);*/
			                    //15
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//16
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//17
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//18
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
								//19
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//20
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//21
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//22
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								//23
								fileWriter.append(String.valueOf(5001));
								fileWriter.append(COMMA_DELIMITER);	
								//24
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
								
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);	
								
								
							System.out.println("CSV file was created successfully !!!");
							
						} catch (Exception e) {
							System.out.println("Error in CsvFileWriter !!!");
							e.printStackTrace();
						} finally {
							
							try {
								fileWriter.flush();
								fileWriter.close();
							} catch (IOException e) {
								System.out.println("Error while flushing/closing fileWriter !!!");
				                e.printStackTrace();
							}
							
						}
					}	
					
				public static void Payment(String fileName,String header,long cn,String Alternative_Customer_No,String Transaction_Type,String Payment_Method,String Card_Type,long Amount,String Transaction_Date,String Comments,String Auto_Allocate,String Batch) throws InterruptedException {

							
					String FILE_HEADER = header;
					FileWriter fileWriter = null;
							
					try {
						fileWriter = new FileWriter(fileName);

						//Write the CSV file header
						fileWriter.append(FILE_HEADER.toString());
						
						//Add a new line separator after the header
						fileWriter.append(NEW_LINE_SEPARATOR);
						
						//Write a new student object list to the CSV file
					 
				 
									fileWriter.append(String.valueOf(cn));
									fileWriter.append(COMMA_DELIMITER);
										
									fileWriter.append(Alternative_Customer_No);
									fileWriter.append(COMMA_DELIMITER);
					 
									fileWriter.append(Transaction_Type);
									fileWriter.append(COMMA_DELIMITER);
									
									fileWriter.append(Payment_Method);
									fileWriter.append(COMMA_DELIMITER);
 								
									fileWriter.append(Card_Type);
									fileWriter.append(COMMA_DELIMITER);
									
									fileWriter.append(String.valueOf(Amount));
									fileWriter.append(COMMA_DELIMITER);
									
									fileWriter.append(Transaction_Date);
									fileWriter.append(COMMA_DELIMITER);
									
									fileWriter.append(Comments);
									fileWriter.append(COMMA_DELIMITER);
									
									fileWriter.append(Auto_Allocate);						
									fileWriter.append(COMMA_DELIMITER);

									fileWriter.append(Batch);
						
									
								System.out.println("CSV file was created successfully !!!");
								
							} catch (Exception e) {
								System.out.println("Error in CsvFileWriter !!!");
								e.printStackTrace();
							} finally {
								
								try {
								
									fileWriter.flush();
									
									fileWriter.close();
								} catch (IOException e) {
									System.out.println("Error while flushing/closing fileWriter !!!");
					                e.printStackTrace();
								}}
							
								}
				//add vinod
					public static void Security_Deposit(String fileName, String header, Long CustomerNo) {

						
						String FILE_HEADER = header;
						FileWriter fileWriter = null;
								
						try {
							fileWriter = new FileWriter(fileName);

							//Write the CSV file header
							fileWriter.append(FILE_HEADER.toString());
							
							//Add a new line separator after the header
							fileWriter.append(NEW_LINE_SEPARATOR);
							
							//Write a new student object list to the CSV file
						 
					 
							fileWriter.append(String.valueOf(CustomerNo));
								fileWriter.append(COMMA_DELIMITER);
															
								fileWriter.append("");
								fileWriter.append(COMMA_DELIMITER);
								
								
								fileWriter.append("SD");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("DP");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("150");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("03/15/2018");
								fileWriter.append(COMMA_DELIMITER);//newly added for new template

								fileWriter.append("Security Payments Recived ");
								fileWriter.append(COMMA_DELIMITER);
								
								fileWriter.append("Security Deposit Payments");
								fileWriter.append(COMMA_DELIMITER);
								//newly added for new template
								
								
								


							System.out.println("CSV file was created successfully !!!");
							
						} catch (Exception e) {
							System.out.println("Error in CsvFileWriter !!!");
							e.printStackTrace();
						} finally {
							
							try {
								fileWriter.flush();
								fileWriter.close();
							} catch (IOException e) {
								System.out.println("Error while flushing/closing fileWriter !!!");
				                e.printStackTrace();
							}
						}
							
}
						//add vinod1
						public static void Prorated_Tariff(String fileName, String header,String Plan,String Tcode, String prodate, String prodate1) {

							
							String FILE_HEADER = header;
							FileWriter fileWriter = null;
									
							try {
								fileWriter = new FileWriter(fileName);

								//Write the CSV file header
								fileWriter.append(FILE_HEADER.toString());
								
								//Add a new line separator after the header
								fileWriter.append(NEW_LINE_SEPARATOR);
								
								//Write a new student object list to the CSV file
							 	
								
									fileWriter.append(Plan);
									fileWriter.append(COMMA_DELIMITER);
									fileWriter.append(Tcode);
									fileWriter.append(COMMA_DELIMITER);		
									fileWriter.append(prodate);
									fileWriter.append(COMMA_DELIMITER);									
									fileWriter.append(prodate1);
									fileWriter.append(COMMA_DELIMITER);									
									fileWriter.append("150");
									fileWriter.append(COMMA_DELIMITER);														
													
								System.out.println("CSV file was created successfully !!!");
								
							} catch (Exception e) {
								System.out.println("Error in CsvFileWriter !!!");
								e.printStackTrace();
							} finally {
								
								try {
									fileWriter.flush();
									fileWriter.close();
								} catch (IOException e) {
									System.out.println("Error while flushing/closing fileWriter !!!");
					                e.printStackTrace();
								}	
							}
	}
public static void main(String[] args) {
		
		//String fileName = System.getProperty("user.home")+"/student.csv";
	String fileName ="C:\\Users\\Shubham\\Desktop\\final\\Customer Import Templat.csv";
	String head="id,firstName,lastName,gender,age";
		System.out.println("Write CSV file:");
		//Meter_Read (fileName,head);
		//String p="E:\\MeterReadImportTemplate\\Meter Read Import Template.csv";
		String col="*Meter Number,	*Date of Read,	Flat Rate Read,	Peak Read,	Shoulder Read,	Off Peak Read,	*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate / F - Final],	Notes";
		Date date;
		
		csv.Meter_Read(fileName, col, "MtrNo4CSV", "9/10/2016", 1000, 200, 300, 50, 'A', "Initial Read");
	 

	}



//addd for gass reading 

public static void GasMeterNumber(String string, String col, String customerNumber, String string2, String plan,
		String string3, char c, int i, char d, int j, String string4) {
	// TODO Auto-generated method stub
	
}
}