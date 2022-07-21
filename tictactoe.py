coorA1 = " "
coorB1 = " "
coorC1 = " "
coorA2 = " "
coorB2 = " "
coorC2 = " "
coorA3 = " "
coorB3 = " "
coorC3 = " "

print("  │A │B │C │")
print("──┼──┼──┼──┤")
print("1 │" + coorA1 + " │" + coorB1 + " │" + coorC1 + " │")
print("──┼──┼──┼──┤")
print("2 │" + coorA2 + " │" + coorB2 + " │" + coorC2 + " │")
print("──┼──┼──┼──┤")
print("3 │" + coorA3 + " │" + coorB3 + " │" + coorC3 + " │")
print("──┴──┴──┴──┘")


input_coor = input("Input coordinate for new marker : ")
x = input_coor[0]
y = input_coor[1]
print("(" + x + ", " + y + ") is your input.")