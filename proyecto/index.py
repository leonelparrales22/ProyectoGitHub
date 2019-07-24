from flask import Flask


app = Flask(__name__)

@app.route('/') #decoradores el slash denota la raiz
def inicio() -> str: #esta funcion va a devolver un string
return "Bienvenido"

