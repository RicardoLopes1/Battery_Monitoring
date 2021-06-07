#!/bin/bash

touch Manifest.txt;
echo Main-Class: fullbat >> Manifest.txt;
javac *.java # "COMPILING JAVA FILES";
jar cfm batt_full.jar Manifest.txt *.class # "CREATING JAR FILE batt_fullljar";
rm Manifest.txt;
#####
touch Manifest.txt;
echo Main-Class: lowbat >> Manifest.txt;
javac *.java # "COMPILING JAVA FILES";
jar cfm batt_low.jar Manifest.txt *.class # "CREATING JAR FILE batt_lowjar";

mv batt_full.jar batt_low.jar ../jar

rm Manifest.txt;
rm *.class # "REMOVING FILES .class"

# java -jar batt_full.jar # running
# java -jar batt_low.jar # running

	