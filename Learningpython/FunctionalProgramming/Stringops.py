line = 'asdf fjdk; afed, fjek,asdf,      foo'

import re
from urllib.request import urlopen

print(re.split(r'[\s;,]',line))

print(re.split(r'(;|,|\s)\s*',line))


def request(link):
    if link.startswith(('http:','https:','ftp:')):
        return urlopen(link)
    else:
        with open(link) as f:
            return f.readlines()

inp = ['http://www.python.org','http://www.python.org']
url = 'http://www.python.org'
choices = ['https:','http:']


url.startswith(tuple(choices))


