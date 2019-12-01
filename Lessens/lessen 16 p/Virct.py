class vircel (object):
    def __init__(self,colore,spid_maxx):
        self.colore=colore
        self.spid_maxx=spid_maxx
class mobail(vircel):
    def __init__(self,colore,spid_maxx,whait,id):
        vircel.__init__(self,colore,spid_maxx)
        self.whait=whait
        self.id=id

    def __str__(self):
        return "iiiii"


class car (vircel):
    def __init__(self,colore,spid_maxx,age,model):
        vircel.__init__(self,colore,spid_maxx)
        self.age =age
        self.model=model

    @staticmethod
    def rodse():
        return "4 rodse"

class baik (vircel):
    def __init__(self,colore,spid_maxx,id_baik):
        vircel.__init__(self,colore,spid_maxx)
        self.id_baik=id_baik
m1=mobail("blue",60,150,"1111")
c1=car("liteblu",200,2006,"yyyy")
b1 = baik("black", 30,222222)
print(c1.spid_maxx)
print(m1.whait)
print(b1.colore)
print(car.rodse())
print(m1)





