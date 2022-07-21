from tornado.ioloop import IOLoop
from tornado.web import Application,RequestHandler,url
import matplotlib.pyplot as plt
import mpld3, math, myutil
class MainHandler(RequestHandler):
    def draw(self,f):
        t = range(-300,300)
        x = [t/100 for t in t]
        y = [f(x) for x in x]
        fig = plt.figure(1)
        fig.clf()
        plt.plot(x,y)
        html = mpld3.fig_to_html(fig)
        self.render('index.html',mesg=html)
    def get(self):
        f = lambda x: x*x
        self.draw(f)
    def post(self):
        ldict = locals()
        fn = self.get_body_argument('fn')
        try:
            exec(fn,globals(),ldict)
            f = ldict['f']
            self.draw(f)
        except Exception:
            self.render('error.html')
def make_app():
    return Application([
            url(r"/",MainHandler)])
if __name__ == "__main__":
    fs = myutil.FastStop()
    fs.enable()
    app = make_app()
    app.listen(8080)
    IOLoop.current().start()