
$(document).ready(function () {
    $('#formulario-agregar-catedratico').submit(function (event) {
        event.preventDefault();
        var nombre = $('#nombre').val();
        var nombre2 = $('#nombre2').val();
        var apellido = $('#apellido').val();
        var apellido2 = $('#apellido2').val();
        var sexo = $('#sexo').val();
        var curp = $('#curp').val();
        var semestre1 = $('#semestre1').val();
        var grupo1 = $('#grupo1').val();
        var matricula = $('#matricula').val();
        var telefono = $('#telefono').val();
        var email = $('#email').val();
        var idCatedratico = $('#idCatedratico').val();
        alert('N: ' + nombre + 'r:' + sexo + 'g ' + semestre1 + '');
        $.ajax({
            url: '../../ProfesorServlet',
            type: 'POST',

            data: {
                nombre: nombre,
                nombre2: nombre2,
                apellido: apellido,
                apellido2: apellido2,
                sexo: sexo,
                curp: curp,
                semestre1: semestre1,
                grupo1: grupo1,
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

$(document).ready(function () {
    $('#formulario-actualizar-alumno').submit(function (event) {
        event.preventDefault();
        var nombre = $('#primerNombre').val();
        var nombre2 = $('#segundoNombre').val();
        var apellido = $('#apellidoPaterno').val();
        var apellido2 = $('#apellidoMaterno').val();
        var sexo = $('#sexo').val();
        var curp = $('#curp').val();
        var semestre1 = $('#semestre1').val();
        var grupo1 = $('#grupo1').val();
        var matricula = $('#matricula').val();
        var telefono = $('#telefono').val();
        var email = $('#email').val();
        var idCatedratico = $('#idCatedratico').val();
        alert('N: ' + nombre + 'r:' + sexo + 'g ' + semestre1 + '');
        $.ajax({
            url: '../../AlumnoController',
            type: 'PUT',
            data: {
                nombre: nombre,
                nombre2: nombre2,
                apellido: apellido,
                apellido2: apellido2,
                sexo: sexo,
                curp: curp,
                semestre1: semestre1,
                grupo1: grupo1,
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
