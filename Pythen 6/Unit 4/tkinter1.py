from tkinter import *
from tkinter import messagebox
def message():
    name = ent1.get()
    messagebox.showinfo('Registered','Login is Successful '+name)
    x = 2;y = 10 
    z = x // y
    print(z)


win = Tk() 
win.geometry('500x500')
win.title('Register Window')

heading = Label(text='Register Here!')
heading.grid(row=0,column=0)

label1 = Label(text='Name:')
label1.grid(row=1, column=0)
ent1 = Entry()
ent1.grid(row=1, column=1)

label2 = Label(text='Password:')
label2.grid(row=2, column=0)
ent2 = Entry(show='*')
ent2.grid(row=2,column=1)

bt = Button(text="click",padx=10,pady=10,command=message)
bt.grid(row=3,column=2)

win.mainloop()
