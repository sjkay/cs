import tornado.ioloop
import tornado.web
import myutil
class MainHandler(tornado.web.RequestHandler):
    def get(self):
        self.render("index.html")
def make_app():
    return tornado.web.Application([
        (r"/", MainHandler),
    ])
if __name__ == "__main__":
    fs = myutil.FastStop()
    fs.enable()
    app = make_app()
    app.listen(8080)
    tornado.ioloop.IOLoop.current().start()