import redis
import time

r = redis.Redis(host="192.168.33.10", port=6379, password='')
keys = r.keys('*')

for i in range(3):
    r.set("key" + str(i), time.time())

for i in range(100):
    r.set("test:key" + str(i), time.time())

for key in keys:
    print(key)


r.delete(*r.keys('test:key*'))
