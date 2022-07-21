# -*- Coding: utf-8 -*-
from tornado.ioloop import IOLoop
from tornado.web import Application,RequestHandler,url
class MainHandler(RequestHandler):
	def get(self):
		self.render('main.html',title="한글",mesg="한글을 사랑합시다")
def make_app():
    return Application([
            url(r"/",MainHandler)])
if __name__ == "__main__":
       app = make_app()
       app.listen(8080)
       IOLoop.current().start()
