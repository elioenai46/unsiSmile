/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 17/Mayo/2023
 *Fecha modificación: 18/Mayo/2023
 *Descripcion: Se va a crear el formulario para crear el alumno.
 */

$(document).ready(function () {
    $('Agregar_Alumno').click(function (event) {
        event.preventDefault();
        var nombre = $('#nombre').val();
        var nombre2 = $('#nombre2').val();
        var apellido = $('#apellido').val();
        var apellido2 = $('#apellido2').val();
        var sexo = $('#sexo').val();
        var curp = $('#curp').val();
       // var Semestre = $('#Semestre1').val();
        var matricula = $('#matricula').val();
        var telefono = $('#telefono').val();
        var email = $('#email').val();
        var idCatedratico = $('#idCatedratico').val();
        
        alert('' + nombre + ', ' + nombre2 + ', ' + apellido + ', ' + apellido2
                + ', ' + sexo + ', ' + curp + ', '
                + Semestre + ', ' + Grupo + ', ' + matricula + ', ' + telefono
                + ', ' + email);
        $.ajax({
            url: '../../AlumnoController?accion=crear',
            type: 'POST',

            data: {
                nombre: nombre,
                nombre2: nombre2,
                apellido: apellido,
                apellido2: apellido2,
                sexo: sexo,
                curp: curp,
                Semestre: Semestre,
                matricula: matricula,
                telefono: telefono,
                email: email,
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





