from tornado.ioloop import IOLoop
from tornado.web import RequestHandler, Application
import myutil
class MainHandler(RequestHandler):
    def get(self):
        y = [(i,j,i*j) for i in range(2,20) for j in range(1,20)]
        self.render("index.html", data=y)
def make_app():
    return Application([
        (r"/", MainHandler),
    ])
if __name__ == "__main__":
    fs = myutil.FastStop()
    fs.enable()
    app = make_app()
    app.listen(8080)
    IOLoop.current().start()