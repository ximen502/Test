things = "Apples Oranges Pears Piches"

stuff = things.split(' ')

print(things)
print(stuff)

# pop()函数从右向左一次获取并删除一个元素
while len(stuff) > 0:
    print(stuff.pop())

print(stuff)

# append(element)函数添加一个元素
while len(stuff) != 10:
    temp = input("input a fruit>")
    print(f"Adding {temp}")
    stuff.append(temp)
    print(f"Now there are {len(stuff)} items")

print('-' * 20)
print(stuff)

print(stuff[1])
print(stuff[-1])

print(' '.join(stuff))
print('#'.join(stuff[3:5]))
