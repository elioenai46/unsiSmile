/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 17/Mayo/2023
 *Fecha modificación: 18/Mayo/2023
 *Descripcion: Se va a crear el formulario del administrador.
 */

$(document).ready(function () {
    //Sainos se hizo el cambio de java controller a js.
    $('formulario-agregar-alumno').submit(function (event) {
        event.preventDefault();
        //firstN viene del ProfesorServlet controller y primer-nombre viene del jsp actualizar añumno.
        var firstN = $('#primer-nombre').val();
        var secondN = $('#segundo-nombre').val();
        var Apa = $('#apellido-paterno').val();
        var Ama = $('#apellido-materno').val();
        var curp = $('#curp').val();
        var NumTel = $('#telefono').val();
        var sexo = $('#sexo').val();
        var fecha = $('#fecha').val();
        var NumT = $('#matricula').val();
        var correo = $('#email').val();
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





