# python实现倒计时的一种方法
import threading
import time

exec_count = 0

def down():
    print(time.strftime("%Y-%m-%d %H:%M:%S"))
    global exec_count
    exec_count += 1
    if exec_count < 5:
        threading.Timer(1, down).start()

down()