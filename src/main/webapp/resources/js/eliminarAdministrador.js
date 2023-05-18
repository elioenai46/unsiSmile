/**
 * Autor: Joel Francisco Figueroa Martinez
 * Fecha de creación: 18 de mayo de 2023
 * Fecha de actualización: 18 de mayo de 2023
 * Descripción: archivo js para hacer la peticion para eliminar un administrador
 */


$(document).ready(function(){
$('#formulario-agregar-catedratico').submit(function(event){
event.preventDefault();
        
        var idCatedratico = $('#idCatedratico').val();
        alert('N: ' + nombre + 'r:' + sexo + 'g ' + semestre1 + '');
        $.ajax({
        url: '../../ProfesorServlet',
                type: 'POST',
                
                data: {
                
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

