import requests

w = float(input('Wight'))
h = float(input('Height (cm)'))

data = {'weight': w, 'height': h}
url = "http://127.0.0.1:5000/bmi"

res = requests.post(url, json=data)
print(res.json())