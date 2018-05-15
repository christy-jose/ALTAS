#!/bin/bash
echo "In snet"
iptables -F
iptables-restore < /home/christy/Documents/College/SE/ALTAS/firewallConfig.rules
echo "Done snet"

