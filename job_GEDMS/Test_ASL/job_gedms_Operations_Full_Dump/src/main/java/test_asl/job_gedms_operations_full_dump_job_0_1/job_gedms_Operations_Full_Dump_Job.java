
package test_asl.job_gedms_operations_full_dump_job_0_1;

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
 





@SuppressWarnings("unused")

/**
 * Job: job_gedms_Operations_Full_Dump_Job Purpose: <br>
 * Description:  <br>
 * @author security@company.com
 * @version 8.0.1.20231017_1026-patch
 * @status 
 */
public class job_gedms_Operations_Full_Dump_Job implements TalendJob {
	static {System.setProperty("TalendJob.log", "job_gedms_Operations_Full_Dump_Job.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(job_gedms_Operations_Full_Dump_Job.class);
	

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
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "job_gedms_Operations_Full_Dump_Job";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_gJ2_gFbnEe6MusZcIWCVEA", "0.1");
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
				job_gedms_Operations_Full_Dump_Job.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(job_gedms_Operations_Full_Dump_Job.this, new Object[] { e , currentComponent, globalMap});
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

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAggregateRow_1_AGGOUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tAggregateRow_1_AGGIN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tAggregateRow_1_AGGIN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPrejob_1");
		org.slf4j.MDC.put("_subJobPid", "W6CV13_" + subJobPidCounter.getAndIncrement());
	

	
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
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";
	
	
		int tos_count_tPrejob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBConnection_2Process(globalMap);



/**
 * [tPrejob_1 end ] stop
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
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	


public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_2");
		org.slf4j.MDC.put("_subJobPid", "S693NJ_" + subJobPidCounter.getAndIncrement());
	

	
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
	
	
			cLabel="gedms(prod)";
		
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
                            log4jParamters_tDBConnection_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:ByNEK8P5PiURcYURjIIKi3yCORmSiyOXqVJZyvOXrxiv7OLYaTtIpley/lI=").substring(0, 4) + "...");     
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
				talendJobLog.addCM("tDBConnection_2", "gedms(prod)", "tMysqlConnection");
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
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:/726sckfn7Qml/oSoG36lK7DjcphTXfjJlkI1+aNnOEuseBPNWnlcfRMYvA=");
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
	
	
			cLabel="gedms(prod)";
		

 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="gedms(prod)";
		

 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="gedms(prod)";
		

 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="gedms(prod)";
		

 
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
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tDBInput_1Process(globalMap); 
						



	
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
	
	
			cLabel="gedms(prod)";
		

 



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
	


public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
    static byte[] commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];

	
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
					this.maxDate = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

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
    public int compareTo(row5Struct other) {

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

public static class out1Struct implements routines.system.IPersistableRow<out1Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
    static byte[] commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];

	
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
					this.maxDate = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

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
    public int compareTo(out1Struct other) {

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

public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
    static byte[] commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];

	
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

				
			    public String operationName;

				public String getOperationName () {
					return this.operationName;
				}

				public Boolean operationNameIsNullable(){
				    return false;
				}
				public Boolean operationNameIsKey(){
				    return false;
				}
				public Integer operationNameLength(){
				    return 45;
				}
				public Integer operationNamePrecision(){
				    return 0;
				}
				public String operationNameDefault(){
				
					return null;
				
				}
				public String operationNameComment(){
				
				    return "";
				
				}
				public String operationNamePattern(){
				
					return "";
				
				}
				public String operationNameOriginalDbColumnName(){
				
					return "operationName";
				
				}

				
			    public String operationCode;

				public String getOperationCode () {
					return this.operationCode;
				}

				public Boolean operationCodeIsNullable(){
				    return false;
				}
				public Boolean operationCodeIsKey(){
				    return false;
				}
				public Integer operationCodeLength(){
				    return 45;
				}
				public Integer operationCodePrecision(){
				    return 0;
				}
				public String operationCodeDefault(){
				
					return null;
				
				}
				public String operationCodeComment(){
				
				    return "";
				
				}
				public String operationCodePattern(){
				
					return "";
				
				}
				public String operationCodeOriginalDbColumnName(){
				
					return "operationCode";
				
				}

				
			    public String region;

				public String getRegion () {
					return this.region;
				}

				public Boolean regionIsNullable(){
				    return false;
				}
				public Boolean regionIsKey(){
				    return false;
				}
				public Integer regionLength(){
				    return 45;
				}
				public Integer regionPrecision(){
				    return 0;
				}
				public String regionDefault(){
				
					return null;
				
				}
				public String regionComment(){
				
				    return "";
				
				}
				public String regionPattern(){
				
					return "";
				
				}
				public String regionOriginalDbColumnName(){
				
					return "region";
				
				}

				
			    public Object status;

				public Object getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return 8;
				}
				public Integer statusPrecision(){
				    return 0;
				}
				public String statusDefault(){
				
					return "'ACTIVE'";
				
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

				
			    public java.util.Date deletedAt;

				public java.util.Date getDeletedAt () {
					return this.deletedAt;
				}

				public Boolean deletedAtIsNullable(){
				    return true;
				}
				public Boolean deletedAtIsKey(){
				    return false;
				}
				public Integer deletedAtLength(){
				    return 19;
				}
				public Integer deletedAtPrecision(){
				    return 0;
				}
				public String deletedAtDefault(){
				
					return null;
				
				}
				public String deletedAtComment(){
				
				    return "";
				
				}
				public String deletedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String deletedAtOriginalDbColumnName(){
				
					return "deletedAt";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
       			    	dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
						dos.clearInstanceCache();
						dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationName="+operationName);
		sb.append(",operationCode="+operationCode);
		sb.append(",region="+region);
		sb.append(",status="+String.valueOf(status));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
		sb.append(",deletedAt="+String.valueOf(deletedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationName);
            			}
            		
        			sb.append("|");
        		
        				if(operationCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationCode);
            			}
            		
        			sb.append("|");
        		
        				if(region == null){
        					sb.append("<null>");
        				}else{
            				sb.append(region);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
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
        		
        				if(deletedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(deletedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

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

public static class OnRowsEndStructtAggregateRow_1 implements routines.system.IPersistableRow<OnRowsEndStructtAggregateRow_1> {
    final static byte[] commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
    static byte[] commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
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

				
			    public String operationName;

				public String getOperationName () {
					return this.operationName;
				}

				public Boolean operationNameIsNullable(){
				    return false;
				}
				public Boolean operationNameIsKey(){
				    return false;
				}
				public Integer operationNameLength(){
				    return 45;
				}
				public Integer operationNamePrecision(){
				    return 0;
				}
				public String operationNameDefault(){
				
					return null;
				
				}
				public String operationNameComment(){
				
				    return "";
				
				}
				public String operationNamePattern(){
				
					return "";
				
				}
				public String operationNameOriginalDbColumnName(){
				
					return "operationName";
				
				}

				
			    public String operationCode;

				public String getOperationCode () {
					return this.operationCode;
				}

				public Boolean operationCodeIsNullable(){
				    return false;
				}
				public Boolean operationCodeIsKey(){
				    return false;
				}
				public Integer operationCodeLength(){
				    return 45;
				}
				public Integer operationCodePrecision(){
				    return 0;
				}
				public String operationCodeDefault(){
				
					return null;
				
				}
				public String operationCodeComment(){
				
				    return "";
				
				}
				public String operationCodePattern(){
				
					return "";
				
				}
				public String operationCodeOriginalDbColumnName(){
				
					return "operationCode";
				
				}

				
			    public String region;

				public String getRegion () {
					return this.region;
				}

				public Boolean regionIsNullable(){
				    return false;
				}
				public Boolean regionIsKey(){
				    return false;
				}
				public Integer regionLength(){
				    return 45;
				}
				public Integer regionPrecision(){
				    return 0;
				}
				public String regionDefault(){
				
					return null;
				
				}
				public String regionComment(){
				
				    return "";
				
				}
				public String regionPattern(){
				
					return "";
				
				}
				public String regionOriginalDbColumnName(){
				
					return "region";
				
				}

				
			    public Object status;

				public Object getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return 8;
				}
				public Integer statusPrecision(){
				    return 0;
				}
				public String statusDefault(){
				
					return "'ACTIVE'";
				
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

				
			    public java.util.Date deletedAt;

				public java.util.Date getDeletedAt () {
					return this.deletedAt;
				}

				public Boolean deletedAtIsNullable(){
				    return true;
				}
				public Boolean deletedAtIsKey(){
				    return false;
				}
				public Integer deletedAtLength(){
				    return 19;
				}
				public Integer deletedAtPrecision(){
				    return 0;
				}
				public String deletedAtDefault(){
				
					return null;
				
				}
				public String deletedAtComment(){
				
				    return "";
				
				}
				public String deletedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String deletedAtOriginalDbColumnName(){
				
					return "deletedAt";
				
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
	            other.operationName = this.operationName;
	            other.operationCode = this.operationCode;
	            other.region = this.region;
	            other.status = this.status;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            other.deletedAt = this.deletedAt;
	            
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
       			    	dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
						dos.clearInstanceCache();
						dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationName="+operationName);
		sb.append(",operationCode="+operationCode);
		sb.append(",region="+region);
		sb.append(",status="+String.valueOf(status));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
		sb.append(",deletedAt="+String.valueOf(deletedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationName);
            			}
            		
        			sb.append("|");
        		
        				if(operationCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationCode);
            			}
            		
        			sb.append("|");
        		
        				if(region == null){
        					sb.append("<null>");
        				}else{
            				sb.append(region);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
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
        		
        				if(deletedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(deletedAt);
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

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
    static byte[] commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
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

				
			    public String operationName;

				public String getOperationName () {
					return this.operationName;
				}

				public Boolean operationNameIsNullable(){
				    return false;
				}
				public Boolean operationNameIsKey(){
				    return false;
				}
				public Integer operationNameLength(){
				    return 45;
				}
				public Integer operationNamePrecision(){
				    return 0;
				}
				public String operationNameDefault(){
				
					return null;
				
				}
				public String operationNameComment(){
				
				    return "";
				
				}
				public String operationNamePattern(){
				
					return "";
				
				}
				public String operationNameOriginalDbColumnName(){
				
					return "operationName";
				
				}

				
			    public String operationCode;

				public String getOperationCode () {
					return this.operationCode;
				}

				public Boolean operationCodeIsNullable(){
				    return false;
				}
				public Boolean operationCodeIsKey(){
				    return false;
				}
				public Integer operationCodeLength(){
				    return 45;
				}
				public Integer operationCodePrecision(){
				    return 0;
				}
				public String operationCodeDefault(){
				
					return null;
				
				}
				public String operationCodeComment(){
				
				    return "";
				
				}
				public String operationCodePattern(){
				
					return "";
				
				}
				public String operationCodeOriginalDbColumnName(){
				
					return "operationCode";
				
				}

				
			    public String region;

				public String getRegion () {
					return this.region;
				}

				public Boolean regionIsNullable(){
				    return false;
				}
				public Boolean regionIsKey(){
				    return false;
				}
				public Integer regionLength(){
				    return 45;
				}
				public Integer regionPrecision(){
				    return 0;
				}
				public String regionDefault(){
				
					return null;
				
				}
				public String regionComment(){
				
				    return "";
				
				}
				public String regionPattern(){
				
					return "";
				
				}
				public String regionOriginalDbColumnName(){
				
					return "region";
				
				}

				
			    public Object status;

				public Object getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return 8;
				}
				public Integer statusPrecision(){
				    return 0;
				}
				public String statusDefault(){
				
					return "'ACTIVE'";
				
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

				
			    public java.util.Date deletedAt;

				public java.util.Date getDeletedAt () {
					return this.deletedAt;
				}

				public Boolean deletedAtIsNullable(){
				    return true;
				}
				public Boolean deletedAtIsKey(){
				    return false;
				}
				public Integer deletedAtLength(){
				    return 19;
				}
				public Integer deletedAtPrecision(){
				    return 0;
				}
				public String deletedAtDefault(){
				
					return null;
				
				}
				public String deletedAtComment(){
				
				    return "";
				
				}
				public String deletedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String deletedAtOriginalDbColumnName(){
				
					return "deletedAt";
				
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
		final row3Struct other = (row3Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.id = this.id;
	            other.operationName = this.operationName;
	            other.operationCode = this.operationCode;
	            other.region = this.region;
	            other.status = this.status;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            other.deletedAt = this.deletedAt;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
       			    	dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
						dos.clearInstanceCache();
						dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationName="+operationName);
		sb.append(",operationCode="+operationCode);
		sb.append(",region="+region);
		sb.append(",status="+String.valueOf(status));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
		sb.append(",deletedAt="+String.valueOf(deletedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationName);
            			}
            		
        			sb.append("|");
        		
        				if(operationCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationCode);
            			}
            		
        			sb.append("|");
        		
        				if(region == null){
        					sb.append("<null>");
        				}else{
            				sb.append(region);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
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
        		
        				if(deletedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(deletedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

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

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
    static byte[] commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
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

				
			    public String operationName;

				public String getOperationName () {
					return this.operationName;
				}

				public Boolean operationNameIsNullable(){
				    return false;
				}
				public Boolean operationNameIsKey(){
				    return false;
				}
				public Integer operationNameLength(){
				    return 45;
				}
				public Integer operationNamePrecision(){
				    return 0;
				}
				public String operationNameDefault(){
				
					return null;
				
				}
				public String operationNameComment(){
				
				    return "";
				
				}
				public String operationNamePattern(){
				
					return "";
				
				}
				public String operationNameOriginalDbColumnName(){
				
					return "operationName";
				
				}

				
			    public String operationCode;

				public String getOperationCode () {
					return this.operationCode;
				}

				public Boolean operationCodeIsNullable(){
				    return false;
				}
				public Boolean operationCodeIsKey(){
				    return false;
				}
				public Integer operationCodeLength(){
				    return 45;
				}
				public Integer operationCodePrecision(){
				    return 0;
				}
				public String operationCodeDefault(){
				
					return null;
				
				}
				public String operationCodeComment(){
				
				    return "";
				
				}
				public String operationCodePattern(){
				
					return "";
				
				}
				public String operationCodeOriginalDbColumnName(){
				
					return "operationCode";
				
				}

				
			    public String region;

				public String getRegion () {
					return this.region;
				}

				public Boolean regionIsNullable(){
				    return false;
				}
				public Boolean regionIsKey(){
				    return false;
				}
				public Integer regionLength(){
				    return 45;
				}
				public Integer regionPrecision(){
				    return 0;
				}
				public String regionDefault(){
				
					return null;
				
				}
				public String regionComment(){
				
				    return "";
				
				}
				public String regionPattern(){
				
					return "";
				
				}
				public String regionOriginalDbColumnName(){
				
					return "region";
				
				}

				
			    public Object status;

				public Object getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return 8;
				}
				public Integer statusPrecision(){
				    return 0;
				}
				public String statusDefault(){
				
					return "'ACTIVE'";
				
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

				
			    public java.util.Date deletedAt;

				public java.util.Date getDeletedAt () {
					return this.deletedAt;
				}

				public Boolean deletedAtIsNullable(){
				    return true;
				}
				public Boolean deletedAtIsKey(){
				    return false;
				}
				public Integer deletedAtLength(){
				    return 19;
				}
				public Integer deletedAtPrecision(){
				    return 0;
				}
				public String deletedAtDefault(){
				
					return null;
				
				}
				public String deletedAtComment(){
				
				    return "";
				
				}
				public String deletedAtPattern(){
				
					return "yyyyMMddHHmmss";
				
				}
				public String deletedAtOriginalDbColumnName(){
				
					return "deletedAt";
				
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
		final row2Struct other = (row2Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.id = this.id;
	            other.operationName = this.operationName;
	            other.operationCode = this.operationCode;
	            other.region = this.region;
	            other.status = this.status;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            other.deletedAt = this.deletedAt;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
       			    	dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
						dos.clearInstanceCache();
						dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationName="+operationName);
		sb.append(",operationCode="+operationCode);
		sb.append(",region="+region);
		sb.append(",status="+String.valueOf(status));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
		sb.append(",deletedAt="+String.valueOf(deletedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationName);
            			}
            		
        			sb.append("|");
        		
        				if(operationCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationCode);
            			}
            		
        			sb.append("|");
        		
        				if(region == null){
        					sb.append("<null>");
        				}else{
            				sb.append(region);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
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
        		
        				if(deletedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(deletedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

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

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
    static byte[] commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[0];
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

				
			    public String operationName;

				public String getOperationName () {
					return this.operationName;
				}

				public Boolean operationNameIsNullable(){
				    return false;
				}
				public Boolean operationNameIsKey(){
				    return false;
				}
				public Integer operationNameLength(){
				    return 45;
				}
				public Integer operationNamePrecision(){
				    return 0;
				}
				public String operationNameDefault(){
				
					return null;
				
				}
				public String operationNameComment(){
				
				    return "";
				
				}
				public String operationNamePattern(){
				
					return "";
				
				}
				public String operationNameOriginalDbColumnName(){
				
					return "operationName";
				
				}

				
			    public String operationCode;

				public String getOperationCode () {
					return this.operationCode;
				}

				public Boolean operationCodeIsNullable(){
				    return false;
				}
				public Boolean operationCodeIsKey(){
				    return false;
				}
				public Integer operationCodeLength(){
				    return 45;
				}
				public Integer operationCodePrecision(){
				    return 0;
				}
				public String operationCodeDefault(){
				
					return null;
				
				}
				public String operationCodeComment(){
				
				    return "";
				
				}
				public String operationCodePattern(){
				
					return "";
				
				}
				public String operationCodeOriginalDbColumnName(){
				
					return "operationCode";
				
				}

				
			    public String region;

				public String getRegion () {
					return this.region;
				}

				public Boolean regionIsNullable(){
				    return false;
				}
				public Boolean regionIsKey(){
				    return false;
				}
				public Integer regionLength(){
				    return 45;
				}
				public Integer regionPrecision(){
				    return 0;
				}
				public String regionDefault(){
				
					return null;
				
				}
				public String regionComment(){
				
				    return "";
				
				}
				public String regionPattern(){
				
					return "";
				
				}
				public String regionOriginalDbColumnName(){
				
					return "region";
				
				}

				
			    public Object status;

				public Object getStatus () {
					return this.status;
				}

				public Boolean statusIsNullable(){
				    return true;
				}
				public Boolean statusIsKey(){
				    return false;
				}
				public Integer statusLength(){
				    return 8;
				}
				public Integer statusPrecision(){
				    return 0;
				}
				public String statusDefault(){
				
					return "'ACTIVE'";
				
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
				
					return "dd-MM-yyyy hh:mm:ss";
				
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
				
					return "dd-MM-yyyy hh:mm:ss";
				
				}
				public String updatedAtOriginalDbColumnName(){
				
					return "updatedAt";
				
				}

				
			    public java.util.Date deletedAt;

				public java.util.Date getDeletedAt () {
					return this.deletedAt;
				}

				public Boolean deletedAtIsNullable(){
				    return true;
				}
				public Boolean deletedAtIsKey(){
				    return false;
				}
				public Integer deletedAtLength(){
				    return 19;
				}
				public Integer deletedAtPrecision(){
				    return 0;
				}
				public String deletedAtDefault(){
				
					return null;
				
				}
				public String deletedAtComment(){
				
				    return "";
				
				}
				public String deletedAtPattern(){
				
					return "dd-MM-yyyy hh:mm:ss";
				
				}
				public String deletedAtOriginalDbColumnName(){
				
					return "deletedAt";
				
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
		final row1Struct other = (row1Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row1Struct other) {

		other.id = this.id;
	            other.operationName = this.operationName;
	            other.operationCode = this.operationCode;
	            other.region = this.region;
	            other.status = this.status;
	            other.createdAt = this.createdAt;
	            other.updatedAt = this.updatedAt;
	            other.deletedAt = this.deletedAt;
	            
	}

	public void copyKeysDataTo(row1Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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
			if(length > commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length) {
				if(length < 1024 && commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job.length == 0) {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[1024];
				} else {
   					commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length);
			strReturn = new String(commonByteArray_TEST_ASL_job_gedms_Operations_Full_Dump_Job, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_TEST_ASL_job_gedms_Operations_Full_Dump_Job) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.operationName = readString(dis);
					
					this.operationCode = readString(dis);
					
					this.region = readString(dis);
					
						this.status = (Object) dis.readObject();
					
					this.createdAt = readDate(dis);
					
					this.updatedAt = readDate(dis);
					
					this.deletedAt = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
       			    	dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.operationName,dos);
					
					// String
				
						writeString(this.operationCode,dos);
					
					// String
				
						writeString(this.region,dos);
					
					// Object
				
						dos.clearInstanceCache();
						dos.writeObject(this.status);
					
					// java.util.Date
				
						writeDate(this.createdAt,dos);
					
					// java.util.Date
				
						writeDate(this.updatedAt,dos);
					
					// java.util.Date
				
						writeDate(this.deletedAt,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",operationName="+operationName);
		sb.append(",operationCode="+operationCode);
		sb.append(",region="+region);
		sb.append(",status="+String.valueOf(status));
		sb.append(",createdAt="+String.valueOf(createdAt));
		sb.append(",updatedAt="+String.valueOf(updatedAt));
		sb.append(",deletedAt="+String.valueOf(deletedAt));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(id);
        			
        			sb.append("|");
        		
        				if(operationName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationName);
            			}
            		
        			sb.append("|");
        		
        				if(operationCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(operationCode);
            			}
            		
        			sb.append("|");
        		
        				if(region == null){
        					sb.append("<null>");
        				}else{
            				sb.append(region);
            			}
            		
        			sb.append("|");
        		
        				if(status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(status);
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
        		
        				if(deletedAt == null){
        					sb.append("<null>");
        				}else{
            				sb.append(deletedAt);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

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

public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_1");
		org.slf4j.MDC.put("_subJobPid", "IFNvRh_" + subJobPidCounter.getAndIncrement());
	

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



		row1Struct row1 = new row1Struct();
row1Struct row2 = row1;
row1Struct row3 = row1;
row4Struct row4 = new row4Struct();
out1Struct out1 = new out1Struct();
out1Struct row5 = out1;






	
	/**
	 * [tAggregateRow_1_AGGOUT begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGOUT", false);
		start_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row3");
			
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
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
		int tos_count_tFileOutputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_1.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_1.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "\"D:/dnt/asl/talend/recordFiles/operation/operationData.csv\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + (log4jParamters_tFileOutputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_1", "tFileOutputDelimited_1", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_1 = "";
    fileName_tFileOutputDelimited_1 = (new java.io.File("D:/dnt/asl/talend/recordFiles/operation/operationData.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_1 = null;
    String extension_tFileOutputDelimited_1 = null;
    String directory_tFileOutputDelimited_1 = null;
    if((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        }
        directory_tFileOutputDelimited_1 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_1 = true;
    java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
    globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */","/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
                        if(!dir_tFileOutputDelimited_1.exists()) {
                                log.info("tFileOutputDelimited_1 - Creating directory '" + dir_tFileOutputDelimited_1.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_1.mkdirs();
                                log.info("tFileOutputDelimited_1 - The directory '"+ dir_tFileOutputDelimited_1.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_1 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
                        if(fileToDelete_tFileOutputDelimited_1.exists()) {
                            fileToDelete_tFileOutputDelimited_1.delete();
                        }
                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, false),"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
                                    if(filetFileOutputDelimited_1.length()==0){
                                        outtFileOutputDelimited_1.write("id");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("operationName");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("operationCode");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("region");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("status");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("createdAt");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("updatedAt");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("deletedAt");
                                        outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.flush();
                                    }


resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

 



/**
 * [tFileOutputDelimited_1 begin ] stop
 */



	
	/**
	 * [tLogRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_1", false);
		start_Hash.put("tLogRow_1", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
		int tos_count_tLogRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogRow_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLogRow_1 = new StringBuilder();
                    log4jParamters_tLogRow_1.append("Parameters:");
                            log4jParamters_tLogRow_1.append("BASIC_MODE" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_HEADER" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_UNIQUE_NAME" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_COLNAMES" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("USE_FIXED_LENGTH" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + (log4jParamters_tLogRow_1) );
                    } 
                } 
            new BytesLimit65535_tLogRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tLogRow_1", "tLogRow_1", "tLogRow");
				talendJobLogProcess(globalMap);
			}
			

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_tLogRow_1 = "|";
		java.io.PrintStream consoleOut_tLogRow_1 = null;
                    
                    
                StringBuilder sbHeader_tLogRow_1 = new StringBuilder();
				
				sbHeader_tLogRow_1.append("id");
				
    			sbHeader_tLogRow_1.append("\t");
				
				sbHeader_tLogRow_1.append("operationName");
				
    			sbHeader_tLogRow_1.append("\t");
				
				sbHeader_tLogRow_1.append("operationCode");
				
    			sbHeader_tLogRow_1.append("\t");
				
				sbHeader_tLogRow_1.append("region");
				
    			sbHeader_tLogRow_1.append("\t");
				
				sbHeader_tLogRow_1.append("status");
				
    			sbHeader_tLogRow_1.append("\t");
				
				sbHeader_tLogRow_1.append("createdAt");
				
    			sbHeader_tLogRow_1.append("\t");
				
				sbHeader_tLogRow_1.append("updatedAt");
				
    			sbHeader_tLogRow_1.append("\t");
				
				sbHeader_tLogRow_1.append("deletedAt");
				
                   
                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_1);
                    }
                    	log.info("tLogRow_1 - Header names: " + sbHeader_tLogRow_1.toString());
                    consoleOut_tLogRow_1.println(sbHeader_tLogRow_1.toString());
                    consoleOut_tLogRow_1.flush();
                    	

 		StringBuilder strBuffer_tLogRow_1 = null;
		int nb_line_tLogRow_1 = 0;
///////////////////////    			



 



/**
 * [tLogRow_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"Operations\"";
		
		int tos_count_tDBInput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_1 = new StringBuilder();
                    log4jParamters_tDBInput_1.append("Parameters:");
                            log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"Operations\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"SELECT * FROM `Operations`\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("ENABLE_STREAM" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("id")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("operationName")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("operationCode")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("region")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("status")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("createdAt")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("updatedAt")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("deletedAt")+"}]");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tMysqlInput");
                        log4jParamters_tDBInput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + (log4jParamters_tDBInput_1) );
                    } 
                } 
            new BytesLimit65535_tDBInput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_1", "\"Operations\"", "tMysqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
	
		    java.util.Calendar calendar_tDBInput_1 = java.util.Calendar.getInstance();
		    calendar_tDBInput_1.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_1 = calendar_tDBInput_1.getTime();
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
				if(conn_tDBInput_1 != null) {
					if(conn_tDBInput_1.getMetaData() != null) {
						
							log.debug("tDBInput_1 - Uses an existing connection with username '" + conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_1.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT * FROM `Operations`";
		    
	    		log.debug("tDBInput_1 - Executing the query: '" + dbquery_tDBInput_1 + "'.");
			

		    globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);

		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    	log.debug("tDBInput_1 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row1.id = 0;
							} else {
		                          
            row1.id = rs_tDBInput_1.getInt(1);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.operationName = null;
							} else {
	                         		
        	row1.operationName = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.operationCode = null;
							} else {
	                         		
        	row1.operationCode = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.region = null;
							} else {
	                         		
        	row1.region = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.status = null;
							} else {
		                          
            row1.status = rs_tDBInput_1.getObject(5);
            if(rs_tDBInput_1.wasNull()){
                    row1.status = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.createdAt = null;
							} else {
										
				if(rs_tDBInput_1.getString(6) != null) {
					String dateString_tDBInput_1 = rs_tDBInput_1.getString(6);
					if (!("0000-00-00").equals(dateString_tDBInput_1) && !("0000-00-00 00:00:00").equals(dateString_tDBInput_1)) {
						row1.createdAt = rs_tDBInput_1.getTimestamp(6);
					} else {
						row1.createdAt = (java.util.Date) year0_tDBInput_1.clone();
					}
				} else {
					row1.createdAt =  null;
				}
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.updatedAt = null;
							} else {
										
				if(rs_tDBInput_1.getString(7) != null) {
					String dateString_tDBInput_1 = rs_tDBInput_1.getString(7);
					if (!("0000-00-00").equals(dateString_tDBInput_1) && !("0000-00-00 00:00:00").equals(dateString_tDBInput_1)) {
						row1.updatedAt = rs_tDBInput_1.getTimestamp(7);
					} else {
						row1.updatedAt = (java.util.Date) year0_tDBInput_1.clone();
					}
				} else {
					row1.updatedAt =  null;
				}
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.deletedAt = null;
							} else {
										
				if(rs_tDBInput_1.getString(8) != null) {
					String dateString_tDBInput_1 = rs_tDBInput_1.getString(8);
					if (!("0000-00-00").equals(dateString_tDBInput_1) && !("0000-00-00 00:00:00").equals(dateString_tDBInput_1)) {
						row1.deletedAt = rs_tDBInput_1.getTimestamp(8);
					} else {
						row1.deletedAt = (java.util.Date) year0_tDBInput_1.clone();
					}
				} else {
					row1.deletedAt =  null;
				}
		                    }
					
						log.debug("tDBInput_1 - Retrieving the record " + nb_line_tDBInput_1 + ".");
					

 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"Operations\"";
		

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"Operations\"";
		

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tLogRow_1 main ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tDBInput_1","\"Operations\"","tMysqlInput","tLogRow_1","tLogRow_1","tLogRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_1 = new StringBuilder();




              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row1.id)							
				);


							  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row1.operationName != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row1.operationName)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row1.operationCode != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row1.operationCode)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row1.region != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row1.region)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row1.status != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row1.status)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row1.createdAt != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.format_Date(row1.createdAt, "yyyyMMddHHmmss")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row1.updatedAt != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.format_Date(row1.updatedAt, "yyyyMMddHHmmss")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row1.deletedAt != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.format_Date(row1.deletedAt, "yyyyMMddHHmmss")				
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_1);
                    }
                    	log.info("tLogRow_1 - Content of row "+(nb_line_tLogRow_1+1)+": " + strBuffer_tLogRow_1.toString());
                    consoleOut_tLogRow_1.println(strBuffer_tLogRow_1.toString());
                    consoleOut_tLogRow_1.flush();
                    nb_line_tLogRow_1++;
//////

//////                    
                    
///////////////////////    			

 
     row2 = row1;


	tos_count_tLogRow_1++;

/**
 * [tLogRow_1 main ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	

 



/**
 * [tLogRow_1 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tLogRow_1","tLogRow_1","tLogRow","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                        sb_tFileOutputDelimited_1.append(
                            row2.id
                        );
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.operationName != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.operationName
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.operationCode != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.operationCode
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.region != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.region
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.status != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.status
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.createdAt != null) {
                        sb_tFileOutputDelimited_1.append(
                            FormatterUtils.format_Date(row2.createdAt, "yyyyMMddHHmmss")
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.updatedAt != null) {
                        sb_tFileOutputDelimited_1.append(
                            FormatterUtils.format_Date(row2.updatedAt, "yyyyMMddHHmmss")
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.deletedAt != null) {
                        sb_tFileOutputDelimited_1.append(
                            FormatterUtils.format_Date(row2.deletedAt, "yyyyMMddHHmmss")
                        );
                            }
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
                        log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");




 
     row3 = row2;


	tos_count_tFileOutputDelimited_1++;

/**
 * [tFileOutputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	

 



/**
 * [tFileOutputDelimited_1 process_data_begin ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row3","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited","tAggregateRow_1_AGGOUT","tAggregateRow_1_AGGOUT","tAggregateOut"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		
	


	operation_finder_tAggregateRow_1.hashCodeDirty = true;
	
	operation_result_tAggregateRow_1 = hash_tAggregateRow_1.get(operation_finder_tAggregateRow_1);

	
		boolean isFirstAdd_tAggregateRow_1 = false;
	

	if(operation_result_tAggregateRow_1 == null) { // G_OutMain_AggR_001

		operation_result_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();

		
		
		
			isFirstAdd_tAggregateRow_1 = true;
		

		hash_tAggregateRow_1.put(operation_result_tAggregateRow_1, operation_result_tAggregateRow_1);
	
	} // G_OutMain_AggR_001


	
				if(row3.createdAt != null) { // G_OutMain_AggR_546
				
					if( 
						
							operation_result_tAggregateRow_1.createdAt_max == null || row3.createdAt.compareTo(operation_result_tAggregateRow_1.createdAt_max) > 0
						
					) {
						operation_result_tAggregateRow_1.createdAt_max = row3.createdAt;
					}
					
				} // G_OutMain_AggR_546
				
				if(row3.updatedAt != null) { // G_OutMain_AggR_546
				
					if( 
						
							operation_result_tAggregateRow_1.updatedAt_max == null || row3.updatedAt.compareTo(operation_result_tAggregateRow_1.updatedAt_max) > 0
						
					) {
						operation_result_tAggregateRow_1.updatedAt_max = row3.updatedAt;
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
	 * [tFileOutputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	

 



/**
 * [tFileOutputDelimited_1 process_data_end ] stop
 */



	
	/**
	 * [tLogRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	

 



/**
 * [tLogRow_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"Operations\"";
		

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"Operations\"";
		

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
	    		log.debug("tDBInput_1 - Retrieved records count: "+nb_line_tDBInput_1 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Done.") );

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tLogRow_1 end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	


//////
//////
globalMap.put("tLogRow_1_NB_LINE",nb_line_tLogRow_1);
                if(log.isInfoEnabled())
            log.info("tLogRow_1 - "  + ("Printed row count: ")  + (nb_line_tLogRow_1)  + (".") );

///////////////////////    			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_1","\"Operations\"","tMysqlInput","tLogRow_1","tLogRow_1","tLogRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Done.") );

ok_Hash.put("tLogRow_1", true);
end_Hash.put("tLogRow_1", System.currentTimeMillis());




/**
 * [tLogRow_1 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	



		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	
				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tLogRow_1","tLogRow_1","tLogRow","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited","tAggregateRow_1_AGGOUT","tAggregateRow_1_AGGOUT","tAggregateOut","output")) {
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
	 * [tFileOutputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_2", false);
		start_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
		int tos_count_tFileOutputDelimited_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_2 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_2.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_2.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FILENAME" + " = " + "\"D:/dnt/asl/talend/recordDate/operation/operationMaxDate.csv\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + (log4jParamters_tFileOutputDelimited_2) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_2", "tFileOutputDelimited_2", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_2 = "";
    fileName_tFileOutputDelimited_2 = (new java.io.File("D:/dnt/asl/talend/recordDate/operation/operationMaxDate.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_2 = null;
    String extension_tFileOutputDelimited_2 = null;
    String directory_tFileOutputDelimited_2 = null;
    if((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") < fileName_tFileOutputDelimited_2.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        }
        directory_tFileOutputDelimited_2 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_2 = true;
    java.io.File filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
    globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
            int nb_line_tFileOutputDelimited_2 = 0;
            int splitedFileNo_tFileOutputDelimited_2 = 0;
            int currentRow_tFileOutputDelimited_2 = 0;

            final String OUT_DELIM_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:FIELDSEPARATOR */","/** End field tFileOutputDelimited_2:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_2 != null && directory_tFileOutputDelimited_2.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_2 = new java.io.File(directory_tFileOutputDelimited_2);
                        if(!dir_tFileOutputDelimited_2.exists()) {
                                log.info("tFileOutputDelimited_2 - Creating directory '" + dir_tFileOutputDelimited_2.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_2.mkdirs();
                                log.info("tFileOutputDelimited_2 - The directory '"+ dir_tFileOutputDelimited_2.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_2 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
                        if(fileToDelete_tFileOutputDelimited_2.exists()) {
                            fileToDelete_tFileOutputDelimited_2.delete();
                        }
                        outtFileOutputDelimited_2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_2, false),"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_2", outtFileOutputDelimited_2);
                                    if(filetFileOutputDelimited_2.length()==0){
                                        outtFileOutputDelimited_2.write("maxDate");
                                        outtFileOutputDelimited_2.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.flush();
                                    }


resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

 



/**
 * [tFileOutputDelimited_2 begin ] stop
 */



	
	/**
	 * [tLogRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_2", false);
		start_Hash.put("tLogRow_2", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out1");
			
		int tos_count_tLogRow_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogRow_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogRow_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLogRow_2 = new StringBuilder();
                    log4jParamters_tLogRow_2.append("Parameters:");
                            log4jParamters_tLogRow_2.append("BASIC_MODE" + " = " + "true");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("VERTICAL" + " = " + "false");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("PRINT_HEADER" + " = " + "true");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("PRINT_UNIQUE_NAME" + " = " + "false");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("PRINT_COLNAMES" + " = " + "false");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("USE_FIXED_LENGTH" + " = " + "false");
                        log4jParamters_tLogRow_2.append(" | ");
                            log4jParamters_tLogRow_2.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "false");
                        log4jParamters_tLogRow_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLogRow_2 - "  + (log4jParamters_tLogRow_2) );
                    } 
                } 
            new BytesLimit65535_tLogRow_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tLogRow_2", "tLogRow_2", "tLogRow");
				talendJobLogProcess(globalMap);
			}
			

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_tLogRow_2 = ",";
		java.io.PrintStream consoleOut_tLogRow_2 = null;
                    
                    
                StringBuilder sbHeader_tLogRow_2 = new StringBuilder();
				
				sbHeader_tLogRow_2.append("maxDate");
				
                   
                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_2 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_2 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_2);
                    }
                    consoleOut_tLogRow_2.println(sbHeader_tLogRow_2.toString());
                    consoleOut_tLogRow_2.flush();
                    	

 		StringBuilder strBuffer_tLogRow_2 = null;
		int nb_line_tLogRow_2 = 0;
///////////////////////    			



 



/**
 * [tLogRow_2 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row4");
			
		int tos_count_tMap_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_1 = new StringBuilder();
                    log4jParamters_tMap_1.append("Parameters:");
                            log4jParamters_tMap_1.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + (log4jParamters_tMap_1) );
                    } 
                } 
            new BytesLimit65535_tMap_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_1", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row4_tMap_1 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out1_tMap_1 = 0;
				
out1Struct out1_tmp = new out1Struct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
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
	
	

                                row4.createdAt = aggregated_row_tAggregateRow_1.createdAt_max;
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Operation function: 'max' on the column 'createdAt'.") );
                                row4.updatedAt = aggregated_row_tAggregateRow_1.updatedAt_max;
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
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row4","tAggregateRow_1_AGGIN","tAggregateRow_1_AGGIN","tAggregateIn","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_1 = false;
		boolean mainRowRejected_tMap_1 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

out1 = null;


// # Output table : 'out1'
count_out1_tMap_1++;

out1_tmp.maxDate = DemoRoutine.dateMysqlCompareExample(row4.createdAt, row4.updatedAt) ;
out1 = out1_tmp;
log.debug("tMap_1 - Outputting the record " + count_out1_tMap_1 + " of the output table 'out1'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "out1"
if(out1 != null) { 



	
	/**
	 * [tLogRow_2 main ] start
	 */

	

	
	
	currentComponent="tLogRow_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out1","tMap_1","tMap_1","tMap","tLogRow_2","tLogRow_2","tLogRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out1 - " + (out1==null? "": out1.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_2 = new StringBuilder();




   				
	    		if(out1.maxDate != null) { //              
                    							
       
				strBuffer_tLogRow_2.append(
				                String.valueOf(out1.maxDate)							
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_2 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_2 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_2);
                    }
                    consoleOut_tLogRow_2.println(strBuffer_tLogRow_2.toString());
                    consoleOut_tLogRow_2.flush();
                    nb_line_tLogRow_2++;
//////

//////                    
                    
///////////////////////    			

 
     row5 = out1;


	tos_count_tLogRow_2++;

/**
 * [tLogRow_2 main ] stop
 */
	
	/**
	 * [tLogRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_2";
	
	

 



/**
 * [tLogRow_2 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tLogRow_2","tLogRow_2","tLogRow","tFileOutputDelimited_2","tFileOutputDelimited_2","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
                            if(row5.maxDate != null) {
                        sb_tFileOutputDelimited_2.append(
                            row5.maxDate
                        );
                            }
                    sb_tFileOutputDelimited_2.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);


                    nb_line_tFileOutputDelimited_2++;
                    resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

                        outtFileOutputDelimited_2.write(sb_tFileOutputDelimited_2.toString());
                        log.debug("tFileOutputDelimited_2 - Writing the record " + nb_line_tFileOutputDelimited_2 + ".");




 


	tos_count_tFileOutputDelimited_2++;

/**
 * [tFileOutputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	

 



/**
 * [tFileOutputDelimited_2 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	

 



/**
 * [tFileOutputDelimited_2 process_data_end ] stop
 */



	
	/**
	 * [tLogRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_2";
	
	

 



/**
 * [tLogRow_2 process_data_end ] stop
 */

} // End of branch "out1"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_end ] stop
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
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'out1': " + count_out1_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row4",2,0,
			 			"tAggregateRow_1_AGGIN","tAggregateRow_1_AGGIN","tAggregateIn","tMap_1","tMap_1","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Done.") );

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tLogRow_2 end ] start
	 */

	

	
	
	currentComponent="tLogRow_2";
	
	


//////
//////
globalMap.put("tLogRow_2_NB_LINE",nb_line_tLogRow_2);
                if(log.isInfoEnabled())
            log.info("tLogRow_2 - "  + ("Printed row count: ")  + (nb_line_tLogRow_2)  + (".") );

///////////////////////    			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out1",2,0,
			 			"tMap_1","tMap_1","tMap","tLogRow_2","tLogRow_2","tLogRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tLogRow_2 - "  + ("Done.") );

ok_Hash.put("tLogRow_2", true);
end_Hash.put("tLogRow_2", System.currentTimeMillis());




/**
 * [tLogRow_2 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	



		
			
					if(outtFileOutputDelimited_2!=null) {
						outtFileOutputDelimited_2.flush();
						outtFileOutputDelimited_2.close();
					}
				
				globalMap.put("tFileOutputDelimited_2_NB_LINE",nb_line_tFileOutputDelimited_2);
				globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_2", true);
	
				log.debug("tFileOutputDelimited_2 - Written records count: " + nb_line_tFileOutputDelimited_2 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tLogRow_2","tLogRow_2","tLogRow","tFileOutputDelimited_2","tFileOutputDelimited_2","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_2", true);
end_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_2 end ] stop
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
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="\"Operations\"";
		

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tLogRow_1 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	

 



/**
 * [tLogRow_1 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_1 finally ] stop
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
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tLogRow_2 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_2";
	
	

 



/**
 * [tLogRow_2 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_2") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_2 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_2");
						if(outtFileOutputDelimited_2!=null) {
							outtFileOutputDelimited_2.flush();
							outtFileOutputDelimited_2.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_2 finally ] stop
 */





















				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "talendJobLog");
		org.slf4j.MDC.put("_subJobPid", "PZRdjp_" + subJobPidCounter.getAndIncrement());
	

	
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
        final job_gedms_Operations_Full_Dump_Job job_gedms_Operations_Full_Dump_JobClass = new job_gedms_Operations_Full_Dump_Job();

        int exitCode = job_gedms_Operations_Full_Dump_JobClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'job_gedms_Operations_Full_Dump_Job' - Done.");
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
			log.info("TalendJob: 'job_gedms_Operations_Full_Dump_Job' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_gJ2_gFbnEe6MusZcIWCVEA");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-12-20T08:52:01.485879300Z");

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
            java.io.InputStream inContext = job_gedms_Operations_Full_Dump_Job.class.getClassLoader().getResourceAsStream("test_asl/job_gedms_operations_full_dump_job_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = job_gedms_Operations_Full_Dump_Job.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'job_gedms_Operations_Full_Dump_Job' - Started.");
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
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

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




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : job_gedms_Operations_Full_Dump_Job");
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
        log.info("TalendJob: 'job_gedms_Operations_Full_Dump_Job' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     235379 characters generated by Talend Data Integration 
 *     on the December 20, 2023, 2:22:01 PM IST
 ************************************************************************************************/