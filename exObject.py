import json

class User:
    def __init__(self, name, age) -> None:
        self.name = name
        self.age = age

def obj2Dict(obj):
    if isinstance(obj, User):
        return {"name":obj.name, "age":obj.age}
    else:
        return obj

usr = User("赵一伤", 40)
uobj = json.dumps(usr, default=obj2Dict)
print(uobj)

usr2 = User("钱二败", 44)
uobj2 = json.dumps(usr2, default=obj2Dict)
print(uobj2)

list = []
list.append(usr)
list.append(usr2)
for u in list:
    print(f"{u.name}, {u.age}")

jsonArray = []
jsonArray.append(uobj)
jsonArray.append(uobj2)
print(jsonArray)

# 下面的这个方法并不能将这个list的数据转化为合法的jsonArray
arr = json.dumps(jsonArray, ensure_ascii=False)
print(arr)

# list转json数组最终版，性能略差
strList = []
for obj in list:
    str = json.dumps(obj, default=obj2Dict)
    #print(str)
    strList.append(str)
ja = "[" + ",".join(strList) + "]"
print(ja)
#print(array)