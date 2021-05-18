## You can use Double quote or single quote while using the string


message1 = 'Im excited about the new role'
print(message1)
message1 = 'I was so miserable in the last job'
print(message1)

## changing case of a string
## print(dir(message1))



# ['__add__', '__class__', '__contains__', '__delattr__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__getitem__', '__getnewargs__', '__gt__', '__hash__', '__init__', '__init_subclass__', '__iter__', '__le__', '__len__', '__lt__', '__mod__', '__mul__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__rmod__', '__rmul__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', 'capitalize', 'casefold', 'center', 'count', 'encode', 'endswith', 'expandtabs', 'find', 'format', 'format_map', 'index', 'isalnum', 'isalpha', 'isascii', 'isdecimal', 'isdigit', 'isidentifier', 'islower', 'isnumeric', 'isprintable', 'isspace', 'istitle', 'isupper', 'join', 'ljust', 'lower', 'lstrip', 'maketrans', 'partition', 'replace', 'rfind', 'rindex', 'rjust', 'rpartition', 'rsplit', 'rstrip', 'split', 'splitlines', 'startswith', 'strip', 'swapcase', 'title', 'translate', 'upper', 'zfill']

# __add__

s1 = 'foo'
s2 = 'bar'
print(s1+s2)
print(s1.__hash__())

print('###############################################')

## USING VARIABLE IN A STRING
## fstring are used in python   3.7
## anything prior to 3.6 use format

firstname = 'ada'
lastname = 'lovelace'
print(f'{firstname}...{lastname}')
print(f'{firstname} {lastname.title()}')

message = f'Hello, {firstname} {lastname.title()}'
fullname = '{} 3.6 and prior {}'.format(firstname, lastname)
print(fullname)

text = f'python \nis a great language for\n\tairflow'
print(text)

## STRIPPING WHITE SPACE

x, y , z = 0,0,0
help(str)


hello_arabic = 'مرحبا'
print(bytes(hello_arabic,encoding='base64'))
# arabic b'\xd9\x85\xd8\xb1\xd8\xad\xd8\xa8\xd8\xa7'
# arabic b"\xff\xfeE\x061\x06-\x06(\x06'\x06"

