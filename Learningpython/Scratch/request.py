class EarthQuake:
    def __init__(self,row):
        self.timestamp = row[0]
        self.lat = float(row[1])
        self.lon = float(row[2])
        try:
          self.magnitude = float(row[4])
        except ValueError:
          self.magnitude = 0
    def __str__(self):
        return '{}: {} : {}'.format(self.timestamp,self.lat,self.lon)


import requests
import io
import csv

def get_earthquake_data(url):
    response = requests.get(url)
    csvio = io.StringIO(response.text)
    reader = csv.reader(csvio)
    next(reader)
    quakes = [EarthQuake(i) for i in reader]
    return quakes

if __name__ == '__main__':
    test = get_earthquake_data('http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.csv')
    for i in test:
        print(i)
