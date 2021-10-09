provinces = {
        '山东':'鲁',
        '河南':'豫',
        '河北':'冀',
        '山西':'晋'
        }

print('-' * 20)

# 圆括号括起来的k-v
print(provinces.items())
# 方括号括起来的k-v
print(list(provinces.items()))

print('-' * 30)
# list()方法去掉了圆括号，python可以直接调用的函数真的很多
# 感觉像是将参数内容变成了一个json array
for 省, 简称 in list(provinces.items()):
    print(f"{省}省的简称是{简称}")

prov_cities = {
        '山东':'济南',
        '河南':'郑州',
        '河北':'石家庄',
        '山西':'太原'
        }

print('-' * 30)
for 省, 省会 in list(prov_cities.items()):
    print(f"{省}省的省会城市是{省会}")

print(provinces.get('山东'))
print(provinces['山东'])

# 可以防止报错 keyError
print(provinces.get('辽宁'))
p = provinces.get('辽宁')
if not p:
    print("没有辽宁省的key")

# 程序将会报错终止
print(provinces['辽宁'])

print("===")
