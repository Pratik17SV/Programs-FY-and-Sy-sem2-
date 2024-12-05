import mysql.connector

mydb = mysql.connector.connect(
    host = "localhost",
    user = "root",
    password = "system",
    port = "3306",
    database = "python",
)

mycursor = mydb.cursor()

mycursor.execute("CREATE TABLE IF NOT EXISTS PAPER (Unit int)")
mydb.commit()

sql="INSERT INTO PAPER (Unit) VALUES(%s)"
val = [(1,),(2,),(3,)]

mycursor.executemany(sql,val)
mydb.commit()

mycursor.execute("select * from PAPER")
result = mycursor.fetchall()
for i in result:
    print(i)

