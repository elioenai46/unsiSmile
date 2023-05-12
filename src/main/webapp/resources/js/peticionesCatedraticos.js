
$(document).ready(function(){
$('#formulario-agregar-catedratico').submit(function(event){
event.preventDefault();
        var firsN = $('#firsN').val();
        var secondN = $('#secondN').val();
        var Apa = $('#Apa').val();
        var Ama = $('#Ama').val();
        var sexo = $('#sexo').val();
        var curp = $('#curp').val();
        var NumTel = $('#NumTel').val();
        var email = $('#email').val();
        var NumT = $('#NumT').val();
        var correo = $('#correo').val();
        var fecha = $('#fecha').val();
        
        alert('N: ' + firsN + 'r:' + sexo + 'g ' + semestre1 + 'fecha' + fecha);
        $.ajax({
        url: '../../AlumnoController',
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

