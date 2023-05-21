/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 17/Mayo/2023
 *Fecha modificación: 18/Mayo/2023
 *Descripcion: Se va a crear el formulario para crear el alumno.
 */

$(document).ready(function () {
    
    $('#formulario_agregar_alumno').submit(function (event) {
        event.preventDefault();
        var PrimerNombre = $('#nombre').val();
        var SegundoNombre = $('#nombre2').val();
        var ApellidoPaterno = $('#apellido').val();
        var ApellidoMaterno = $('#apellido2').val();
        var sexo = $('#sexo').val();
        var curp = $('#curp').val();
        var grupo = $('#grupo').val();
        var Semestre = $('#Semestre').val();
        var matricula = $('#matricula').val();
        var telefono = $('#telefono').val();
        var email = $('#email').val();
        var idCatedratico = $('#idCatedratico').val();
        
        alert('\nPrimerNombre:'+PrimerNombre + '\nSegundoNombre:' + SegundoNombre + 
                '\nApellidoPaterno:' + ApellidoPaterno + '\nApellidoMaterno.' + ApellidoMaterno +      
                '\nsexo:' + sexo + '\ncurp:' +  curp +  '\ngrupo:' + grupo + '\nSemestre:' + Semestre + 
                '\nMatricula:' + matricula + '\nTeléfono:' + telefono + '\nEmail:' + email + '\nIdCatedratico:' + idCatedratico );

        
       $.ajax({
            url: '../../AlumnoController',

            type: 'POST',

            data: {
                nombre: PrimerNombre,
                nombre2: SegundoNombre,
                apellido: ApellidoPaterno,
                apellido2: ApellidoMaterno,
                M: sexo,
                curp: curp,
                grupo: grupo,
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





