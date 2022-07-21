import math
class Vector:
    def __init__(self,lst,dim=None):
        self._vec = list(lst)
        if dim is None:
            self._dim = len(self._vec)
        else:
            self._dim = dim
    def dim(self):
        return self._dim
    def __repr__(self):
        return "Vector({0})".format(self._vec)
    def __str__(self):
        if (self.dim() > 3):
            return "Vector({},{},...)".format(self[0],self[1]);
        else:
            return self.__repr__()
    def __getitem__(self,key):
        return self._vec[key]
    def __setitem__(self,key,val):
        self._vec[key] = val
    def __add__(self,other):
        return Vector([self[i] + other[i] for i in range(self.dim())])
    def __sub__(self,other):
        return Vector([self[i] - other[i] for i in range(self.dim())])
    def size(self):
        return math.sqrt(sum([x*x for x in self._vec]))
        
class Point(Vector):
    def __init__(self,lst):
        super().__init__(lst)
    def distance(self,other):
        d=self-other
        return d.size()

p1 = Point(range(100))
p2 = Point(range(100))
p1[0] = 10
print("p1.distance(p2)=",p1.distance(p2))