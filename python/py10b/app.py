import tornado.ioloop
from tornado.web import RequestHandler
import myutil
class MainHandler(RequestHandler):
    def get(self):
        self.render("index.html")
class WelcomeHandler(RequestHandler):
    def get(self):
        self.render("error.html", msg='GET /welcome')
    def post(self):
        str = self.get_body_argument('str')
        print(type(str))
        self.render('welcome.html', world=str)
def make_app():
    return tornado.web.Application([
        (r"/", MainHandler),
        (r"/welcome", WelcomeHandler),
    ])
if __name__ == "__main__":
    fs = myutil.FastStop()
    fs.enable()
    app = make_app()
    app.listen(8080)
    tornado.ioloop.IOLoop.current().start()