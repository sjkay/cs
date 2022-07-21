from skimage import novice,data
class MyPic():
    def __init__(self,filename):
        self.pic = novice.open(data.data_dir + "/" + filename)
    def threshold(self,p):
        if p > 255:
            return 255
        else:
            return int(p)
    def show(self):
        self.pic.show()
    def sum(self):
        (r,g,b,a) = (0,0,0,0)
        for p in self.pic:
            r += p.red
            g += p.green
            b += p.blue
            a += p.alpha
        return (r,g,b,a)
    def grey(self):
        for p in self.pic:
            (r,g,b) = (p.red, p.green, p.blue)
            grey = self.threshold((r + g + b)/3)
            (p.red,p.green,p.blue)=(grey,grey,grey)
    def bluered(self):
        for y in range(self.pic.height):
            for x in range(self.pic.width//2):
                self.pic.p=self.pic[x,y]
                self.pic[x,y] = (self.pic.p.red,self.pic.p.green,255)
            for x in range(self.pic.width//2):
                self.pic.p=self.pic[x+self.pic.width//2,y]
                self.pic[x+self.pic.width//2,y] = (255, self.pic.p.green, self.pic.p.blue)
    def sepia(self):
        for p in self.pic:
            (r,g,b) = (p.red, p.green, p.blue)
            p.red = min(r*.393 + g*.769 + b*.189, 255)
            p.green = min(r*.349 + g*.686 + b*.168, 255)
            p.blue = min(r*.272 + g*.534 + b*.131, 255)

pic = MyPic("chelsea.png")
pic.sepia()
pic.show()