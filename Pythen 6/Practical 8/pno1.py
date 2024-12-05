import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="system",
    database="python",
    port = "3306"
)

mycursor = mydb.cursor()

mycursor.execute("CREATE TABLE IF NOT EXISTS customerdata(Product varchar(100), cost int)")
mydb.commit()

sql = "INSERT INTO customerdata (Product, cost) values (%s, %s)"
val = [("Iphone", "60000"), ("charger", "1999")]

mycursor.executemany(sql, val)
mydb.commit()

print("Two values entered")
mycursor.execute("select * from customerdata")
myresult = mycursor.fetchall()
for x in myresult:
    print(x)

