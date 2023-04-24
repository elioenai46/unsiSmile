<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Admin Dashboard | Korsat X Parmaga</title>
    <!-- ======= Styles ====== -->
    <link rel="stylesheet" href="/assets/css/style.css">
    <link rel="stylesheet" href="/assets/css/cards.css">
    <link rel="stylesheet" href="/assets/css/styleRegistro.css">
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
                    <a href="index.html">
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
                        <span class="title">Administradores</span>
                    </a>
                </li>

                <li>
                    <a href="gestionarAlumno.html">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Alumnos</span>
                    </a>
                </li>

                <li>
                    <a href="gestionarProfesor.html">
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
                <form>
                    <div class="form-group">
                        <label for="primer-nombre">Primer nombre</label>
                        <input type="text" class="form-control" placeholder="Primer nombre" id="primer-nombre">
                    </div>
                    <div class="form-group">
                        <label for="segundo-nombre">Segundo nombre</label>
                        <input type="text" class="form-control" placeholder="Segundo nombre" id="segundo-nombre">
                    </div>
                    <div class="form-group">
                        <label for="apellido-paterno">Apellido paterno</label>
                        <input type="text" class="form-control" placeholder="Apellido paterno" id="apellido-paterno">
                    </div>
                    <div class="form-group">
                        <label for="apellido-materno">Apellido materno</label>
                        <input type="text" class="form-control" placeholder="Apellido materno" id="apellido-materno">
                    </div>
                    <div class="form-group">
                        <label for="curp">CURP</label>
                        <input type="email" class="form-control" placeholder="CURP" id="curp">
                    </div>
                    <div class="form-group">
                        <label for="telefono">Tel�fono</label>
                        <input type="text" class="form-control" placeholder="Tel�fono" id="telefono">
                    </div>
                    <div class="form-group">
                        <label for="sexo">Sexo:</label>
                        <select id="sexo" name="sexo" class="select-custom">
                            <option value="">--</option>
                            <option value="hombre">Hombre</option>
                            <option value="mujer">Mujer</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="sexo">Fecha de nacimiento</label>
                        <label class="custom-label">D�a:</label>
                        <select name="dia" class="select-custom-fecha custom-select select-custom">
                            <option value="">--</option>
                            <option value="">1</option>
                            <option value="">2</option>
                            <option value="">3</option>
                            <option value="">4</option>
                            <option value="">5</option>
                            <option value="">6</option>
                            <option value="">7</option>
                            <option value="">8</option>
                        </select>
                        <label class="custom-label">Mes:</label>
                        <select name="mes" name="fechanacimiento" class="select-custom-fecha custom-select select-custom">
                            <option value="">--</option>
                            <option value="01">01</option>
                            <option value="02">02</option>
                            <option value="03">03</option>
                            <option value="04">04</option>
                            <option value="05">05</option>
                            <option value="06">06</option>
                            <option value="07">07</option>
                            <option value="08">08</option>
                            <option value="09">09</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                        </select>
                        <label class="custom-label">A�o:</label>
                        <select name="anio" class="select-custom-fecha custom-select select-custom">
                            <option value="">--</option>
                            <option value="">2001</option>
                            <option value="">2002</option>
                            <option value="">2003</option>
                            <option value="">2004</option>
                            <option value="">2005</option>
                            <option value="">2006</option>                            
                        </select>
                    </div>
                    
                    
                    <div class="form-group">
                        <label for="matricula">Numero trabajador</label>
                        <input type="text" class="form-control" placeholder="Numero trabajador" id="matricula">
                    </div>

                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="text" class="form-control" placeholder="Email" id="email">
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