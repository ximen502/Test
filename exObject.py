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