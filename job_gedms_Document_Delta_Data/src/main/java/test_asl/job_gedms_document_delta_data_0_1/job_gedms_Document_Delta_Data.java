
package test_asl.job_gedms_document_delta_data_0_1;

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
 * Job: job_gedms_Document_Delta_Data Purpose: <br>
 * Description:  <br>
 * @author security@company.com
 * @version 8.0.1.20231017_1026-patch
 * @status 
 */
public class job_gedms_Document_Delta_Data implements TalendJob {
	static {System.setProperty("TalendJob.log", "job_gedms_Document_Delta_Data.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(job_gedms_Document_Delta_Data.class);
	

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
	private final String jobName = "job_gedms_Document_Delta_Data";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_V4g1cF6QEe63sJ3K9Ad75w", "0.1");
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
				job_gedms_Document_Delta_Data.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(job_gedms_Document_Delta_Data.this, new Object[] { e , currentComponent, globalMap});
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

			public void tRunJob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tGSConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tGSConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tGSPut_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tGSPut_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tGSPut_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tGSPut_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tGSClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tGSClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tGSConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tGSPut_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tGSPut_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tGSClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public void tRunJob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tRunJob_1");
		org.slf4j.MDC.put("_subJobPid", "BkYzI8_" + subJobPidCounter.getAndIncrement());
	

	
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
	 * [tRunJob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_1", false);
		start_Hash.put("tRunJob_1", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_1";
	
	
		int tos_count_tRunJob_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tRunJob_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tRunJob_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tRunJob_1 = new StringBuilder();
                    log4jParamters_tRunJob_1.append("Parameters:");
                            log4jParamters_tRunJob_1.append("USE_DYNAMIC_JOB" + " = " + "false");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("PROCESS" + " = " + "job_gedms_Document_Delta_Data_Job");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("USE_INDEPENDENT_PROCESS" + " = " + "true");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("CONTEXTPARAMS" + " = " + "[]");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("PRINT_PARAMETER" + " = " + "false");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("USE_CHILD_JVM_SETTING" + " = " + "true");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("USE_CUSTOM_JVM_SETTING" + " = " + "false");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("USE_DYNAMIC_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("USE_EXTRA_CLASSPATH" + " = " + "false");
                        log4jParamters_tRunJob_1.append(" | ");
                            log4jParamters_tRunJob_1.append("LOAD_CONTEXT_FROM_FILE" + " = " + "false");
                        log4jParamters_tRunJob_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_1 - "  + (log4jParamters_tRunJob_1) );
                    } 
                } 
            new BytesLimit65535_tRunJob_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tRunJob_1", "tRunJob_1", "tRunJob");
				talendJobLogProcess(globalMap);
			}
			
class DealChildJobLibrary_tRunJob_1 {

	public String replaceJarPathsFromCrcMap(String originalClassPathLine) throws java.lang.Exception {
		String classPathLine = "";
		String crcMapPath = new java.io.File("../crcMap").getCanonicalPath();
		if (isNeedAddLibsPath( crcMapPath)) {
			java.util.Map<String, String> crcMap = null;
			java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream(crcMapPath)) {
				@Override
				public Class<?> resolveClass(java.io.ObjectStreamClass desc) throws java.io.IOException, ClassNotFoundException {
					if(!"java.util.HashMap".equals(desc.getName())) {
						throw new java.io.InvalidClassException("Unauthorized deserialization attempt : " + desc.getName());
					}
					return super.resolveClass(desc);
				}
			};
			crcMap = (java.util.Map<String, String>) ois.readObject();
			ois.close();
			classPathLine = addLibsPath(originalClassPathLine, crcMap);
		} else {
			classPathLine = originalClassPathLine;
		}
		return classPathLine;
	}
	
	private boolean isNeedAddLibsPath(String crcMapPath) {
		if (!(new java.io.File(crcMapPath).exists())) {// when not use cache
			return false;
		}
		return true;
	}
	
	
	private String addLibsPath(String line, java.util.Map<String, String> crcMap) {
		for (java.util.Map.Entry<String, String> entry : crcMap.entrySet()) {
			line = adaptLibPaths(line, entry);
		}
		return line;
	}
	
	private String adaptLibPaths(String line, java.util.Map.Entry<String, String> entry) {
		String jarName = entry.getValue();
		String crc = entry.getKey();
		String libStringFinder = "../lib/" + jarName;
		if (line.contains(libStringFinder)) {
			line = line.replace(libStringFinder, "../../../cache/lib/" + crc + "/" + jarName);
		} else if (line.contains(":$ROOT_PATH/" + jarName + ":")) {
			line = line.replace(":$ROOT_PATH/" + jarName + ":", ":$ROOT_PATH/../../../cache/lib/" + crc + "/" + jarName + ":");
		} else if (line.contains(";" + jarName + ";")) {
			line = line.replace(";" + jarName + ";", ";../../../cache/lib/" + crc + "/" + jarName + ";");
		}
		return line;
	}
	
}
	DealChildJobLibrary_tRunJob_1 dealChildJobLibrary_tRunJob_1 = new DealChildJobLibrary_tRunJob_1();

	class JVMArgumentHelper_tRunJob_1 {
		
		
		
		private void addClasspath(java.util.List<String> target_argument_list, String job_origin_classpath) {
			
			String extra_classpath = null;
			String path_separator = System.getProperty("path.separator");
			if (path_separator != null && path_separator.length() > 1) {
				throw new RuntimeException("path separator should be single character");
			}
			
			if(extra_classpath!=null && !extra_classpath.isEmpty()) {
				if(extra_classpath.endsWith(path_separator)) {
					target_argument_list.add(extra_classpath+job_origin_classpath);
				} else if(extra_classpath.contains(path_separator)) {
					target_argument_list.add(concatStr(extra_classpath, path_separator, job_origin_classpath));
				} else if(extra_classpath.endsWith(":")) {
					target_argument_list.add(extra_classpath.replace(":", path_separator)+job_origin_classpath);
				} else if(extra_classpath.endsWith(";")) {
					target_argument_list.add(extra_classpath.replace(";", path_separator)+job_origin_classpath);
				} else if(extra_classpath.contains(":")) {
					target_argument_list.add(concatStr(extra_classpath.replace(":", path_separator), path_separator, job_origin_classpath));
				} else if(extra_classpath.contains(";")) {
					target_argument_list.add(concatStr(extra_classpath.replace(";", path_separator), path_separator, job_origin_classpath));
				} else {
					target_argument_list.add(concatStr(extra_classpath, path_separator, job_origin_classpath));
				}
				return;
			}
			
			target_argument_list.add(job_origin_classpath);
		}
		
		private String concatStr(String s1, String s2, String s3) {
			java.lang.StringBuilder strB = new java.lang.StringBuilder();
			strB.append(s1).append(s2).append(s3);
			return strB.toString();
		}
		
		public void addArgumentsTo(java.util.List<String> target_argument_list, String argument_from_child) {
			addArgumentsTo(target_argument_list, argument_from_child, false);
		}
		
		public void addArgumentsTo(java.util.List<String> target_argument_list, String argument_from_child, boolean isCP) {
			if(isCP) {
				addClasspath(target_argument_list, argument_from_child);
				return;
			}
		
			
			
			
			target_argument_list.add(argument_from_child);
			
		}
		
		
	}
	
	JVMArgumentHelper_tRunJob_1 jvm_argument_helper_tRunJob_1 = new JVMArgumentHelper_tRunJob_1();
	
	String audit_jar_path_tRunJob_1 = System.getProperty("classpath.extended");
	

 



/**
 * [tRunJob_1 begin ] stop
 */
	
	/**
	 * [tRunJob_1 main ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	
	java.util.List<String> paraList_tRunJob_1 = new java.util.ArrayList<String>();
	
			
			String osName_tRunJob_1 = System.getProperty("os.name");
			if (osName_tRunJob_1 != null && osName_tRunJob_1.toLowerCase(java.util.Locale.US).startsWith("win")){
				
						paraList_tRunJob_1.add("java");
						String m2 = System.getProperty("talend.component.manager.m2.repository");
						if (m2 != null){
							paraList_tRunJob_1.add("-Dtalend.component.manager.m2.repository=" + m2);
						}
						
						if (Boolean.getBoolean("propagateLoggingConfiguration")) {
							String log4j1_config_tRunJob_1 = System.getProperty("log4j.configuration");
							if (log4j1_config_tRunJob_1 != null){
								paraList_tRunJob_1.add("-Dlog4j.configuration=" + log4j1_config_tRunJob_1);
							}
							String log4j2_config_tRunJob_1 = System.getProperty("log4j.configurationFile");
							if (log4j2_config_tRunJob_1 != null){
								paraList_tRunJob_1.add("-Dlog4j.configurationFile=" + log4j2_config_tRunJob_1);
							}
							if (log4j1_config_tRunJob_1 != null || log4j2_config_tRunJob_1 != null) {
								paraList_tRunJob_1.add("-DpropagateLoggingConfiguration=true");
							}
						}
						
						if(enableLogStash){
							System.getProperties().stringPropertyNames().stream()
								.filter(it -> it.startsWith("audit."))
								.forEach(key -> paraList_tRunJob_1.add("-D" + key + "=" + System.getProperty(key)));
						}
							
						System.getProperties().stringPropertyNames().stream()
							.filter(it -> it.startsWith("runtime.lineage.") || "classpath.extended".equals(it))
							.forEach(key -> paraList_tRunJob_1.add("-D" + key + "=" + System.getProperty(key)));
					
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-Dtalend.component.manager.m2.repository=../lib");
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-Xms256M");
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-Xmx1024M");
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-cp");
		      				
              					String classpath_tRunJob_1_5 = ".;../lib/routines.jar;../lib/log4j-slf4j-impl-2.17.1.jar;../lib/log4j-api-2.17.1.jar;../lib/log4j-core-2.17.1.jar;../lib/google-auth-library-appengine-1.19.0.jar;../lib/grpc-context-1.27.2.jar;../lib/json-smart-2.4.11.jar;../lib/j2objc-annotations-2.8.jar;../lib/google-http-client-1.42.3.jar;../lib/commons-logging-1.2.jar;../lib/httpclient-4.5.13.jar;../lib/job-audit-1.5.jar;../lib/talend_file_enhanced-1.3.jar;../lib/guava-32.0.0-android.jar;../lib/google-api-client-1.31.2.jar;../lib/commons-codec-1.11.jar;../lib/failureaccess-1.0.1.jar;../lib/opencensus-contrib-http-util-0.31.1.jar;../lib/google-cloud-storage-2.26.1.jar;../lib/commons-lang3-3.10.jar;../lib/jtransc-rt-core-0.6.8.jar;../lib/error_prone_annotations-2.18.0.jar;../lib/audit-common-1.16.1.jar;../lib/checker-qual-3.33.0.jar;../lib/opencensus-api-0.31.1.jar;../lib/jboss-marshalling-2.0.12.Final.jar;../lib/gson-2.10.jar;../lib/slf4j-api-1.7.34.jar;../lib/jtransc-rt-0.6.8.jar;../lib/latest.jar;../lib/dom4j-2.1.3.jar;../lib/google-cloud-core-2.22.0.jar;../lib/google-cloud-core-http-2.22.0.jar;../lib/google-http-client-gson-1.42.3.jar;../lib/google-auth-library-credentials-1.19.0.jar;../lib/accessors-smart-2.4.11.jar;../lib/crypto-utils-7.1.16.jar;../lib/audit-log4j2-1.16.1.jar;../lib/httpcore-4.4.15.jar;../lib/auto-value-annotations-1.10.1.jar;../lib/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;../lib/logging-event-layout-1.16.1.jar;../lib/asm-9.5.jar;../lib/google-auth-library-oauth2-http-1.19.0.jar;../lib/jtransc-annotations-0.6.8.jar;../lib/jsr305-3.0.2.jar;../lib/talendcsv-1.1.0.jar;../lib/mysql-connector-j-8.0.33.jar;job_gedms_document_delta_data_job_0_1.jar;";
              					
              					if(audit_jar_path_tRunJob_1!=null && !audit_jar_path_tRunJob_1.isEmpty()) {
		      						classpath_tRunJob_1_5 += audit_jar_path_tRunJob_1;
		      					}
		      					
	        					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, dealChildJobLibrary_tRunJob_1.replaceJarPathsFromCrcMap(classpath_tRunJob_1_5), true);
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "test_asl.job_gedms_document_delta_data_job_0_1.job_gedms_Document_Delta_Data_Job");
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--father_pid="+pid);
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--root_pid="+rootPid);
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--father_node=tRunJob_1");
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--context=Default");
		      				
		      					jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "%*");
		      				
			} else {
	      		
						paraList_tRunJob_1.add("java");
						String m2 = System.getProperty("talend.component.manager.m2.repository");
						if (m2 != null){
							paraList_tRunJob_1.add("-Dtalend.component.manager.m2.repository=" + m2);
						}
						
						if (Boolean.getBoolean("propagateLoggingConfiguration")) {
							String log4j1_config_tRunJob_1 = System.getProperty("log4j.configuration");
							if (log4j1_config_tRunJob_1 != null){
								paraList_tRunJob_1.add("-Dlog4j.configuration=" + log4j1_config_tRunJob_1);
							}
							String log4j2_config_tRunJob_1 = System.getProperty("log4j.configurationFile");
							if (log4j2_config_tRunJob_1 != null){
								paraList_tRunJob_1.add("-Dlog4j.configurationFile=" + log4j2_config_tRunJob_1);
							}
							if (log4j1_config_tRunJob_1 != null || log4j2_config_tRunJob_1 != null) {
								paraList_tRunJob_1.add("-DpropagateLoggingConfiguration=true");
							}
						}
						
						if(enableLogStash){
							System.getProperties().stringPropertyNames().stream()
								.filter(it -> it.startsWith("audit."))
								.forEach(key -> paraList_tRunJob_1.add("-D" + key + "=" + System.getProperty(key)));
						}
							
						System.getProperties().stringPropertyNames().stream()
							.filter(it -> it.startsWith("runtime.lineage.") || "classpath.extended".equals(it))
							.forEach(key -> paraList_tRunJob_1.add("-D" + key + "=" + System.getProperty(key)));
					
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-Dtalend.component.manager.m2.repository=../lib");
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-Xms256M");
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-Xmx1024M");
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "-cp");
		      				
		      					String classpath_tRunJob_1_5 = ".:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/log4j-slf4j-impl-2.17.1.jar:$ROOT_PATH/../lib/log4j-api-2.17.1.jar:$ROOT_PATH/../lib/log4j-core-2.17.1.jar:$ROOT_PATH/../lib/google-auth-library-appengine-1.19.0.jar:$ROOT_PATH/../lib/grpc-context-1.27.2.jar:$ROOT_PATH/../lib/json-smart-2.4.11.jar:$ROOT_PATH/../lib/j2objc-annotations-2.8.jar:$ROOT_PATH/../lib/google-http-client-1.42.3.jar:$ROOT_PATH/../lib/commons-logging-1.2.jar:$ROOT_PATH/../lib/httpclient-4.5.13.jar:$ROOT_PATH/../lib/job-audit-1.5.jar:$ROOT_PATH/../lib/talend_file_enhanced-1.3.jar:$ROOT_PATH/../lib/guava-32.0.0-android.jar:$ROOT_PATH/../lib/google-api-client-1.31.2.jar:$ROOT_PATH/../lib/commons-codec-1.11.jar:$ROOT_PATH/../lib/failureaccess-1.0.1.jar:$ROOT_PATH/../lib/opencensus-contrib-http-util-0.31.1.jar:$ROOT_PATH/../lib/google-cloud-storage-2.26.1.jar:$ROOT_PATH/../lib/commons-lang3-3.10.jar:$ROOT_PATH/../lib/jtransc-rt-core-0.6.8.jar:$ROOT_PATH/../lib/error_prone_annotations-2.18.0.jar:$ROOT_PATH/../lib/audit-common-1.16.1.jar:$ROOT_PATH/../lib/checker-qual-3.33.0.jar:$ROOT_PATH/../lib/opencensus-api-0.31.1.jar:$ROOT_PATH/../lib/jboss-marshalling-2.0.12.Final.jar:$ROOT_PATH/../lib/gson-2.10.jar:$ROOT_PATH/../lib/slf4j-api-1.7.34.jar:$ROOT_PATH/../lib/jtransc-rt-0.6.8.jar:$ROOT_PATH/../lib/latest.jar:$ROOT_PATH/../lib/dom4j-2.1.3.jar:$ROOT_PATH/../lib/google-cloud-core-2.22.0.jar:$ROOT_PATH/../lib/google-cloud-core-http-2.22.0.jar:$ROOT_PATH/../lib/google-http-client-gson-1.42.3.jar:$ROOT_PATH/../lib/google-auth-library-credentials-1.19.0.jar:$ROOT_PATH/../lib/accessors-smart-2.4.11.jar:$ROOT_PATH/../lib/crypto-utils-7.1.16.jar:$ROOT_PATH/../lib/audit-log4j2-1.16.1.jar:$ROOT_PATH/../lib/httpcore-4.4.15.jar:$ROOT_PATH/../lib/auto-value-annotations-1.10.1.jar:$ROOT_PATH/../lib/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:$ROOT_PATH/../lib/logging-event-layout-1.16.1.jar:$ROOT_PATH/../lib/asm-9.5.jar:$ROOT_PATH/../lib/google-auth-library-oauth2-http-1.19.0.jar:$ROOT_PATH/../lib/jtransc-annotations-0.6.8.jar:$ROOT_PATH/../lib/jsr305-3.0.2.jar:$ROOT_PATH/../lib/talendcsv-1.1.0.jar:$ROOT_PATH/../lib/mysql-connector-j-8.0.33.jar:$ROOT_PATH/job_gedms_document_delta_data_job_0_1.jar:";
		      					
		      					if(audit_jar_path_tRunJob_1!=null && !audit_jar_path_tRunJob_1.isEmpty()) {
		      						classpath_tRunJob_1_5 += audit_jar_path_tRunJob_1;
		      					}
		      					
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, dealChildJobLibrary_tRunJob_1.replaceJarPathsFromCrcMap(classpath_tRunJob_1_5).replace("$ROOT_PATH",System.getProperty("user.dir")), true);
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "test_asl.job_gedms_document_delta_data_job_0_1.job_gedms_Document_Delta_Data_Job");
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--father_pid="+pid);
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--root_pid="+rootPid);
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--father_node=tRunJob_1");
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "--context=Default");
		      				
								jvm_argument_helper_tRunJob_1.addArgumentsTo(paraList_tRunJob_1, "$@");
		      				
			}

			
			
	  	
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_1.add("--log4jLevel="+log4jLevel);
			}
		
		if(enableLogStash){
			paraList_tRunJob_1.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_1.add("--stat_port=" + null);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_1.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_1 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_1 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_1".equals(tRunJobName_tRunJob_1) && childResumePath_tRunJob_1 != null){
		paraList_tRunJob_1.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_1.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_1");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_1 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_1 = null;

	
	
				class ConsoleHelper_tRunJob_1 {
					private Thread getNormalThread(Process process) {
						return new Thread() {
							public void run() {
								try {
									java.io.BufferedReader reader = new java.io.BufferedReader(
											new java.io.InputStreamReader(
													process.getInputStream()));
									String line = "";
									try {
										while ((line = reader.readLine()) != null) {
											System.out.println(line);
										}
									} finally {
										reader.close();
									}
								} catch (java.io.IOException ioe) {
globalMap.put("tRunJob_1_ERROR_MESSAGE",ioe.getMessage());
						            
										log.error("tRunJob_1 - " + ioe.getMessage());
						            
									ioe.printStackTrace();
								}
							}
						};
					}

					private Thread getErrorThread(Process process, StringBuffer sb) {
						return new Thread() {
							public void run() {
								try {
									java.io.BufferedReader reader = new java.io.BufferedReader(
											new java.io.InputStreamReader(
													process.getErrorStream()));
									String line = "";
									try {
										while ((line = reader.readLine()) != null) {
											sb.append(line)
													.append("\n");
										}
									} finally {
										reader.close();
									}
								} catch (java.io.IOException ioe) {
globalMap.put("tRunJob_1_ERROR_MESSAGE",ioe.getMessage());
						            
										log.error("tRunJob_1 - " + ioe.getMessage());
						            
									ioe.printStackTrace();
								}
							}
						};
					}
				}
				ConsoleHelper_tRunJob_1 consoleHelper_tRunJob_1 = new ConsoleHelper_tRunJob_1();

		Runtime runtime_tRunJob_1 = Runtime.getRuntime();
		Process ps_tRunJob_1 = null;
		
		//0 indicates normal termination
        int result_tRunJob_1;
        StringBuffer errorMsg_tRunJob_1 = new StringBuffer();
        try {
            ps_tRunJob_1 = runtime_tRunJob_1.exec((String[])paraList_tRunJob_1.toArray(new String[paraList_tRunJob_1.size()]));

            Thread normal_tRunJob_1 = consoleHelper_tRunJob_1.getNormalThread(ps_tRunJob_1);
                log.info("tRunJob_1 - The child job 'job_gedms_Document_Delta_Data_Job' starts on the version '0.1' with the context 'Default'.");
            normal_tRunJob_1.start();
                log.info("tRunJob_1 - The child job 'job_gedms_Document_Delta_Data_Job' is done.");

            Thread error_tRunJob_1 = consoleHelper_tRunJob_1.getErrorThread(ps_tRunJob_1, errorMsg_tRunJob_1);
            error_tRunJob_1.start();

            result_tRunJob_1 = ps_tRunJob_1.waitFor();
            normal_tRunJob_1.join();
            error_tRunJob_1.join();
        } catch (ThreadDeath tde) {
globalMap.put("tRunJob_1_ERROR_MESSAGE",tde.getMessage());
            	log.error("tRunJob_1 - thread was terminated.");
            ps_tRunJob_1.destroy();
            throw tde;
        }

		globalMap.put("tRunJob_1_CHILD_RETURN_CODE",result_tRunJob_1);
		if(result_tRunJob_1 != 0){
   			globalMap.put("tRunJob_1_CHILD_EXCEPTION_STACKTRACE",errorMsg_tRunJob_1.toString());
			  
	    		throw new RuntimeException("Child job returns " + result_tRunJob_1 + ". It doesn't terminate normally.\n" + errorMsg_tRunJob_1.toString());
			
  		}

		

 


	tos_count_tRunJob_1++;

/**
 * [tRunJob_1 main ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	

 



/**
 * [tRunJob_1 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	

 



/**
 * [tRunJob_1 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_1 end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tRunJob_1 - "  + ("Done.") );

ok_Hash.put("tRunJob_1", true);
end_Hash.put("tRunJob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tGSConnection_1Process(globalMap);



/**
 * [tRunJob_1 end ] stop
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
	 * [tRunJob_1 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_1";
	
	
	
 



/**
 * [tRunJob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_1_SUBPROCESS_STATE", 1);
	}
	


public void tGSConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tGSConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tGSConnection_1");
		org.slf4j.MDC.put("_subJobPid", "ib3kr9_" + subJobPidCounter.getAndIncrement());
	

	
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
	 * [tGSConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tGSConnection_1", false);
		start_Hash.put("tGSConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tGSConnection_1";
	
	
		int tos_count_tGSConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tGSConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tGSConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tGSConnection_1 = new StringBuilder();
                    log4jParamters_tGSConnection_1.append("Parameters:");
                            log4jParamters_tGSConnection_1.append("AUTH_TYPE" + " = " + "SERVICE_ACCOUNT");
                        log4jParamters_tGSConnection_1.append(" | ");
                            log4jParamters_tGSConnection_1.append("SERVICE_ACCOUNT_KEY" + " = " + "\"D:/ASLGCPACCESSKEYDREMIO.json\"");
                        log4jParamters_tGSConnection_1.append(" | ");
                            log4jParamters_tGSConnection_1.append("USE_REGION_ENDPOINT" + " = " + "false");
                        log4jParamters_tGSConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tGSConnection_1 - "  + (log4jParamters_tGSConnection_1) );
                    } 
                } 
            new BytesLimit65535_tGSConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tGSConnection_1", "tGSConnection_1", "tGSConnection");
				talendJobLogProcess(globalMap);
			}
			

com.google.auth.Credentials credential_tGSConnection_1 = null;
try {
  credential_tGSConnection_1 = com.google.auth.oauth2.GoogleCredentials
      .fromStream(new java.io.FileInputStream("D:/ASLGCPACCESSKEYDREMIO.json"));
} catch (IOException e_tGSConnection_1) {
globalMap.put("tGSConnection_1_ERROR_MESSAGE",e_tGSConnection_1.getMessage());
     log.error("tGSConnection_1 - Exception in component tGSConnection_1.", e_tGSConnection_1);
}
 
  com.google.cloud.storage.StorageOptions.Builder storageBuilder_tGSConnection_1 = com.google.cloud.storage.StorageOptions.newBuilder().setCredentials(credential_tGSConnection_1);
	
  com.google.cloud.storage.Storage storage_tGSConnection_1 = storageBuilder_tGSConnection_1.build().getService();
  
	globalMap.put("service_" + "tGSConnection_1",storage_tGSConnection_1);

 



/**
 * [tGSConnection_1 begin ] stop
 */
	
	/**
	 * [tGSConnection_1 main ] start
	 */

	

	
	
	currentComponent="tGSConnection_1";
	
	

 


	tos_count_tGSConnection_1++;

/**
 * [tGSConnection_1 main ] stop
 */
	
	/**
	 * [tGSConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tGSConnection_1";
	
	

 



/**
 * [tGSConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tGSConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tGSConnection_1";
	
	

 



/**
 * [tGSConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tGSConnection_1 end ] start
	 */

	

	
	
	currentComponent="tGSConnection_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tGSConnection_1 - "  + ("Done.") );

ok_Hash.put("tGSConnection_1", true);
end_Hash.put("tGSConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tGSPut_2Process(globalMap);



/**
 * [tGSConnection_1 end ] stop
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
	 * [tGSConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tGSConnection_1";
	
	

 



/**
 * [tGSConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tGSConnection_1_SUBPROCESS_STATE", 1);
	}
	


public void tGSPut_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tGSPut_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tGSPut_2");
		org.slf4j.MDC.put("_subJobPid", "0wJkxM_" + subJobPidCounter.getAndIncrement());
	

	
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
	 * [tGSPut_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tGSPut_2", false);
		start_Hash.put("tGSPut_2", System.currentTimeMillis());
		
	
	currentComponent="tGSPut_2";
	
	
		int tos_count_tGSPut_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tGSPut_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tGSPut_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tGSPut_2 = new StringBuilder();
                    log4jParamters_tGSPut_2.append("Parameters:");
                            log4jParamters_tGSPut_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tGSPut_2.append(" | ");
                            log4jParamters_tGSPut_2.append("CONNECTION" + " = " + "tGSConnection_1");
                        log4jParamters_tGSPut_2.append(" | ");
                            log4jParamters_tGSPut_2.append("BUCKET" + " = " + "\"datalake-dremio\"");
                        log4jParamters_tGSPut_2.append(" | ");
                            log4jParamters_tGSPut_2.append("LOCALDIR" + " = " + "\"D:/dnt/asl/talend/recordDate/document\"");
                        log4jParamters_tGSPut_2.append(" | ");
                            log4jParamters_tGSPut_2.append("REMOTEDIR" + " = " + "\"gedms_report_date/Documents\"");
                        log4jParamters_tGSPut_2.append(" | ");
                            log4jParamters_tGSPut_2.append("USE_FILES_LIST" + " = " + "false");
                        log4jParamters_tGSPut_2.append(" | ");
                            log4jParamters_tGSPut_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tGSPut_2.append(" | ");
                            log4jParamters_tGSPut_2.append("PART_SIZE" + " = " + "50");
                        log4jParamters_tGSPut_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tGSPut_2 - "  + (log4jParamters_tGSPut_2) );
                    } 
                } 
            new BytesLimit65535_tGSPut_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tGSPut_2", "tGSPut_2", "tGSPut");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tGSPut_2 begin ] stop
 */
	
	/**
	 * [tGSPut_2 main ] start
	 */

	

	
	
	currentComponent="tGSPut_2";
	
	
	
	int nb_line_tGSPut_2 = 0;
	long partSizeInBytes_tGSPut_2 = (long)50 * 1024 * 1024;
	
	if(partSizeInBytes_tGSPut_2 > Integer.MAX_VALUE - 8) {
		partSizeInBytes_tGSPut_2 = Integer.MAX_VALUE - 8;
	}
	
  com.google.cloud.storage.Storage storage_tGSPut_2 = (com.google.cloud.storage.Storage)globalMap.get("service_tGSConnection_1");

	java.io.File file_tGSPut_2 = new java.io.File("D:/dnt/asl/talend/recordDate/document");
	org.talend.gs.util.GSObjectUtil gsObjectUtil_tGSPut_2 = new org.talend.gs.util.GSObjectUtil();

	
		java.util.Map<String, java.io.File> fileMap_tGSPut_2 = gsObjectUtil_tGSPut_2.generateFileMap(file_tGSPut_2, "gedms_report_date/Documents");
	
	for (java.util.Map.Entry<String, java.io.File> currentFile_tGSPut_2 : fileMap_tGSPut_2.entrySet()){
		com.google.cloud.storage.BlobInfo blobInfo_tGSPut_2 = com.google.cloud.storage.BlobInfo.
				newBuilder("datalake-dremio", currentFile_tGSPut_2.getKey()).build();
		if (partSizeInBytes_tGSPut_2 > 0 && java.nio.file.Files.size(currentFile_tGSPut_2.getValue().toPath()) > partSizeInBytes_tGSPut_2) {
			byte[] buffer = new byte[(int)partSizeInBytes_tGSPut_2];
			try (com.google.cloud.WriteChannel writer_tGSPut_2 = storage_tGSPut_2.writer(blobInfo_tGSPut_2); java.io.InputStream inputStreamForUpload_tGSPut_2 = java.nio.file.Files.newInputStream(currentFile_tGSPut_2.getValue().toPath())) {
				int curFileLimit_tGSPut_2;
				while ((curFileLimit_tGSPut_2 = inputStreamForUpload_tGSPut_2.read(buffer)) >= 0) {
					writer_tGSPut_2.write(java.nio.ByteBuffer.wrap(buffer, 0, curFileLimit_tGSPut_2));
				}
			} catch (IOException e_tGSPut_2) {
globalMap.put("tGSPut_2_ERROR_MESSAGE",e_tGSPut_2.getMessage());
				
					log.error("tGSPut_2 - Exception in component tGSPut_2:" + e_tGSPut_2.getMessage());
				
			}
		} else {
			try {
				storage_tGSPut_2.create(blobInfo_tGSPut_2, java.nio.file.Files.readAllBytes(currentFile_tGSPut_2.getValue().toPath()));
				nb_line_tGSPut_2 ++;
			} catch (IOException e_tGSPut_2) {
globalMap.put("tGSPut_2_ERROR_MESSAGE",e_tGSPut_2.getMessage());
				
					log.error("tGSPut_2 - Exception in component tGSPut_2:" + e_tGSPut_2.getMessage());
				
			}
		}
	}
	globalMap.put("tGSPut_2_NB_LINE", nb_line_tGSPut_2);

 


	tos_count_tGSPut_2++;

/**
 * [tGSPut_2 main ] stop
 */
	
	/**
	 * [tGSPut_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tGSPut_2";
	
	

 



/**
 * [tGSPut_2 process_data_begin ] stop
 */
	
	/**
	 * [tGSPut_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tGSPut_2";
	
	

 



/**
 * [tGSPut_2 process_data_end ] stop
 */
	
	/**
	 * [tGSPut_2 end ] start
	 */

	

	
	
	currentComponent="tGSPut_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tGSPut_2 - "  + ("Done.") );

ok_Hash.put("tGSPut_2", true);
end_Hash.put("tGSPut_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tGSPut_1Process(globalMap);



/**
 * [tGSPut_2 end ] stop
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
	 * [tGSPut_2 finally ] start
	 */

	

	
	
	currentComponent="tGSPut_2";
	
	

 



/**
 * [tGSPut_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tGSPut_2_SUBPROCESS_STATE", 1);
	}
	


public void tGSPut_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tGSPut_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tGSPut_1");
		org.slf4j.MDC.put("_subJobPid", "5RUqHs_" + subJobPidCounter.getAndIncrement());
	

	
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
	 * [tGSPut_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tGSPut_1", false);
		start_Hash.put("tGSPut_1", System.currentTimeMillis());
		
	
	currentComponent="tGSPut_1";
	
	
		int tos_count_tGSPut_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tGSPut_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tGSPut_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tGSPut_1 = new StringBuilder();
                    log4jParamters_tGSPut_1.append("Parameters:");
                            log4jParamters_tGSPut_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tGSPut_1.append(" | ");
                            log4jParamters_tGSPut_1.append("CONNECTION" + " = " + "tGSConnection_1");
                        log4jParamters_tGSPut_1.append(" | ");
                            log4jParamters_tGSPut_1.append("BUCKET" + " = " + "\"datalake-dremio\"");
                        log4jParamters_tGSPut_1.append(" | ");
                            log4jParamters_tGSPut_1.append("LOCALDIR" + " = " + "\"D:/dnt/asl/talend/recordFiles/document\"");
                        log4jParamters_tGSPut_1.append(" | ");
                            log4jParamters_tGSPut_1.append("REMOTEDIR" + " = " + "\"gedms_report_records/Documents\"");
                        log4jParamters_tGSPut_1.append(" | ");
                            log4jParamters_tGSPut_1.append("USE_FILES_LIST" + " = " + "false");
                        log4jParamters_tGSPut_1.append(" | ");
                            log4jParamters_tGSPut_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tGSPut_1.append(" | ");
                            log4jParamters_tGSPut_1.append("PART_SIZE" + " = " + "50");
                        log4jParamters_tGSPut_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tGSPut_1 - "  + (log4jParamters_tGSPut_1) );
                    } 
                } 
            new BytesLimit65535_tGSPut_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tGSPut_1", "tGSPut_1", "tGSPut");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tGSPut_1 begin ] stop
 */
	
	/**
	 * [tGSPut_1 main ] start
	 */

	

	
	
	currentComponent="tGSPut_1";
	
	
	
	int nb_line_tGSPut_1 = 0;
	long partSizeInBytes_tGSPut_1 = (long)50 * 1024 * 1024;
	
	if(partSizeInBytes_tGSPut_1 > Integer.MAX_VALUE - 8) {
		partSizeInBytes_tGSPut_1 = Integer.MAX_VALUE - 8;
	}
	
  com.google.cloud.storage.Storage storage_tGSPut_1 = (com.google.cloud.storage.Storage)globalMap.get("service_tGSConnection_1");

	java.io.File file_tGSPut_1 = new java.io.File("D:/dnt/asl/talend/recordFiles/document");
	org.talend.gs.util.GSObjectUtil gsObjectUtil_tGSPut_1 = new org.talend.gs.util.GSObjectUtil();

	
		java.util.Map<String, java.io.File> fileMap_tGSPut_1 = gsObjectUtil_tGSPut_1.generateFileMap(file_tGSPut_1, "gedms_report_records/Documents");
	
	for (java.util.Map.Entry<String, java.io.File> currentFile_tGSPut_1 : fileMap_tGSPut_1.entrySet()){
		com.google.cloud.storage.BlobInfo blobInfo_tGSPut_1 = com.google.cloud.storage.BlobInfo.
				newBuilder("datalake-dremio", currentFile_tGSPut_1.getKey()).build();
		if (partSizeInBytes_tGSPut_1 > 0 && java.nio.file.Files.size(currentFile_tGSPut_1.getValue().toPath()) > partSizeInBytes_tGSPut_1) {
			byte[] buffer = new byte[(int)partSizeInBytes_tGSPut_1];
			try (com.google.cloud.WriteChannel writer_tGSPut_1 = storage_tGSPut_1.writer(blobInfo_tGSPut_1); java.io.InputStream inputStreamForUpload_tGSPut_1 = java.nio.file.Files.newInputStream(currentFile_tGSPut_1.getValue().toPath())) {
				int curFileLimit_tGSPut_1;
				while ((curFileLimit_tGSPut_1 = inputStreamForUpload_tGSPut_1.read(buffer)) >= 0) {
					writer_tGSPut_1.write(java.nio.ByteBuffer.wrap(buffer, 0, curFileLimit_tGSPut_1));
				}
			} catch (IOException e_tGSPut_1) {
globalMap.put("tGSPut_1_ERROR_MESSAGE",e_tGSPut_1.getMessage());
				
					log.error("tGSPut_1 - Exception in component tGSPut_1:" + e_tGSPut_1.getMessage());
				
			}
		} else {
			try {
				storage_tGSPut_1.create(blobInfo_tGSPut_1, java.nio.file.Files.readAllBytes(currentFile_tGSPut_1.getValue().toPath()));
				nb_line_tGSPut_1 ++;
			} catch (IOException e_tGSPut_1) {
globalMap.put("tGSPut_1_ERROR_MESSAGE",e_tGSPut_1.getMessage());
				
					log.error("tGSPut_1 - Exception in component tGSPut_1:" + e_tGSPut_1.getMessage());
				
			}
		}
	}
	globalMap.put("tGSPut_1_NB_LINE", nb_line_tGSPut_1);

 


	tos_count_tGSPut_1++;

/**
 * [tGSPut_1 main ] stop
 */
	
	/**
	 * [tGSPut_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tGSPut_1";
	
	

 



/**
 * [tGSPut_1 process_data_begin ] stop
 */
	
	/**
	 * [tGSPut_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tGSPut_1";
	
	

 



/**
 * [tGSPut_1 process_data_end ] stop
 */
	
	/**
	 * [tGSPut_1 end ] start
	 */

	

	
	
	currentComponent="tGSPut_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tGSPut_1 - "  + ("Done.") );

ok_Hash.put("tGSPut_1", true);
end_Hash.put("tGSPut_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tGSClose_1Process(globalMap);



/**
 * [tGSPut_1 end ] stop
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
	 * [tGSPut_1 finally ] start
	 */

	

	
	
	currentComponent="tGSPut_1";
	
	

 



/**
 * [tGSPut_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tGSPut_1_SUBPROCESS_STATE", 1);
	}
	


public void tGSClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tGSClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tGSClose_1");
		org.slf4j.MDC.put("_subJobPid", "mRlZMt_" + subJobPidCounter.getAndIncrement());
	

	
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
	 * [tGSClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tGSClose_1", false);
		start_Hash.put("tGSClose_1", System.currentTimeMillis());
		
	
	currentComponent="tGSClose_1";
	
	
		int tos_count_tGSClose_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tGSClose_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tGSClose_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tGSClose_1 = new StringBuilder();
                    log4jParamters_tGSClose_1.append("Parameters:");
                            log4jParamters_tGSClose_1.append("CONNECTION" + " = " + "tGSConnection_1");
                        log4jParamters_tGSClose_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tGSClose_1 - "  + (log4jParamters_tGSClose_1) );
                    } 
                } 
            new BytesLimit65535_tGSClose_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tGSClose_1", "tGSClose_1", "tGSClose");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tGSClose_1 begin ] stop
 */
	
	/**
	 * [tGSClose_1 main ] start
	 */

	

	
	
	currentComponent="tGSClose_1";
	
	
	
	//Don't need to close storage when use google storage api

 


	tos_count_tGSClose_1++;

/**
 * [tGSClose_1 main ] stop
 */
	
	/**
	 * [tGSClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tGSClose_1";
	
	

 



/**
 * [tGSClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tGSClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tGSClose_1";
	
	

 



/**
 * [tGSClose_1 process_data_end ] stop
 */
	
	/**
	 * [tGSClose_1 end ] start
	 */

	

	
	
	currentComponent="tGSClose_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tGSClose_1 - "  + ("Done.") );

ok_Hash.put("tGSClose_1", true);
end_Hash.put("tGSClose_1", System.currentTimeMillis());




/**
 * [tGSClose_1 end ] stop
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
	 * [tGSClose_1 finally ] start
	 */

	

	
	
