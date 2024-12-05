num<- as.integer(readline(prompt="Enter the number:"))
repeat{
    print(num)
    num<- num - 1
    if (num==0)
    {
        break
    } 
}