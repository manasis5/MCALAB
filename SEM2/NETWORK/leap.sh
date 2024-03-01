#!/bin/bash
echo "enter a year to check whether it is leap or not"
read y
if [ $(( y % 400 )) = 0 ]
then
echo "$y is a leap year"
elif [ $(( y % 100 )) = 0 ]
then
echo "$y is a not leap year"
elif [ $(( y % 4 )) = 0 ]
then
echo "$y is a  leap year"
else
echo "$y is a not leap year"
fi

