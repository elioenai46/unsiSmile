
$(document).ready(function () {
    $('#Form-Actualizar-Admin').click(function (event) {
        event.preventDefault();
        var idAdministrador = $('#idAdministrador').val();
        var nombre1 = $('#nombre1').val();
        var nombre2 = $('#nombre2').val();
        var apellido1 = $('#apellido1').val();
        var apellido2 = $('#apellido2').val();
        var curp = $('#curp').val();
        var telefono = $('#telefono').val();
        var fechaNacimiento = $('#fechaNacimiento').val();
        var sexo = $('#sexo').val();
        var emailAdmin = $('#emailAdmin').val();

        alert('Variables cachadas: ' + idAdministrador + ', ' + nombre1 + ', ' + nombre2 + ', ' + apellido1 + ', ' + apellido2 + ', ' + curp + ', ' + telefono + ', ' + fechaNacimiento + ', ' + sexo + ', ' + emailAdmin);
    });

});

