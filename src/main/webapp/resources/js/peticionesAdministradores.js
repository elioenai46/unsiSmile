
$(document).ready(function () {
    $('#form-Actualizar-Admin').submit(function (event) {
        event.preventDefault();
        var idAdministrador = $('#idAdministrador').val();
        var nombre1 = $('#nombre1').val();
        var nombre2 = $('#nombre2').val();
        var apellido1 = $('#apellido1').val();
        var apellido2 = $('#apellido2').val();
        var curp = $('#curp').val();
        var telefono = $('#telefono').val();
        var numeroTrabajador = $('#numeroTrabajador').val();
        var fechaNacimiento = $('#fechaNacimiento').val();
        var sexo = $('#sexo').val();
        var emailAdmin = $('#email').val();

        alert('Variables cachadas: ' + idAdministrador + ', n' + nombre1 + ', n' + nombre2 + ', a' + apellido1 + ', a' + apellido2 + ', c' + curp + ', t'
                + telefono + ', f' + fechaNacimiento + ', s' + sexo + ', e' + emailAdmin);
        $.ajax({
        url: '../../SvltadminAdministradoresController',
                type: 'PUT',
                
                data: {
                    idAdministrador: idAdministrador,
                    nombre1 : nombre1,
                    nombre2 : nombre2,
                    apellido1 : apellido1,
                    apellido2 : apellido2,
                    curp : curp,
                    telefono : telefono,
                    numeroTrabajador : numeroTrabajador,
                    fechaNacimiento : fechaNacimiento,
                    sexo : sexo,
                    emailAdmin : email
                },
                success: function(response) {
                // código a ejecutar cuando la petición es exitosa
                console.log(response);
                },
                error: function(xhr, status, error) {
                // código a ejecutar cuando la petición falla
                console.log("Error: " + error);
                }
                });
    });

});

