#!/bin/bash
echo "hello world"
name="John"
echo "My name is $name"
read -p "enter your age:" age
echo "you are $age years old."
if [ $age -ge 18 ]; then
echo "you are an adult"
else
echo "you are a minor."
fi
