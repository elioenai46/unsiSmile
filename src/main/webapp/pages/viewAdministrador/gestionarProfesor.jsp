<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Gestionar Profesor</title>
        <!-- ======= Styles ====== -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilosHome.css">
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

                <!-- ======================= Cards ================== -->
                <div class="cardBox">
                    <div class="card">
                        <div>
                            <div class="numbers">1,504</div>
                            <div class="cardName">Daily Views</div>
                        </div>

                        <div class="iconBx">
                            <ion-icon name="eye-outline"></ion-icon>
                        </div>
                    </div>

                    <div class="card">
                        <div>
                            <div class="numbers">80</div>
                            <div class="cardName">Sales</div>
                        </div>

                        <div class="iconBx">
                            <ion-icon name="cart-outline"></ion-icon>
                        </div>
                    </div>

                    <div class="card">
                        <div>
                            <div class="numbers">284</div>
                            <div class="cardName">Comments</div>
                        </div>

                        <div class="iconBx">
                            <ion-icon name="chatbubbles-outline"></ion-icon>
                        </div>
                    </div>

                    <div class="card">
                        <div>
                            <div class="numbers">$7,842</div>
                            <div class="cardName">Earning</div>
                        </div>

                        <div class="iconBx">
                            <ion-icon name="cash-outline"></ion-icon>
                        </div>
                    </div>
                </div>

                <!-- ================ Order Details List ================= -->
                  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
                <div class="details">
                    <div class="recentOrders">
                        <div class="cardHeader">
                            <h2>Profesor</h2>
                            <a href="${pageContext.request.contextPath}/ProfesorServlet?accion=listar" class="btn">Ver todos</a>
                            <a href="${pageContext.request.contextPath}/pages/viewAdministrador/agregarProfesor.jsp" class="btn">Agregar</a>
                        </div>

                        <table>
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Nombre</th>
                                    <th>Nombre2</th>
                                    <th>Apellido</th>
                                    <th>Apellido2</th>
                                    <th>Curp</th>
                                    <th>Telefono</th>
                                    <td>sexo</td>
                                    <td>fecha_nac</td>
                                    <td>Num_trabajador</td>
                                    <th>email</th>
                                    <td>estatus</td>
                                </tr>
                            </thead>

                            <c:forEach var="catedraticos" items="${listaCatedratico}">
                                <tr>
                                <td><c:out value="${catedraticos.idCatedratico}"></c:out></td>
                                <td><c:out value="${catedraticos.nombre}"></c:out></td>
                                <td><c:out value="${catedraticos.nombre2}"></c:out></td>
                                <td><c:out value='${catedraticos.apellido}'></c:out></td>
                                <td><c:out value='${catedraticos.apellido2}'></c:out></td>
                                <td><c:out value='${catedraticos.curp}'></c:out></td>
                                <td><c:out value='${catedraticos.telefono}'></c:out></td>
                                <td><c:out value='${catedraticos.sexo}'></c:out></td>
                                <td><c:out value='${catedraticos.fechaNacimiento}'></c:out></td>
                                <td><c:out value='${catedraticos.numeroTrabajador}'></c:out></td>
                                <td><c:out value='${catedraticos.emailCatedratico}'></c:out></td>
                                <td><c:out value='${catedraticos.estatus}'></c:out></td>                           
                                <td><a href="${pageContext.request.contextPath}/pages/viewAdministrador/actualizarProfesor.jsp"><button>Actualizar</button></a></td>
                                <td><a href="${pageContext.request.contextPath}/ProfesorServlet?accion=eliminar&id=<c:out value="${catedraticos.idCatedratico}"></c:out>"><button>Eliminar</button></a></td>

                                </tr>
                            </c:forEach>
                        </table>

                    </div>

                    <!-- ================= New Customers ================ -->
                   
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
