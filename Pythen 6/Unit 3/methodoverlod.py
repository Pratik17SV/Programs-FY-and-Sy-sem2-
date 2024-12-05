class Animal:
    def feed(self):
        print('The animal eat Food.')
    def beeath(self):
        print('The animal is breathing')
class Human(Animal):
    def feed(self):
        print('The human eat vegitables.')

o1 = Human()
o1.beeath()
o1.feed()