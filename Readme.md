## Battery Monitoring

This script is designed to alert the user when their laptop's battery is low or sufficiently charged.
Used on Ubundo OS 18.04.

## Table of contents
- [Introduction](#introduction)
- [About the script](#about-the-script)
- [Necessary modifications](#necessary-modifications)

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

## Necessary modifications




