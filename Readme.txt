** Contact Manager – Build and Run Instructions**

This is a simple Java-based Contact Manager application.

** Requirements: 

- Java Development Kit (JDK) 17 or higher
- Apache Maven

** How to Build and Run:

1. Open a terminal and navigate to the project directory:
   cd ~/path_to_contact_manager 
   for example cd ~/Documents/Subjects_in_uni/DevOps_Tools/assesment_2/contact_manager

//due to assessment requirements, the build will have a FAILED status
// you might proceed to step 4 for the compiling
2. Compile and run tests:
   mvn clean test

3. Build the JAR file:
   mvn clean package

   This will create the file:
   target/contact_manager-1.0-SNAPSHOT.jar

//workaround
//this command ignore failure unit tests as it required in task instructions  **three test cases pass and two test cases fail**
4. Build the JAR file:
mvn clean package -DskipTests

   This will create the file:
   target/contact_manager-1.0-SNAPSHOT.jar

3. Run the application through TERMINAL:
   java -jar target/contact_manager-1.0-SNAPSHOT.jar

_______________________________________________
Prepared by student Boiko Vladimir A00168917
Vladimir.Boiko@Student.Torrens.edu.au
