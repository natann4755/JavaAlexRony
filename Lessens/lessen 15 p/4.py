class car (object):

    def __init__(self,a,b=0):
        self.a=a
        self.b=b

    def dd(self):
        print("a:%s \nb: %s"% (self.a,self.b))
    @staticmethod
    def prin(c):
        print ("a:%s \nb: %s"% (c.a,c.b))
    def __ff(self):
        print ("jjj")
    def __cmp__(self, other):
        if isinstance(other,car):
            if self.a>other.a:
                return 1
            elif self.a<other.a:
                return -1
            else:
                return 0
class var(car):
    def __init__(self,a,b,c):
        car.__init__(self,a,b)
        self.c=c

    def prin(c):
        print ("a:%s \nb: %s \nc: %s" % (c.a, c.b, c.c))

c= car(22,33)

car.kkk=88888
print(c.kkk)
c1=car (44.55)
print (c.__cmp__(c1))
print c.a
c.dd()
car.prin(c)
d= var(66,7777,88)
var.prin(d)


class point (object):
    ("mmmmmm")
    def __init__(self,x=0,y=0):
        self.x=x
        self.y=y
p1= point(7,9)
print(point.__doc__)

