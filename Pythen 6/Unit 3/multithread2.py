from threading import Thread
import time

def wock_dog():
    time.sleep(2)
    print('done Wacking a dog.')

def studing_Subjects():
    time.sleep(3)
    for i in range(5):
        print('Finish studding',i+1,'.')

threat1 = Thread(target=wock_dog)
threat1.start()
threat2 = Thread(target=studing_Subjects)
threat2.start()
threat1.join()
threat2.join()
print('After exicution.')