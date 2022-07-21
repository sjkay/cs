import matplotlib.pyplot as plt, mpld3
import math
fig = plt.figure(1)
x = [x/100*2*math.pi for x in range(100)]
y = [math.sin(x) for x in x]
plt.clf()
plt.plot(x,y)
f = open('tmp.html', 'w')
f.write(mpld3.fig_to_html(fig))
f.close()