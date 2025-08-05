** Contact Manager – Build and Run Instructions**

This is a simple Java-based Contact Manager application.

** Requirements: 

- Java Development Kit (JDK) 24 or higher
- Apache Maven

** How to Build and Run:  **

1. Open a terminal and navigate to the project directory:
   cd ~/path_to_contact_manager 
   for example cd ~/Documents/Subjects_in_uni/DevOps_Tools/assesment_2/contact_manager

2. Compile and run tests:
   mvn clean test

3. Build the JAR file:
   mvn clean package

   This will create the file:
   target/contact_manager-1.0-SNAPSHOT.jar

3. Run the application through TERMINAL:
   java -jar target/contact_manager-1.0-SNAPSHOT.jar

______________________________________________________
** CI/CD Integration with Jenkins **

- Jenkins job name: `DOT503`
- Source: GitHub repository https://github.com/VladimirBoyko/ContactManager
- Trigger: Automatically builds when changes are pushed to the `master` branch, via GitHub webhook
- Jenkins executes:
  mvn clean install
- Result: Code is compiled, tested and packaged into a deployable JAR

To build manually:
1. Open Jenkins
2. Navigate to `DOT503` job
3. Click “Build Now”

Job configuration is located at:
~/.jenkins/jobs/DOT503/
____________________________________________________

** Monitoring  **

1) New Relic
- The application is instrumented using the **New Relic Java Agent**
- JVM metrics (memory, threads, GC, etc.) are visible in the New Relic APM dashboard
https://one.eu.newrelic.com/dashboards/detail/Njk2MzI1NnxWSVp8REFTSEJPQVJEfGRhOjI1NDMyNDg?account=6963256&state=29eb4519-3370-42b7-50e8-fc4035deb1f9
- Configuration:
  - File: `newrelic.yml` contains license key and app name
  - Agent: `newrelic.jar` is added during runtime

To run with monitoring enabled:
```bash
java -javaagent:/path/to/newrelic.jar -jar target/contact_manager-1.0-SNAPSHOT.jar

2) Nagios
- Nagios Core is configured to monitor:
   Jenkins service availability
- Host system CPU and memory usage
   Java process (Contact Manager) uptime
- Monitoring tools used:
   check_http to verify Jenkins web UI
   check_procs to ensure Java app is running
____________________________________________________
Prepared by student Boiko Vladimir A00168917
Vladimir.Boiko@Student.Torrens.edu.au
