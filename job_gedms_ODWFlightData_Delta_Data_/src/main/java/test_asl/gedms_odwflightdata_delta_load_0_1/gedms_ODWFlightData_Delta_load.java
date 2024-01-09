
package test_asl.gedms_odwflightdata_delta_load_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.SQLike;
import routines.DemoRoutine;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJavaRow_3
	//import java.util.List;

	//the import part of tJavaRow_4
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: gedms_ODWFlightData_Delta_load Purpose: gedms_ODWFlightData_Delta_load<br>
 * Description:  <br>
 * @author security@company.com
 * @version 8.0.1.20231017_1026-patch
 * @status 
 */
public class gedms_ODWFlightData_Delta_load implements TalendJob {
	static {System.setProperty("TalendJob.log", "gedms_ODWFlightData_Delta_load.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(gedms_ODWFlightData_Delta_load.class);
	

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	

	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
		

	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(LATEST_DATE != null){
				
					this.setProperty("LATEST_DATE", LATEST_DATE.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String LATEST_DATE;
public String getLATEST_DATE(){
	return this.LATEST_DATE;
}
	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "gedms_ODWFlightData_Delta_load";
	private final String projectName = "TEST_ASL";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_jnl7UG2IEe6pYdPIWdzVNQ", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	
	private String currentComponent = null;
	private String cLabel =  null;
	
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}
	
	private TalendException(Exception e, String errorComponent, String errorComponentLabel, final java.util.Map<String, Object> globalMap) {
		this(e, errorComponent, globalMap);
		this.cLabel = errorComponentLabel;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				gedms_ODWFlightData_Delta_load.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(gedms_ODWFlightData_Delta_load.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
		if(enableLogStash) {
			talendJobLog.addJobExceptionMessage(currentComponent, cLabel, null, e);
			talendJobLogProcess(globalMap);
		}
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tPrejob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAggregateRow_1_AGGOUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tAggregateRow_1_AGGIN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tAggregateRow_1_AGGIN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public void tPrejob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPrejob_2");
		org.slf4j.MDC.put("_subJobPid", "Jl5ess_" + subJobPidCounter.getAndIncrement());
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_2", false);
		start_Hash.put("tPrejob_2", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_2";
	
	
		int tos_count_tPrejob_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_2", "tPrejob_2", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_2 begin ] stop
 */
	
	/**
	 * [tPrejob_2 main ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 


	tos_count_tPrejob_2++;

/**
 * [tPrejob_2 main ] stop
 */
	
	/**
	 * [tPrejob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_2 end ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 

ok_Hash.put("tPrejob_2", true);
end_Hash.put("tPrejob_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tFileInputDelimited_2Process(globalMap);



/**
 * [tPrejob_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_2 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_2_SUBPROCESS_STATE", 1);
	}
	


public static class row8Struct implements routines.system.IPersistableRow<row8Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];

	
			    public String maxDate;

				public String getMaxDate () {
					return this.maxDate;
				}

				public Boolean maxDateIsNullable(){
				    return true;
				}
				public Boolean maxDateIsKey(){
				    return false;
				}
				public Integer maxDateLength(){
				    return null;
				}
				public Integer maxDatePrecision(){
				    return null;
				}
				public String maxDateDefault(){
				
					return null;
				
				}
				public String maxDateComment(){
				
				    return "";
				
				}
				public String maxDatePattern(){
				
					return "";
				
				}
				public String maxDateOriginalDbColumnName(){
				
					return "maxDate";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
					this.maxDate = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
					this.maxDate = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.maxDate,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.maxDate,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("maxDate="+maxDate);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(maxDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(maxDate);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void tFileInputDelimited_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_2");
		org.slf4j.MDC.put("_subJobPid", "PN6HSf_" + subJobPidCounter.getAndIncrement());
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row8Struct row8 = new row8Struct();




	
	/**
	 * [tJavaRow_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_3", false);
		start_Hash.put("tJavaRow_3", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row8");
			
		int tos_count_tJavaRow_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJavaRow_3", "tJavaRow_3", "tJavaRow");
				talendJobLogProcess(globalMap);
			}
			

int nb_line_tJavaRow_3 = 0;

 



/**
 * [tJavaRow_3 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_2", false);
		start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_2";
	
	
		int tos_count_tFileInputDelimited_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_2 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_2.append("Parameters:");
                            log4jParamters_tFileInputDelimited_2.append("USE_EXISTING_DYNAMIC" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FILENAME" + " = " + "\"D:/dnt/asl/talend/recordDate/ODWFlightData/ODWFlightDataMaxDate.csv\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FOOTER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("REMOVE_EMPTY_ROW" + " = " + "true");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("UNCOMPRESS" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("RANDOM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("maxDate")+"}]");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("USE_HEADER_AS_IS" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + (log4jParamters_tFileInputDelimited_2) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_2", "tFileInputDelimited_2", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_2 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = null;
				int limit_tFileInputDelimited_2 = -1;
				try{
					
						Object filename_tFileInputDelimited_2 = "D:/dnt/asl/talend/recordDate/ODWFlightData/ODWFlightDataMaxDate.csv";
						if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_2 = 0, random_value_tFileInputDelimited_2 = -1;
			if(footer_value_tFileInputDelimited_2 >0 || random_value_tFileInputDelimited_2 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited("D:/dnt/asl/talend/recordDate/ODWFlightData/ODWFlightDataMaxDate.csv", "ISO-8859-15",",","\n",true,1,0,
									limit_tFileInputDelimited_2
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
							
								
									log.error("tFileInputDelimited_2 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
					
				    
				    	log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_2!=null && fid_tFileInputDelimited_2.nextRecord()) {
						rowstate_tFileInputDelimited_2.reset();
						
			    						row8 = null;			
												
									boolean whetherReject_tFileInputDelimited_2 = false;
									row8 = new row8Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_2 = 0;
				
					columnIndexWithD_tFileInputDelimited_2 = 0;
					
							row8.maxDate = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
				
										
										if(rowstate_tFileInputDelimited_2.getException()!=null) {
											throw rowstate_tFileInputDelimited_2.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_2 = true;
			        					
												log.error("tFileInputDelimited_2 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row8 = null;
			                				
										
			    					}
								
			log.debug("tFileInputDelimited_2 - Retrieving the record " + fid_tFileInputDelimited_2.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_2 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 


	tos_count_tFileInputDelimited_2++;

/**
 * [tFileInputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 



/**
 * [tFileInputDelimited_2 process_data_begin ] stop
 */
// Start of branch "row8"
if(row8 != null) { 



	
	/**
	 * [tJavaRow_3 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row8","tFileInputDelimited_2","tFileInputDelimited_2","tFileInputDelimited","tJavaRow_3","tJavaRow_3","tJavaRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row8 - " + (row8==null? "": row8.toLogString()));
    			}
    		

    
//Code generated according to input schema and output schema
context.LATEST_DATE = row8.maxDate;
System.out.println("context.LATEST_DATE :-" + context.LATEST_DATE);
    nb_line_tJavaRow_3++;   

 


	tos_count_tJavaRow_3++;

/**
 * [tJavaRow_3 main ] stop
 */
	
	/**
	 * [tJavaRow_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

 



/**
 * [tJavaRow_3 process_data_begin ] stop
 */
	
	/**
	 * [tJavaRow_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

 



/**
 * [tJavaRow_3 process_data_end ] stop
 */

} // End of branch "row8"




	
	/**
	 * [tFileInputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 



/**
 * [tFileInputDelimited_2 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	



            }
            }finally{
                if(!((Object)("D:/dnt/asl/talend/recordDate/ODWFlightData/ODWFlightDataMaxDate.csv") instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_2!=null){
                		fid_tFileInputDelimited_2.close();
                	}
                }
                if(fid_tFileInputDelimited_2!=null){
                	globalMap.put("tFileInputDelimited_2_NB_LINE", fid_tFileInputDelimited_2.getRowNumber());
					
						log.info("tFileInputDelimited_2 - Retrieved records count: "+ fid_tFileInputDelimited_2.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_2", true);
end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());




/**
 * [tFileInputDelimited_2 end ] stop
 */

	
	/**
	 * [tJavaRow_3 end ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

globalMap.put("tJavaRow_3_NB_LINE",nb_line_tJavaRow_3);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row8",2,0,
			 			"tFileInputDelimited_2","tFileInputDelimited_2","tFileInputDelimited","tJavaRow_3","tJavaRow_3","tJavaRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tJavaRow_3", true);
end_Hash.put("tJavaRow_3", System.currentTimeMillis());




/**
 * [tJavaRow_3 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 



/**
 * [tFileInputDelimited_2 finally ] stop
 */

	
	/**
	 * [tJavaRow_3 finally ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

 



/**
 * [tJavaRow_3 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}
	


public void tPostjob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPostjob_2");
		org.slf4j.MDC.put("_subJobPid", "8KdQSj_" + subJobPidCounter.getAndIncrement());
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_2", false);
		start_Hash.put("tPostjob_2", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_2";
	
	
		int tos_count_tPostjob_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_2", "tPostjob_2", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_2 begin ] stop
 */
	
	/**
	 * [tPostjob_2 main ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 


	tos_count_tPostjob_2++;

/**
 * [tPostjob_2 main ] stop
 */
	
	/**
	 * [tPostjob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 



/**
 * [tPostjob_2 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 



/**
 * [tPostjob_2 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_2 end ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 

ok_Hash.put("tPostjob_2", true);
end_Hash.put("tPostjob_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBConnection_2Process(globalMap);



/**
 * [tPostjob_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_2 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 



/**
 * [tPostjob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_2_SUBPROCESS_STATE", 1);
	}
	


public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_2");
		org.slf4j.MDC.put("_subJobPid", "YbXCUn_" + subJobPidCounter.getAndIncrement());
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_2", false);
		start_Hash.put("tDBConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_2";
	
	
		int tos_count_tDBConnection_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBConnection_2 = new StringBuilder();
                    log4jParamters_tDBConnection_2.append("Parameters:");
                            log4jParamters_tDBConnection_2.append("DB_VERSION" + " = " + "MYSQL_8");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("HOST" + " = " + "\"34.140.193.225\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("PORT" + " = " + "\"3306\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("DBNAME" + " = " + "\"gedms\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("PROPERTIES" + " = " + "\"noDatetimeStringSync=true&enabledTLSProtocols=TLSv1.2,TLSv1.1,TLSv1\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("USER" + " = " + "\"root\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:xTiwczKL95W1rfGNl/Jrnb7f5OhX6U2PAKSJNmgLOqnE98At1QeRVIaAWwQ=").substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("USE_SHARED_CONNECTION" + " = " + "false");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("UNIFIED_COMPONENTS" + " = " + "tMysqlConnection");
                        log4jParamters_tDBConnection_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + (log4jParamters_tDBConnection_2) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_2", "tDBConnection_2", "tMysqlConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
        String properties_tDBConnection_2 = "noDatetimeStringSync=true&enabledTLSProtocols=TLSv1.2,TLSv1.1,TLSv1";
        if (properties_tDBConnection_2 == null || properties_tDBConnection_2.trim().length() == 0) {
            properties_tDBConnection_2 = "rewriteBatchedStatements=true&allowLoadLocalInfile=true";
        }else {
            if (!properties_tDBConnection_2.contains("rewriteBatchedStatements=")) {
                properties_tDBConnection_2 += "&rewriteBatchedStatements=true";
            }

            if (!properties_tDBConnection_2.contains("allowLoadLocalInfile=")) {
                properties_tDBConnection_2 += "&allowLoadLocalInfile=true";
            }
        }

        String url_tDBConnection_2 = "jdbc:mysql://" + "34.140.193.225" + ":" + "3306" + "/" + "gedms" + "?" + properties_tDBConnection_2;
	String dbUser_tDBConnection_2 = "root";
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Fl3F3oIQ/O9r38xoQZFlxEcj+PnRhSD/Ahf9/ONI7F56sisEJh1+pl1WNy4=");
		String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;
	
	
	java.sql.Connection conn_tDBConnection_2 = null;
	
		
			String driverClass_tDBConnection_2 = "com.mysql.cj.jdbc.Driver";
			java.lang.Class jdbcclazz_tDBConnection_2 = java.lang.Class.forName(driverClass_tDBConnection_2);
			globalMap.put("driverClass_tDBConnection_2", driverClass_tDBConnection_2);
		
	    		log.debug("tDBConnection_2 - Driver ClassName: "+driverClass_tDBConnection_2+".");
			
	    		log.debug("tDBConnection_2 - Connection attempt to '" + url_tDBConnection_2 + "' with the username '" + dbUser_tDBConnection_2 + "'.");
			
			conn_tDBConnection_2 = java.sql.DriverManager.getConnection(url_tDBConnection_2,dbUser_tDBConnection_2,dbPwd_tDBConnection_2);
	    		log.debug("tDBConnection_2 - Connection to '" + url_tDBConnection_2 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
	if (null != conn_tDBConnection_2) {
		
			log.debug("tDBConnection_2 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_2.setAutoCommit(false);
	}

	globalMap.put("db_tDBConnection_2","gedms");
 



/**
 * [tDBConnection_2 begin ] stop
 */
	
	/**
	 * [tDBConnection_2 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	

 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	

 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	

 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + ("Done.") );

ok_Hash.put("tDBConnection_2", true);
end_Hash.put("tDBConnection_2", System.currentTimeMillis());




/**
 * [tDBConnection_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBConnection_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tDBInput_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	

 



/**
 * [tDBConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
	}
	


public static class copyOfout1Struct implements routines.system.IPersistableRow<copyOfout1Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];

	
			    public String maxDate;

				public String getMaxDate () {
					return this.maxDate;
				}

				public Boolean maxDateIsNullable(){
				    return true;
				}
				public Boolean maxDateIsKey(){
				    return false;
				}
				public Integer maxDateLength(){
				    return 19;
				}
				public Integer maxDatePrecision(){
				    return 0;
				}
				public String maxDateDefault(){
				
					return null;
				
				}
				public String maxDateComment(){
				
				    return "";
				
				}
				public String maxDatePattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String maxDateOriginalDbColumnName(){
				
					return "maxDate";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
					this.maxDate = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
					this.maxDate = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.maxDate,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.maxDate,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("maxDate="+maxDate);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(maxDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(maxDate);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(copyOfout1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row14Struct implements routines.system.IPersistableRow<row14Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];

	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return true;
				}
				public Integer idLength(){
				    return 10;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return null;
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return false;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return "1";
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String status;

				public String getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return null;
				}
				public Integer statusPrecision(){
				    return null;
				}
				public String statusDefault(){
				
					return null;
				
				}
				public String statusComment(){
				
				    return "";
				
				}
				public String statusPattern(){
				
					return "";
				
				}
				public String statusOriginalDbColumnName(){
				
					return "status";
				
				}

				
			    public String documentTypeId;

				public String getDocumentTypeId () {
					return this.documentTypeId;
				}

				public Boolean documentTypeIdIsNullable(){
				    return true;
				}
				public Boolean documentTypeIdIsKey(){
				    return false;
				}
				public Integer documentTypeIdLength(){
				    return null;
				}
				public Integer documentTypeIdPrecision(){
				    return null;
				}
				public String documentTypeIdDefault(){
				
					return "2";
				
				}
				public String documentTypeIdComment(){
				
				    return "";
				
				}
				public String documentTypeIdPattern(){
				
					return "";
				
				}
				public String documentTypeIdOriginalDbColumnName(){
				
					return "documentTypeId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return null;
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return null;
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",status="+status);
		sb.append(",documentTypeId="+documentTypeId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
            			}
            		
        			sb.append("|");
        		
        				if(documentTypeId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentTypeId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row14Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row13Struct implements routines.system.IPersistableRow<row13Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return true;
				}
				public Integer idLength(){
				    return 10;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return null;
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return false;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return "1";
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String status;

				public String getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return null;
				}
				public Integer statusPrecision(){
				    return null;
				}
				public String statusDefault(){
				
					return null;
				
				}
				public String statusComment(){
				
				    return "";
				
				}
				public String statusPattern(){
				
					return "";
				
				}
				public String statusOriginalDbColumnName(){
				
					return "status";
				
				}

				
			    public String documentTypeId;

				public String getDocumentTypeId () {
					return this.documentTypeId;
				}

				public Boolean documentTypeIdIsNullable(){
				    return true;
				}
				public Boolean documentTypeIdIsKey(){
				    return false;
				}
				public Integer documentTypeIdLength(){
				    return null;
				}
				public Integer documentTypeIdPrecision(){
				    return null;
				}
				public String documentTypeIdDefault(){
				
					return "2";
				
				}
				public String documentTypeIdComment(){
				
				    return "";
				
				}
				public String documentTypeIdPattern(){
				
					return "";
				
				}
				public String documentTypeIdOriginalDbColumnName(){
				
					return "documentTypeId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return null;
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return null;
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row13Struct other = (row13Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row13Struct other) {

		other.id = this.id;
	            other.operationId = this.operationId;
	            other.tailNo = this.tailNo;
	            other.projectId = this.projectId;
	            other.status = this.status;
	            other.documentTypeId = this.documentTypeId;
	            other.departureAirportCode = this.departureAirportCode;
	            other.arrivalAirportCode = this.arrivalAirportCode;
	            other.arrivalDateTime = this.arrivalDateTime;
	            other.departureDateTime = this.departureDateTime;
	            other.fileProcessDate = this.fileProcessDate;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            
	}

	public void copyKeysDataTo(row13Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",status="+status);
		sb.append(",documentTypeId="+documentTypeId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
            			}
            		
        			sb.append("|");
        		
        				if(documentTypeId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentTypeId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row13Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class OnRowsEndStructtAggregateRow_1 implements routines.system.IPersistableRow<OnRowsEndStructtAggregateRow_1> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return true;
				}
				public Integer idLength(){
				    return 10;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return null;
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return false;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return "1";
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String status;

				public String getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return null;
				}
				public Integer statusPrecision(){
				    return null;
				}
				public String statusDefault(){
				
					return null;
				
				}
				public String statusComment(){
				
				    return "";
				
				}
				public String statusPattern(){
				
					return "";
				
				}
				public String statusOriginalDbColumnName(){
				
					return "status";
				
				}

				
			    public String documentTypeId;

				public String getDocumentTypeId () {
					return this.documentTypeId;
				}

				public Boolean documentTypeIdIsNullable(){
				    return true;
				}
				public Boolean documentTypeIdIsKey(){
				    return false;
				}
				public Integer documentTypeIdLength(){
				    return null;
				}
				public Integer documentTypeIdPrecision(){
				    return null;
				}
				public String documentTypeIdDefault(){
				
					return "2";
				
				}
				public String documentTypeIdComment(){
				
				    return "";
				
				}
				public String documentTypeIdPattern(){
				
					return "";
				
				}
				public String documentTypeIdOriginalDbColumnName(){
				
					return "documentTypeId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return null;
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return null;
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final OnRowsEndStructtAggregateRow_1 other = (OnRowsEndStructtAggregateRow_1) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(OnRowsEndStructtAggregateRow_1 other) {

		other.id = this.id;
	            other.operationId = this.operationId;
	            other.tailNo = this.tailNo;
	            other.projectId = this.projectId;
	            other.status = this.status;
	            other.documentTypeId = this.documentTypeId;
	            other.departureAirportCode = this.departureAirportCode;
	            other.arrivalAirportCode = this.arrivalAirportCode;
	            other.arrivalDateTime = this.arrivalDateTime;
	            other.departureDateTime = this.departureDateTime;
	            other.fileProcessDate = this.fileProcessDate;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            
	}

	public void copyKeysDataTo(OnRowsEndStructtAggregateRow_1 other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",status="+status);
		sb.append(",documentTypeId="+documentTypeId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
            			}
            		
        			sb.append("|");
        		
        				if(documentTypeId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentTypeId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtAggregateRow_1 other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row12Struct implements routines.system.IPersistableRow<row12Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return true;
				}
				public Integer idLength(){
				    return 10;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return null;
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return false;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String documentId;

				public String getDocumentId () {
					return this.documentId;
				}

				public Boolean documentIdIsNullable(){
				    return true;
				}
				public Boolean documentIdIsKey(){
				    return false;
				}
				public Integer documentIdLength(){
				    return 45;
				}
				public Integer documentIdPrecision(){
				    return 0;
				}
				public String documentIdDefault(){
				
					return null;
				
				}
				public String documentIdComment(){
				
				    return "";
				
				}
				public String documentIdPattern(){
				
					return "";
				
				}
				public String documentIdOriginalDbColumnName(){
				
					return "documentId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return "1";
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String status;

				public String getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return null;
				}
				public Integer statusPrecision(){
				    return null;
				}
				public String statusDefault(){
				
					return null;
				
				}
				public String statusComment(){
				
				    return "";
				
				}
				public String statusPattern(){
				
					return "";
				
				}
				public String statusOriginalDbColumnName(){
				
					return "status";
				
				}

				
			    public String documentTypeId;

				public String getDocumentTypeId () {
					return this.documentTypeId;
				}

				public Boolean documentTypeIdIsNullable(){
				    return true;
				}
				public Boolean documentTypeIdIsKey(){
				    return false;
				}
				public Integer documentTypeIdLength(){
				    return null;
				}
				public Integer documentTypeIdPrecision(){
				    return null;
				}
				public String documentTypeIdDefault(){
				
					return "2";
				
				}
				public String documentTypeIdComment(){
				
				    return "";
				
				}
				public String documentTypeIdPattern(){
				
					return "";
				
				}
				public String documentTypeIdOriginalDbColumnName(){
				
					return "documentTypeId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return null;
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return null;
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row12Struct other = (row12Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row12Struct other) {

		other.id = this.id;
	            other.operationId = this.operationId;
	            other.documentId = this.documentId;
	            other.tailNo = this.tailNo;
	            other.projectId = this.projectId;
	            other.status = this.status;
	            other.documentTypeId = this.documentTypeId;
	            other.departureAirportCode = this.departureAirportCode;
	            other.arrivalAirportCode = this.arrivalAirportCode;
	            other.arrivalDateTime = this.arrivalDateTime;
	            other.departureDateTime = this.departureDateTime;
	            other.fileProcessDate = this.fileProcessDate;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            
	}

	public void copyKeysDataTo(row12Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",documentId="+documentId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",status="+status);
		sb.append(",documentTypeId="+documentTypeId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(documentId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
            			}
            		
        			sb.append("|");
        		
        				if(documentTypeId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentTypeId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row12Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row11Struct implements routines.system.IPersistableRow<row11Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return true;
				}
				public Integer idLength(){
				    return 10;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return null;
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return false;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String documentId;

				public String getDocumentId () {
					return this.documentId;
				}

				public Boolean documentIdIsNullable(){
				    return true;
				}
				public Boolean documentIdIsKey(){
				    return false;
				}
				public Integer documentIdLength(){
				    return 45;
				}
				public Integer documentIdPrecision(){
				    return 0;
				}
				public String documentIdDefault(){
				
					return null;
				
				}
				public String documentIdComment(){
				
				    return "";
				
				}
				public String documentIdPattern(){
				
					return "";
				
				}
				public String documentIdOriginalDbColumnName(){
				
					return "documentId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return "1";
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String status;

				public String getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return null;
				}
				public Integer statusPrecision(){
				    return null;
				}
				public String statusDefault(){
				
					return null;
				
				}
				public String statusComment(){
				
				    return "";
				
				}
				public String statusPattern(){
				
					return "";
				
				}
				public String statusOriginalDbColumnName(){
				
					return "status";
				
				}

				
			    public String documentTypeId;

				public String getDocumentTypeId () {
					return this.documentTypeId;
				}

				public Boolean documentTypeIdIsNullable(){
				    return true;
				}
				public Boolean documentTypeIdIsKey(){
				    return false;
				}
				public Integer documentTypeIdLength(){
				    return null;
				}
				public Integer documentTypeIdPrecision(){
				    return null;
				}
				public String documentTypeIdDefault(){
				
					return "2";
				
				}
				public String documentTypeIdComment(){
				
				    return "";
				
				}
				public String documentTypeIdPattern(){
				
					return "";
				
				}
				public String documentTypeIdOriginalDbColumnName(){
				
					return "documentTypeId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return null;
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return null;
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row11Struct other = (row11Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row11Struct other) {

		other.id = this.id;
	            other.operationId = this.operationId;
	            other.documentId = this.documentId;
	            other.tailNo = this.tailNo;
	            other.projectId = this.projectId;
	            other.status = this.status;
	            other.documentTypeId = this.documentTypeId;
	            other.departureAirportCode = this.departureAirportCode;
	            other.arrivalAirportCode = this.arrivalAirportCode;
	            other.arrivalDateTime = this.arrivalDateTime;
	            other.departureDateTime = this.departureDateTime;
	            other.fileProcessDate = this.fileProcessDate;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            
	}

	public void copyKeysDataTo(row11Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",documentId="+documentId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",status="+status);
		sb.append(",documentTypeId="+documentTypeId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(documentId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
            			}
            		
        			sb.append("|");
        		
        				if(documentTypeId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentTypeId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row11Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class copyOfcopyOfcopyOfout2Struct implements routines.system.IPersistableRow<copyOfcopyOfcopyOfout2Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return true;
				}
				public Integer idLength(){
				    return 10;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return null;
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return false;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String documentId;

				public String getDocumentId () {
					return this.documentId;
				}

				public Boolean documentIdIsNullable(){
				    return true;
				}
				public Boolean documentIdIsKey(){
				    return false;
				}
				public Integer documentIdLength(){
				    return 45;
				}
				public Integer documentIdPrecision(){
				    return 0;
				}
				public String documentIdDefault(){
				
					return null;
				
				}
				public String documentIdComment(){
				
				    return "";
				
				}
				public String documentIdPattern(){
				
					return "";
				
				}
				public String documentIdOriginalDbColumnName(){
				
					return "documentId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return "1";
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String status;

				public String getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return null;
				}
				public Integer statusPrecision(){
				    return null;
				}
				public String statusDefault(){
				
					return null;
				
				}
				public String statusComment(){
				
				    return "";
				
				}
				public String statusPattern(){
				
					return "";
				
				}
				public String statusOriginalDbColumnName(){
				
					return "status";
				
				}

				
			    public String documentTypeId;

				public String getDocumentTypeId () {
					return this.documentTypeId;
				}

				public Boolean documentTypeIdIsNullable(){
				    return true;
				}
				public Boolean documentTypeIdIsKey(){
				    return false;
				}
				public Integer documentTypeIdLength(){
				    return null;
				}
				public Integer documentTypeIdPrecision(){
				    return null;
				}
				public String documentTypeIdDefault(){
				
					return "2";
				
				}
				public String documentTypeIdComment(){
				
				    return "";
				
				}
				public String documentTypeIdPattern(){
				
					return "";
				
				}
				public String documentTypeIdOriginalDbColumnName(){
				
					return "documentTypeId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return null;
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return null;
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "CURRENT_TIMESTAMP";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final copyOfcopyOfcopyOfout2Struct other = (copyOfcopyOfcopyOfout2Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(copyOfcopyOfcopyOfout2Struct other) {

		other.id = this.id;
	            other.operationId = this.operationId;
	            other.documentId = this.documentId;
	            other.tailNo = this.tailNo;
	            other.projectId = this.projectId;
	            other.status = this.status;
	            other.documentTypeId = this.documentTypeId;
	            other.departureAirportCode = this.departureAirportCode;
	            other.arrivalAirportCode = this.arrivalAirportCode;
	            other.arrivalDateTime = this.arrivalDateTime;
	            other.departureDateTime = this.departureDateTime;
	            other.fileProcessDate = this.fileProcessDate;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            
	}

	public void copyKeysDataTo(copyOfcopyOfcopyOfout2Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.status = readString(dis);
					
					this.documentTypeId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.documentTypeId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",documentId="+documentId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",status="+status);
		sb.append(",documentTypeId="+documentTypeId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(documentId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
            			}
            		
        			sb.append("|");
        		
        				if(documentTypeId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentTypeId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(copyOfcopyOfcopyOfout2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];

	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return false;
				}
				public Integer idLength(){
				    return 11;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return "";
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return true;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String documentId;

				public String getDocumentId () {
					return this.documentId;
				}

				public Boolean documentIdIsNullable(){
				    return true;
				}
				public Boolean documentIdIsKey(){
				    return false;
				}
				public Integer documentIdLength(){
				    return 45;
				}
				public Integer documentIdPrecision(){
				    return 0;
				}
				public String documentIdDefault(){
				
					return null;
				
				}
				public String documentIdComment(){
				
				    return "";
				
				}
				public String documentIdPattern(){
				
					return "";
				
				}
				public String documentIdOriginalDbColumnName(){
				
					return "documentId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return null;
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return "";
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return "";
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",documentId="+documentId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(documentId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row10Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];
    static byte[] commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[0];

	
			    public int id;

				public int getId () {
					return this.id;
				}

				public Boolean idIsNullable(){
				    return false;
				}
				public Boolean idIsKey(){
				    return false;
				}
				public Integer idLength(){
				    return 11;
				}
				public Integer idPrecision(){
				    return 0;
				}
				public String idDefault(){
				
					return "";
				
				}
				public String idComment(){
				
				    return "";
				
				}
				public String idPattern(){
				
					return "";
				
				}
				public String idOriginalDbColumnName(){
				
					return "id";
				
				}

				
			    public String operationId;

				public String getOperationId () {
					return this.operationId;
				}

				public Boolean operationIdIsNullable(){
				    return true;
				}
				public Boolean operationIdIsKey(){
				    return false;
				}
				public Integer operationIdLength(){
				    return 45;
				}
				public Integer operationIdPrecision(){
				    return 0;
				}
				public String operationIdDefault(){
				
					return null;
				
				}
				public String operationIdComment(){
				
				    return "";
				
				}
				public String operationIdPattern(){
				
					return "";
				
				}
				public String operationIdOriginalDbColumnName(){
				
					return "operationId";
				
				}

				
			    public String documentId;

				public String getDocumentId () {
					return this.documentId;
				}

				public Boolean documentIdIsNullable(){
				    return true;
				}
				public Boolean documentIdIsKey(){
				    return false;
				}
				public Integer documentIdLength(){
				    return 45;
				}
				public Integer documentIdPrecision(){
				    return 0;
				}
				public String documentIdDefault(){
				
					return null;
				
				}
				public String documentIdComment(){
				
				    return "";
				
				}
				public String documentIdPattern(){
				
					return "";
				
				}
				public String documentIdOriginalDbColumnName(){
				
					return "documentId";
				
				}

				
			    public String tailNo;

				public String getTailNo () {
					return this.tailNo;
				}

				public Boolean tailNoIsNullable(){
				    return false;
				}
				public Boolean tailNoIsKey(){
				    return false;
				}
				public Integer tailNoLength(){
				    return 45;
				}
				public Integer tailNoPrecision(){
				    return 0;
				}
				public String tailNoDefault(){
				
					return null;
				
				}
				public String tailNoComment(){
				
				    return "";
				
				}
				public String tailNoPattern(){
				
					return "";
				
				}
				public String tailNoOriginalDbColumnName(){
				
					return "tailNo";
				
				}

				
			    public String projectId;

				public String getProjectId () {
					return this.projectId;
				}

				public Boolean projectIdIsNullable(){
				    return true;
				}
				public Boolean projectIdIsKey(){
				    return false;
				}
				public Integer projectIdLength(){
				    return 45;
				}
				public Integer projectIdPrecision(){
				    return 0;
				}
				public String projectIdDefault(){
				
					return null;
				
				}
				public String projectIdComment(){
				
				    return "";
				
				}
				public String projectIdPattern(){
				
					return "";
				
				}
				public String projectIdOriginalDbColumnName(){
				
					return "projectId";
				
				}

				
			    public String departureAirportCode;

				public String getDepartureAirportCode () {
					return this.departureAirportCode;
				}

				public Boolean departureAirportCodeIsNullable(){
				    return true;
				}
				public Boolean departureAirportCodeIsKey(){
				    return false;
				}
				public Integer departureAirportCodeLength(){
				    return 45;
				}
				public Integer departureAirportCodePrecision(){
				    return 0;
				}
				public String departureAirportCodeDefault(){
				
					return null;
				
				}
				public String departureAirportCodeComment(){
				
				    return "";
				
				}
				public String departureAirportCodePattern(){
				
					return "";
				
				}
				public String departureAirportCodeOriginalDbColumnName(){
				
					return "departureAirportCode";
				
				}

				
			    public String arrivalAirportCode;

				public String getArrivalAirportCode () {
					return this.arrivalAirportCode;
				}

				public Boolean arrivalAirportCodeIsNullable(){
				    return true;
				}
				public Boolean arrivalAirportCodeIsKey(){
				    return false;
				}
				public Integer arrivalAirportCodeLength(){
				    return 45;
				}
				public Integer arrivalAirportCodePrecision(){
				    return 0;
				}
				public String arrivalAirportCodeDefault(){
				
					return null;
				
				}
				public String arrivalAirportCodeComment(){
				
				    return "";
				
				}
				public String arrivalAirportCodePattern(){
				
					return "";
				
				}
				public String arrivalAirportCodeOriginalDbColumnName(){
				
					return "arrivalAirportCode";
				
				}

				
			    public String departureDateTime;

				public String getDepartureDateTime () {
					return this.departureDateTime;
				}

				public Boolean departureDateTimeIsNullable(){
				    return true;
				}
				public Boolean departureDateTimeIsKey(){
				    return false;
				}
				public Integer departureDateTimeLength(){
				    return 100;
				}
				public Integer departureDateTimePrecision(){
				    return 0;
				}
				public String departureDateTimeDefault(){
				
					return "";
				
				}
				public String departureDateTimeComment(){
				
				    return "";
				
				}
				public String departureDateTimePattern(){
				
					return "";
				
				}
				public String departureDateTimeOriginalDbColumnName(){
				
					return "departureDateTime";
				
				}

				
			    public String arrivalDateTime;

				public String getArrivalDateTime () {
					return this.arrivalDateTime;
				}

				public Boolean arrivalDateTimeIsNullable(){
				    return true;
				}
				public Boolean arrivalDateTimeIsKey(){
				    return false;
				}
				public Integer arrivalDateTimeLength(){
				    return 100;
				}
				public Integer arrivalDateTimePrecision(){
				    return 0;
				}
				public String arrivalDateTimeDefault(){
				
					return "";
				
				}
				public String arrivalDateTimeComment(){
				
				    return "";
				
				}
				public String arrivalDateTimePattern(){
				
					return "";
				
				}
				public String arrivalDateTimeOriginalDbColumnName(){
				
					return "arrivalDateTime";
				
				}

				
			    public java.util.Date fileProcessDate;

				public java.util.Date getFileProcessDate () {
					return this.fileProcessDate;
				}

				public Boolean fileProcessDateIsNullable(){
				    return true;
				}
				public Boolean fileProcessDateIsKey(){
				    return false;
				}
				public Integer fileProcessDateLength(){
				    return 19;
				}
				public Integer fileProcessDatePrecision(){
				    return 0;
				}
				public String fileProcessDateDefault(){
				
					return "";
				
				}
				public String fileProcessDateComment(){
				
				    return "";
				
				}
				public String fileProcessDatePattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String fileProcessDateOriginalDbColumnName(){
				
					return "fileProcessDate";
				
				}

				
			    public java.util.Date createdAt;

				public java.util.Date getCreatedAt () {
					return this.createdAt;
				}

				public Boolean createdAtIsNullable(){
				    return true;
				}
				public Boolean createdAtIsKey(){
				    return false;
				}
				public Integer createdAtLength(){
				    return 19;
				}
				public Integer createdAtPrecision(){
				    return 0;
				}
				public String createdAtDefault(){
				
					return "";
				
				}
				public String createdAtComment(){
				
				    return "";
				
				}
				public String createdAtPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String createdAtOriginalDbColumnName(){
				
					return "createdAt";
				
				}

				
			    public java.util.Date updatedAt;

				public java.util.Date getUpdatedAt () {
					return this.updatedAt;
				}

				public Boolean updatedAtIsNullable(){
				    return true;
				}
				public Boolean updatedAtIsKey(){
				    return false;
				}
				public Integer updatedAtLength(){
				    return 19;
				}
				public Integer updatedAtPrecision(){
				    return 0;
				}
				public String updatedAtDefault(){
				
					return "";
				
				}
				public String updatedAtComment(){
				
				    return "";
				
				}
				public String updatedAtPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load.length == 0) {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_gedms_ODWFlightData_Delta_load, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_gedms_ODWFlightData_Delta_load) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationId = readString(dis);
					
					this.documentId = readString(dis);
					
					this.tailNo = readString(dis);
					
					this.projectId = readString(dis);
					
					this.departureAirportCode = readString(dis);
					
					this.arrivalAirportCode = readString(dis);
					
					this.departureDateTime = readString(dis);
					
					this.arrivalDateTime = readString(dis);
					
					this.fileProcessDate = readDate(dis);
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationId,dos);
					
					// String
				
						writeString(this.documentId,dos);
					
					// String
				
						writeString(this.tailNo,dos);
					
					// String
				
						writeString(this.projectId,dos);
					
					// String
				
						writeString(this.departureAirportCode,dos);
					
					// String
				
						writeString(this.arrivalAirportCode,dos);
					
					// String
				
						writeString(this.departureDateTime,dos);
					
					// String
				
						writeString(this.arrivalDateTime,dos);
					
					// java.util.Date
				
						writeDate(this.fileProcessDate,dos);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationId="+operationId);
		sb.append(",documentId="+documentId);
		sb.append(",tailNo="+tailNo);
		sb.append(",projectId="+projectId);
		sb.append(",departureAirportCode="+departureAirportCode);
		sb.append(",arrivalAirportCode="+arrivalAirportCode);
		sb.append(",departureDateTime="+departureDateTime);
		sb.append(",arrivalDateTime="+arrivalDateTime);
		sb.append(",fileProcessDate="+String.valueOf(fileProcessDate));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationId);
            			}
            		
        			sb.append("|");
        		
        				if(documentId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(documentId);
            			}
            		
        			sb.append("|");
        		
        				if(tailNo == null){
        					sb.append("<null>");
        				}else{
            				sb.append(tailNo);
            			}
            		
        			sb.append("|");
        		
        				if(projectId == null){
        					sb.append("<null>");
        				}else{
            				sb.append(projectId);
            			}
            		
        			sb.append("|");
        		
        				if(departureAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalAirportCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalAirportCode);
            			}
            		
        			sb.append("|");
        		
        				if(departureDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(departureDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(arrivalDateTime == null){
        					sb.append("<null>");
        				}else{
            				sb.append(arrivalDateTime);
            			}
            		
        			sb.append("|");
        		
        				if(fileProcessDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(fileProcessDate);
            			}
            		
        			sb.append("|");
        		
        				if(createdAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(createdAt);
            			}
            		
        			sb.append("|");
        		
        				if(updatedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(updatedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row9Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_2");
		org.slf4j.MDC.put("_subJobPid", "BlXVDR_" + subJobPidCounter.getAndIncrement());
	

		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row9Struct row9 = new row9Struct();
row9Struct row10 = row9;
copyOfcopyOfcopyOfout2Struct copyOfcopyOfcopyOfout2 = new copyOfcopyOfcopyOfout2Struct();
row11Struct row11 = new row11Struct();
row11Struct row12 = row11;
row13Struct row13 = new row13Struct();
row13Struct row14 = row13;
copyOfout1Struct copyOfout1 = new copyOfout1Struct();








	
	/**
	 * [tAggregateRow_1_AGGOUT begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGOUT", false);
		start_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row12");
			
		int tos_count_tAggregateRow_1_AGGOUT = 0;
		
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGOUT - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tAggregateRow_1_AGGOUT{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tAggregateRow_1_AGGOUT = new StringBuilder();
                    log4jParamters_tAggregateRow_1_AGGOUT.append("Parameters:");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("DESTINATION" + " = " + "tAggregateRow_1");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("GROUPBYS" + " = " + "[]");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("OPERATIONS" + " = " + "[{OUTPUT_COLUMN="+("createdAt")+", INPUT_COLUMN="+("createdAt")+", IGNORE_NULL="+("true")+", FUNCTION="+("max")+"}, {OUTPUT_COLUMN="+("updatedAt")+", INPUT_COLUMN="+("updatedAt")+", IGNORE_NULL="+("true")+", FUNCTION="+("max")+"}]");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("LIST_DELIMITER" + " = " + "\",\"");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("USE_FINANCIAL_PRECISION" + " = " + "true");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("CHECK_TYPE_OVERFLOW" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("CHECK_ULP" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGOUT - "  + (log4jParamters_tAggregateRow_1_AGGOUT) );
                    } 
                } 
            new BytesLimit65535_tAggregateRow_1_AGGOUT().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tAggregateRow_1_AGGOUT", "tAggregateRow_1_AGGOUT", "tAggregateOut");
				talendJobLogProcess(globalMap);
			}
			

// ------------ Seems it is not used

java.util.Map hashAggreg_tAggregateRow_1 = new java.util.HashMap(); 

// ------------

	class UtilClass_tAggregateRow_1 { // G_OutBegin_AggR_144

		public double sd(Double[] data) {
	        final int n = data.length;
        	if (n < 2) {
	            return Double.NaN;
        	}
        	double d1 = 0d;
        	double d2 =0d;
	        
	        for (int i = 0; i < data.length; i++) {
            	d1 += (data[i]*data[i]);
            	d2 += data[i];
        	}
        
	        return Math.sqrt((n*d1 - d2*d2)/n/(n-1));
	    }
	    
		public void checkedIADD(byte a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		    byte r = (byte) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'short/Short'", "'byte/Byte'"));
		    }
		}
		
		public void checkedIADD(short a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		    short r = (short) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'int/Integer'", "'short/Short'"));
		    }
		}
		
		public void checkedIADD(int a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		    int r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'long/Long'", "'int/Integer'"));
		    }
		}
		
		public void checkedIADD(long a, long b, boolean checkTypeOverFlow, boolean checkUlp) {
		    long r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'long/Long'"));
		    }
		}
		
		public void checkedIADD(float a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    float minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
			    }
			}
			
		    if (checkTypeOverFlow && ((double) a + (double) b > (double) Float.MAX_VALUE) || ((double) a + (double) b < (double) -Float.MAX_VALUE)) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
		    }
		}
		
		public void checkedIADD(double a, double b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		private String buildOverflowMessage(String a, String b, String advicedTypes, String originalType) {
		    return "Type overflow when adding " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}
		
		private String buildPrecisionMessage(String a, String b, String advicedTypes, String originalType) {
		    return "The double precision is unsufficient to add the value " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}

	} // G_OutBegin_AggR_144

	UtilClass_tAggregateRow_1 utilClass_tAggregateRow_1 = new UtilClass_tAggregateRow_1();

	

	class AggOperationStruct_tAggregateRow_1 { // G_OutBegin_AggR_100

		private static final int DEFAULT_HASHCODE = 1;
	    private static final int PRIME = 31;
	    private int hashCode = DEFAULT_HASHCODE;
	    public boolean hashCodeDirty = true;

         			java.util.Date createdAt_max;
         			java.util.Date updatedAt_max;
        
	    @Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;
		
	    		this.hashCode = result;
	    		this.hashCodeDirty = false;		
			}
			return this.hashCode;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			final AggOperationStruct_tAggregateRow_1 other = (AggOperationStruct_tAggregateRow_1) obj;
			
			
			return true;
		}
  
        
	} // G_OutBegin_AggR_100

	AggOperationStruct_tAggregateRow_1 operation_result_tAggregateRow_1 = null;
	AggOperationStruct_tAggregateRow_1 operation_finder_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();
	java.util.Map<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1> hash_tAggregateRow_1 = new java.util.HashMap<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1>();
	

 



/**
 * [tAggregateRow_1_AGGOUT begin ] stop
 */



	
	/**
	 * [tFileOutputDelimited_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_3", false);
		start_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row11");
			
		int tos_count_tFileOutputDelimited_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_3 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_3.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_3.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FILENAME" + " = " + "\"D:/dnt/asl/talend/recordFiles/ODWFlightData/ODWFlightData_\"+TalendDate.formatDate(\"ddMMyyyyhhmm\", TalendDate.getCurrentDate())+\".csv\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("DELETE_EMPTYFILE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FILE_EXIST_EXCEPTION" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_3 - "  + (log4jParamters_tFileOutputDelimited_3) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_3", "tFileOutputDelimited_3", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_3 = "";
    fileName_tFileOutputDelimited_3 = (new java.io.File("D:/dnt/asl/talend/recordFiles/ODWFlightData/ODWFlightData_"+TalendDate.formatDate("ddMMyyyyhhmm", TalendDate.getCurrentDate())+".csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_3 = null;
    String extension_tFileOutputDelimited_3 = null;
    String directory_tFileOutputDelimited_3 = null;
    if((fileName_tFileOutputDelimited_3.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_3.lastIndexOf(".") < fileName_tFileOutputDelimited_3.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
            extension_tFileOutputDelimited_3 = "";
        } else {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0, fileName_tFileOutputDelimited_3.lastIndexOf("."));
            extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(fileName_tFileOutputDelimited_3.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0, fileName_tFileOutputDelimited_3.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_3.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0, fileName_tFileOutputDelimited_3.lastIndexOf("."));
            extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(fileName_tFileOutputDelimited_3.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
            extension_tFileOutputDelimited_3 = "";
        }
        directory_tFileOutputDelimited_3 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_3 = true;
    java.io.File filetFileOutputDelimited_3 = new java.io.File(fileName_tFileOutputDelimited_3);
    globalMap.put("tFileOutputDelimited_3_FILE_NAME",fileName_tFileOutputDelimited_3);
    if(filetFileOutputDelimited_3.exists()){
            throw new RuntimeException("The particular file \""+filetFileOutputDelimited_3.getAbsoluteFile() +
            "\" already exist. If you want to overwrite the file, please uncheck the" + 
            " \"Throw an error if the file already exist\" option in Advanced settings.");
        }
            int nb_line_tFileOutputDelimited_3 = 0;
            int splitedFileNo_tFileOutputDelimited_3 = 0;
            int currentRow_tFileOutputDelimited_3 = 0;

            final String OUT_DELIM_tFileOutputDelimited_3 = /** Start field tFileOutputDelimited_3:FIELDSEPARATOR */","/** End field tFileOutputDelimited_3:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_3 = /** Start field tFileOutputDelimited_3:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_3:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_3 != null && directory_tFileOutputDelimited_3.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_3 = new java.io.File(directory_tFileOutputDelimited_3);
                        if(!dir_tFileOutputDelimited_3.exists()) {
                                log.info("tFileOutputDelimited_3 - Creating directory '" + dir_tFileOutputDelimited_3.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_3.mkdirs();
                                log.info("tFileOutputDelimited_3 - The directory '"+ dir_tFileOutputDelimited_3.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_3 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_3 = new java.io.File(fileName_tFileOutputDelimited_3);
                        if(fileToDelete_tFileOutputDelimited_3.exists()) {
                            fileToDelete_tFileOutputDelimited_3.delete();
                        }
                        outtFileOutputDelimited_3 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_3, false),"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_3", outtFileOutputDelimited_3);
                                    if(filetFileOutputDelimited_3.length()==0){
                                        outtFileOutputDelimited_3.write("id");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("operationId");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("documentId");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("tailNo");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("projectId");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("status");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("documentTypeId");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("departureAirportCode");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("arrivalAirportCode");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("arrivalDateTime");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("departureDateTime");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("fileProcessDate");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("createdAt");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("updatedAt");
                                        outtFileOutputDelimited_3.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.flush();
                                    }


resourceMap.put("nb_line_tFileOutputDelimited_3", nb_line_tFileOutputDelimited_3);
    resourceMap.put("isFileGenerated_tFileOutputDelimited_3", isFileGenerated_tFileOutputDelimited_3);
        resourceMap.put("filetFileOutputDelimited_3", filetFileOutputDelimited_3);

 



/**
 * [tFileOutputDelimited_3 begin ] stop
 */



	
	/**
	 * [tJavaRow_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_4", false);
		start_Hash.put("tJavaRow_4", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"copyOfcopyOfcopyOfout2");
			
		int tos_count_tJavaRow_4 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJavaRow_4", "tJavaRow_4", "tJavaRow");
				talendJobLogProcess(globalMap);
			}
			

int nb_line_tJavaRow_4 = 0;

 



/**
 * [tJavaRow_4 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row10");
			
		int tos_count_tMap_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_3 = new StringBuilder();
                    log4jParamters_tMap_3.append("Parameters:");
                            log4jParamters_tMap_3.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + (log4jParamters_tMap_3) );
                    } 
                } 
            new BytesLimit65535_tMap_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_3", "tMap_3", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row10_tMap_3 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
	String documentTypeId;
	String status;
	java.util.Date fileProcessDate;
	java.util.Date createdAt;
	java.util.Date updatedAt;
	String TailNo;
	String subTailNo;
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_copyOfcopyOfcopyOfout2_tMap_3 = 0;
				
copyOfcopyOfcopyOfout2Struct copyOfcopyOfcopyOfout2_tmp = new copyOfcopyOfcopyOfout2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tLogRow_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_3", false);
		start_Hash.put("tLogRow_3", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
		int tos_count_tLogRow_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogRow_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogRow_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLogRow_3 = new StringBuilder();
                    log4jParamters_tLogRow_3.append("Parameters:");
                            log4jParamters_tLogRow_3.append("BASIC_MODE" + " = " + "true");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("VERTICAL" + " = " + "false");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("PRINT_HEADER" + " = " + "true");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("PRINT_UNIQUE_NAME" + " = " + "false");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("PRINT_COLNAMES" + " = " + "false");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("USE_FIXED_LENGTH" + " = " + "false");
                        log4jParamters_tLogRow_3.append(" | ");
                            log4jParamters_tLogRow_3.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
                        log4jParamters_tLogRow_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLogRow_3 - "  + (log4jParamters_tLogRow_3) );
                    } 
                } 
            new BytesLimit65535_tLogRow_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tLogRow_3", "tLogRow_3", "tLogRow");
				talendJobLogProcess(globalMap);
			}
			

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_tLogRow_3 = "|";
		java.io.PrintStream consoleOut_tLogRow_3 = null;
                    
                    
                StringBuilder sbHeader_tLogRow_3 = new StringBuilder();
				
				sbHeader_tLogRow_3.append("id");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("operationId");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("documentId");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("tailNo");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("projectId");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("departureAirportCode");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("arrivalAirportCode");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("departureDateTime");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("arrivalDateTime");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("fileProcessDate");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("createdAt");
				
    			sbHeader_tLogRow_3.append("\t");
				
				sbHeader_tLogRow_3.append("updatedAt");
				
                   
                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_3 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_3 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_3);
                    }
                    	log.info("tLogRow_3 - Header names: " + sbHeader_tLogRow_3.toString());
                    consoleOut_tLogRow_3.println(sbHeader_tLogRow_3.toString());
                    consoleOut_tLogRow_3.flush();
                    	

 		StringBuilder strBuffer_tLogRow_3 = null;
		int nb_line_tLogRow_3 = 0;
///////////////////////    			



 



/**
 * [tLogRow_3 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";
	
	
			cLabel="\"ODWFlightData\"";
		
		int tos_count_tDBInput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_2 = new StringBuilder();
                    log4jParamters_tDBInput_2.append("Parameters:");
                            log4jParamters_tDBInput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"ODWFlightData\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"SELECT * FROM `ODWFlightData` where date_format(createdAt,'%Y%m%d%H%i%s') > '\" + context.LATEST_DATE + \"'   OR (date_format(updatedAt, '%Y-%m-%d %H:%i:%s') IS NOT NULL AND date_format(updatedAt, '%Y-%m-%d %H:%i:%s') > '\" + context.LATEST_DATE + \"')\";");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("ENABLE_STREAM" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("id")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("operationId")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("documentId")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("tailNo")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("projectId")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("departureAirportCode")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("arrivalAirportCode")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("departureDateTime")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("arrivalDateTime")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("fileProcessDate")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("createdAt")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("updatedAt")+"}]");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("UNIFIED_COMPONENTS" + " = " + "tMysqlInput");
                        log4jParamters_tDBInput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + (log4jParamters_tDBInput_2) );
                    } 
                } 
            new BytesLimit65535_tDBInput_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_2", "\"ODWFlightData\"", "tMysqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
	
		    java.util.Calendar calendar_tDBInput_2 = java.util.Calendar.getInstance();
		    calendar_tDBInput_2.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_2 = calendar_tDBInput_2.getTime();
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				conn_tDBInput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
				if(conn_tDBInput_2 != null) {
					if(conn_tDBInput_2.getMetaData() != null) {
						
							log.debug("tDBInput_2 - Uses an existing connection with username '" + conn_tDBInput_2.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_2.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT * FROM `ODWFlightData` where date_format(createdAt,'%Y%m%d%H%i%s') > '" + context.LATEST_DATE + "' \nOR (date_format(updatedAt, '%Y-%m-%d %H:%i:%s') IS NOT NULL AND date_format(updatedAt, '%Y-%m-%d %H:%i:%s') > '" + context.LATEST_DATE + "')";;
		    
	    		log.debug("tDBInput_2 - Executing the query: '" + dbquery_tDBInput_2 + "'.");
			

		    globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);

		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    	log.debug("tDBInput_2 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row9.id = 0;
							} else {
		                          
            row9.id = rs_tDBInput_2.getInt(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row9.operationId = null;
							} else {
	                         		
        	row9.operationId = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row9.documentId = null;
							} else {
	                         		
        	row9.documentId = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row9.tailNo = null;
							} else {
	                         		
        	row9.tailNo = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row9.projectId = null;
							} else {
	                         		
        	row9.projectId = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row9.departureAirportCode = null;
							} else {
	                         		
        	row9.departureAirportCode = routines.system.JDBCUtil.getString(rs_tDBInput_2, 6, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row9.arrivalAirportCode = null;
							} else {
	                         		
        	row9.arrivalAirportCode = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								row9.departureDateTime = null;
							} else {
	                         		
        	row9.departureDateTime = routines.system.JDBCUtil.getString(rs_tDBInput_2, 8, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								row9.arrivalDateTime = null;
							} else {
	                         		
        	row9.arrivalDateTime = routines.system.JDBCUtil.getString(rs_tDBInput_2, 9, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								row9.fileProcessDate = null;
							} else {
										
				if(rs_tDBInput_2.getString(10) != null) {
					String dateString_tDBInput_2 = rs_tDBInput_2.getString(10);
					if (!("0000-00-00").equals(dateString_tDBInput_2) && !("0000-00-00 00:00:00").equals(dateString_tDBInput_2)) {
						row9.fileProcessDate = rs_tDBInput_2.getTimestamp(10);
					} else {
						row9.fileProcessDate = (java.util.Date) year0_tDBInput_2.clone();
					}
				} else {
					row9.fileProcessDate =  null;
				}
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								row9.createdAt = null;
							} else {
										
				if(rs_tDBInput_2.getString(11) != null) {
					String dateString_tDBInput_2 = rs_tDBInput_2.getString(11);
					if (!("0000-00-00").equals(dateString_tDBInput_2) && !("0000-00-00 00:00:00").equals(dateString_tDBInput_2)) {
						row9.createdAt = rs_tDBInput_2.getTimestamp(11);
					} else {
						row9.createdAt = (java.util.Date) year0_tDBInput_2.clone();
					}
				} else {
					row9.createdAt =  null;
				}
		                    }
							if(colQtyInRs_tDBInput_2 < 12) {
								row9.updatedAt = null;
							} else {
										
				if(rs_tDBInput_2.getString(12) != null) {
					String dateString_tDBInput_2 = rs_tDBInput_2.getString(12);
					if (!("0000-00-00").equals(dateString_tDBInput_2) && !("0000-00-00 00:00:00").equals(dateString_tDBInput_2)) {
						row9.updatedAt = rs_tDBInput_2.getTimestamp(12);
					} else {
						row9.updatedAt = (java.util.Date) year0_tDBInput_2.clone();
					}
				} else {
					row9.updatedAt =  null;
				}
		                    }
					
						log.debug("tDBInput_2 - Retrieving the record " + nb_line_tDBInput_2 + ".");
					

 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	
			cLabel="\"ODWFlightData\"";
		

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	
			cLabel="\"ODWFlightData\"";
		

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tLogRow_3 main ] start
	 */

	

	
	
	currentComponent="tLogRow_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row9","tDBInput_2","\"ODWFlightData\"","tMysqlInput","tLogRow_3","tLogRow_3","tLogRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_3 = new StringBuilder();




              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.id)							
				);


							  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.operationId != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.operationId)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.documentId != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.documentId)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.tailNo != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.tailNo)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.projectId != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.projectId)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.departureAirportCode != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.departureAirportCode)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.arrivalAirportCode != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.arrivalAirportCode)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.departureDateTime != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.departureDateTime)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.arrivalDateTime != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
				                String.valueOf(row9.arrivalDateTime)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.fileProcessDate != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
								FormatterUtils.format_Date(row9.fileProcessDate, "dd-MM-yyyy")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.createdAt != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
								FormatterUtils.format_Date(row9.createdAt, "dd-MM-yyyy")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_3.append("|");
    			


   				
	    		if(row9.updatedAt != null) { //              
                    							
       
				strBuffer_tLogRow_3.append(
								FormatterUtils.format_Date(row9.updatedAt, "dd-MM-yyyy")				
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_3 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_3 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_3);
                    }
                    	log.info("tLogRow_3 - Content of row "+(nb_line_tLogRow_3+1)+": " + strBuffer_tLogRow_3.toString());
                    consoleOut_tLogRow_3.println(strBuffer_tLogRow_3.toString());
                    consoleOut_tLogRow_3.flush();
                    nb_line_tLogRow_3++;
