
// Autor: Salvador Elioenai Antonio Pérez
// Descripción: Agregar solo tipos de datos numericos a las tablas

const cells = document.getElementsByClassName("table-cell"); // Obtener todas las celdas con la clase "table-cell"

// Iterar sobre cada celda y agregar un evento de escucha para el evento "input"
Array.from(cells).forEach(cell => {
  cell.addEventListener("input", function () {
    const inputValue = this.innerText.trim();
    const parsedValue = parseFloat(inputValue);

    // Validar si el valor ingresado es un número válido de tipo "double"
    const isValid = /^-?\d*\.?\d*$/.test(inputValue);

    if (!isValid) {
      // Restaurar el contenido anterior si el valor no es válido
      this.innerText = "";
    }
  });

  // Agregar un evento de escucha para el evento "keydown" (pulsación de tecla)
  cell.addEventListener("keydown", function (event) {
    // Obtener el código de la tecla pulsada
    const keyCode = event.keyCode || event.which;

    // Permitir solo números, el punto decimal, la tecla "Tab" (9) y la tecla "Backspace" (8)
    if (
      (keyCode < 48 || keyCode > 57) && // Números de 0 a 9
      (keyCode < 96 || keyCode > 105) && // Números del teclado numérico
      keyCode !== 190 && // Punto decimal
      keyCode !== 110 && // Punto decimal del teclado numérico
      keyCode !== 9 && // Tabulador
      keyCode !== 8 // Retroceso (borrar)
    ) {
      // Cancelar el evento de teclado
      event.preventDefault();
    }
  });
});

// Autor: Salvador Elioenai Antonio Pérez
// Descripción: Obtener datos de cada una de las celdas de las tablas
/*
$(document).ready(function () {
  $('#btnEnviar').click(function () {
    let items = []
    $('td').each(function () {
      if ($(this).attr('id'))
      alert($(this).text())
        //items.push($(this).text());
    });
  });
});

*/


function validarTabla() {
  var tabla = document.getElementById("miTabla");
  var celdas = tabla.getElementsByTagName("td");

  var celdasVacias = false;

  for (var i = 0; i < celdas.length; i++) {
    if (celdas[i].innerHTML.trim() === "") {
      celdasVacias = true;
      break;
    }
  }

  if (celdasVacias) {
    alert("Aún hay celdas por rellenar.");
  } else {
    // Aquí puedes agregar el código para enviar los datos
    alert("Datos enviados correctamente.");
  }
}