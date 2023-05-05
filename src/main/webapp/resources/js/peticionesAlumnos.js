
$(document).ready(function(){
    $('#formulario-agregar-alumno').submit(function(event){
        event.preventDefault();
        
        var usuario = $('#userId').val();
        var rol = $('#rolId').val();
        
        alert('N: '+usuario+'r:'+ rol + 'g '+ sexo+'');
        
        $.ajax({
            url: window.location.origin + '/ruta-del-servlet'
,
            type: 'POST',
            data: {
                usuario: usuario,
                rol: rol,
                sexo: sexo
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