//////

//////                    
                    
///////////////////////    			

 
     row10 = row9;


	tos_count_tLogRow_3++;

/**
 * [tLogRow_3 main ] stop
 */
	
	/**
	 * [tLogRow_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_3";
	
	

 



/**
 * [tLogRow_3 process_data_begin ] stop
 */

	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row10","tLogRow_3","tLogRow_3","tLogRow","tMap_3","tMap_3","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row10 - " + (row10==null? "": row10.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_3 = false;
		boolean mainRowRejected_tMap_3 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;
Var.documentTypeId = "2";
Var.status = "QUEUE_SUCCESS" ;
Var.fileProcessDate = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss",row10.fileProcessDate+"") ;
Var.createdAt = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss",row10.createdAt+"") ;
Var.updatedAt = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss",row10.updatedAt+"") ;
Var.TailNo = row10.tailNo == "" || row10.tailNo == null ? "NA" : row10.tailNo ;
Var.subTailNo = DemoRoutine.removeDashFromString(StringHandling.LEFT(Var.TailNo,5)) ;// ###############################
        // ###############################
        // # Output tables

copyOfcopyOfcopyOfout2 = null;


// # Output table : 'copyOfcopyOfcopyOfout2'
count_copyOfcopyOfcopyOfout2_tMap_3++;

