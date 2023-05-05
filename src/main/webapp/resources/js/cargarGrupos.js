/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de mayo de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Descripción: archivo js para actulizar el combobox de grupos de manera 
 *              dinámica cuando cambia el valor contenido en el combobox de
 *              semestres
 */



$(document).ready(function () {
    $("#Semestre1").click(function () {
        var val = $("#Semestre1").val();
        // Enviar valor al servlet
        $.ajax({
            url: '../../AlumnoController',
            type: 'post',
            data: {
                val: val
            },
            success: function (responseText) {
                var $combobox = $('#Grupo1'); // Obtener el elemento select
                $combobox.empty(); // Limpiar las opciones existentes del select
                var data = JSON.parse(responseText); // Convertir la cadena JSON en un objeto JavaScript
                $.each(data, function (index, value) {
                    $combobox.append($('<option>').text(value));
                    // Agregar una nueva opción al select por cada elemento en la respuesta
                });
            }
        });
    });
});
