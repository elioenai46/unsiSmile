<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Actualizar Administrador</title>
    <!-- ======= Styles ====== -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styleR.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/cards.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styleRegistro.css">

</head>

<body>
    <!-- =============== Navigation ================ -->
    <div class="container">
        <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                        <span class="icon">
                            <div>
                                <img src="/assets/imgs/logo-remove.png" alt="">
                            </div>
                        </span>
                        <span class="title"></span>
                    </a>
                </li>

                <li>
                    <a href="${pageContext.request.contextPath}/pages/viewAdministrador/homeAdministrador.jsp">
                        <span class="icon">
                            <ion-icon name="home-outline"></ion-icon>
                        </span>
                        <span class="title">Home</span>
                    </a>
                </li>

                <li>
                    <a href="${pageContext.request.contextPath}/AdministradoresServletController">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Administradores</span>
                    </a>
                </li>

                <li>
                    <a href="${pageContext.request.contextPath}/AlumnoController">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Alumnos</span>
                    </a>
                </li>

                <li>
                    <a href="${pageContext.request.contextPath}/ProfesorServlet">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Profesores</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="log-out-outline"></ion-icon>
                        </span>
                        <span class="title">Salir</span>
                    </a>
                </li>
            </ul>
        </div>

        <!-- ========================= Main ==================== -->
        <div class="main">
            <div class="topbar">
                <div class="toggle">
                    <ion-icon name="menu-outline"></ion-icon>
                </div>
            </div>

            <!-- ========================= Registrar ==================== -->

            <div class="containerRegistro">
                <h2>Actualizar Administrador</h2>
                <form id="Form-Actualizar-Admin">
                    <div class="form-group">
                        <label for="primer-nombre">Primer nombre</label>
                        <input type="text" class="form-control" value="${administradores.nombre1}" placeholder='Primer nombre' id="primer-nombre">
                    </div>
                    <div class="form-group">
                        <label for="segundo-nombre">Segundo nombre</label>
                        <input type="text" class="form-control" value='${administradores.nombre2}' placeholder="Segundo nombre" id="segundo-nombre">
                    </div>
                    <div class="form-group">
                        <label for="apellido-paterno">Apellido paterno</label>
                        <input type="text" class="form-control" value='${administradores.apellido1}' placeholder="Apellido paterno" id="apellido-paterno">
                    </div>
                    <div class="form-group">
                        <label for="apellido-materno">Apellido materno</label>
                        <input type="text" class="form-control" value="${administradores.apellido2}" placeholder="Apellido materno" id="apellido-materno">
                    </div>
                    <div class="form-group">
                        <label for="curp">CURP</label>
                        <input type="text" class="form-control" value='${administradores.curp}' placeholder="CURP" id="curp">
                    </div>
                    <div class="form-group">
                        <label for="telefono">Teléfono</label>
                        <input type="text" class="form-control" value="${administradores.telefono}" placeholder="Teléfono" id="telefono">
                    </div>
                    <div class="form-group">
                        <label for="numero-Trabajador">Número Trabajador</label>
                        <input type="text" class="form-control" value="${administradores.numeroTrabajador}" placeholder="Número Trabajador" id="numero-Trabajador">
                            
                        </input>
                    </div>

                     <div class="form-group">
                            <label for="sexo">Fecha de nacimiento</label>
                            <input type="date" name="fecha" class="form-control" value="${administradores.fechaNacimiento}" id="fecha">
                        </div>

                    
                    <div class="form-group">
                        <label for="sexo">Sexo</label>
                        <select id="sexo" name="sexo" class="select-custom" >
                            <option value="">--</option>
                            <option value="hombre">Hombre</option>
                            <option value="mujer">Mujer</option>
                        </select>
                    </div>

                    
                    
                    
                   

                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="text" class="form-control" value="${administradores.emailAdmin}" placeholder="Email" id="email">
                    </div>
                    
                    <button type="submit" class="btn btn-primary">Actualizar</button>
                </form>
            </div>

        </div>
    </div>



    <!-- =========== Scripts =========  -->
    <script src="/assets/js/main.js"></script>

    <!-- ====== ionicons ======= -->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>

</html>