copyOfcopyOfcopyOfout2_tmp.id = row10.id ;
copyOfcopyOfcopyOfout2_tmp.operationId = row10.operationId ;
copyOfcopyOfcopyOfout2_tmp.documentId = row10.documentId ;
copyOfcopyOfcopyOfout2_tmp.tailNo = Var.subTailNo;
copyOfcopyOfcopyOfout2_tmp.projectId = row10.projectId ;
copyOfcopyOfcopyOfout2_tmp.status = Var.status ;
copyOfcopyOfcopyOfout2_tmp.documentTypeId = Var.documentTypeId ;
copyOfcopyOfcopyOfout2_tmp.departureAirportCode = row10.departureAirportCode ;
copyOfcopyOfcopyOfout2_tmp.arrivalAirportCode = row10.arrivalAirportCode ;
copyOfcopyOfcopyOfout2_tmp.arrivalDateTime = row10.arrivalDateTime ;
copyOfcopyOfcopyOfout2_tmp.departureDateTime = row10.departureDateTime ;
copyOfcopyOfcopyOfout2_tmp.fileProcessDate =  Var.fileProcessDate ;
copyOfcopyOfcopyOfout2_tmp.createdAt = Var.createdAt ;
copyOfcopyOfcopyOfout2_tmp.updatedAt = Var.updatedAt ;
copyOfcopyOfcopyOfout2 = copyOfcopyOfcopyOfout2_tmp;
log.debug("tMap_3 - Outputting the record " + count_copyOfcopyOfcopyOfout2_tMap_3 + " of the output table 'copyOfcopyOfcopyOfout2'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "copyOfcopyOfcopyOfout2"
if(copyOfcopyOfcopyOfout2 != null) { 



	
	/**
	 * [tJavaRow_4 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"copyOfcopyOfcopyOfout2","tMap_3","tMap_3","tMap","tJavaRow_4","tJavaRow_4","tJavaRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("copyOfcopyOfcopyOfout2 - " + (copyOfcopyOfcopyOfout2==null? "": copyOfcopyOfcopyOfout2.toLogString()));
    			}
    		

    //Code generated according to input schema and output schema
row11.id = copyOfcopyOfcopyOfout2.id;
row11.documentId = copyOfcopyOfcopyOfout2.documentId ;
row11.operationId = copyOfcopyOfcopyOfout2.operationId;

row11.tailNo = copyOfcopyOfcopyOfout2.tailNo;

row11.projectId = copyOfcopyOfcopyOfout2.projectId;

row11.status = copyOfcopyOfcopyOfout2.status;

row11.documentTypeId = copyOfcopyOfcopyOfout2.documentTypeId;

row11.departureAirportCode = copyOfcopyOfcopyOfout2.departureAirportCode;

row11.arrivalAirportCode = copyOfcopyOfcopyOfout2.arrivalAirportCode;

row11.fileProcessDate = copyOfcopyOfcopyOfout2.fileProcessDate;
row11.createdAt = copyOfcopyOfcopyOfout2.createdAt;
row11.updatedAt = copyOfcopyOfcopyOfout2.updatedAt;

if(copyOfcopyOfcopyOfout2.arrivalDateTime.length() > 5 && (copyOfcopyOfcopyOfout2.arrivalDateTime != "" || copyOfcopyOfcopyOfout2.arrivalDateTime != null ))
{
    java.util.Date arrivalDateTime1 = TalendDate.parseDate("yyyy-MM-dd'T'HH:mm:ss'Z'", copyOfcopyOfcopyOfout2.arrivalDateTime);

    String arrivalDateTime= TalendDate.formatDate("yyyyMMddHHmmss", arrivalDateTime1);

    row11.arrivalDateTime = arrivalDateTime;
}
else 
{
    row11.arrivalDateTime= copyOfcopyOfcopyOfout2.arrivalDateTime;
}
if(copyOfcopyOfcopyOfout2.departureDateTime.length() > 5 && (copyOfcopyOfcopyOfout2.departureDateTime != "" || copyOfcopyOfcopyOfout2.departureDateTime != null ))
{
    java.util.Date departureDateTime1 = TalendDate.parseDate("yyyy-MM-dd'T'HH:mm:ss'Z'", copyOfcopyOfcopyOfout2.departureDateTime);

    String departureDateTime= TalendDate.formatDate("yyyyMMddHHmmss", departureDateTime1);

    row11.departureDateTime= departureDateTime;
}
else 
{
    row11.departureDateTime= copyOfcopyOfcopyOfout2.departureDateTime;
}
    nb_line_tJavaRow_4++;   

 


	tos_count_tJavaRow_4++;

/**
 * [tJavaRow_4 main ] stop
 */
	
	/**
	 * [tJavaRow_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJavaRow_4";
	
	

 



/**
 * [tJavaRow_4 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_3 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row11","tJavaRow_4","tJavaRow_4","tJavaRow","tFileOutputDelimited_3","tFileOutputDelimited_3","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row11 - " + (row11==null? "": row11.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_3 = new StringBuilder();
                        sb_tFileOutputDelimited_3.append(
                            row11.id
                        );
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.operationId != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.operationId
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.documentId != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.documentId
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.tailNo != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.tailNo
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.projectId != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.projectId
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.status != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.status
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.documentTypeId != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.documentTypeId
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.departureAirportCode != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.departureAirportCode
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.arrivalAirportCode != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.arrivalAirportCode
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.arrivalDateTime != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.arrivalDateTime
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.departureDateTime != null) {
                        sb_tFileOutputDelimited_3.append(
                            row11.departureDateTime
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.fileProcessDate != null) {
                        sb_tFileOutputDelimited_3.append(
                            FormatterUtils.format_Date(row11.fileProcessDate, "yyyyMMddHHmmss")
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.createdAt != null) {
                        sb_tFileOutputDelimited_3.append(
                            FormatterUtils.format_Date(row11.createdAt, "yyyyMMddHHmmss")
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row11.updatedAt != null) {
                        sb_tFileOutputDelimited_3.append(
                            FormatterUtils.format_Date(row11.updatedAt, "yyyyMMddHHmmss")
                        );
                            }
                    sb_tFileOutputDelimited_3.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);


                    nb_line_tFileOutputDelimited_3++;
                    resourceMap.put("nb_line_tFileOutputDelimited_3", nb_line_tFileOutputDelimited_3);

                        outtFileOutputDelimited_3.write(sb_tFileOutputDelimited_3.toString());
                        log.debug("tFileOutputDelimited_3 - Writing the record " + nb_line_tFileOutputDelimited_3 + ".");




 
     row12 = row11;


	tos_count_tFileOutputDelimited_3++;

/**
 * [tFileOutputDelimited_3 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	

 



/**
 * [tFileOutputDelimited_3 process_data_begin ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row12","tFileOutputDelimited_3","tFileOutputDelimited_3","tFileOutputDelimited","tAggregateRow_1_AGGOUT","tAggregateRow_1_AGGOUT","tAggregateOut"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row12 - " + (row12==null? "": row12.toLogString()));
    			}
    		
	


	operation_finder_tAggregateRow_1.hashCodeDirty = true;
	
	operation_result_tAggregateRow_1 = hash_tAggregateRow_1.get(operation_finder_tAggregateRow_1);

	
		boolean isFirstAdd_tAggregateRow_1 = false;
	

	if(operation_result_tAggregateRow_1 == null) { // G_OutMain_AggR_001

		operation_result_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();

		
		
		
			isFirstAdd_tAggregateRow_1 = true;
		

		hash_tAggregateRow_1.put(operation_result_tAggregateRow_1, operation_result_tAggregateRow_1);
	
	} // G_OutMain_AggR_001


	
				if(row12.createdAt != null) { // G_OutMain_AggR_546
				
					if( 
						
							operation_result_tAggregateRow_1.createdAt_max == null || row12.createdAt.compareTo(operation_result_tAggregateRow_1.createdAt_max) > 0
						
					) {
						operation_result_tAggregateRow_1.createdAt_max = row12.createdAt;
					}
					
				} // G_OutMain_AggR_546
				
				if(row12.updatedAt != null) { // G_OutMain_AggR_546
				
					if( 
						
							operation_result_tAggregateRow_1.updatedAt_max == null || row12.updatedAt.compareTo(operation_result_tAggregateRow_1.updatedAt_max) > 0
						
					) {
						operation_result_tAggregateRow_1.updatedAt_max = row12.updatedAt;
					}
					
				} // G_OutMain_AggR_546
				


 


	tos_count_tAggregateRow_1_AGGOUT++;

/**
 * [tAggregateRow_1_AGGOUT main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_end ] stop
 */



	
	/**
	 * [tFileOutputDelimited_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	

 



/**
 * [tFileOutputDelimited_3 process_data_end ] stop
 */



	
	/**
	 * [tJavaRow_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tJavaRow_4";
	
	

 



/**
 * [tJavaRow_4 process_data_end ] stop
 */

} // End of branch "copyOfcopyOfcopyOfout2"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_end ] stop
 */



	
	/**
	 * [tLogRow_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_3";
	
	

 



/**
 * [tLogRow_3 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	
			cLabel="\"ODWFlightData\"";
		

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	
			cLabel="\"ODWFlightData\"";
		

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
}
globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
	    		log.debug("tDBInput_2 - Retrieved records count: "+nb_line_tDBInput_2 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + ("Done.") );

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tLogRow_3 end ] start
	 */

	

	
	
	currentComponent="tLogRow_3";
	
	


//////
//////
globalMap.put("tLogRow_3_NB_LINE",nb_line_tLogRow_3);
                if(log.isInfoEnabled())
            log.info("tLogRow_3 - "  + ("Printed row count: ")  + (nb_line_tLogRow_3)  + (".") );

///////////////////////    			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
			 			"tDBInput_2","\"ODWFlightData\"","tMysqlInput","tLogRow_3","tLogRow_3","tLogRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tLogRow_3 - "  + ("Done.") );

