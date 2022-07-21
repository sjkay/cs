from tornado.ioloop import IOLoop
from tornado.web import Application,RequestHandler,url
import matplotlib.pyplot as plt
import mpld3, math, myutil

def zero_finder(f,start,end,eps=1E-9):
    y1 = f(start)
    y2 = f(end)
    if y1*y2 >= 0:
        self.render('error.html', error="zero finder")
    x = (start + end)/2
    y = f(x)
    while math.fabs(y) >= eps:
        if y1*y < 0:
            end = x
        else:
            start = x
        x = (start + end)/2
        y = f(x)
    x= float(x)
    return x
def solution_finder(f,start=-100,end=100,n=1000,eps=1E-9):
    answers=[]
    length=end-start
    part=length/n
    a=start
    b=a+part
    while(b<end):
        if f(a)*f(b)<0:
            answers.append(zero_finder(f,a,b))
        a=b
        b+=part
    return answers

class MainHandler(RequestHandler):
    def draw(self,f1=None, f2=None, f3=None,f4=None, f5=None,f6=None, f7=None,f8=None, f9=None, xmin=-3, xmax=3):
        t = range(int(xmin)*100,int(xmax)*100)
        x = [t/100 for t in t]
        fig = plt.figure(1)
        fig.clf()
        if f1:
            y = [f1(x) for x in x]
            line1 = plt.plot(x,y, label='fn1')
            a1 = solution_finder(f1,-100,100)
            b1 = [0 for x in a1]
            plt.plot(a1,b1,marker='o', color='r', ls='')
        if f2:
            y = [f2(x) for x in x]
            line2 = plt.plot(x,y, label='fn2')
            a2 = solution_finder(f2,-100,100)
            b2 = [0 for x in a2]
            plt.plot(a2,b2,marker='o', color='r', ls='')
        if f3:
            y = [f3(x) for x in x]
            line3 = plt.plot(x,y, label='fn3')
            a3 = solution_finder(f3,-100,100)
            b3 = [0 for x in a3]
            plt.plot(a3,b3,marker='o', color='r', ls='')
        if f4:
            y = [f4(x) for x in x]
            line4 = plt.plot(x,y, label='fn4')
            a4 = solution_finder(f4,-100,100)
            b4 = [0 for x in a4]
            plt.plot(a4,b4,marker='o', color='r', ls='')
        if f5:
            y = [f5(x) for x in x]
            line5 = plt.plot(x,y, label='fn5')
            a5 = solution_finder(f5,-100,100)
            b5 = [0 for x in a5]
            plt.plot(a5,b5,marker='o', color='r', ls='')
        if f6:
            y = [f6(x) for x in x]
            line6 = plt.plot(x,y, label='fn6')
            a6 = solution_finder(f6,-100,100)
            b6 = [0 for x in a6]
            plt.plot(a6,b6,marker='o', color='r', ls='')
        if f7:
            y = [f7(x) for x in x]
            line7 = plt.plot(x,y, label='fn7')
            a7 = solution_finder(f7,-100,100)
            b7 = [0 for x in a7]
            plt.plot(a3,b3,marker='o', color='r', ls='')
        if f8:
            y = [f8(x) for x in x]
            line8 = plt.plot(x,y, label='fn8')
            a8 = solution_finder(f8,-100,100)
            b8 = [0 for x in a8]
            plt.plot(a8,b8,marker='o', color='r', ls='')
        if f9:
            y = [f9(x) for x in x]
            line9 = plt.plot(x,y, label='fn9')
            a9 = solution_finder(f9,-100,100)
            b9 = [0 for x in a9]
            plt.plot(a9,b9,marker='o', color='r', ls='')
        plt.legend()
        html = mpld3.fig_to_html(fig)
        a1=None
        b1=None
        a2=None
        b2=None
        a3=None
        b3=None
        a4=None
        b4=None
        a5=None
        b5=None
        a6=None
        b6=None
        a7=None
        b7=None
        a8=None
        b8=None
        a9=None
        b9=None
        eps=1E-9
        self.render('index.html',mesg=html,data=(a1,eps,b1,eps,a2,eps,b2,eps,a3,eps,b3,eps,
                                        a4,eps,b4,eps,a5,eps,b5,eps,a6,eps,b6,eps,
                                        a7,eps,b7,eps,a8,eps,b8,eps,a9,eps,b9,eps))
    def get(self):
        f = lambda x: x*x
        self.draw(f)
    def graph(self):
        ldict = locals()
        f1 = self.get_body_argument('fn1',default=None)
        f2 = self.get_body_argument('fn2',default=None)
        f3 = self.get_body_argument('fn3',default=None)
        f4 = self.get_body_argument('fn4',default=None)
        f5 = self.get_body_argument('fn5',default=None)
        f6 = self.get_body_argument('fn6',default=None)
        f7 = self.get_body_argument('fn7',default=None)
        f8 = self.get_body_argument('fn8',default=None)
        f9 = self.get_body_argument('fn9',default=None)
        xmin = self.get_body_argument('xmin',default=-3)
        xmax = self.get_body_argument('xmax',default=3)
        if xmin == '':
            xmin = -3
        if xmax == '':
            xmax = 3
        try:
            if f1:
                exec(f1,globals(),ldict)
                f1 = ldict['f']
            if f2:
                exec(f2,globals(),ldict)
                f2 = ldict['f']
            if f3:
                exec(f3,globals(),ldict)
                f3 = ldict['f']
            if f4:
                exec(f4,globals(),ldict)
                f4 = ldict['f']
            if f5:
                exec(f5,globals(),ldict)
                f5 = ldict['f']
            if f6:
                exec(f6,globals(),ldict)
                f6 = ldict['f']
            if f7:
                exec(f7,globals(),ldict)
                f7 = ldict['f']
            if f8:
                exec(f8,globals(),ldict)
                f8 = ldict['f']
            if f9:
                exec(f9,globals(),ldict)
                f9 = ldict['f']
        except Exception:
            self.render('error.html', error="function input")
        self.draw(f1, f2,f3,f4,f5,f6,f7,f8,f9, xmin, xmax)
    def find(self):
        f1 = self.get_body_argument('fn1',default=None)
        f2 = self.get_body_argument('fn2',default=None)
        f3 = self.get_body_argument('fn3',default=None)
        f4 = self.get_body_argument('fn4',default=None)
        f5 = self.get_body_argument('fn5',default=None)
        f6 = self.get_body_argument('fn6',default=None)
        f7 = self.get_body_argument('fn7',default=None)
        f8 = self.get_body_argument('fn8',default=None)
        f9 = self.get_body_argument('fn9',default=None)
        xmin = self.get_body_argument('xmin',default=-3)
        xmax = self.get_body_argument('xmax',default=3)
        if xmin == '':
            xmin = -3
        if xmax == '':
            xmax = 3
        a1=None
        b1=None
        a2=None
        b2=None
        a3=None
        b3=None
        a4=None
        b4=None
        a5=None
        b5=None
        a6=None
        b6=None
        a7=None
        b7=None
        a8=None
        b8=None
        a9=None
        b9=None
        eps=1E-9
        try:
            if f1:
                exec(f1,globals(),ldict)
                f1 = ldict['f']
                [a1,b2]=solution_finder(f1,-10,10,eps=eps)
            if f2:
                exec(f2,globals(),ldict)
                f2 = ldict['f']
                a2=zero_finder(f2,-100000,100000,eps=eps)
                b2=zero_finder(f2,-100000,100000,eps=eps)
            if f3:
                exec(f3,globals(),ldict)
                f3 = ldict['f']
                a3=zero_finder(f3,-100000,100000,eps=eps)
                b3=zero_finder(f3,-100000,100000,eps=eps)
            if f4:
                exec(f4,globals(),ldict)
                f4 = ldict['f']
                a4=zero_finder(f4,-100000,100000,eps=eps)
                b4=zero_finder(f4,-100000,100000,eps=eps)
            if f5:
                exec(f5,globals(),ldict)
                f5 = ldict['f']
                a5=zero_finder(f5,-100000,100000,eps)
                b5=zero_finder(f5,-100000,100000,eps)
            if f6:
                exec(f6,globals(),ldict)
                f6 = ldict['f']
                a6=zero_finder(f6,-100000,100000,eps)
                b6=zero_finder(f6,-100000,100000,eps)
            if f7:
                exec(f7,globals(),ldict)
                f7 = ldict['f']
                a7=zero_finder(f7,-100000,100000,eps)
                b7=zero_finder(f7,-100000,100000,eps)
            if f8:
                exec(f8,globals(),ldict)
                f8 = ldict['f']
                a8=zero_finder(f8,-100000,100000,eps)
                b8=zero_finder(f8,-100000,100000,eps)
            if f9:
                exec(f9,globals(),ldict)
                f9 = ldict['f']
                a9=zero_finder(f9,-100000,100000,eps)
                b9=zero_finder(f9,-100000,100000,eps)
        except Exception:
            self.render('error.html', error="function input")
        fig = plt.figure(1)
        fig.clf()
        html = mpld3.fig_to_html(fig)
        self.render('index.html',mesg=html,data=(a1,eps,b1,eps,a2,eps,b2,eps,a3,eps,b3,eps,
                                        a4,eps,b4,eps,a5,eps,b5,eps,a6,eps,b6,eps,
                                        a7,eps,b7,eps,a8,eps,b8,eps,a9,eps,b9,eps))
    def post(self):
        cmd = self.get_body_argument('cmd')
        if cmd == 'graph':
            self.graph()
        elif cmd == 'solve':
            self.find()
        else:
            self.render('error.html',error="function input")
def make_app():
    return Application([
            url(r"/",MainHandler)])
if __name__ == "__main__":
    fs = myutil.FastStop()
    fs.enable()
    app = make_app()
    app.listen(8080)
    IOLoop.current().start()