class Node(object):
    def __init__(self,data,tail=None):
        self.data = data
        self.next = tail
        print('*'*10)
        print(id(self.next))
        print('-'*10)

class LinkedList:

    def __init__(self):
        self.head =None

    def add(self,value):
        x = Node(value,self.head)
        print(id(self.head))
        print(id(x))
        self.head = x

    def __iter__(self):
        it = self.head
        while it != None:
            yield it.data
            it = it.next

    def __repr__(self):
        return ','.join(map(str,self))


test1 = LinkedList()
test1.add(1)
print(test1)
