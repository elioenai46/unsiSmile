<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Actualizar Alumno</title>
        <!-- ======= Styles ====== -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styleR.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/cards.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styleRegistro.css">
        <script src="${pageContext.request.contextPath}/webjars/jquery/3.6.3/dist/jquery.min.js"></script>
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
                    <h2>Actualizar Alumno</h2>
                    <form id="formulario-actualizar-alumno">
                        <div class="form-group">
                            <label for="primer-nombre">Primer nombre</label>
                            <input type="text" class="form-control" placeholder="Primer nombre" id="primerNombre">
                        </div>
                        <div class="form-group">
                            <label for="segundo-nombre">Segundo nombre</label>
                            <input type="text" class="form-control" placeholder="Segundo nombre" id="segundoNombre">
                        </div>
                        <div class="form-group">
                            <label for="apellido-paterno">Apellido paterno</label>
                            <input type="text" class="form-control" placeholder="Apellido paterno" id="apellidoPaterno">
                        </div>
                        <div class="form-group">
                            <label for="apellido-materno">Apellido materno</label>
                            <input type="text" class="form-control" placeholder="Apellido materno" id="apellidoMaterno">
                        </div>
                        <div class="form-group">
                            <label for="sexo">Sexo:</label>
                            <select id="sexo" name="sexo" class="select-custom">
                                <option value="hombre">Hombre</option>
                                <option value="mujer">Mujer</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="curp">CURP</label>
                            <input type="email" class="form-control" placeholder="CURP" id="curp">
                        </div>
                        <div class="form-group">
                            <label for="semestre">Semestre</label>
                            <select id="semestre1" name="semestre" class="select-custom">
                                <option value="hombre">Primero</option>
                                <option value="mujer">Segundo</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="semestre">Grupo</label>
                            <select id="grupo1" name="grupo" class="select-custom">
                                <option value="hombre">506</option>
                                <option value="mujer">706</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="matricula">Matricula</label>
                            <input type="text" class="form-control" placeholder="Matricula" id="matricula">
                        </div>
                        <div class="form-group">
                            <label for="telefono">Teléfono</label>
                            <input type="text" class="form-control" placeholder="Teléfono" id="telefono">
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="text" class="form-control" placeholder="Email" id="email">
                        </div>
                        <div class="form-group">
                            <label for="id-catedratico">ID Catedratico responsable</label>
                            <input type="text" class="form-control" placeholder="ID Catedratico responsable"
                                   id="idCatedratico">
                        </div>
                        <button type="submit" class="btn btn-primary">Actualizar</button>
                    </form>
                </div>

            </div>
        </div>



        <!-- =========== Scripts =========  -->
        <script src="${pageContext.request.contextPath}/resources/js/scriptHome.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/peticionesAlumnos.js"></script>

        <!-- ====== ionicons ======= -->
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </body>

</html>