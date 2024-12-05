from tkinter import * 

root = Tk()

root.title('Notepad')
root.geometry('1000x600')

menubar = Menu(root)
root.config(menu=menubar)

filemenu = Menu(menubar,tearoff=False)
menubar.add_cascade(label='File',menu=filemenu)
filemenu.add_command(label='Open')
filemenu.add_command(label='Exit')
filemenu.add_separator()
filemenu.add_command(label='copy')

editmenu = Menu(menubar,tearoff=FALSE)
menubar.add_cascade(label='Edit',menu=editmenu)
editmenu.add_command(label='Copy')

viewmenu = Menu(menubar,tearoff=False)
menubar.add_cascade(label='View')
viewmenu.add_command(label='Zoom')

root.mainloop()