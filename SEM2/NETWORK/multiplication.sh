echo "enter a number to find the multiplication"
read n
echo "output"
i=1
while [ $i -le 10 ]
do
   
   echo $i "*" $n" = $(( n * i ))"
   i=$(( i+1 ))
done
