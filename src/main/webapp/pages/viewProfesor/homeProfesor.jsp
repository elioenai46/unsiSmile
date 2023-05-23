<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Profesor</title>
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
                            <img src="${pageContext.request.contextPath}/resources/img/logo-remove.png" alt="">
                        </div>
                    </span>
                    <span class="title"></span>
                </a>
            </li>

            <li>
                    <a href="${pageContext.request.contextPath}/pages/viewProfesor/homeProfesor.jsp">
                    <span class="icon">
                        <ion-icon name="home-outline"></ion-icon>
                    </span>
                    <span class="title">Home</span>
                </a>
            </li>

            <li>
                    <a href="${pageContext.request.contextPath}/pages/viewProfesor/homeProfesor.jsp">
                    <span class="icon">
                        <ion-icon name="people-outline"></ion-icon>
                    </span>
                    <span class="title">Alumnos</span>
                </a>
            </li>

            <li>
                    <a href="${pageContext.request.contextPath}/pages/viewProfesor/homeProfesor.jsp">
                    <span class="icon">
                        <ion-icon name="people-outline"></ion-icon>
                    </span>
                    <span class="title">Grupos</span>
                </a>
            </li>

            <li>
                    <a href="${pageContext.request.contextPath}/pages/viewProfesor/homeProfesor.jsp">
                    <span class="icon">
                        <ion-icon name="people-outline"></ion-icon>
                    </span>
                    <span class="title">Pacientes</span>
                </a>
            </li>

            <li>
                    <a href="${pageContext.request.contextPath}/pages/viewProfesor/homeProfesor.jsp">
                    <span class="icon">
                        <ion-icon name="people-outline"></ion-icon>
                    </span>
                    <span class="title">Configuración</span>
                </a>
            </li>

         

            <li>
                    <a href="${pageContext.request.contextPath}/pages/viewProfesor/homeProfesor.jsp">
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


            <div class="user">
                <img src="${pageContext.request.contextPath}/resources/img/customer01.jpg" alt="">
            </div>
        </div>

        <!-- ======================= Cards ================== -->
        <div class="cardBox">
            <div class="card">
                <div class="iconBx"><img class="imgPerf" src="${pageContext.request.contextPath}/resources/img/customer01.jpg"alt=""></div>
                <div class="cardName">${catedratico.nombre} ${catedratico.nombre2} ${catedratico.apellido} ${catedratico.apellido2}</div>
                <div class="cardName">${catedratico.emailCatedratico}</div>

            </div>
        

       
            <div class="card">
                <div>
                    <div id="sexo" class="dat">Sexo</div>
                    <div class="cardName">${catedratico.sexo}</div>
                    <div id="Matricula" class="dat">Numero de trabajador</div>
                    <div class="cardName">${catedratico.numeroTrabajador}</div>
                    <div id="Curp" class="dat">CURP</div>
                    <div class="cardName">${catedratico.curp}</div>
                    <div id="Grupo" class="dat">Grupos</div>
                    <div class="cardName">1004,3004</div>
                    <div id="Telefono" class="dat">Telefono</div>
                    <div class="cardName">${catedratico.telefono}</div>
                    
                </div>

                
            </div>
        
        </div>
        <div class="cardBox">   
            <div class="card">
                <div>
                    <div class="numbers">2</div>
                    <div class="cardName">Grupos</div>
                </div>

                
            </div>
            <div class="card">
                <div>
                    <div class="numbers">22</div>
                    <div class="cardName">Alumnos</div>
                </div>

                
            </div>
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