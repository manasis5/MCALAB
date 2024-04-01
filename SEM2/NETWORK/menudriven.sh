#!/bin/bash
echo "Do you want to continue? "
read choice
while [ "$choice" = "Y" ]; do
  echo "***MENU***"
  echo "1. Copy"
  echo "2. Edit"
  echo "3. Rename"
  echo "4. Delete"
  echo "5. Exit"
  echo "Enter your choice: "
  read option
  case $option in
    1) echo -n "Enter Source Filename: "
       read source
       echo -n "Enter Destination Filename: "
       read target
       cp $source $target
       ;;
    2) echo -n "Enter the filename you want to edit: "
       read filename
       nano $filename
       ;;
    3) echo -n "Enter the filename you want to rename: "
       read filename
       echo -n "Enter the new name for the file: "
       read newfile
       mv $filename $newfile
       ;;
    4) echo -n "Enter the filename you want to delete: "
       read source
       rm $source
       ;;
    5) break
       ;;
  esac
done


