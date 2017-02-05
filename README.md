1.	Download the Krypton Reports jar.
2.	Now open terminal and execute following command

mvn install:install file -Dfile=path to you jar file -DgroupId=KryptonReports -DartifactId=KryptonReports -Dversion=1.5.0 -Dpackaging=jar

3.	Now add your jar dependency in project pom.xml file.
a.	First copy following dependency in pom.xml
<dependency>
<groupId>KryptonReports</groupId>
<artifactId>KryptonReports</artifactId>
<version>1.5.0</version>
</dependency>
b.	For local repository , add following lines in your pom.xml
<repositories>
<repository>
<id>projectrepo</id>
<url>local machine repo path</url>
</repository>
</repositories>

4.	Now open Jenkins from your machine.
5.	Create new project, and in Maven goal add following goal.

test exec:java -Dexec.mainClass="Path to ReadXmlFile.java"
i.e. test exec:java -Dexec.mainClass="com.project.Init.ReadXMLFile"

6.	Save it and execute the Jenkins project.
7.	After successful completion, refresh project and find Krypton Report in directory Krypton-Reports.
