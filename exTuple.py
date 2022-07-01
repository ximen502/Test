tup1 = ('Google', 'Apple', 'MicroSoft', 'Tencent', 'Baidu', 'Alibaba')
print(tup1)
print(tup1[0])
print(tup1[-1])
print(tup1[5])
#print(tup1[6])
#TypeError: 'tuple' object does not support item assignment
#tup1[0] = 'Amazon'
print(tup1[1:5])

tup2 = (12, 3.14)
tup3 = ('abc', 'hok')
tup4 = tup2 + tup3
print(tup4)
print(id(tup4))

print(tup1)
del tup1
print(tup1)
