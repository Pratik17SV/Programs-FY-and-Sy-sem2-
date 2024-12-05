import mysql.connector

mydb =mysql.connector.connect(
    host="localhost",
    user="root",
    password="system",
    database="python",
    port = "3306"
)

mycursor = mydb.cursor()

mycursor.execute("CREATE TABLE IF NOT EXISTS PYTHON_TOPIC (Name varchar(50),marks int)")
mydb.commit()

sql = "INSERT INTO PYTHON_TOPIC (Name,marks)  VALUES(%s,%s)"
val = [("Inheritence",10),("tkinter",10)]

mycursor.executemany(sql,val)
mydb.commit()

mycursor.execute("select * from PYTHON_TOPIC ")
result = mycursor.fetchall()
for i in result:
    print(i)
