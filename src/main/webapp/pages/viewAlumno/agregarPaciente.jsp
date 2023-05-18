<!--Autor: Getzemani Alejandro Gonzales Cruz
Fecha de creación: 25 de abril de 2023
Fecha de actualización: 05 de mayo de 2023
Modificado por: Oscar Fuentes Alvarado
Descripción: JSP para modelar la vista de agregado del alumno-->

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Agregar Alumno</title>
  <!-- ======= Styles ====== -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/historiaClinica.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilosMedicionBolsas.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/pestañas.css">
</head>

<body>
  <!-- =============== Navegador ================ -->
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
                        <span class=" icon">
            <ion-icon name="people-outline"></ion-icon>
            </span>
            <span class="title">Administradores</span>
          </a>
        </li>

        <li>
          <a href="${pageContext.request.contextPath}/AdministradoresServletController?accion=listar"">
                        <span class=" icon">
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

      <!-- ========================= Registrar Paciente ==================== -->

      <div class="containerRegistro">
        <div class="tabs-wrapper">
          <div class="tabs">
            <div class="tab active" data-tab="tab-1">Datos personales</div>
            <div class="tab" data-tab="tab-2">Datos de los tutores</div>
            <div class="tab" data-tab="tab-3">Signos vitales</div>
            <div class="tab" data-tab="tab-4">Examen facial</div>
            <div class="tab" data-tab="tab-5">Antecedentes heredofamiliares</div>
            <div class="tab" data-tab="tab-6">Antecedentes personales no patologicos</div>
            <div class="tab" data-tab="tab-7">Antecedentes personales patologicos</div>
            <div class="tab" data-tab="tab-8">Antecedentes personales patologicos</div>

            <div class="tab" data-tab="tab-10">Medición de bolsas</div>




          </div>
          <div class="tab-content">
            <!-- ========================= pestaña 1 datos personales ==================== -->
            <div class="tab-pane active" id="tab-1">
              <h2>Registrar Paciente</h2>
              <form>
                <div class="form-group">
                  <label for="primer-nombre">Primer nombre</label>
                  <input type="text" class="form-control" placeholder="Primer nombre" name="nombre">
                </div>
                <div class="form-group">
                  <label for="segundo-nombre">Segundo nombre</label>
                  <input type="text" class="form-control" placeholder="Segundo nombre" name="nombre2">
                </div>
                <div class="form-group">
                  <label for="apellido-paterno">Apellido paterno</label>
                  <input type="text" class="form-control" placeholder="Apellido paterno" name="apellido">
                </div>
                <div class="form-group">
                  <label for="apellido-materno">Apellido materno</label>
                  <input type="text" class="form-control" placeholder="Apellido materno" name="apellido2">
                </div>
                <div class="form-group">
                  <label for="sexo">Sexo:</label>
                  <select id="sexo" name="sexo" class="select-custom">
                    <option value="hombre">Hombre</option>
                    <option value="mujer">Mujer</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="grupo_etnico">Grupo etnico</label>
                  <input type="text" class="form-control" placeholder="Grupo etnico" name="grupo_etnico">
                </div>
                <div class="form-group">
                  <label for="ocupacion">Ocupación</label>
                  <input type="text" class="form-control" placeholder="ocupacion" name="ocupacion">
                </div>
                <div class="form-group">
                  <label for="sexo">Fecha de nacimiento</label>
                  <input type="date" name="fecha" class="form-control" id="fecha">
                </div>
                <div class="form-group">
                  <label for="grado_escolar">Grado escolar</label>
                  <select id="grado_escolar" name="grado_escolar" class="select-custom">
                    <option value="primaria">Primaria</option>
                    <option value="secundaria">Secundaria</option>
                    <option value="preparatoria">Preparatoria</option>
                    <option value="universidad">Universidad</option>
                    <option value="graduado">Graduado</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="telefono">Teléfono</label>
                  <input type="text" class="form-control" placeholder="Teléfono" name="telefono">
                </div>
                <div class="form-group">
                  <label for="domicilio">Domicilio</label>
                  <input type="text" class="form-control" placeholder="Domicilio" name="domicilio">
                </div>
                <div class="form-group">
                  <label for="estado_civil">Estado civil</label>
                  <input type="text" class="form-control" placeholder="Estado civil" name="estado_civil">
                </div>
                <div class="form-group">
                  <label for="religion">Religión</label>
                  <input type="text" class="form-control" placeholder="Religión" name="religion">
                </div>
                <div class="form-group">
                  <label for="fecha_ingreso">Fecha de ingreso</label>
                  <input type="date" name="fecha_ingreso" class="form-control" id="fecha_ingreso">
                </div>
                <div class="form-group">
                  <label for="nacionalidad">Nacionalidad</label>
                  <input type="text" class="form-control" placeholder="Nacionalidad" name="nacionalidad">
                </div>
                <div class="form-group">
                  <label for="localidad">Localidad</label>
                  <input type="text" class="form-control" placeholder="Localidad" name="localidad">
                </div>
                <div class="form-group">
                  <label for="E-mail">E-mail</label>
                  <input type="text" class="form-control" placeholder="E-mail" name="email">
                </div>
                <div class="form-group">
                  <label for="MotivoDeConsulta">Motivo De Consulta</label>
                  <input type="text" class="form-control" placeholder="Motivo de consulta" name="mot_consulta">
                </div>
                <div class="form-group">
                  <label for="fecha_ingreso">Ultima consulta dental</label>
                  <input type="date" name="fecha_ultima_consulta" class="form-control" id="fecha_ultima_consulta">
                </div>
              </form>
            </div>

            <!-- ========================= pestaña 2 datos personales ==================== -->

            <div class="tab-pane" id="tab-2">
              <h2>Conteste si el paciente es menor de 18 años</h2>
              <form>
                <div class="form-group">
                  <label for="primerTutor">Primer nombre del padre</label>
                  <input type="text" class="form-control" placeholder="Nombre del padre" name="primer_nombre_padre">
                </div>
                <div class="form-group">
                  <label for="primerTutor">Segundo nombre del padre</label>
                  <input type="text" class="form-control" placeholder="Nombre del padre" name="segundo_nombre_padre">
                </div>
                <div class="form-group">
                  <label for="localidad">Ocupación</label>
                  <input type="text" class="form-control" placeholder="Ocupación" name="ocupacion_padre">
                </div>
                <div class="form-group">
                  <label for="SegundoTutor">Primer nombre de la madre</label>
                  <input type="text" class="form-control" placeholder="Nombre de la madre" name="primer_nombre_madre">
                </div>
                <div class="form-group">
                  <label for="SegundoTutor">Segundo nombre de la madre</label>
                  <input type="text" class="form-control" placeholder="Nombre de la madre" name="segundo_nombre_madre">
                </div>
                <div class="form-group">
                  <label for="localidad">Ocupación</label>
                  <input type="text" class="form-control" placeholder="Ocupación" name="ocupacion_madre">
                </div>
                <div class="form-group">
                  <label for="localidad">Estado civil de los padres</label>
                  <input type="text" class="form-control" placeholder="Estado civil" name="estado_civil_padres">
                </div>
                <div class="form-group">
                  <label for="localidad">Nombre del pedriatra o médico familiar</label>
                  <input type="text" class="form-control" placeholder="Nombre del pedriatra" name="medico_familiar">
                </div>
              </form>
            </div>

                     <!-- ========================= pestaña 3 datos personales ==================== -->


            <div class="tab-pane" id="tab-3">
              <h2>Signos vitales</h2>
              <form>
                <div class="form-group">
                  <label for="primerTutor">Peso:</label>
                  <input type="text" class="form-control" placeholder="Peso" name="peso">
                </div>
                <div class="form-group">
                  <label for="localidad">Estatura:</label>
                  <input type="text" class="form-control" placeholder="Estatura" name="Estatura">
                </div>
                <div class="form-group">
                  <label for="SegundoTutor">Temperatura:</label>
                  <input type="text" class="form-control" placeholder="Temperatura" name="temperatura">
                </div>
                <div class="form-group">
                  <label for="localidad">Frecuencia Cardiaca:</label>
                  <input type="text" class="form-control" placeholder="Frecuencia Cardiaca" name="frecuencia_cardiaca">
                </div>
                <div class="form-group">
                  <label for="localidad">Frecuencia respiratoria:</label>
                  <input type="text" class="form-control" placeholder="Frecuencia respiratoria"
                    name="frecuencia_respiratoria">
                </div>
                <div class="form-group">
                  <label for="localidad">Presión arterial:</label>
                  <input type="text" class="form-control" placeholder="Presión arterial" name="presion_arteriar">
                </div>
                <div class="form-group">
                  <label for="localidad">Saturación de oxigeno:</label>
                  <input type="text" class="form-control" placeholder="Saturación de oxigeno" name="saturacion_oxigeno">
                </div>
              </form>
            </div>

            <!-- ========================= pestaña 4 datos personales ==================== -->

            <div class="tab-pane" id="tab-4">
              <h2>Examen facial</h2>
              <form>
                <div class="form-group">
                  <label for="primerTutor">Perfil recto:</label>
                  <input type="text" class="form-control" placeholder="Perfil recto" name="perfil_recto">
                </div>
                <div class="form-group">
                  <label for="localidad">C&oacute;ncavo:</label>
                  <input type="text" class="form-control" placeholder="Cóncavo" name="concavo">
                </div>
                <div class="form-group">
                  <label for="SegundoTutor">Convexo:</label>
                  <input type="text" class="form-control" placeholder="Convexo" name="convexo">
                </div>
                <div class="form-group">
                  <label for="localidad">Frente braquial:</label>
                  <input type="text" class="form-control" placeholder="Frente braquial" name="frente_braquial">
                </div>
                <div class="form-group">
                  <label for="localidad">Normofacial:</label>
                  <input type="text" class="form-control" placeholder="Normofacial" name="normofacial">
                </div>
                <div class="form-group">
                  <label for="localidad">Dolicofacial:</label>
                  <input type="text" class="form-control" placeholder="Dolicofacial" name="dolicofacial">
                </div>
                <div class="form-group">
                  <label for="localidad">Señas particulares:</label>
                  <input type="text" class="form-control" placeholder="Señas particulares" name="señas_particulares">
                </div>
              </form>
            </div>


            <!-- ========================= pestaña 5 datos personales ==================== -->


            <div class="tab-pane" id="tab-5">
              <h2>Antecedentes heredofamiliares</h2>
              <form>
                <div class="form-group">
                  <label for="sexo">Neoplasia:</label>
                  <select id="sexo" name="neoplasia" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Ampliar respuesta" name="neoplasia_ampliar">
                </div>
                <div class="form-group">
                  <label for="sexo">Diabetes:</label>
                  <select id="sexo" name="diabetes" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Ampliar respuesta" name="diabetes_ampliar">
                </div>
                <div class="form-group">
                  <label for="sexo">Hipertensión arterial:</label>
                  <select id="sexo" name="hipertension_arterial" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Ampliar respuesta"
                    name="hipertension_arterial_ampliar">
                </div>
                <div class="form-group">
                  <label for="sexo">Padecimientos mentales:</label>
                  <select id="sexo" name="padecimientos_mentales" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Ampliar respuesta"
                    name="padecimientos_mentales_ampliar">
                </div>
                <div class="form-group">
                  <label for="sexo">Padecimientos hematologicos:</label>
                  <select id="sexo" name="padecimientos_hematologicos" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Ampliar respuesta"
                    name="padecimientos_hematologicos_ampl">
                </div>
                <div class="form-group">
                  <label for="sexo">Malformaciones congénitas:</label>
                  <select id="sexo" name="malformaciones_congenitas" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Ampliar respuesta"
                    name="malformaciones_congenitas_ampl">
                </div>
                <div class="form-group">
                  <label for="sexo">Problemas cardiacos:</label>
                  <select id="sexo" name="problemas_cardiacos" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Ampliar respuesta"
                    name="problemas_cardiacos_ampl">
                </div>
              </form>
            </div>

            <!-- ========================= pestaña 6 datos personales ==================== -->


            <div class="tab-pane" id="tab-6">
              <h2>Antecedentes personales no patologicos</h2>
              <form>
                <div class="form-group">
                  <label for="frutas_verduras">Come frutas y verduras:</label>
                  <select id="frutas_verduras" name="frutas_verduras" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="come_carne">Come carne(Res, puerco o pollo):</label>
                  <select id="come_carne" name="come_carne" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="come_cereal">come cereales(Pan, cereal, etc):</label>
                  <select id="come_cereal" name="come_cereal" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
                
                <div class="form-group">
                  <label for="come_chatarra">Come alimentos chatarra(Dulces, botanas, etc):</label>
                  <select id="come_chatarra" name="come_chatarra" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>         
                </div>

                <div class="form-group">
                  <label for="toma_agua">Toma o bebe 2 litros de agua al dia:</label>
                  <select id="toma_agua" name="toma_agua" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>

                <div class="form-group">
                  <label for="horas_dormir">Horas que duerme al dia:</label>
                  <input type="number" class="form-control" placeholder="Horas que duerme al dia" name="horas_dormir">
                </div>

                <div class="form-group">
                  <label for="veces_bañarse">Cuantas veces a la semana se baña:</label>
                  <input type="number" class="form-control" placeholder="Cuantas veces a la semana se baña" name="veces_bañarse">
                </div>

                <div class="form-group">
                  <label for="horas_dormir">Cuantas veces al día cepilla sus dientes:</label>
                  <input type="number" class="form-control" placeholder="Cuantas veces al día cepilla sus dientes" name="veces_cipillarse">
                </div>

                <div class="form-group">
                  <label for="sexo">Su vivienda tiene piso:</label>
                  <select id="sexo" name="vivienda_piso" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="sexo">Su vivienda esta hecha de:</label>
                  <input type="text" class="form-control" placeholder="Vivienda hecha de" name="material_vivienda">
                </div>

              </form>
            </div>
    

                  
            <!-- ========================= pestaña 7 datos personales ==================== -->

            <div class="tab-pane" id="tab-7">
              <h2>Antecedentes personales patologicos</h2>
              <form>
                <div class="form-group">
                  <label for="tabaquismo">Tabaquismo:</label>
                  <select id="tabaquismo" name="tabaquismo" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="alcoholismo">Alcoholismo:</label>
                  <select id="alcoholismo" name="alcoholismo" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="sustancias_psicoactivas">Sustancias psicoactivas o recreativas:</label>
                  <select id="sustancias_psicoactivas" name="sustancias_psicoactivas" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
                
                <div class="form-group">
                  <label for="perforaciones">Perforaciones:</label>
                  <select id="perforaciones" name="perforaciones" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>         
                </div>

                <div class="form-group">
                  <label for="toma_agua">Tatuajes:</label>
                  <select id="toma_agua" name="tatuajes" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>

                <div class="form-group">
                  <label for="neoplasia">Neoplasia:</label>
                  <select id="neoplasia" name="neoplasia" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
               
                <div class="form-group">
                  <label for="diabetes">Diabetes:</label>
                  <select id="diabetes" name="diabetes" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>

                <div class="form-group">
                  <label for="hipertension_arterial">Hipertensión arterial:</label>
                  <select id="hipertension_arterial" name="hipertension_arterial" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>

                <div class="form-group">
                  <label for="padecimientos_mentales">Padecimientos mentales:</label>
                  <select id="padecimientos_mentales" name="padecimientos_mentales" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="obesidad_diagnosticada">Obesidad diagnosticada:</label>
                  <select id="obesidad_diagnosticada" name="obesidad_diagnosticada" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="padecimientos_hematologicos">Padecimientos hematológicos/hemorragicos:</label>
                  <select id="padecimientos_hematologicos" name="padecimientos_hematologicos" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="malformaciones_congenitas">Malformaciones congénitas/síndromes:</label>
                  <select id="padecimientos_hematologicos" name="padecimientos_hematologicos" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="problemas_cardiacos">Problemas cardiacos:</label>
                  <select id="padecimientos_hematologicos" name="padecimientos_hematologicos" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="radioterapia">Radioterapia/Quimioterapia:</label>
                  <select id="radioterapia" name="radioterapia" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="padecimientos_reumatologicos">Padecimientos reumatológicos:</label>
                  <select id="padecimientos_reumatologicos" name="padecimientos_reumatologicos" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="enfermedades_riñon">Enfermedades del riñon:</label>
                  <select id="enfermedades_riñon" name="enfermedades_riñon" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="enfermedades_hepaticas">Enfermedades hepáticas/hepatitis:</label>
                  <select id="enfermedades_hepaticas" name="enfermedades_hepaticas" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="enfermedades_sexuales">Enfermedades de trasmisíon sexual:</label>
                  <select id="enfermedades_sexuales" name="enfermedades_sexuales" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="hipertiroidismo">Hipertiroidismo/Hipotiroidismo:</label>
                  <select id="hipertiroidismo" name="hipertiroidismo" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="enfermedades_aereas">Enfermedades de vías aéreas/asma:</label>
                  <select id="enfermedades_aereas" name="enfermedades_aereas" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="enfermedades_aereas">Problemas oculares:</label>
                  <select id="enfermedades_aereas" name="enfermedades_aereas" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="enfermedades_digestivas">Enfermedades digestivas:</label>
                  <select id="enfermedades_digestivas" name="enfermedades_digestivas" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="tuberculosis">Tuberculosis o vive con persona con esta enfermedad:</label>
                  <select id="tuberculosis" name="tuberculosis" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="enfermedades_piel">Enfermedades de la piel:</label>
                  <select id="enfermedades_piel" name="enfermedades_piel" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

                <div class="form-group">
                  <label for="trasplante_organos">Trasplante de órganos:</label>
                  <select id="trasplante_organos" name="trasplante_organos" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>       
                </div>

              </form>
            </div>


                        <!-- ========================= pestaña 8 datos personales ==================== -->

            <div class="tab-pane" id="tab-8">
              <h2>Antecedentes personales patologicos</h2>
              <form>
                <div class="form-group">
                  <label for="hospitalizacion">¿Has sido hospitalizado?:</label>
                  <select id="hospitalizacion" name="hospitalizacion" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>
                
                <div class="form-group">
                  <label for="motivo_hospitalizacion">Motivo de la hospitalización:</label>
                  <input type="text" class="form-control" placeholder="Motivo d la hospitalización" name="motivo_hospitalizacion">
                </div>

                <div class="form-group">
                  <label for="medicamento_reciente">¿Ha tomado algún medicamento recientemente?:</label>
                  <select id="medicamento_reciente" name="medicamento_reciente" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>

                <div class="form-group">
                  <label for="cual_medicamento">¿Cual?:</label>
                  <input type="text" class="form-control" placeholder="Cual" name="cual_medicamento">
                </div>

                <div class="form-group">
                  <label for="motivo_medicamento">Motivo del medicamento:</label>
                  <input type="text" class="form-control" placeholder="Motivo del medicamento" name="motivo_medicamento">
                </div>

                <div class="form-group">
                  <label for="anestesia_dental">¿Ha tenido algún problema con la anestesia dental o anestesia general?:</label>
                  <select id="anestesia_dental" name="anestesia_dental" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>

                <div class="form-group">
                  <label for="cual_anestesia">¿Cual?:</label>
                  <input type="text" class="form-control" placeholder="Cual" name="cual_anestesia">
                </div>

                <div class="form-group">
                  <label for="embarazo">¿Esta embarazada?:</label>
                  <select id="embarazo" name="embarazo" class="select-custom">
                    <option value="si">Si</option>
                    <option value="no">No</option>
                  </select>
                </div>

                <div class="form-group">
                  <label for="meses_embarazo">Meses de embarazo:</label>
                  <input type="number" class="form-control" placeholder="Meses de embarazo" name="meses_embarazo">
                </div>


               

              </form>
            </div>



            <!-- ========================= pestaña 10 datos personales ==================== -->

            <div class="tab-pane" id="tab-10">
              <table id="miTabla" class="tabla-Bolsas" border="1">
                <tbody>
                  <h1 class="table-title">VESTIBULARES SUPERIORES</h1>
                  <tr>
                    <td>0</td>
                    <td>18</td>
                    <td>17</td>
                    <td>16</td>
                    <td>15</td>
                    <td>14</td>
                    <td>13</td>
                    <td>12</td>
                    <td>11</td>

                    <td>0</td>

                    <td>21</td>
                    <td>22</td>
                    <td>23</td>
                    <td>24</td>
                    <td>25</td>
                    <td>26</td>
                    <td>27</td>
                    <td>28</td>

                  </tr>
                  <tr>

                    <!--
                            VS-D18-> VS significa vestibular superior y D es la primer fila de la tabla y 18 la columna
                        -->

                    <td>D</td>

                    <td id="VS-D18" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D17" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D16" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D15" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D14" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D13" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D12" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D11" contenteditable="true" class="table-cell"></td>

                    <td>D</td>
                    <td id="VS-D21" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D22" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D23" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D24" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D25" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D26" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D27" contenteditable="true" class="table-cell"></td>
                    <td id="VS-D28" contenteditable="true" class="table-cell"></td>


                  </tr>
                  <tr>
                    <td>M</td>

                    <td id="VS-M18" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M17" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M16" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M15" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M14" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M13" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M12" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M11" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="VS-M21" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M22" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M23" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M24" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M25" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M26" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M27" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M28" contenteditable="true" class="table-cell"></td>

                  </tr>
                  <tr>
                    <!--
                            M216-> M2 es la fila M numero 2
                        -->
                    <td>M</td>

                    <td id="VS-M218" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M217" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M216" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M215" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M214" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M213" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M212" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M211" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="VS-M221" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M222" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M223" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M224" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M225" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M226" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M227" contenteditable="true" class="table-cell"></td>
                    <td id="VS-M228" contenteditable="true" class="table-cell"></td>

                  </tr>

                </tbody>

              </table>



              <table id="miTabla" class="tabla-Bolsas" border="1">
                <tbody>
                  <h1 class="table-title">PALATINAS</h1>
                  <tr>
                    <td>0</td>
                    <td>18</td>
                    <td>17</td>
                    <td>16</td>
                    <td>15</td>
                    <td>14</td>
                    <td>13</td>
                    <td>12</td>
                    <td>11</td>

                    <td>0</td>

                    <td>21</td>
                    <td>22</td>
                    <td>23</td>
                    <td>24</td>
                    <td>25</td>
                    <td>26</td>
                    <td>27</td>
                    <td>28</td>

                  </tr>
                  <tr>

                    <!--
                  PL-M18-> PL significa palatinas y M es la segunda fila de la tabla y 18 la columna
              -->

                    <td>D</td>

                    <td id="PL-D18" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D17" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D16" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D15" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D14" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D13" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D12" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D11" contenteditable="true" class="table-cell"></td>

                    <td>D</td>
                    <td id="PL-D21" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D22" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D23" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D24" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D25" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D26" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D27" contenteditable="true" class="table-cell"></td>
                    <td id="PL-D28" contenteditable="true" class="table-cell"></td>


                  </tr>
                  <tr>
                    <td>M</td>

                    <td id="PL-M18" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M17" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M16" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M15" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M14" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M13" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M12" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M11" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="PL-M21" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M22" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M23" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M24" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M25" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M26" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M27" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M28" contenteditable="true" class="table-cell"></td>

                  </tr>
                  <tr>
                    <td>M</td>
                    <!--
                  M216-> M2 es la fila M numero 2
              -->
                    <td id="PL-M218" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M217" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M216" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M215" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M214" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M213" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M212" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M211" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="PL-M221" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M222" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M223" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M224" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M225" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M226" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M227" contenteditable="true" class="table-cell"></td>
                    <td id="PL-M228" contenteditable="true" class="table-cell"></td>

                  </tr>

                </tbody>

              </table>


              <table id="miTabla" class="tabla-Bolsas" border="1">
                <tbody>
                  <h1 class="table-title">INFERIORES</h1>
                  <tr>
                    <td>0</td>
                    <td>18</td>
                    <td>17</td>
                    <td>16</td>
                    <td>15</td>
                    <td>14</td>
                    <td>13</td>
                    <td>12</td>
                    <td>11</td>

                    <td>0</td>

                    <td>21</td>
                    <td>22</td>
                    <td>23</td>
                    <td>24</td>
                    <td>25</td>
                    <td>26</td>
                    <td>27</td>
                    <td>28</td>

                  </tr>
                  <tr>

                    <td>D</td>
                    <!--
                  IN->INFERIORES
                  M216-> M2 es la fila M numero 2
              -->
                    <td id="IN-D18" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D17" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D16" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D15" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D14" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D13" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D12" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D11" contenteditable="true" class="table-cell"></td>

                    <td>D</td>
                    <td id="IN-D21" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D22" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D23" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D24" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D25" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D26" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D27" contenteditable="true" class="table-cell"></td>
                    <td id="IN-D28" contenteditable="true" class="table-cell"></td>


                  </tr>
                  <tr>
                    <td>M</td>

                    <td id="IN-M18" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M17" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M16" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M15" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M14" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M13" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M12" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M11" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="IN-M21" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M22" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M23" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M24" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M25" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M26" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M27" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M28" contenteditable="true" class="table-cell"></td>

                  </tr>
                  <tr>
                    <td>M</td>

                    <td id="IN-M218" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M217" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M216" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M215" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M214" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M213" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M212" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M211" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="IN-M221" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M222" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M223" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M224" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M225" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M226" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M227" contenteditable="true" class="table-cell"></td>
                    <td id="IN-M228" contenteditable="true" class="table-cell"></td>

                  </tr>

                </tbody>

              </table>

              <table id="miTabla" class="tabla-Bolsas" border="1">
                <tbody>
                  <h1 class="table-title">LINGUAJES</h1>
                  <tr>
                    <td>0</td>
                    <td>18</td>
                    <td>17</td>
                    <td>16</td>
                    <td>15</td>
                    <td>14</td>
                    <td>13</td>
                    <td>12</td>
                    <td>11</td>

                    <td>0</td>

                    <td>21</td>
                    <td>22</td>
                    <td>23</td>
                    <td>24</td>
                    <td>25</td>
                    <td>26</td>
                    <td>27</td>
                    <td>28</td>

                  </tr>
                  <tr>
                    <!--
                            LI->LINGUAJES
                            M216-> M2 es la fila M numero 2
                        -->
                    <td>D</td>

                    <td id="LI-D18" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D17" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D16" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D15" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D14" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D13" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D12" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D11" contenteditable="true" class="table-cell"></td>

                    <td>D</td>
                    <td id="LI-D21" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D22" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D23" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D24" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D25" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D26" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D27" contenteditable="true" class="table-cell"></td>
                    <td id="LI-D28" contenteditable="true" class="table-cell"></td>


                  </tr>
                  <tr>
                    <td>M</td>

                    <td id="LI-M18" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M17" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M16" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M15" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M14" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M13" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M12" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M11" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="LI-M21" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M22" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M23" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M24" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M25" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M26" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M27" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M28" contenteditable="true" class="table-cell"></td>

                  </tr>
                  <tr>
                    <td>M</td>

                    <td id="LI-M218" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M217" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M216" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M215" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M214" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M213" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M212" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M211" contenteditable="true" class="table-cell"></td>

                    <td>M</td>
                    <td id="LI-M221" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M222" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M223" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M224" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M225" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M226" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M227" contenteditable="true" class="table-cell"></td>
                    <td id="LI-M228" contenteditable="true" class="table-cell"></td>

                  </tr>

                </tbody>

              </table>





            </div>
          </div>
          <div class="tab-buttons">
            <button class="prev-tab-button" >&lt; Anterior</button>
            <button class="next-tab-button">Siguiente &gt;</button>
          </div>
        </div>

      </div>



      <!-- =========== Scripts =========  -->

      <script src="${pageContext.request.contextPath}/resources/js/scriptPestanas.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/scriptBotonesPestañas.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/scriptMedicionBolsas.js"></script>
      <!-- ====== ionicons ======= -->
      <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
      <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>

</html>