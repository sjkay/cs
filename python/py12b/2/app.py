from tornado.ioloop import IOLoop
from tornado.web import RequestHandler, Application
import myutil
class MainHandler(RequestHandler):
    def get(self):
        self.render("index.html")
class TableHandler(RequestHandler):
    def post(self):
        midterm = float(self.get_body_argument('midterm'))
        final = float(self.get_body_argument('final'))
        self.render("sum.html", data=(midterm,final,midterm+final))
def make_app():
    return Application([
        (r"/", MainHandler),
        (r"/sum", TableHandler)
    ])
if __name__ == "__main__":
    fs = myutil.FastStop()
    fs.enable()
    app = make_app()
    app.listen(8080)
    IOLoop.current().start()