ok_Hash.put("tLogRow_3", true);
end_Hash.put("tLogRow_3", System.currentTimeMillis());

   			if ((Integer)globalMap.get("tDBInput_2_NB_LINE")==0

) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If2", 0, "true");
					}
				tDie_2Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If2", 0, "false");
					}   	 
   				}



/**
 * [tLogRow_3 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'copyOfcopyOfcopyOfout2': " + count_copyOfcopyOfcopyOfout2_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row10",2,0,
			 			"tLogRow_3","tLogRow_3","tLogRow","tMap_3","tMap_3","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Done.") );

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tJavaRow_4 end ] start
	 */

	

	
	
	currentComponent="tJavaRow_4";
	
	

globalMap.put("tJavaRow_4_NB_LINE",nb_line_tJavaRow_4);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"copyOfcopyOfcopyOfout2",2,0,
			 			"tMap_3","tMap_3","tMap","tJavaRow_4","tJavaRow_4","tJavaRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tJavaRow_4", true);
end_Hash.put("tJavaRow_4", System.currentTimeMillis());




/**
 * [tJavaRow_4 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_3 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	



		
			
					if(outtFileOutputDelimited_3!=null) {
						outtFileOutputDelimited_3.flush();
						outtFileOutputDelimited_3.close();
					}
				
				globalMap.put("tFileOutputDelimited_3_NB_LINE",nb_line_tFileOutputDelimited_3);
				globalMap.put("tFileOutputDelimited_3_FILE_NAME",fileName_tFileOutputDelimited_3);
			
		
		
			if(isFileGenerated_tFileOutputDelimited_3 && nb_line_tFileOutputDelimited_3 == 0){
				
					filetFileOutputDelimited_3.delete();
				
			}		
		
		resourceMap.put("finish_tFileOutputDelimited_3", true);
	
				log.debug("tFileOutputDelimited_3 - Written records count: " + nb_line_tFileOutputDelimited_3 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row11",2,0,
			 			"tJavaRow_4","tJavaRow_4","tJavaRow","tFileOutputDelimited_3","tFileOutputDelimited_3","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_3 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_3", true);
end_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_3 end ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row12",2,0,
			 			"tFileOutputDelimited_3","tFileOutputDelimited_3","tFileOutputDelimited","tAggregateRow_1_AGGOUT","tAggregateRow_1_AGGOUT","tAggregateOut","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGOUT - "  + ("Done.") );

ok_Hash.put("tAggregateRow_1_AGGOUT", true);
end_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());




/**
 * [tAggregateRow_1_AGGOUT end ] stop
 */




	
	/**
	 * [tFileOutputDelimited_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_4", false);
		start_Hash.put("tFileOutputDelimited_4", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"copyOfout1");
			
		int tos_count_tFileOutputDelimited_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_4 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_4.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_4.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("FILENAME" + " = " + "\"D:/dnt/asl/talend/recordDate/ODWFlightData/ODWFlightDataMaxDate.csv\"");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                            log4jParamters_tFileOutputDelimited_4.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_4 - "  + (log4jParamters_tFileOutputDelimited_4) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_4", "tFileOutputDelimited_4", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_4 = "";
    fileName_tFileOutputDelimited_4 = (new java.io.File("D:/dnt/asl/talend/recordDate/ODWFlightData/ODWFlightDataMaxDate.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_4 = null;
    String extension_tFileOutputDelimited_4 = null;
    String directory_tFileOutputDelimited_4 = null;
    if((fileName_tFileOutputDelimited_4.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_4.lastIndexOf(".") < fileName_tFileOutputDelimited_4.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4;
            extension_tFileOutputDelimited_4 = "";
        } else {
            fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4.substring(0, fileName_tFileOutputDelimited_4.lastIndexOf("."));
            extension_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4.substring(fileName_tFileOutputDelimited_4.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4.substring(0, fileName_tFileOutputDelimited_4.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_4.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4.substring(0, fileName_tFileOutputDelimited_4.lastIndexOf("."));
            extension_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4.substring(fileName_tFileOutputDelimited_4.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4;
            extension_tFileOutputDelimited_4 = "";
        }
        directory_tFileOutputDelimited_4 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_4 = true;
    java.io.File filetFileOutputDelimited_4 = new java.io.File(fileName_tFileOutputDelimited_4);
    globalMap.put("tFileOutputDelimited_4_FILE_NAME",fileName_tFileOutputDelimited_4);
            int nb_line_tFileOutputDelimited_4 = 0;
            int splitedFileNo_tFileOutputDelimited_4 = 0;
            int currentRow_tFileOutputDelimited_4 = 0;

            final String OUT_DELIM_tFileOutputDelimited_4 = /** Start field tFileOutputDelimited_4:FIELDSEPARATOR */","/** End field tFileOutputDelimited_4:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_4 = /** Start field tFileOutputDelimited_4:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_4:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_4 != null && directory_tFileOutputDelimited_4.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_4 = new java.io.File(directory_tFileOutputDelimited_4);
                        if(!dir_tFileOutputDelimited_4.exists()) {
                                log.info("tFileOutputDelimited_4 - Creating directory '" + dir_tFileOutputDelimited_4.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_4.mkdirs();
                                log.info("tFileOutputDelimited_4 - The directory '"+ dir_tFileOutputDelimited_4.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_4 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_4 = new java.io.File(fileName_tFileOutputDelimited_4);
                        if(fileToDelete_tFileOutputDelimited_4.exists()) {
                            fileToDelete_tFileOutputDelimited_4.delete();
                        }
                        outtFileOutputDelimited_4 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_4, false),"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_4", outtFileOutputDelimited_4);
                                    if(filetFileOutputDelimited_4.length()==0){
                                        outtFileOutputDelimited_4.write("maxDate");
                                        outtFileOutputDelimited_4.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_4);
                                        outtFileOutputDelimited_4.flush();
                                    }


resourceMap.put("nb_line_tFileOutputDelimited_4", nb_line_tFileOutputDelimited_4);

 



/**
 * [tFileOutputDelimited_4 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row14");
			
		int tos_count_tMap_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_4 = new StringBuilder();
                    log4jParamters_tMap_4.append("Parameters:");
                            log4jParamters_tMap_4.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + (log4jParamters_tMap_4) );
                    } 
                } 
            new BytesLimit65535_tMap_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_4", "tMap_4", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row14_tMap_4 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_copyOfout1_tMap_4 = 0;
				
copyOfout1Struct copyOfout1_tmp = new copyOfout1Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tLogRow_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_4", false);
		start_Hash.put("tLogRow_4", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row13");
			
		int tos_count_tLogRow_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogRow_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogRow_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLogRow_4 = new StringBuilder();
                    log4jParamters_tLogRow_4.append("Parameters:");
                            log4jParamters_tLogRow_4.append("BASIC_MODE" + " = " + "true");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("VERTICAL" + " = " + "false");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("PRINT_HEADER" + " = " + "true");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("PRINT_UNIQUE_NAME" + " = " + "false");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("PRINT_COLNAMES" + " = " + "false");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("USE_FIXED_LENGTH" + " = " + "false");
                        log4jParamters_tLogRow_4.append(" | ");
                            log4jParamters_tLogRow_4.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
                        log4jParamters_tLogRow_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLogRow_4 - "  + (log4jParamters_tLogRow_4) );
                    } 
                } 
            new BytesLimit65535_tLogRow_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tLogRow_4", "tLogRow_4", "tLogRow");
				talendJobLogProcess(globalMap);
			}
			

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_tLogRow_4 = "|";
		java.io.PrintStream consoleOut_tLogRow_4 = null;
                    
                    
                StringBuilder sbHeader_tLogRow_4 = new StringBuilder();
				
				sbHeader_tLogRow_4.append("id");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("operationId");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("tailNo");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("projectId");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("status");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("documentTypeId");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("departureAirportCode");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("arrivalAirportCode");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("arrivalDateTime");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("departureDateTime");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("fileProcessDate");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("createdAt");
				
    			sbHeader_tLogRow_4.append("\t");
				
				sbHeader_tLogRow_4.append("updatedAt");
				
                   
                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_4 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_4 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_4);
                    }
                    	log.info("tLogRow_4 - Header names: " + sbHeader_tLogRow_4.toString());
                    consoleOut_tLogRow_4.println(sbHeader_tLogRow_4.toString());
                    consoleOut_tLogRow_4.flush();
                    	

 		StringBuilder strBuffer_tLogRow_4 = null;
		int nb_line_tLogRow_4 = 0;
///////////////////////    			



 



/**
 * [tLogRow_4 begin ] stop
 */



	
	/**
	 * [tAggregateRow_1_AGGIN begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGIN", false);
		start_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	
		int tos_count_tAggregateRow_1_AGGIN = 0;
		
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tAggregateRow_1_AGGIN{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tAggregateRow_1_AGGIN = new StringBuilder();
                    log4jParamters_tAggregateRow_1_AGGIN.append("Parameters:");
                            log4jParamters_tAggregateRow_1_AGGIN.append("ORIGIN" + " = " + "tAggregateRow_1");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("GROUPBYS" + " = " + "[]");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("OPERATIONS" + " = " + "[{OUTPUT_COLUMN="+("createdAt")+", INPUT_COLUMN="+("createdAt")+", IGNORE_NULL="+("true")+", FUNCTION="+("max")+"}, {OUTPUT_COLUMN="+("updatedAt")+", INPUT_COLUMN="+("updatedAt")+", IGNORE_NULL="+("true")+", FUNCTION="+("max")+"}]");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("LIST_DELIMITER" + " = " + "\",\"");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("USE_FINANCIAL_PRECISION" + " = " + "true");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("CHECK_TYPE_OVERFLOW" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("CHECK_ULP" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + (log4jParamters_tAggregateRow_1_AGGIN) );
                    } 
                } 
            new BytesLimit65535_tAggregateRow_1_AGGIN().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tAggregateRow_1_AGGIN", "tAggregateRow_1_AGGIN", "tAggregateIn");
				talendJobLogProcess(globalMap);
			}
			

java.util.Collection<AggOperationStruct_tAggregateRow_1> values_tAggregateRow_1 = hash_tAggregateRow_1.values();

globalMap.put("tAggregateRow_1_NB_LINE", values_tAggregateRow_1.size());

                if(log.isInfoEnabled())
            log.info("tAggregateRow_1_AGGIN - "  + ("Retrieving the aggregation results.") );
for(AggOperationStruct_tAggregateRow_1 aggregated_row_tAggregateRow_1 : values_tAggregateRow_1) { // G_AggR_600



 



/**
 * [tAggregateRow_1_AGGIN begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

                                row13.createdAt = aggregated_row_tAggregateRow_1.createdAt_max;
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Operation function: 'max' on the column 'createdAt'.") );
                                row13.updatedAt = aggregated_row_tAggregateRow_1.updatedAt_max;
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Operation function: 'max' on the column 'updatedAt'.") );

 


	tos_count_tAggregateRow_1_AGGIN++;

/**
 * [tAggregateRow_1_AGGIN main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

 



/**
 * [tAggregateRow_1_AGGIN process_data_begin ] stop
 */

	
	/**
	 * [tLogRow_4 main ] start
	 */

	

	
	
	currentComponent="tLogRow_4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row13","tAggregateRow_1_AGGIN","tAggregateRow_1_AGGIN","tAggregateIn","tLogRow_4","tLogRow_4","tLogRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row13 - " + (row13==null? "": row13.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_4 = new StringBuilder();




              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.id)							
				);


							  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.operationId != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.operationId)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.tailNo != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.tailNo)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.projectId != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.projectId)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.status != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.status)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.documentTypeId != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.documentTypeId)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.departureAirportCode != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.departureAirportCode)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.arrivalAirportCode != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.arrivalAirportCode)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.arrivalDateTime != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.arrivalDateTime)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.departureDateTime != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
				                String.valueOf(row13.departureDateTime)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.fileProcessDate != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
								FormatterUtils.format_Date(row13.fileProcessDate, "yyyyMMddHHmmss")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.createdAt != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
								FormatterUtils.format_Date(row13.createdAt, "yyyyMMddHHmmss")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_4.append("|");
    			


   				
	    		if(row13.updatedAt != null) { //              
                    							
       
				strBuffer_tLogRow_4.append(
								FormatterUtils.format_Date(row13.updatedAt, "yyyyMMddHHmmss")				
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_4 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_4 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_4);
                    }
                    	log.info("tLogRow_4 - Content of row "+(nb_line_tLogRow_4+1)+": " + strBuffer_tLogRow_4.toString());
                    consoleOut_tLogRow_4.println(strBuffer_tLogRow_4.toString());
                    consoleOut_tLogRow_4.flush();
                    nb_line_tLogRow_4++;
