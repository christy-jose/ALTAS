#!/bin/bash
echo "In enet"
iptables -F
iptables-restore < /home/christy/Documents/College/SE/ALTAS/Default.rules
echo "Done enet"

