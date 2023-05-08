/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de mayo de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Descripción: archivo js para actulizar el combobox de grupos de manera 
 *              dinámica cuando cambia el valor contenido en el combobox de
 *              semestres
 */

  $(document).ready(function() {
    var nombreUsuario = "<%= request.getParameter("iduser") %>";
    var val = $("#Semestre1").val();
              alert("El nombre de usuario es: " + nombreUsuario);
    $.ajax({
      url: '../../AdministradoresServletController',
      type: "POST",
      data: {idDelUsuario: idDelUsuario},
      success: function(response) {
        console.log(response);
      },
      error: function(xhr, status, error) {
        console.log(error);
      }
    });
  });


