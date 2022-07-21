# -*- coding: utf-8 -*-
# Filename: testser.py
import pickle
f = open('tmp.bin', 'wb')
s1 = 'English'
s2 = '한글'
pickle.dump([s1,s2],f)
f.close()
f = open('tmp.bin', 'rb')
x = pickle.load(f)
s1 = x[1]
s2 = x[0]
f.close()
print(s1)
print(s2)