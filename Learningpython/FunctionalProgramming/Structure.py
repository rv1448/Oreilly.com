class Structure(object):
    _fields = []

    def __init__(self, *args, **kwargs):
        if len(args) != len(self._fields):
            raise TypeError(
                'Expected {} arguements'.format(len(self._fields))
            )

        for name, value in zip(self._fields,args):
            setattr(self,name,value)

        ##Check for any Kwargs
        extra_tags = kwargs.keys() - self._fields




if __name__ == '__main__':
    class Stock(Structure):
        _fields = ['name','shares','price']

stoc = ['name','length','cat','bat','fiel']
print(stoc[2:]) 
