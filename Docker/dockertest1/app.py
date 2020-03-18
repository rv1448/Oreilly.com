from flask import Flask
app = Flask(__name__)

@app.route("/")
def home():
    return "this is a docker first build"


if __name__ = "__main__":
    app.run(debug=True,localost=0.0.0.0)
