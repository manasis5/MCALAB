list1=input("enter the first list:")
list2=input("enter the second list:")
if len(list1)==len(list2):
	print("the two lines are of same length.")
else:
	print("the two lines are not of same length.")
sum1=sum(list1)
sum2=sum(list2)
if sum1==sum2:
	print("the two lists sum to the same valur.")
else:
	print("the two lists do not sum to the same valur.")
set1=set(list1)
set2=set(list2)
intersection=set1 &set2
if intersection:
	print("the two list have at least one value in common.")
else:
	print("the two list have at least one value in common.")
