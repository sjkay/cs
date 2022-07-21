import matplotlib.pyplot as plt
import math
import numpy as np
t=np.arange(-10,10,0.01)
def f(t):
    return (1/(math.e**(t**2)))*np.cos(5*t) - 0.1
plt.plot(t, f(t))
plt.plot([-10,10],[0,0])
plt.show()
