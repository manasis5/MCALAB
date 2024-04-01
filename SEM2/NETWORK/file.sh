echo enter a file name
read file
if [ -e $file ]
then
echo "$file exists"
if [ -r $file ]
then
echo "$file has read access"
else
echo "$file does not have read access"
fi
if [ -w $file ]
then
echo "$file has write permission"
else
echo "$file does not have write permission"
fi
if [ -r $file ] && [ -w $file ]
then
echo "$file has both read and write operations"
fi
elif [ -d $file ]
then
echo "$file is a directory"
else
echo "$file does not exist"
fi
