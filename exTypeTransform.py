import sys
# 数据类型
a = 0.5
b = 6
c = True
d = 4+3j
print(a)
print(b)
print(c)
print(d)
print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(isinstance(a, int))
print(isinstance(b, int))
# python中bool是int的子类，bool变量可以和数字相加
print(isinstance(c, int))
print(isinstance(d, int))

# 显式类型转换
# 预定义函数float(), int(), str()
print('-' * 15)
print(int(1))
print(int(3.8))
print(int("9"))
print('-' * 15)
print(float(1))
print(float(3.8))
print(float("9"))
print(float("5.20"))
print('-' * 15)
print(str("s111"))
print(str(2))
print(str(3.0))
print(str(True))
#print(int('a', base=16))
print(sys.float_info.max)
print(sys.float_info.min)