	currentComponent="tGSClose_1";
	
	

 



/**
 * [tGSClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tGSClose_1_SUBPROCESS_STATE", 1);
	}
	


public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "talendJobLog");
		org.slf4j.MDC.put("_subJobPid", "ZkWolZ_" + subJobPidCounter.getAndIncrement());
	

	
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
        final job_gedms_Document_Delta_Data job_gedms_Document_Delta_DataClass = new job_gedms_Document_Delta_Data();

        int exitCode = job_gedms_Document_Delta_DataClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'job_gedms_Document_Delta_Data' - Done.");
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
			log.info("TalendJob: 'job_gedms_Document_Delta_Data' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_V4g1cF6QEe63sJ3K9Ad75w");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-12-19T05:29:55.969871500Z");

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
            java.io.InputStream inContext = job_gedms_Document_Delta_Data.class.getClassLoader().getResourceAsStream("test_asl/job_gedms_document_delta_data_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = job_gedms_Document_Delta_Data.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'job_gedms_Document_Delta_Data' - Started.");
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




		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tRunJob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tRunJob_1) {
globalMap.put("tRunJob_1_SUBPROCESS_STATE", -1);

e_tRunJob_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : job_gedms_Document_Delta_Data");
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
        log.info("TalendJob: 'job_gedms_Document_Delta_Data' - Finished - status: " + status + " returnCode: " + returnCode );

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeGSConnections();


    }













    private void closeGSConnections() {
        try {

        //Don't need to close storage when use google storage api

        } catch (java.lang.Exception e) {
        }
    }

    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();




            connections.put("service_tGSConnection_1", globalMap.get("service_tGSConnection_1"));


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
 *     93648 characters generated by Talend Data Integration 
 *     on the December 19, 2023, 10:59:55 AM IST
 ************************************************************************************************/