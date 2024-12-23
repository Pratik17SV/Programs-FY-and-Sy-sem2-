

class Car:
    def __init__(self,max_speed,unit = "Km/h"):
        return  print("Car with the maximum speed of ",max_speed,unit)
        
    

class Boat:
    def __init__(self,max_speed):
        return print("Boat with the maximum speed of ",max_speed," Knots")


c = Car(120)
b = Boat(50)
        
