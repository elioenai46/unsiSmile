$(document).ready(function () {
    $('#formulario_agregar_administrador').submit(function (event) {
        event.preventDefault();
        var primerNombre = $('#primer-nombre').val();
        var segundoNombre = $('#segundo-nombre').val();
        var apellidoPaterno = $('#apellido-paterno').val();
        var apellidoMaterno = $('#apellido-materno').val();
        var sexo = $('#sexo').val();
        var curp = $('#curp').val();
        var telefono = $('#telefono').val();
        var email = $('#email').val();
        var numTrabajador = $('#matricula').val();
        var fecha = $('#fecha').val();

        alert('Nombre: ' + primerNombre + ' ' + segundoNombre +
                ' ' + apellidoPaterno + ' '
                + apellidoMaterno + '\nSexo: ' + sexo + '\nCurp: ' + curp +
                '\nTelefono: '
                + telefono + '\nEmail: ' + email + '\nNumero de trabajador: '
                + numTrabajador +
                '\nFecha: ' + fecha);

        $.ajax({
            url: '../../AdministradoresServletController?accion=crear',
            type: 'POST',

            data: {
                primerNombre: primerNombre,
                segundoNombre: segundoNombre,
                apellidoPaterno: apellidoPaterno,
                apellidoMaterno: apellidoMaterno,
                sexo: sexo,
                curp: curp,
                numeroTrabajador: numTrabajador,
                telefono: telefono,
                email: email

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


