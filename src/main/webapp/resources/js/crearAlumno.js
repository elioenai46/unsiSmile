/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 17/Mayo/2023
 *Fecha modificación: 18/Mayo/2023
 *Descripcion: Se va a crear el formulario para crear el alumno.
 */

$(document).ready(function () {
    $('formulario-agregar-alumno').submit(function (event) {
        event.preventDefault();
        //firstN viene del ProfesorServlet controller y primer-nombre viene del jsp actualizar añumno.
        var nombre = $('#nombre').val();
        var nombre2 = $('#nombre2').val();
        var apellido = $('#apellido').val();
        var apellido2 = $('#apellido2').val();
        var sexo = $('#sexo').val();
        var curp = $('#curp').val();
        var Semestre = $('#Semestre1').val();        
        var Grupo = $('#Grupo1').val();
        var matricula = $('#matricula').val();        
        var idCatedratico = $('#idCatedratico').val();
        alert('N: ' + firsN + 'r:' + sexo + 'fecha' + fecha);
        $.ajax({
            url: '../../ProfesorServlet',
            type: 'POST',

            data: {
                firstN: firstN,
                secondN: secondN,
                Apa: Apa,
                Ama: Ama,
                curp: curp,
                NumTel: NumTel,
                sexo: sexo,
                fecha: fecha,
                NumT: NumT,
                correo: correo,
                idCatedratico: idCatedratico
            },
            success: function (response) {
                // código a ejecutar cuando la petición es exitosa
                console.log(response);
            },
            error: function (xhr, status, error) {
                // código a ejecutar cuando la petición falla
                console.log("Error: " + error);
            }
        });
    });
});





