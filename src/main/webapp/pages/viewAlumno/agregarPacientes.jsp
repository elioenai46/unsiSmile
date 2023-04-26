<!DOCTYPE html>
<html lang="en">
<head>
    <title>Dynamic Tabs with Bootstrap</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../../resources/css/pestañasPacientes.css">

</head>

<body>
    <div class="container">
        <h2>Agregar Paciente</h2>
        <ul class="nav nav-tabs">
            <li class="active"><a data-toggle="tab" href="#tab1">DATOS PERSONALES</a></li>
            <li><a data-toggle="tab" href="#tab2">SIGNOS VITALES</a></li>
            <li><a data-toggle="tab" href="#tab3">EXAMEN FACIAL</a></li>
            <li><a data-toggle="tab" href="#tab4">ANTECEDENTES HEREDOFAMILIARES</a></li>
            <li><a data-toggle="tab" href="#tab5">ANTECEDENTES PERSONALES NO PATOLOGICOS</a></li>
            <li><a data-toggle="tab" href="#tab6">ANTECEDENTES PERSONALES PATOLOGICOS</a></li>
            <li><a  href="${pageContext.request.contextPath}/pages/viewAlumno/homeAlumno.jsp">ODONTOGRAMA</a></li>


        </ul>
        <div class="tab-content">
            <div id="tab1" class="tab-pane fade in active">
                <div class="container">
                    <h2>Formulario de datos personales</h2>
                    <form>
                        <div class="form-group row">
                            <label for="nombre" class="col-sm-2 col-form-label">Nombre:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="nombre" placeholder="Ingresa tu nombre">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="apellido" class="col-sm-2 col-form-label">Apellido:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="apellido"
                                    placeholder="Ingresa tu apellido">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="email" class="col-sm-2 col-form-label">Edad:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="edad" placeholder="Ingresa tu edad">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Grado escolar:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="grado_escolar"
                                    placeholder="Ingresa tu grado escolar">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Telefono:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="telefono"
                                    placeholder="Ingresa tu número de teléfono">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Domicilio:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="domicilio"
                                    placeholder="Ingresa tu domicilio">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Estado civil:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="estado_civil"
                                    placeholder="Ingresa tu estado_civil">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Religión:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="religion"
                                    placeholder="Ingresa tu religion">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Fecha de ingreso:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="fecha_ingreso"
                                    placeholder="Ingresa fecha ingreso">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Nacionalidad:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="nacionalidad"
                                    placeholder="Ingresa tu nacionalidad">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Localidad:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="localidad"
                                    placeholder="Ingresa tu localidad">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">E-mail:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="e-mail" placeholder="Ingresa tu E-mail">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Motivo de la consulta:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="motivo_consulta"
                                    placeholder="Ingresa el motivo consulta">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Ultima consulta dental:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="ultima_con_dental"
                                    placeholder="Ingresa la ultima consulta dental">
                            </div>
                        </div>

                        <h2>Contesta este apartado si el paciente es menor de 18 años</h2>
                        <br>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Nombre del padre:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="nombre_padre"
                                    placeholder="Ingresa el nombre del padre">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">ocupacion:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="ocupacion_padre"
                                    placeholder="Ingresa su ocupacion">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Nombre de la madre:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="nombre_madre"
                                    placeholder="Ingresa el nombre de la madre">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">ocupacion:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="ocupacion_madre"
                                    placeholder="Ingresa su ocupacion">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Estado civil de los padres:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="estado_civil_padres"
                                    placeholder="Ingresa su estado civil">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Nombre del médico familiar:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="medico_familiar"
                                    placeholder="Ingresa el nombre del medico">
                            </div>
                        </div>
                    </form>
                </div>

                <button type="button" class="btn btn-primary btn-next">Siguiente</button>
            </div>

            <div id="tab2" class="tab-pane fade in active">
                <div class="container">
                    <h2>Formulario de signos vitales</h2>
                    <form>
                        <div class="form-group row">
                            <label for="nombre" class="col-sm-2 col-form-label">Peso:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="peso" placeholder="Ingresa el peso">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="apellido" class="col-sm-2 col-form-label">Estatura:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="estatura"
                                    placeholder="Ingresa la estatura">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="email" class="col-sm-2 col-form-label">Temperatura:</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="temperatura"
                                    placeholder="Ingresa la temperatura">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Frecuencia cardiaca:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="frecuencia_cardiaca"
                                    placeholder="Ingresa la frecuencia cardiaca">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Frecuencia respiratoria:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="frecuencia_respiratoria"
                                    placeholder="Ingresa la frecuencia respiratoria">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Presión arterial:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="presion_arterial"
                                    placeholder="Ingresa la presion arterial">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Saturación de oxigeno:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="Saturacion_oxigeno"
                                    placeholder="Ingresa la saturacion_oxigeno">
                            </div>
                        </div>

                    </form>
                </div>
                <button type="button" class="btn btn-primary btn-back">Anterior</button>
                <button type="button" class="btn btn-primary btn-next">Siguiente</button>
            </div>

            <div id="tab3" class="tab-pane fade">
                <div class="container">
                    <h2>Formulario de examen facial</h2>
                    <form>
                        <div class="form-group row">
                            <label for="nombre" class="col-sm-2 col-form-label">Perfil Recto:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="perfil_recto"
                                    placeholder="Ingresa el perfil recto">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="apellido" class="col-sm-2 col-form-label">Cóncavo:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="concavo" placeholder="Ingresa concavo">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="email" class="col-sm-2 col-form-label">Convexo:</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="convexo" placeholder="Ingresa convexo">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Frente Braquifacial:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="frente_branquifacial"
                                    placeholder="Ingresa frente branquifacial">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Normofacial</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="normofacial"
                                    placeholder="Ingresa normofacial">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Dolicofacial:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="dolicofacial"
                                    placeholder="Ingresa dolicofacial">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Señas particulares:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="senas_particulares"
                                    placeholder="Ingresa las señas particulares">
                            </div>
                        </div>
                    </form>
                </div>
                <button type="button" class="btn btn-primary btn-back">Anterior</button>
                <button type="button" class="btn btn-primary btn-next">Siguiente</button>
            </div>
            <div id="tab4" class="tab-pane fade">
                <div class="container">
                    <h2>Antecedentes heredofamiliares</h2>
                    <form>
                        <label>Neoplasia (Cáncer).</label><br>
                        <input type="radio" name="neoplasia" value="si"> Sí<br>
                        <input type="radio" name="neoplasia" value="no"> No<br><br>

                        <label>Diabetes</label><br>
                        <input type="radio" name="diabetes" value="si"> Sí<br>
                        <input type="radio" name="diabetes" value="no"> No<br><br>

                        <label>Hipertensión Arterial.</label><br>
                        <input type="radio" name="hipertension" value="si"> Sí<br>
                        <input type="radio" name="hipertension" value="no"> No<br><br>

                        <label>Padecimientos mentales/neurológicos.</label><br>
                        <input type="radio" name="pacedimientos_mentales" value="si"> Sí<br>
                        <input type="radio" name="pacedimientos_mentales" value="no"> No<br><br>

                        <label>Obesidad.</label><br>
                        <input type="radio" name="obesidad" value="si"> Sí<br>
                        <input type="radio" name="obesidad" value="no"> No<br><br>

                        <label>Padecimientos hematológicos.</label><br>
                        <input type="radio" name="pacedimientos_hematologicos" value="si"> Sí<br>
                        <input type="radio" name="pacedimientos_hematologicos" value="no"> No<br><br>

                        <label>Malformaciones congénitas.</label><br>
                        <input type="radio" name="malformaciones" value="si"> Sí<br>
                        <input type="radio" name="malformaciones" value="no"> No<br><br>

                        <label>Problemas cardiacos.</label><br>
                        <input type="radio" name="problemas_cardiacos" value="si"> Sí<br>
                        <input type="radio" name="problemas_cardiacos" value="no"> No<br><br>
                    </form>

                </div>
                <button type="button" class="btn btn-primary btn-back">Anterior</button>
                <button type="button" class="btn btn-primary btn-next">Siguiente</button>
            </div>
            <div id="tab5" class="tab-pane fade">
                <div class="container">
                    <h2>Antecedentes personales no patologicos</h2>
                    <form>
                        <label>Come frutas y verduras.</label><br>
                        <input type="radio" name="frutas_verduras" value="si"> Sí<br>
                        <input type="radio" name="frutas_verduras" value="no"> No<br><br>

                        <label>Come carnes (Res, puerco o pollo)</label><br>
                        <input type="radio" name="carnes" value="si"> Sí<br>
                        <input type="radio" name="carnes" value="no"> No<br><br>

                        <label>Come cereales (Pan, Cereal, etc.).</label><br>
                        <input type="radio" name="cereales" value="si"> Sí<br>
                        <input type="radio" name="cereales" value="no"> No<br><br>

                        <label>Come alimentos chatarra (Dulces, botanas, etc.).</label><br>
                        <input type="radio" name="alimentos_chatarra" value="si"> Sí<br>
                        <input type="radio" name="alimentos_chatarra" value="no"> No<br><br>

                        <label>Toma o bebe 2 litros de agua al día</label><br>
                        <input type="radio" name="2litros" value="si"> Sí<br>
                        <input type="radio" name="2litros" value="no"> No<br><br>

                        <label>Toma o bebe uno o más refrescos al día.</label><br>
                        <input type="radio" name="refrescos" value="si"> Sí<br>
                        <input type="radio" name="refrescos" value="no"> No<br><br>

                        <label>Su vivienda tiene piso.</label><br>
                        <input type="radio" name="vivienda_piso" value="si"> Sí<br>
                        <input type="radio" name="vivienda_piso" value="no"> No<br><br>

                        <label>Su vivienda esta hecha de:</label><br>
                        <input type="radio" name="vivienda_materialx" value="si"> Adobe<br>
                        <input type="radio" name="vivienda_materialx" value="no"> Madera<br>
                        <input type="radio" name="vivienda_materialx" value="si"> Lamina<br>
                        <input type="radio" name="vivienda_materialx" value="no"> Otro<br><br>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Horas que duerme al día:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="horas_dormir"
                                    placeholder="Ingresa las horas de sueño">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Cuantas veces a la semana se
                                baña:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="baño" placeholder="Ingresa la cantidad">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Cuantas veces al día cepilla sus
                                dientes:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="cepillado_dientes"
                                    placeholder="Ingresa la cantidad">
                            </div>
                        </div>
                    </form>
                </div>
                <button type="button" class="btn btn-primary btn-back">Back</button>
                <button type="button" class="btn btn-primary btn-next">Siguiente</button>

            </div>
            <div id="tab6" class="tab-pane fade">
                <div class="container">
                    <h2>Antecedentes personales patologicos</h2>
                    <h2>Tiene o ha tenido alguno de los siguientes padecimientos o condiciones</h2>

                    <form>
                        <label>Tabaquismo.</label><br>
                        <input type="radio" name="tabaquismo" value="si">Sí<br>
                        <input type="radio" name="tabaquismo" value="no">No<br><br>

                        <label>Alcoholismo</label><br>
                        <input type="radio" name="alcoholismo" value="si">Sí<br>
                        <input type="radio" name="alcoholismo" value="no">No<br><br>

                        <label>Otras sustancias psicoactivas o recreativas.</label><br>
                        <input type="radio" name="sustancias_psicoactivas" value="si"> Sí<br>
                        <input type="radio" name="sustancias_psicoactivas" value="no"> No<br><br>

                        <label>Perforaciones (Aretes, en mujeres además de los 2 aretes en cada oreja).</label><br>
                        <input type="radio" name="perforaciones" value="si"> Sí<br>
                        <input type="radio" name="perforaciones" value="no"> No<br><br>

                        <label>Tatuajes.</label><br>
                        <input type="radio" name="tatuajes" value="si"> Sí<br>
                        <input type="radio" name="tatuajes" value="no"> No<br><br>

                        <label>Neoplasia (Cáncer).</label><br>
                        <input type="radio" name="neoplasia" value="si"> Sí<br>
                        <input type="radio" name="neoplasia" value="no"> No<br><br>

                        <label>Diabetes.</label><br>
                        <input type="radio" name="diabetes" value="si">Sí<br>
                        <input type="radio" name="diabetes" value="no">No<br><br>

                        <label>Hipertensión Arterial.</label><br>
                        <input type="radio" name="hipertension" value="si">si<br>
                        <input type="radio" name="hipertension" value="no">no<br><br>

                        <label>Padecimientos mentales/convulsiones/desmayos/migraña/neuralgia.</label><br>
                        <input type="radio" name="pacedimientos_mentales" value="si">si<br>
                        <input type="radio" name="pacedimientos_mentales" value="no">no<br><br>

                        <label>Obesidad diagnosticada.</label><br>
                        <input type="radio" name="obesidad diagnosticada" value="si">si<br>
                        <input type="radio" name="obesidad diagnosticada" value="no">no<br><br>

                        <label>Padecimientos hematológicos/hemorrágicos/anemia/leucemia.</label><br>
                        <input type="radio" name="pacedimientos_hematologicos_personales" value="si">si<br>
                        <input type="radio" name="pacedimientos_hematologicos_personales" value="no">no<br><br>

                        <label>Malformaciones congénitas/ Síndromes.</label><br>
                        <input type="radio" name="malformaciones_congenitas" value="si">si<br>
                        <input type="radio" name="malformaciones_congenitas" value="no">no<br><br>

                        <label>Problemas cardiacos/ angina de pecho/ infarto/ tromboembolia/ marcapasos/
                            bypass.</label><br>
                        <input type="radio" name="problemas_cardiacos_personales" value="si">si<br>
                        <input type="radio" name="problemas_cardiacos_personales" value="no">no<br><br>

                        <label>Radioterapia/Quimioterapia.</label><br>
                        <input type="radio" name="radioterapia" value="si">si<br>
                        <input type="radio" name="radioterapia" value="no">no<br><br>

                        <label>Padecimientos reumatológicos/ artritis/ osteoporosis.</label><br>
                        <input type="radio" name="pacedimientos_reumatologicos" value="si">si<br>
                        <input type="radio" name="pacedimientos_reumatologicos" value="no">no<br><br>

                        <label>Enfermedades del riñón.</label><br>
                        <input type="radio" name="enfermedades_rinon" value="si">si<br>
                        <input type="radio" name="enfermedades_rinon" value="no">no<br><br>

                        <label>Enfermedades hepáticas/Hepatitis.</label><br>
                        <input type="radio" name="enfermedades_hepaticas" value="si">si<br>
                        <input type="radio" name="enfermedades_hepaticas" value="no">no<br><br>

                        <label>Enfermedades de transmisión sexual.</label><br>
                        <input type="radio" name="enfermedades_sexuales" value="si">si<br>
                        <input type="radio" name="enfermedades_sexuales" value="no">no<br><br>

                        <label>Hipertiroidismo/Hipotiroidismo.</label><br>
                        <input type="radio" name="hipertiroidismo_personal" value="si">si<br>
                        <input type="radio" name="hipertiroidismo_personal" value="no">no<br><br>

                        <label>Enfermedades de vías aéreas/ asma.</label><br>
                        <input type="radio" name="enfermedades_aereas" value="si">si<br>
                        <input type="radio" name="enfermedades_aereas" value="no">no<br><br>

                        <label>Problemas oculares.</label><br>
                        <input type="radio" name="problemas_oculares" value="si">si<br>
                        <input type="radio" name="problemas_oculares" value="no">no<br><br>

                        <label>Enfermedades digestivas.</label><br>
                        <input type="radio" name="enfermedades_digestivas" value="si">si<br>
                        <input type="radio" name="enfermedades_digestivas" value="no">no<br><br>

                        <label>Tuberculosis o vive con persona(s) con este padecimiento.</label><br>
                        <input type="radio" name="tuberculosis" value="si">si<br>
                        <input type="radio" name="tuberculosis" value="no">no<br><br>

                        <label>Enfermedades de la piel.</label><br>
                        <input type="radio" name="enf_piel" value="si">si<br>
                        <input type="radio" name="enf_piel" value="no">no<br><br>

                        <label>Trasplantes de órganos.</label><br>
                        <input type="radio" name="trasplantes_organos" value="si">si<br>
                        <input type="radio" name="trasplantes_organos" value="no">no<br><br>

                        <h2>Antecedentes personales patologicos</h2>

                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">¿Has sido hospitalizado?(en mujeres
                                también anotar datos de parto)</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="hospitalizado"
                                    placeholder="Ingresa informacion">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">¿Ha tomado algún medicamento
                                recientemente?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="medicamento_reciente"
                                    placeholder="Ingresa la respuesta">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">¿Cuál?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="que_medicamento"
                                    placeholder="Ingresa el nombre del medicamento">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Motivo?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="motivo"
                                    placeholder="Ingresa su respuesta">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">¿Ha tenido algún problema con la
                                anestesia dental o anestesia general?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="anestesia"
                                    placeholder="Ingresa su respuesta">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">¿Cuál?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="que_anestesia"
                                    placeholder="Ingresa su respuesta">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">¿Es alérgico a algún medicamento o
                                sustancia?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="alergia"
                                    placeholder="Ingresa su alergia">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">¿Cuál?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="que_alergia"
                                    placeholder="Ingrese su respuesta">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">(Solo para mujeres) ¿Está
                                embarazada?</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="embarazo"
                                    placeholder="Ingresa la respuesta">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono" class="col-sm-2 col-form-label">Meses de embarazo</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="meses_embarazo"
                                    placeholder="Ingresa los meses">
                            </div>
                        </div>
                    </form>
                </div>
                <button type="button" class="btn btn-primary btn-back">Back</button>
                <button type="button" class="btn btn-primary btn-next">Siguiente</button>

            </div>
            
            
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/resources/js/scriptPestañas.js"></script>
</body>

</html>