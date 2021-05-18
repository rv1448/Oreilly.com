class Stacks(object):

    def __init__(self):
        self.container = []
        self.pointer = 0

    def push(self,input):
        self.container.append(input)
        self.pointer = self.pointer+1

    def pop(self):
        if self.pointer > 0:
            val = self.container[self.pointer-1]
            return val
        else:
            return False


stac =  Stacks()
stac.push(3)
stac.push(3)
stac.push(3)
stac.pop()

print(stac.container)

