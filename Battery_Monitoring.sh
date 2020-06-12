#!/bin/bash
##Monitoramento de bateria.
##Para inicializar o monitoramento em segundo plano, abra o terminal no diretório deste arquivo e digite:
## nohup ./monitor_bateria.sh > output_file.log &
##E feche o terminal.
##Para encerrar o monitoramento, mate o processo com 'kill PID_DO_PROCESSO'

    while true
    do
        export DISPLAY=:0.0
        battery_level=$(cat /sys/class/power_supply/BAT1/capacity)
        battery_status=$(cat /sys/class/power_supply/BAT1/status)

        if [[ "$battery_status" == "Charging" ]]; then
            if [ $battery_level -ge 95 ]; then
                notify-send --expire-time=5000 "Battery charged 95% or more. Disconnect your AC adapter!" "Charge: ${battery_level}% "
                ##if on_ac_power; then
                mpg123 /home/rlopes/.battery_warning/sound/text-msg.mp3
                java -jar /home/rlopes/.battery_warning/jar/batt_full.jar   ## Display FULLBATTERY notification window
                ##fi
             fi
        else
             if [ $battery_level -le 10 ]; then
                notify-send --urgency=critical --expire-time=5000 "Battery is low, 10% or less. Connect your AC adapter." "Charge: ${battery_level}%"

                if [[ "$battery_status" == "Discharging" ]]; then
                	mpg123 /home/rlopes/.battery_warning/sound/low_sound.mp3
                    java -jar /home/rlopes/.battery_warning/jar/batt_low.jar   ## Display LOWBATTERY notification window
                fi
             fi
        fi

        sleep 600 # 600 seconds or 10 minutes
    done
