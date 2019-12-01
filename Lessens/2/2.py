mas=raw_input("weach mony you want? (d or s)")
mony = input("weach mach mony?")
if mas!="d" and mas!="s":
    print("error")
elif mas=="d":
    print("convert dollar to shekel")
    tot = mony*3.5
    print(tot , "nis")
else:
    print("convert shekel to dolar")
    tot = str(mony / 3.5)
    print(tot + "$")
print "rrrr"