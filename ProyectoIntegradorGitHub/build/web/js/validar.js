function validar() {
	var nombre, apellido, cedula, email, contrasena, expresion;
	nombre = document.getElementById("nombre").value;
	apellido = document.getElementById("apellido").value;
	cedula = document.getElementById("cedula").value;
	email = document.getElementById("email").value;
	contrasena = document.getElementById("contrasena").value;
	expresion = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;

	if (nombre === "" || apellido === "" || cedula === "" || email === ""
			|| contrasena === "") {
		alert("Todos los campos son obligatorios");
		return false
	} else if (nombre.length > 15) {
		alert("El nombre es muy largo");
		return false
	} else if (apellido.length > 15) {
		alert("El apellido es muy largo");
		return false
	} else if (cedula.length > 10 || cedula.length < 10) {
		alert("La c\u00E9dula debe tener 10 caracteres");
		return false
	} else if (isNaN(cedula)) {
		alert("La c\u00E9dula ingresada no es un n\u00FAmero");
		return false
	} else if (!expresion.test(email)) {
		alert("Email no v\u00E1lido");
		return false
	}
}

function validarDos() {
	var cantidad, expresion;
	cantidad = document.getElementById("cantidad").value;

	if (cantidad === "") {
		alert("El campo cantidad es obligatorio");
		return false
	} else if (parseInt(cantidad) > 5) {
		alert("No puede adquirir m\u00E1s de 5 boletos");
		return false
	} else if (isNaN(cantidad)) {
		alert("La cantidad ingresada no es un n\u00FAmero");
		return false
	}
}

function validarTres() {
	var fecha, hora, expresion, expresion1, precio;
	fecha = document.getElementById("fecha").value;
	hora = document.getElementById("hora").value;
	precio = document.getElementById("precio").value;
	expresion = /^\d{4}-\d{2}-\d{2}$/;
	expresion1 = /^\d{2}:\d{2}$/;

	if (!expresion.test(fecha)) {
		alert("Fecha no valida");
		return false
	}

	if (!expresion1.test(hora)) {
		alert("Hora no valida");
		return false
	}

	if (isNaN(precio)) {
		alert("El precio debe ser un numero");
		return false
	}
}

function validarCuatro() {
	var fecha, hora, expresion, expresion1, precio;
	fecha = document.getElementById("fecha").value;
	hora = document.getElementById("hora").value;
	precio = document.getElementById("precio").value;
	expresion = /^\d{4}-\d{2}-\d{2}$/;
	expresion1 = /^\d{2}:\d{2}$/;

	if (fecha === "") {

	} else {
		if (!expresion.test(fecha)) {
			alert("Fecha no valida");
			return false
		}
	}

	if (hora === "") {

	} else {
		if (!expresion1.test(hora)) {
			alert("Hora no valida");
			return false
		}
	}

	if (precio === "") {

	} else {
		if (isNaN(precio)) {
			alert("El precio debe ser un numero");
			return false
		}
	}

}