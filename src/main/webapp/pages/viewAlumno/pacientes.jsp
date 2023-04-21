<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Admin Dashboard | Korsat X Parmaga</title>
    <!-- ======= Styles ====== -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/assets/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/assets/js/main.js">
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
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="home-outline"></ion-icon>
                        </span>
                        <span class="title">Home</span>
                    </a>
                </li>

                <li>
                    <a href="gestionarAdministradores.html">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Pacientes</span>
                    </a>
                </li>

                <li>
                    <a href="gestionarAlumno.html">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Tratamientos</span>
                    </a>
                </li>

                <li>
                    <a href="gestionarProfesor.html">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Citas</span>
                    </a>
                </li>

                <li>
                    <a href="gestionarProfesor.html">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Configuración</span>
                    </a>
                </li>

                <li>
                    <a href="gestionarProfesor.html">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Historial Clinico</span>
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

                <div class="search">
                    <label>
                        <input type="text" placeholder="Buscar usuario">
                        <ion-icon name="search-outline"></ion-icon>
                    </label>
                </div>

                <div class="user">
                    <img src="assets/imgs/customer01.jpg" alt="">
                </div>
            </div>

            <div class="details">
                <div class="recentOrders">
                    <div class="cardHeader">
                        <h2>Usuarios</h2>
                        <a href="#" class="btn">Ver todos</a>
                    </div>

                    <table>
                        <thead>
                            <tr>
                                <td>Nombres</td>
                                <td>Apellido Paterno</td>
                                <td>Apellido Materno</td>
                                <td>Rol</td>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>Juan</td>
                                <td>García</td>
                                <td>Pérez</td>
                                <td>Alumno</td>
                            </tr>

                            <tr>
                                <td>María</td>
                                <td>Martínez</td>
                                <td>Gómez</td>
                                <td>Profesor</td>
                            </tr>

                            <tr>
                                <td>Carlos</td>
                                <td>Ruiz</td>
                                <td>González</td>
                                <td>Administrador</td>
                            </tr>

                            <tr>
                                <td>Sofía</td>
                                <td>Hernández</td>
                                <td>Rodríguez</td>
                                <td>Alumno</td>
                            </tr>

                            <tr>
                                <td>Pablo</td>
                                <td>López</td>
                                <td>Gutiérrez</td>
                                <td>Profesor</td>
                            </tr>

                            <tr>
                                <td>Luisa</td>
                                <td>Rodríguez</td>
                                <td>Chávez</td>
                                <td>Alumno</td>
                            </tr>

                            <tr>
                                <td>Andrés</td>
                                <td>González</td>
                                <td>Hernández</td>
                                <td>Profesor</td>
                            </tr>

                            <tr>
                                <td>Isabel</td>
                                <td>Ruiz</td>
                                <td>Martínez</td>
                                <td>Administrador</td>
                            </tr>
                        </tbody>
                    </table>

                </div>

                <!-- ================= New Customers ================ -->
                <div class="recentCustomers">
                    <div class="cardHeader">
                        <h2>Modificaciones recientes</h2>
                    </div>

                    <table>
                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer02.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>David <br> <span>Administrador</span></h4>
                            </td>
                        </tr>

                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer01.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>Amit <br> <span>Administrador</span></h4>
                            </td>
                        </tr>

                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer02.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>David <br> <span>Alumno</span></h4>
                            </td>
                        </tr>

                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer01.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>Amit <br> <span>Alumno</span></h4>
                            </td>
                        </tr>

                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer02.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>David <br> <span>Alumno</span></h4>
                            </td>
                        </tr>

                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer01.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>Amit <br> <span>Alumno</span></h4>
                            </td>
                        </tr>

                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer01.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>David <br> <span>Italy</span></h4>
                            </td>
                        </tr>

                        <tr>
                            <td width="60px">
                                <div class="imgBx"><img src="assets/imgs/customer02.jpg" alt=""></div>
                            </td>
                            <td>
                                <h4>Amit <br> <span>India</span></h4>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <!-- =========== Scripts =========  -->
    <script src="${pageContext.request.contextPath}/resources/js/scriptHome.js"></script>

    <!-- ====== ionicons ======= -->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>

</html>