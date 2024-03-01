echo Enter the string
read s
echo $s>temp
rvs="$(rev temp)"
echo " reversed string :"$rvs
if [ $s = $rvs ]
then
echo "it is palindrome"
else
echo " it is not a Palindrome"
fi
