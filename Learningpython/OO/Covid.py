import json
import urllib.request

from pandas import DataFrame as DF

url = urllib.request.urlopen('https://covidtracking.com/api/v1/states/current.json')
data = url.read()
parse_json = json.loads(data)
pdf = DF(parse_json)








