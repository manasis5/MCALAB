color_list1 = ['Red','Green','Blue','white','orange']
color_list2 = ['Green','Black','white','orange']
result_colors=[color for color in color_list1 if color not in  color_list2]
print("colors from color_list1 not contained in color_list2:",result_colors)
