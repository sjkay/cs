from tornado.ioloop import IOLoop
from tornado.web import RequestHandler, Application
import myutil
class MainHandler(RequestHandler):
    def get(self):
        self.render("index.html")
class TableHandler(RequestHandler):
    def post(self):
        name0 = str(self.get_body_argument('name-0'))
        midterm0 = float(self.get_body_argument('midterm-0'))
        final0 = float(self.get_body_argument('final-0'))
        name1 = str(self.get_body_argument('name-1'))
        midterm1 = float(self.get_body_argument('midterm-1'))
        final1 = float(self.get_body_argument('final-1'))
        name2 = str(self.get_body_argument('name-2'))
        midterm2 = float(self.get_body_argument('midterm-2'))
        final2 = float(self.get_body_argument('final-2'))
        self.render("sum.html", data=(name0,midterm0,final0,midterm0+final0,
                                    name1,midterm1,final1,midterm1+final1,
                                    name2,midterm2,final2,midterm2+final2))
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