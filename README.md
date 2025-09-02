Project SpringMVC + Hibernate don't use Spring Boot, using TomCat smart v9: 

Starting logs: (NOTE: Picked up JDK_JAVA_OPTIONS: --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.rmi/sun.rmi.transport=ALL-UNNAMED
02-Sep-2025 13:50:14.899 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Имя версии сервера:    Apache Tomcat/9.0.108
02-Sep-2025 13:50:14.906 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Сервер собран:         Jul 31 2025 18:19:48 UTC
02-Sep-2025 13:50:14.907 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Номер версии сервера:  9.0.108.0
02-Sep-2025 13:50:14.907 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log OS Name:               Windows 10
02-Sep-2025 13:50:14.907 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Версия ОС:             10.0
02-Sep-2025 13:50:14.908 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Архитектура:           amd64
02-Sep-2025 13:50:14.908 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Java Home:             C:\Users\Darkness\.jdks\ms-17.0.16
02-Sep-2025 13:50:14.909 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Версия JVM:            17.0.16+8-LTS
02-Sep-2025 13:50:14.909 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Производитель JVM:     Microsoft
02-Sep-2025 13:50:14.909 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log CATALINA_BASE:         C:\apache-tomcat-9.0.108
02-Sep-2025 13:50:14.910 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log CATALINA_HOME:         C:\apache-tomcat-9.0.108
02-Sep-2025 13:50:14.930 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: --add-opens=java.base/java.lang=ALL-UNNAMED
02-Sep-2025 13:50:14.931 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: --add-opens=java.base/java.io=ALL-UNNAMED
02-Sep-2025 13:50:14.931 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: --add-opens=java.base/java.util=ALL-UNNAMED
02-Sep-2025 13:50:14.931 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: --add-opens=java.base/java.util.concurrent=ALL-UNNAMED
02-Sep-2025 13:50:14.931 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: --add-opens=java.rmi/sun.rmi.transport=ALL-UNNAMED
02-Sep-2025 13:50:14.932 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -Dcatalina.home=C:\apache-tomcat-9.0.108
02-Sep-2025 13:50:14.932 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -Dcatalina.base=C:\apache-tomcat-9.0.108
02-Sep-2025 13:50:14.932 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -Djava.io.tmpdir=C:\apache-tomcat-9.0.108\temp
02-Sep-2025 13:50:14.932 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -Djava.util.logging.config.file=C:\apache-tomcat-9.0.108\conf\logging.properties
02-Sep-2025 13:50:14.932 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager
02-Sep-2025 13:50:14.932 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -javaagent:C:\WINDA\JDK\IntelliJ IDEA Community Edition 2024.3.1.1\lib\idea_rt.jar=54927
02-Sep-2025 13:50:14.933 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command line argument: -Dfile.encoding=UTF-8
02-Sep-2025 13:50:14.954 INFO [main] org.apache.catalina.core.AprLifecycleListener.lifecycleEvent The Apache Tomcat Native library which allows using OpenSSL was not found on the java.library.path: [C:\Users\Darkness\.jdks\ms-17.0.16\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files (x86)\Common Files\Oracle\Java\java8path;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\dotnet\;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files (x86)\Bitvise SSH Client;C:\Program Files\NVIDIA Corporation\NVIDIA app\NvDLISR;c:\Users\Darkness\AppData\Local\Programs\cursor\resources\app\bin;c:\Users\Darkness\AppData\Local\Programs\cursor\resources\app\bin;C:\Program Files\cursor\resources\app\bin;C:\Program Files\Git\cmd;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\Darkness\AppData\Local\Programs\Python\Python313\Scripts\;C:\Users\Darkness\AppData\Local\Programs\Python\Python313\;C:\Users\Darkness\Documents\FramesJAVA\maven\bin;C:\Users\Darkness\AppData\Local\Programs\Python\Launcher\;C:\WINDA\VSCode\Microsoft VS Code\bin;C:\Users\Darkness\AppData\Local\Microsoft\WindowsApps;C:\WINDA\JDK\IntelliJ IDEA Community Edition 2024.3.1.1\bin;;C:\Program Files\JetBrains\JetBrains Rider 2024.3\bin;;C:\Users\Darkness\Documents\FramesJAVA\apache-maven-3.8.8\bin;C:\Users\Darkness\Documents\FramesJAVA\maven\bin;C:\Users\Darkness\AppData\Local\GitHubDesktop\bin;C:\Users\Darkness\AppData\Local\Programs\Fiddler;.]
02-Sep-2025 13:50:15.561 INFO [main] org.apache.coyote.AbstractProtocol.init Инициализация ProtocolHandler ["http-nio-8080"]
02-Sep-2025 13:50:15.622 INFO [main] org.apache.catalina.startup.Catalina.load Server initialization in [1065] milliseconds
02-Sep-2025 13:50:15.735 INFO [main] org.apache.catalina.core.StandardService.startInternal Starting service [Catalina]
02-Sep-2025 13:50:15.735 INFO [main] org.apache.catalina.core.StandardEngine.startInternal Starting Servlet engine: [Apache Tomcat/9.0.108]
02-Sep-2025 13:50:15.750 INFO [main] org.apache.catalina.startup.HostConfig.deployDescriptor Deploying deployment descriptor [C:\apache-tomcat-9.0.108\conf\Catalina\localhost\MVC_Hibernate.xml]
02-Sep-2025 13:50:15.840 WARNING [main] org.apache.catalina.startup.HostConfig.deployDescriptor A docBase [C:\apache-tomcat-9.0.108\webapps] inside the host appBase has been specified, and will be ignored
02-Sep-2025 13:50:19.019 WARNING [main] org.apache.tomcat.util.descriptor.web.WebXml.setVersion Unknown version string [6.0]. Default version will be used.
02-Sep-2025 13:50:22.796 INFO [main] org.apache.jasper.servlet.TldScanner.scanJars At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
02-Sep-2025 13:50:24.660 INFO [main] org.hibernate.jpa.internal.util.LogHelper.logPersistenceUnitInformation HHH000204: Processing PersistenceUnitInfo [name: SpringMVC]
02-Sep-2025 13:50:24.867 INFO [main] org.hibernate.Version.logVersion HHH000412: Hibernate Core {5.4.1.Final}
02-Sep-2025 13:50:24.874 INFO [main] org.hibernate.cfg.Environment.<clinit> HHH000205: Loaded properties from resource hibernate.properties: {hibernate.hbm2ddl.auto=create, db.password=1111, hibernate.dialect=org.hibernate.dialect.MySQL8Dialect, db.username=root, db.driver=com.mysql.cj.jdbc.Driver, hibernate.bytecode.use_reflection_optimizer=false, hibernate.show_sql=false, db.url=jdbc:mysql://127.0.0.1:3307/SpringMVC?useUnicode=true&characterEncoding=utf8}
02-Sep-2025 13:50:25.318 INFO [main] org.hibernate.annotations.common.reflection.java.JavaReflectionManager.<clinit> HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
02-Sep-2025 13:50:26.333 INFO [main] org.hibernate.dialect.Dialect.<init> HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
02-Sep-2025 13:50:28.082 INFO [main] org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator.initiateService HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
02-Sep-2025 13:50:29.873 INFO [main] org.hibernate.jpa.internal.util.LogHelper.logPersistenceUnitInformation HHH000204: Processing PersistenceUnitInfo [name: SpringMVC]
02-Sep-2025 13:50:29.925 INFO [main] org.hibernate.dialect.Dialect.<init> HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
02-Sep-2025 13:50:29.994 INFO [main] org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator.initiateService HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
02-Sep-2025 13:50:30.191 INFO [main] org.apache.catalina.startup.HostConfig.deployDescriptor Deployment of deployment descriptor [C:\apache-tomcat-9.0.108\conf\Catalina\localhost\MVC_Hibernate.xml] has finished in [14 433] ms
02-Sep-2025 13:50:30.191 INFO [main] org.apache.catalina.startup.HostConfig.deployDescriptor Deploying deployment descriptor [C:\apache-tomcat-9.0.108\conf\Catalina\localhost\SpringMVCProject.xml]
02-Sep-2025 13:50:30.214 WARNING [main] org.apache.catalina.startup.HostConfig.deployDescriptor Deployment of deployment descriptor [C:\apache-tomcat-9.0.108\conf\Catalina\localhost\SpringMVCProject.xml] with an external docBase means the WAR [C:\apache-tomcat-9.0.108\webapps\SpringMVCProject.war] in the appBase will be ignored
02-Sep-2025 13:50:30.215 WARNING [main] org.apache.catalina.startup.HostConfig.deployDescriptor Deployment of deployment descriptor [C:\apache-tomcat-9.0.108\conf\Catalina\localhost\SpringMVCProject.xml] with an external docBase means the directory [C:\apache-tomcat-9.0.108\webapps\SpringMVCProject] in the appBase will be ignored
02-Sep-2025 13:50:33.682 INFO [main] org.apache.jasper.servlet.TldScanner.scanJars At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
02-Sep-2025 13:50:34.884 INFO [main] org.apache.catalina.startup.HostConfig.deployDescriptor Deployment of deployment descriptor [C:\apache-tomcat-9.0.108\conf\Catalina\localhost\SpringMVCProject.xml] has finished in [4 692] ms
02-Sep-2025 13:50:34.926 INFO [main] org.apache.catalina.startup.HostConfig.deployWAR Deploying web application archive [C:\apache-tomcat-9.0.108\webapps\Spring_MVC.war]
02-Sep-2025 13:50:37.311 INFO [main] org.apache.jasper.servlet.TldScanner.scanJars At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
02-Sep-2025 13:50:39.247 INFO [main] org.apache.catalina.startup.HostConfig.deployWAR Deployment of web application archive [C:\apache-tomcat-9.0.108\webapps\Spring_MVC.war] has finished in [4 322] ms
02-Sep-2025 13:50:39.258 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["http-nio-8080"]
02-Sep-2025 13:50:39.317 INFO [main] org.apache.catalina.startup.Catalina.start Server startup in [23694] milliseconds
http://localhost:8080/MVC_Hibernate) 

New User <img width="1716" height="333" alt="image" src="https://github.com/user-attachments/assets/839b885c-3fb8-4911-b4e6-c5401ddb12b7" />
<img width="1597" height="353" alt="image" src="https://github.com/user-attachments/assets/7b9acac8-fad1-497e-9afc-219aad9d4af6" />
<img width="1539" height="375" alt="image" src="https://github.com/user-attachments/assets/360075d9-8822-4086-aa6a-abb3331e097d" />
Edit User<img width="1601" height="356" alt="image" src="https://github.com/user-attachments/assets/7c0925d8-2b40-480e-af1c-678126cd6f1f" />
and Delete User (delete)

