from _collections import deque
x = 0
def sum_recursive(list):
    x, *tail = list
    print(x, '*****',tail)
    if len(tail) > 0:
        return x + sum_recursive(tail)
    else:
        return x

lista = [10,20]

# print(sum_recursive(lista))
#
# print(sum_recursive([10,20]))


listb = [int(10),str('abc')]
print(listb)

tup = (10,20,'string')
print(tup[0])
## copy of the dictionary
dic = {'rahul':100,'joe':90,'rv':2000}
print(dic.items())
for i,k in dic.items():
    print(i)

## fromkeys takes to iterables and builds a dictionary
print(dic.fromkeys(['rahul' ,'joe','rv'],1))
 
