#!/bin/bash
echo "please enter4 numbers"
read a
read b
read c
read d
s=$(($a+$b+$c+$d))
avg=$(($s/4))
p=$(($a*$b*$c*$d))
echo "sum="$s
echo "product="$p
echo "average="$avg