//////

//////                    
                    
///////////////////////    			

 
     row14 = row13;


	tos_count_tLogRow_4++;

/**
 * [tLogRow_4 main ] stop
 */
	
	/**
	 * [tLogRow_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_4";
	
	

 



/**
 * [tLogRow_4 process_data_begin ] stop
 */

	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row14","tLogRow_4","tLogRow_4","tLogRow","tMap_4","tMap_4","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row14 - " + (row14==null? "": row14.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_4 = false;
		boolean mainRowRejected_tMap_4 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

copyOfout1 = null;


// # Output table : 'copyOfout1'
count_copyOfout1_tMap_4++;

copyOfout1_tmp.maxDate = DemoRoutine.dateMysqlCompareExample(row14.createdAt, row14.updatedAt) ;
copyOfout1 = copyOfout1_tmp;
log.debug("tMap_4 - Outputting the record " + count_copyOfout1_tMap_4 + " of the output table 'copyOfout1'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "copyOfout1"
if(copyOfout1 != null) { 



	
	/**
	 * [tFileOutputDelimited_4 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"copyOfout1","tMap_4","tMap_4","tMap","tFileOutputDelimited_4","tFileOutputDelimited_4","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("copyOfout1 - " + (copyOfout1==null? "": copyOfout1.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_4 = new StringBuilder();
                            if(copyOfout1.maxDate != null) {
                        sb_tFileOutputDelimited_4.append(
                            copyOfout1.maxDate
                        );
                            }
                    sb_tFileOutputDelimited_4.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_4);


                    nb_line_tFileOutputDelimited_4++;
                    resourceMap.put("nb_line_tFileOutputDelimited_4", nb_line_tFileOutputDelimited_4);

                        outtFileOutputDelimited_4.write(sb_tFileOutputDelimited_4.toString());
                        log.debug("tFileOutputDelimited_4 - Writing the record " + nb_line_tFileOutputDelimited_4 + ".");




 


	tos_count_tFileOutputDelimited_4++;

/**
 * [tFileOutputDelimited_4 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_4";
	
	

 



/**
 * [tFileOutputDelimited_4 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_4";
	
	

 



/**
 * [tFileOutputDelimited_4 process_data_end ] stop
 */

} // End of branch "copyOfout1"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 process_data_end ] stop
 */



	
	/**
	 * [tLogRow_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_4";
	
	

 



/**
 * [tLogRow_4 process_data_end ] stop
 */



	
	/**
	 * [tAggregateRow_1_AGGIN process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

 



/**
 * [tAggregateRow_1_AGGIN process_data_end ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

} // G_AggR_600

 
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Done.") );

ok_Hash.put("tAggregateRow_1_AGGIN", true);
end_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());




/**
 * [tAggregateRow_1_AGGIN end ] stop
 */

	
	/**
	 * [tLogRow_4 end ] start
	 */

	

	
	
	currentComponent="tLogRow_4";
	
	


//////
//////
globalMap.put("tLogRow_4_NB_LINE",nb_line_tLogRow_4);
                if(log.isInfoEnabled())
            log.info("tLogRow_4 - "  + ("Printed row count: ")  + (nb_line_tLogRow_4)  + (".") );

///////////////////////    			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row13",2,0,
			 			"tAggregateRow_1_AGGIN","tAggregateRow_1_AGGIN","tAggregateIn","tLogRow_4","tLogRow_4","tLogRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tLogRow_4 - "  + ("Done.") );

