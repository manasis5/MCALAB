square_area=lambda side:side **2
rectangle_area=lambda length,width:length*width
triangle_area=lambda base,height:0.5*base*height
side_length=float(input("enter the side length of a square"))
rectangle_length=float(input("enter the side length of a rectangle"))
rectangle_width=float(input("enter the side width of a rectangle"))
triangle_base=float(input("enter the base length of a triangle"))
triangle_height=float(input("enter the height of a triangle"))
print("area of the square:",square_area(side_length))
print("area of the rectangle:",rectangle_area(rectangle_length,rectangle_width))
print("area of the triangle:",triangle_area(triangle_base,triangle_height))
