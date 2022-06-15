import time

t = time.localtime()
print(t.tm_year, t.tm_mon, t.tm_mday, t.tm_hour, t.tm_min, t.tm_sec)

now_time = time.strftime('%Y-%m-%d %H:%M:%S', t)
print(now_time)