ok_Hash.put("tLogRow_4", true);
end_Hash.put("tLogRow_4", System.currentTimeMillis());




/**
 * [tLogRow_4 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'copyOfout1': " + count_copyOfout1_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row14",2,0,
			 			"tLogRow_4","tLogRow_4","tLogRow","tMap_4","tMap_4","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Done.") );

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_4 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_4";
	
	



		
			
					if(outtFileOutputDelimited_4!=null) {
						outtFileOutputDelimited_4.flush();
						outtFileOutputDelimited_4.close();
					}
				
				globalMap.put("tFileOutputDelimited_4_NB_LINE",nb_line_tFileOutputDelimited_4);
				globalMap.put("tFileOutputDelimited_4_FILE_NAME",fileName_tFileOutputDelimited_4);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_4", true);
	
				log.debug("tFileOutputDelimited_4 - Written records count: " + nb_line_tFileOutputDelimited_4 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"copyOfout1",2,0,
			 			"tMap_4","tMap_4","tMap","tFileOutputDelimited_4","tFileOutputDelimited_4","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_4 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_4", true);
end_Hash.put("tFileOutputDelimited_4", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_4 end ] stop
 */



























				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
							//free memory for "tAggregateRow_1_AGGIN"
							globalMap.remove("tAggregateRow_1");
						
				try{
					
	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	
			cLabel="\"ODWFlightData\"";
		

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tLogRow_3 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_3";
	
	

 



/**
 * [tLogRow_3 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tJavaRow_4 finally ] start
	 */

	

	
	
	currentComponent="tJavaRow_4";
	
	

 



/**
 * [tJavaRow_4 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_3 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_3") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_3 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_3");
						if(outtFileOutputDelimited_3!=null) {
							outtFileOutputDelimited_3.flush();
							outtFileOutputDelimited_3.close();
						}
					
				
			
				if(Boolean.valueOf(String.valueOf(resourceMap.get("isFileGenerated_tFileOutputDelimited_3"))) && Integer.valueOf(String.valueOf(resourceMap.get("nb_line_tFileOutputDelimited_3"))) == 0){
					
						((java.io.File)resourceMap.get("filetFileOutputDelimited_3")).delete();
					
				}		
			
		}
	

 



/**
 * [tFileOutputDelimited_3 finally ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

 



/**
 * [tAggregateRow_1_AGGOUT finally ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGIN finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

 



/**
 * [tAggregateRow_1_AGGIN finally ] stop
 */

	
	/**
	 * [tLogRow_4 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_4";
	
	

 



/**
 * [tLogRow_4 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_4 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_4";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_4") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_4 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_4");
						if(outtFileOutputDelimited_4!=null) {
							outtFileOutputDelimited_4.flush();
							outtFileOutputDelimited_4.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_4 finally ] stop
 */



























				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public void tDie_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDie_2");
		org.slf4j.MDC.put("_subJobPid", "5P9QZK_" + subJobPidCounter.getAndIncrement());
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_2", false);
		start_Hash.put("tDie_2", System.currentTimeMillis());
		
	
	currentComponent="tDie_2";
	
	
		int tos_count_tDie_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_2 = new StringBuilder();
                    log4jParamters_tDie_2.append("Parameters:");
                            log4jParamters_tDie_2.append("MESSAGE" + " = " + "\"we didn't got any row from input\"");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("CODE" + " = " + "502");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_tDie_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + (log4jParamters_tDie_2) );
                    } 
                } 
            new BytesLimit65535_tDie_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_2", "tDie_2", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_2 begin ] stop
 */
	
	/**
	 * [tDie_2 main ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

	try {
	globalMap.put("tDie_2_DIE_PRIORITY", 5);
	System.err.println("we didn't got any row from input");
	
		log.error("tDie_2 - The die message: "+"we didn't got any row from input");
	
	globalMap.put("tDie_2_DIE_MESSAGE", "we didn't got any row from input");
	globalMap.put("tDie_2_DIE_MESSAGES", "we didn't got any row from input");
	
	} catch (Exception | Error e_tDie_2) {
	    globalMap.put("tDie_2_ERROR_MESSAGE",e_tDie_2.getMessage());
		logIgnoredError(String.format("tDie_2 - tDie failed to log message due to internal error: %s", e_tDie_2), e_tDie_2);
	}
	
	currentComponent = "tDie_2";
	status = "failure";
        errorCode = new Integer(502);
        globalMap.put("tDie_2_DIE_CODE", errorCode);        

    
	if(true){	
		TDieException e_tDie_2 = new TDieException();

		
			if(enableLogStash) {
				talendJobLog.addJobExceptionMessage(currentComponent, cLabel, "we didn't got any row from input", e_tDie_2);
				talendJobLogProcess(globalMap);
			}
		

		throw e_tDie_2;
	}

 


	tos_count_tDie_2++;

/**
 * [tDie_2 main ] stop
 */
	
	/**
	 * [tDie_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 



/**
 * [tDie_2 process_data_begin ] stop
 */
	
	/**
	 * [tDie_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 



/**
 * [tDie_2 process_data_end ] stop
 */
	
	/**
	 * [tDie_2 end ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + ("Done.") );

ok_Hash.put("tDie_2", true);
end_Hash.put("tDie_2", System.currentTimeMillis());




/**
 * [tDie_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_2 finally ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 



/**
 * [tDie_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_2_SUBPROCESS_STATE", 1);
	}
	


public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "talendJobLog");
		org.slf4j.MDC.put("_subJobPid", "OB1nzt_" + subJobPidCounter.getAndIncrement());
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";
	
	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBERROR) {
			java.lang.Exception e_talendJobLog = jcm.exception;
			if(e_talendJobLog!=null) {
				try(java.io.StringWriter sw_talendJobLog = new java.io.StringWriter();java.io.PrintWriter pw_talendJobLog = new java.io.PrintWriter(sw_talendJobLog)) {
					e_talendJobLog.printStackTrace(pw_talendJobLog);
					builder_talendJobLog.custom("stacktrace", sw_talendJobLog.getBuffer().substring(0,java.lang.Math.min(sw_talendJobLog.getBuffer().length(), 512)));
				}
			}

			if(jcm.extra_info!=null) {
				builder_talendJobLog.connectorId(jcm.component_id).custom("extra_info", jcm.extra_info);
			}
				
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_id.substring(0, jcm.component_id.lastIndexOf('_')))
				.connectorId(jcm.component_id)
				.connectorLabel(jcm.component_label == null ? jcm.component_id : jcm.component_label).build();

			auditLogger_talendJobLog.exception(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    
    
    private final static java.util.Properties jobInfo = new java.util.Properties();
    private final static java.util.Map<String,String> mdcInfo = new java.util.HashMap<>();
    private final static java.util.concurrent.atomic.AtomicLong subJobPidCounter = new java.util.concurrent.atomic.AtomicLong();


    public static void main(String[] args){
        final gedms_ODWFlightData_Delta_load gedms_ODWFlightData_Delta_loadClass = new gedms_ODWFlightData_Delta_load();

        int exitCode = gedms_ODWFlightData_Delta_loadClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'gedms_ODWFlightData_Delta_load' - Done.");
	        }

        System.exit(exitCode);
    }
	

	
	
	private void getjobInfo() {
		final String TEMPLATE_PATH = "src/main/templates/jobInfo_template.properties";
		final String BUILD_PATH = "../jobInfo.properties";
		final String path = this.getClass().getResource("").getPath();
		if(path.lastIndexOf("target") > 0) {
			final java.io.File templateFile = new java.io.File(
					path.substring(0, path.lastIndexOf("target")).concat(TEMPLATE_PATH));
			if (templateFile.exists()) {
				readJobInfo(templateFile);
				return;
			}
		}
			readJobInfo(new java.io.File(BUILD_PATH));
	}

    private void readJobInfo(java.io.File jobInfoFile){
	
        if(jobInfoFile.exists()) {
            try (java.io.InputStream is = new java.io.FileInputStream(jobInfoFile)) {
            	jobInfo.load(is);
            } catch (IOException e) {
            	 
                log.debug("Read jobInfo.properties file fail: " + e.getMessage());
                
            }
        }
		log.info(String.format("Project name: %s\tJob name: %s\tGIT Commit ID: %s\tTalend Version: %s",
				projectName,jobName,jobInfo.getProperty("gitCommitId"), "8.0.1.20231017_1026-patch"));
		
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
			}

	        getjobInfo();
			log.info("TalendJob: 'gedms_ODWFlightData_Delta_load' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_jnl7UG2IEe6pYdPIWdzVNQ");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-12-19T05:30:21.244690800Z");

                java.lang.management.RuntimeMXBean mx = java.lang.management.ManagementFactory.getRuntimeMXBean();
                String[] mxNameTable = mx.getName().split("@"); //$NON-NLS-1$
                if (mxNameTable.length == 2) {
                    org.slf4j.MDC.put("_systemPid", mxNameTable[0]);
                } else {
                    org.slf4j.MDC.put("_systemPid", String.valueOf(java.lang.Thread.currentThread().getId()));
                }

		
		
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

            org.slf4j.MDC.put("_pid", pid);

        if (rootPid==null) {
            rootPid = pid;
        }

            org.slf4j.MDC.put("_rootPid", rootPid);

        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }
            org.slf4j.MDC.put("_fatherPid", fatherPid);

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        try {
            java.util.Dictionary<String, Object> jobProperties = null;
            if (inOSGi) {
                jobProperties = routines.system.BundleUtils.getJobProperties(jobName);
    
                if (jobProperties != null && jobProperties.get("context") != null) {
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = gedms_ODWFlightData_Delta_load.class.getClassLoader().getResourceAsStream("test_asl/gedms_odwflightdata_delta_load_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = gedms_ODWFlightData_Delta_load.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
    	                defaultProps.load(inContext);
    	                if (inOSGi && jobProperties != null) {
                             java.util.Enumeration<String> keys = jobProperties.keys();
                             while (keys.hasMoreElements()) {
                                 String propKey = keys.nextElement();
                                 if (defaultProps.containsKey(propKey)) {
                                     defaultProps.put(propKey, (String) jobProperties.get(propKey));
                                 }
                             }
    	                }
    	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }
            
            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("LATEST_DATE", "id_String");
                        if(context.getStringValue("LATEST_DATE") == null) {
                            context.LATEST_DATE = null;
                        } else {
                            context.LATEST_DATE=(String) context.getProperty("LATEST_DATE");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("LATEST_DATE")) {
                context.LATEST_DATE = (String) parentContextMap.get("LATEST_DATE");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'gedms_ODWFlightData_Delta_load' - Started.");
            java.util.Optional.ofNullable(org.slf4j.MDC.getCopyOfContextMap()).ifPresent(mdcInfo::putAll);

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_2) {
globalMap.put("tPrejob_2_SUBPROCESS_STATE", -1);

e_tPrejob_2.printStackTrace();

}



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs


this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_2) {
globalMap.put("tPostjob_2_SUBPROCESS_STATE", -1);

e_tPostjob_2.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : gedms_ODWFlightData_Delta_load");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");
    resumeUtil.flush();


        org.slf4j.MDC.remove("_subJobName");
        org.slf4j.MDC.remove("_subJobPid");
        org.slf4j.MDC.remove("_systemPid");
        log.info("TalendJob: 'gedms_ODWFlightData_Delta_load' - Finished - status: " + status + " returnCode: " + returnCode );

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_2");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--context_file")) {
        	String keyValue = arg.substring(15);
        	String filePath = new String(java.util.Base64.getDecoder().decode(keyValue));
        	java.nio.file.Path contextFile = java.nio.file.Paths.get(filePath);
            try (java.io.BufferedReader reader = java.nio.file.Files.newBufferedReader(contextFile)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    int index = -1;
                    if ( (index = line.indexOf('=')) > -1) {
							if (line.startsWith("--context_param")) {
								if ("id_Password".equals(context_param.getContextType(line.substring(16, index)))) {
									context_param.put(line.substring(16, index), routines.system.PasswordEncryptUtil.decryptPassword(
											line.substring(index + 1)));
								} else {
									context_param.put(line.substring(16, index), line.substring(index + 1));
								}
							}else {//--context_type
								context_param.setContextType(line.substring(15, index), line.substring(index + 1));
							}
                    }
                }
            } catch (java.io.IOException e) {
            	System.err.println("Could not load the context file: " + filePath);
                e.printStackTrace();
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     389942 characters generated by Talend Data Integration 
 *     on the December 19, 2023, 11:00:21 AM IST
 ************************************************************************************************/