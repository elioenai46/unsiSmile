<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>AgregarProfesor</title>
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
                        <a href="${pageContext.request.contextPath}/AdministradoresServletController?accion=listar"">
                            <span class="icon">
                                <ion-icon name="people-outline"></ion-icon>
                            </span>
                            <span class="title">Administradores</span>
                        </a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath}/AlumnoController?accion=listar">
                            <span class="icon">
                                <ion-icon name="people-outline"></ion-icon>
                            </span>
                            <span class="title">Alumnos</span>
                        </a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath}/ProfesorServlet?accion=listar">
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
                    <h2>Registrar Profesor</h2>
                    <form action="${pageContext.request.contextPath}/ProfesorServlet" method="POST">
                        <div class="form-group">
                            <label for="primer-nombre">Primer nombre</label>
                            <input type="text" name="firstN" class="form-control" placeholder="Primer nombre" id="primer-nombre">
                        </div>
                        <div class="form-group">
                            <label for="segundo-nombre">Segundo nombre</label>
                            <input type="text" name="secondN" class="form-control" placeholder="Segundo nombre" id="segundo-nombre">
                        </div>
                        <div class="form-group">
                            <label for="apellido-paterno">Apellido paterno</label>
                            <input type="text" name="Apa" class="form-control" placeholder="Apellido paterno" id="apellido-paterno">
                        </div>
                        <div class="form-group">
                            <label for="apellido-materno">Apellido materno</label>
                            <input type="text" name="Ama" class="form-control" placeholder="Apellido materno" id="apellido-materno">
                        </div>
                        <div class="form-group">
                            <label for="curp">CURP</label>
                            <input type="text" name="curp" class="form-control" placeholder="CURP" id="curp">
                        </div>
                        <div class="form-group">
                            <label for="telefono">Teléfono</label>
                            <input type="tel" name="NumTel" class="form-control" placeholder="Teléfono" id="telefono">
                        </div>
                        <div class="form-group">
                            <label for="sexo">Sexo</label>
                            <select id="sexo" name="sexo" class="select-custom">
                                <option value="">--</option>
                                <option value="hombre">Hombre</option>
                                <option value="mujer">Mujer</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="sexo">Fecha de nacimiento</label>
                            <input type="date" name="fecha" class="form-control" id="fecha">
                        </div>


                        <div class="form-group">
                            <label for="matricula">Numero trabajador</label>
                            <input type="text" name="NumT" class="form-control" placeholder="Numero trabajador" id="matricula">
                        </div>

                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" name="correo" class="form-control" placeholder="Email" id="email">
                        </div>

                        <button type="submit" class="btn btn-primary">Guardar</button>
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