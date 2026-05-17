from flask import Flask, request

app = Flask(__name__)

@app.route('/bmi', methods=['POST'])
def bmi():
    data = request.get_json()
    w = data['weight']
    h = data['height'] / 100
    bmi = w / (h * h)
    return {'bmi': round(bmi, 2)}

if __name__ == '__main__':
    app.run(debug=True)