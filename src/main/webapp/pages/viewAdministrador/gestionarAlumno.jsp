<!DOCTYPE html>
<html lang="en">


    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Gestionar Alumno</title>
        <!-- ======= Styles ====== -->
       
<!--        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">-->
         <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilosHome.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap5.min.css">

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
                                    <img src="assets/imgs/logo-remove.png" alt="">
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


                <!-- ================ Order Details List ================= -->
                <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

                <div class="details">
                    <div class="recentOrders">
                        <div class="cardHeader">
                            <h2>Alumnos</h2>
                            <a href="${pageContext.request.contextPath}/AlumnoController" class="btn">Ver todos</a>
                            <a href="${pageContext.request.contextPath}/pages/viewAdministrador/agregarAlumno.jsp" class="btn">Agregar</a>


                        </div>

                        <table id="example" class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Id</th>
                                    <th scope="col">Nombre</th>
                                    <th scope="col">Segundo Nombre</th>  
                                    <th scope="col">Primer Apellido</th>
                                    <th scope="col">Segundo Apellido</th>
                                    <th scope="col">Sexo</th>
                                    <th scope="col">Curp</th>
                                    <th scope="col">Matricula</th>
                                    <th scope="col">Teléfono</th>
                                    <th scope="col">Email_alumno</th>
                                    <th scope="col">Estatus</th>
                                    <th scope="col">Editar</th>
                                    <th scope="col">Eliminar</th>
                                </tr>
                            </thead>

                            <tbody>                                   
                                <c:forEach var="alumno" items="${listaAlumnos}">
                                <tr>
                                    <td><c:out value="${alumno.idAlumno}"></c:out></td>
                                    <td><c:out value="${alumno.nombre}"></c:out></td>
                                    <td><c:out value="${alumno.nombre2}"></c:out></td>
                                    <td><c:out value="${alumno.apellido}"></c:out></td>
                                    <td><c:out value="${alumno.apellido2}"></c:out></td>
                                    <td><c:out value="${alumno.sexo}"></c:out></td>
                                    <td><c:out value="${alumno.curp}"></c:out></td>
                                    <td><c:out value="${alumno.matricula}"></c:out></td>
                                    <td><c:out value="${alumno.telefono}"></c:out></td>
                                    <td><c:out value="${alumno.emailAlumno}"></c:out></td>
                                    <td><c:out value="${alumno.estatus}"></c:out></td>
                                    <td><a href="${pageContext.request.contextPath}/pages/viewAdministrador/actualizarAlumno.jsp"><button>Actualizar</button></a></td>

                                    <!-- Boton para eliminar un alumno -->
                                    <td><a href="${pageContext.request.contextPath}/AlumnoController?accion=eliminar&idAlumno=<c:out value="${alumno.idAlumno}"></c:out>">Eliminar</td></a>

                                    </tr>
                            </c:forEach>


                            </tbody>
                        </table>

                    </div>

                    <!-- ================= New Customers ================ -->

                </div>
            </div>
        </div>


        <!-- =========== Scripts =========  -->



        <script src="${pageContext.request.contextPath}/webjars/jquery/3.6.3/dist/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap5.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/scriptHome.js"></script>


        <!-- ====== ionicons ======= -->
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </body>

</html>
<!-- como listar una tabla desde un jsp en netsbeans -->
