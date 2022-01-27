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

arr = json.dumps(jsonArray, ensure_ascii=False)
print(arr)