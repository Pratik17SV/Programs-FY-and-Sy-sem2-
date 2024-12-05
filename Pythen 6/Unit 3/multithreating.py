from threading import Thread
import time

def dogwock():
    time.sleep(5)
    print('Finish waking the dog.')
def mail():
    time.sleep(4)
    print('Finish sending the mail.')
def study():
    time.sleep(3)
    print("finish studing.")

thread1 =  Thread(target=dogwock)
thread1.start()

thread2 = Thread(target=mail)
thread2.start()

thread3 = Thread(target=study)
thread3.start()

thread1.join()
thread2.join()
thread3.join()
print("Finish the threts.")