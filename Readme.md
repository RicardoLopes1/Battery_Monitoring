## Battery Monitoring

<p align="center">
  <img id="Battery full" src="img/batt_full.png" alt="Battery Full">
  <img id="Battery low" src="img/batt_low.png" alt="Battery Low">
</p>

This script is designed to alert the user when their laptop's battery is low or sufficiently charged.
Used on Ubundo OS 18.04.

## Table of contents
- [Introduction](#introduction)
- [About the script](#about-the-script)
- [Necessary modifications](#necessary-modifications)
- [Final considerations](#final-considerations)

## Introduction
This script was made with the intention of alerting the user when the battery level of his laptop is charged or very low.<br>
When the battery level is high enough, the user will receive an alert to remove the charger from the laptop and avoid unnecessary charging.<br>
When the battery level is low, the user will receive an alert to connect the charger to his laptop and prevent it from turning off at inappropriate times.

## About the script
#### How it works?
Script will read the information in specific files that the Unix system provides about the battery.
<br>
``` shell
battery_level=$(cat /sys/class/power_supply/BAT1/capacity)
battery_status=$(cat /sys/class/power_supply/BAT1/status)  
```
Where the `battery_level` variable will contain your current battery level. And the `battery_status` variable will contain information about whether the charger is connected or not.
<br>
If the battery is charging and the level is equal or above 95%, the alert is triggered. Or if it is discharging and the level is equal or below 10%, another alert is triggered.
> NOTE: Check your system to see if the BAT directory is *BAT0* or *BAT1*.

Required installation of `javac` to run .jar programs. <br>
If you also want the audible alert, install the *mpg123* program. Otherwise, add \# in front of the lines of code where this program is called.

## Necessary modifications
Some changes will be necessary, such as: <br>
- Modify the paths
  - For example `/home/rlopes/.battery_warning/` this path is on my laptop.

``` shell
mpg123 /home/rlopes/.battery_warning/sound/low_sound.mp3
java -jar /home/rlopes/.battery_warning/jar/batt_low.jar 
```  

- modify the files `java/fullbat.java` (in lines 36 and 47) and `java/lowbat.java` (in lines 41 and 53) to be able to view the images in the notice. Recompile and create new files `jar/batt_full.jar` and `jar/batt_low.jar` and replace them.


- Modify the sleep (optional)
``` bash
sleep 600 # 600 seconds or 10 minutes
```
## Final considerations
The motivation behind this script is the lack of a more effective alert. Several times, while I was coding or just reading, my laptop turn off before I even noticed the low battery. Now, with this alert, I will no longer have this problem.
