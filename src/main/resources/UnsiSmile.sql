drop database if exists unsis_smile;
create database unsis_smile;
use unsis_smile;



-- ******************************************** ESQUEMAS PARA LOS USUARIOS (LOGUEO) *******************************


-- Tabla tipos de roles
CREATE TABLE roles_tipos_usuario
(
id_rol INT auto_increment PRIMARY KEY,
nombre_rol VARCHAR (50) NOT NULL
);

-- Tabla usuario
CREATE TABLE usuarios
(id_usuario INT auto_increment PRIMARY KEY,
nombre_usuario VARCHAR (20) NOT NULL,
pass_usuario VARCHAR (15) NOT NULL,
f_id_rol int NOT NULL,
estatus boolean default true,
foreign key (f_id_rol) references roles_tipos_usuario(id_rol)
);

-- ************************************ ESQUEMAS PARA LOS GRUPOS **************************************************
create table semestres(
id_semestre int not null auto_increment primary key,
semestre varchar(10)
);

create table grupo(
id_grupos int not null auto_increment primary key,
grupo varchar(10)
);



-- ******************************************** ESQUEMAS DE USUARIOS DE LA APLICACION (usuarios finales)*******************************

-- tablas administradores de clinica
create table administradores(
id_administrador int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
curp varchar (20),
telefono varchar(10),
numero_trabajador varchar(15),
fecha_nacimiento date,
sexo char, -- utilizar un check para validar si es f, m u otro,
email_admin varchar (100) not NULL,
estatus boolean default true,
fk_usuario int,
foreign key (fk_usuario) references usuarios(id_usuario)
);


-- ************************datos de personal de salud***********************************


create table catedraticos(
id_catedratico int not null auto_increment primary key,
nombre varchar(100),
nombre2 varchar(100),
apellido varchar(100),
apellido2 varchar(100),
curp varchar (20),
telefono varchar(10),
sexo char,
fecha_nacimiento date,
numero_trabajador varchar(15),
email_catedratico varchar (100) not NULL,
estatus boolean default true,
fk_id_usuario int not null,
FOREIGN KEY(fk_id_usuario) references usuarios(id_usuario)
);

create table semestre_grupo(
id_semestre_grupo int not null auto_increment primary key,
fk_id_grupo int,
fk_id_semestre int,
FOREIGN KEY(fk_id_grupo) references grupo(id_grupos),
FOREIGN KEY(fk_id_semestre) references semestres(id_semestre)
);


create table catedratico_grupo(
id_catedratico_semestre_grupo int not null auto_increment primary key,
fk_id_catedratico int,
fk_id_semestre_grupo int,
FOREIGN KEY(fk_id_catedratico) references catedraticos(id_catedratico),
FOREIGN KEY(fk_id_semestre_grupo) references semestre_grupo(id_semestre_grupo)
);


create table alumnos(
id_alumno int not null auto_increment primary key,
nombre varchar(100),
nombre2 varchar(100),
apellido varchar(100),
apellido2 varchar(100),
sexo char,
curp varchar (20),
fk_id_semestre_grupo int,
matricula varchar(10),
telefono varchar(10),
email_alumno varchar (100) not NULL,
estatus boolean default true,
f_id_catedratico_responsable int not null,
f_id_usuario int not null,
foreign key(f_id_catedratico_responsable) references catedraticos(id_catedratico),
FOREIGN KEY(f_id_usuario) references usuarios(id_usuario),
FOREIGN KEY(fk_id_semestre_grupo) references semestre_grupo(id_semestre_grupo)
);


-- rol de los alumnos

create table rol_alumno( -- tabla que guarda el rol que puede desempeñar el alumno en una consulta ej: encargado, asistente, etc
id_rol_alumno int not null auto_increment primary key,
rol_alumno varchar(50)
);



-- ************************************* tablas para los datos de la clinica ************************
create table clinica(
id_clinica int not null auto_increment primary key,
nombre_clinica varchar(100),
direccion varchar(100)

);




-- *********************************esquemas para los pacientes**************************************


-- tutores
create table tutor( -- se necesitará de un tutor si se es menor de edad
id_tutor int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
sexo char,
fecha_nacimiento date,
ocupacion varchar(100),
estado_civil varchar(50)
);


-- datos para pacientes
create table paciente(
id_paciente int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
sexo char,
grupo_etnico varchar(50),
ocupacion varchar(80),
fecha_nacimiento date,
domicilio varchar(100),
estado_civil varchar(50),
religion varchar(50),
fecha_ingreso date,
nacionalidad varchar(50),
localidad varchar(100),
estatus boolean default true,
fk_id_tutor int,
FOREIGN KEY(fk_id_tutor) references tutor(id_tutor)
);




create table paciente_alumno(
id_paciente_alumno INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fk_id_paciente int,
fk_id_alumno int,
fk_id_rol_alumno int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente),
FOREIGN KEY(fk_id_alumno) references alumnos(id_alumno),
FOREIGN KEY(fk_id_rol_alumno) references rol_alumno(id_rol_alumno)
);





-- ****************************** Historia clinica general******************************************

create table signos_vitales(
id_signos_vitales int not null auto_increment primary key,
peso double,
estatura double,
temperatura double,
frecuencia_cardiaca double,
frecuencia_respiratoria double,
pesion_arterial double,
saturacion_oxigeno double,
glucosa double,
pulso double
);


create table examen_facial(
id_examen_facial int not null primary key,
perfil text,
frente text,
senias_particulares text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

CREATE TABLE antecedentes_heredofamiliares (
    id_antecedentes_heredofamiliares INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Neoplacia BOOLEAN,
    Neoplacia_rAmplia TEXT,
    diabetes BOOLEAN,
    diabetes_amplio TEXT,
    hipertencion BOOLEAN,
    hipertencion_amplio TEXT,
    padecimientos_mentales_neurologicos BOOLEAN,
    padecimientos_mentales_neurologicos_amplio TEXT,
    obecidad BOOLEAN,
    obecidad_amplio TEXT,
    padecimientos_hematologicos BOOLEAN,
    padecimientos_hematologicos_amplio TEXT,
    malformaciones_congenitas BOOLEAN,
    malformaciones_congenitas_amplio TEXT,
    problemas_cardiacos BOOLEAN,
    problemas_cardiacos_amplio TEXT,
	fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);



create table antecedentes_personales_no_patologicos(
id_antecedentes_personales_no_patologicos int not null primary key, 
come_frutas_verduras boolean,
come_carne boolean,
come_cereales boolean,
come_alimentos_chatarra boolean,
toma_dos_litros_de_agua_x_dia boolean,
uno_mas_refrescos_dia boolean,
horas_duerme_dia int,
baño_veces_x_semana int,
cepillado_x_dia int,
su_vivienda_tiene_piso int,
material_de_vivienda varchar(30),
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table antecedentes_personales_patologicos(
id_antecedentes_personales_patologicos int not null primary key,
tabaquismo boolean,
alcoholismo boolean,
otras_sustancias_psicoactivas_recreativas boolean,
perforaciones boolean, 
tatuajes boolean,
neoplastia boolean,
diabetes boolean,
hipertension_arterial boolean,
pedecimientos_mentales boolean,
obesidad_diagnosticada boolean,
padecimientos_hematologicos boolean,
malformaciones_congenitas_sindromes boolean,
problemas_cardiacos boolean,
radioterapia_quimioterapia boolean,
padecimientos_reumatologicos boolean,
enfermedades_del_rinion boolean,
ets boolean,
hipertiroidismo_hipotiroidismo boolean,
enfermedades_de_vias_aereas boolean,
probleamas_oculares boolean,
enfermedades_digestivas boolean,
tuberculosis boolean,
enfermedades_de_la_piel boolean,
trasplantes_de_organos boolean,
ha_sido_hospitalizado text,
ha_tomado_un_medicamento_recientemente text,
ha_tenido_algun_problema_con_anestesia text,
alergia_medicamento_sustancia text,
embarazo text,
observaciones text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table analisis_funcional(
id_analisis_funcional int not null auto_increment primary key,
Deglución text,
Fonación_masticación text,
Respiración text,
Observaciones text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table postura_del_paciente(
id_postura_del_paciente int not null auto_increment primary key,
atm_palpacion text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

create table examen_bucal(
id_examen_bucal int not null auto_increment primary key,
Relación_molar_Derecha text,
Relación_molar_Izquierda text,
Relación_canina_Derecha text,
Relación_canina_Izquierda text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table analisis_radiografico(
id_analisis_radiografico int not null auto_increment primary key,
Periapical text,
cefalica_lateral text,
Panoramica text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

create table modelos_de_estudio_fotografias(
id_modelos_de_estudio_fotografias int not null auto_increment primary key,
Modelos_de_estudio text,
Tipo_de_arcada text,
Fotografias text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table estudio_de_laboratorio_biopsia(
id_estudio_de_laboratorio_biopsia int not null auto_increment primary key,
tipo_de_estudio text,
tipo_de_biopsia text,
region_de_biopsia text,
región_donde_se_realizó_biopsia text,
laboratorio_donde_se_envia_el_estudio text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table interconsulta_medica(
id_interconsulta_medica int not null auto_increment primary key,
nombre_medico text,
razon text,
motivo_de_diagnostico_presuntivo text,
Motivo_de_envio text,
servicio_al_que_se_envia text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

create table examen_clinico(
id_examen_clinico int not null auto_increment primary key,
Paladar text,
Istmo_fauces text,
Mucosa_yugal text,
Nódulos_linfáticos text,
Lengua text,
Piso_boca text,
Labios text,
Glándulas_salivales text,
Encía text,
Frenillos text,
Saliva text,
Otras_señas_particulares text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


		-- ******esquemas de odontogramas******
        
create table odontograma(
id_odontograma int not null auto_increment primary key,
fk_id_paciente int,
descripcion text,
fecha date,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

create table piezas_dentales( -- tabla que contendra cada una de las piezas dentales representadas por un codigo
id_pieza_dental varchar(2) not null primary key,
nombre varchar(50) -- codigo del diente
);

create table estado_diente( -- tabla que contendra los posibles estados en los que se podria econtrar un diente
id_estado_diente int not null auto_increment primary key,
descripcion varchar(50)
);

create table region_diente( -- tabla que contendra las regiones de la pieza dental 
id_region int not null auto_increment primary key,
descripcion varchar(50)
);

create table diente_detalle( -- tabla que engloba a la pieza dental con todos los detalles de esta
id_diente_detalle int not null auto_increment primary key,
fk_id_pieza_dental varchar(2),
fk_id_estado_diente int,
fk_id_odontograma int,
fk_id_region_diente int,
FOREIGN KEY(fk_id_pieza_dental) references piezas_dentales(id_pieza_dental),
FOREIGN KEY(fk_id_estado_diente) references estado_diente(id_estado_diente),
FOREIGN KEY(fk_id_odontograma) references odontograma(id_odontograma),
FOREIGN KEY(fk_id_region_diente) references region_diente(id_region)
);
	



-- ********************************** Historias clínicas **********************************************************
-- tabla de la historia clinica general con llaves foraneas de sus respectivas regiones
create table historia_clinica_general( 
id int not null auto_increment primary key,
fk_id_signos_vitales int,
fk_id_examen_facial int,
fk_id_antecedentes_heredofamiliares int,
fk_id_antecedentes_personales_no_patologicos int,
fk_id_antecedentes_personales_patologicos int,
fk_id_analisis_funcional int,
fk_id_postura_del_paciente int,
fk_id_examen_bucal int,
fk_id_analisis_radiografico int,
fk_id_modelos_de_estudio_fotografias int,
fk_id_estudio_de_laboratorio_biopsia int,
fk_id_interconsulta_medica int,
fk_id_examen_clinico int,
fk_id_odontograma_inicial int null,
fk_id_odontograma_final int null,
FOREIGN KEY(fk_id_signos_vitales) references signos_vitales(id_signos_vitales),
FOREIGN KEY(fk_id_examen_facial) references examen_facial(id_examen_facial),
FOREIGN KEY(fk_id_antecedentes_heredofamiliares) references antecedentes_heredofamiliares(id_antecedentes_heredofamiliares),
FOREIGN KEY(fk_id_antecedentes_personales_no_patologicos) references antecedentes_personales_no_patologicos(id_antecedentes_personales_no_patologicos),
FOREIGN KEY(fk_id_antecedentes_personales_patologicos) references antecedentes_personales_patologicos(id_antecedentes_personales_patologicos),
FOREIGN KEY(fk_id_analisis_funcional) references analisis_funcional(id_analisis_funcional),
FOREIGN KEY(fk_id_postura_del_paciente) references postura_del_paciente(id_postura_del_paciente),
FOREIGN KEY(fk_id_examen_bucal) references examen_bucal(id_examen_bucal),
FOREIGN KEY(fk_id_analisis_radiografico) references analisis_radiografico(id_analisis_radiografico),
FOREIGN KEY(fk_id_modelos_de_estudio_fotografias) references modelos_de_estudio_fotografias(id_modelos_de_estudio_fotografias),
FOREIGN KEY(fk_id_estudio_de_laboratorio_biopsia) references estudio_de_laboratorio_biopsia(id_estudio_de_laboratorio_biopsia),
FOREIGN KEY(fk_id_interconsulta_medica) references interconsulta_medica(id_interconsulta_medica),
FOREIGN KEY(fk_id_examen_clinico) references examen_clinico(id_examen_clinico),
FOREIGN KEY(fk_id_odontograma_inicial) references odontograma(id_odontograma),
FOREIGN KEY(fk_id_odontograma_final) references odontograma(id_odontograma)
);




-- ********************************** Historia clínica de cirugía bucal **********************************************************

create table antecedentes_personales_familiares(
id_antecedentes_personales_familiares int not null auto_increment primary key,
padecimiento_en_familiar boolean not null,
tipo varchar(50),
padecimiento_cronico boolean,
diabetes boolean,
hipertension boolean,
epilepsia boolean,
cardiopatias boolean,
hemorragias boolean,
alergias text,
enfermedades_infecciosas text
);

create table interrogatorios_por_aparatos_y_sistemas(
id_interrogatorios_por_aparatos_y_sistemas int not null auto_increment primary key,
aparato_cardiovascular text,
aparato_digestivo text,
aparato_renal text,
sistema_nervioso text,
sistema_genital text
);

create table padecimiento_actual(
id_padecimiento_actual int not null auto_increment primary key,
fecha_ultima_consulta_medica date,
motivo_medico text,
fecha_ultima_consulta_dental date,
motivo_dental text,
embarazada boolean,
lactancia boolean,
tipo_sangrado integer,
examen_radiologico text,
tecnicas_de_anestecia text,
instrumental text,
dientes_extraidos text,
estado_del_paciente text
);

-- tabla general sobre la historia clínica de cirugía bucal, en esta 
-- se encontrarán las referencias a las tablas previas para complementar la información

create table historia_clinica_de_cirugia_bucal(
id_historia_clinica_de_cirugia_bucal int not null auto_increment primary key,
numero_de_expediente int not null,
fecha_de_realizacion datetime,

id_ficha_de_identificacion int not null,
id_signos_vitales int not null,
id_antecedentes_personales_familiares int not null,
id_interrogatorios_por_aparatos_y_sistemas int not null,
id_padecimiento_actual int not null,
foreign key (id_ficha_de_identificacion) references paciente(id_paciente),
foreign key (id_signos_vitales) references signos_vitales(id_signos_vitales),
foreign key (id_antecedentes_personales_familiares) references antecedentes_personales_familiares(id_antecedentes_personales_familiares),
foreign key (id_interrogatorios_por_aparatos_y_sistemas) references interrogatorios_por_aparatos_y_sistemas(id_interrogatorios_por_aparatos_y_sistemas),
foreign key (id_padecimiento_actual) references padecimiento_actual(id_padecimiento_actual)
);

-- ********************************** Historia clínica de Odontología preventiva y salud pública **********************************************************

-- tabla de profilaxis
create table profilaxis(
id_profilaxis int not null auto_increment primary key,
    Diente int,
    Codigo int
    );
    
-- tabla de Fluorosis
create table fluorosis(
id_fluorosis int not null auto_increment primary key,
    Diente int,
    Codigo int
    );
    
-- tabla de datos del sellador de fosetas y fisuras que se rellenan con tipo texto
create table sellador_de_fosetas_y_fisuras(
id_sellador int not null auto_increment primary key,
Autorizacion text,
Aislamientos_Relativo text,
Limpieza_de_superficie text,
Grabado text,
Lavados_y_Secado text,
Sellador_de_foseta_y_fisura text,
Terninado text,
observaciones text
);

-- tabla de la historia clinica   de odontología preventiva y salud pública con llaves foraneas de sus respectivas regiones
CREATE TABLE odontologia_preventiva (
    id_odontologia_preventica INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fk_id_paciente INT NOT NULL,
    fk_id_profilaxis INT NOT NULL,
    fk_id_fluorosis INT NOT NULL,
    fk_id_sellador INT NOT NULL,
    fk_id_odontograma INT NOT NULL,
    FOREIGN KEY (fk_id_paciente)
        REFERENCES paciente (id_paciente),
    FOREIGN KEY (fk_id_profilaxis)
        REFERENCES profilaxis (id_profilaxis),
    FOREIGN KEY (fk_id_fluorosis)
        REFERENCES fluorosis (id_fluorosis),
    FOREIGN KEY (fk_id_sellador)
        REFERENCES sellador_de_fosetas_y_fisuras (id_sellador),
    FOREIGN KEY (fk_id_odontograma)
        REFERENCES odontograma (id_odontograma)
);

-- ****************Historia Clínica de Prótesis Bucal****************************

-- Interrogatorio
Create table Interrogatorio(
id_Interrogatorio int not null auto_increment primary key,
Motivo text,
Padecimiento_Actual text,
Salud text,
Ateención_médica boolean,
Tratamiento text,
F_exam_físico date,
Medicina_especial_droga boolean,
Sustancia_y_motivo text,
Medicamento_alergia text,
Reacción_inusual text,
Anestesia_local_compl text,
Detalles_extra text,
Enfermedad_infecciosa text,
Ataques_Epilépticos text,
Detalles_consultaprevia text,
Embarazo boolean,
Mes text
);

-- Examen Paradontal
Create table Exam_Paradontal(
id_Exam_Paradontal int not null auto_increment primary key,
Materia_Alba boolean,
Placa_Bacteriana boolean,
Sarro boolean,
Gingivitis boolean,
Bolsas_Periodontales boolean,
Absceso_Periodontal boolean,
Reabsorción_Ósea boolean,
Movilidad_Dental boolean
);

-- Exploración de la cavidad bucal y anexos;
create table Expl_Bucal(
id_Expl_Bucal int not null auto_increment primary key,
Piso_boca text,
Labios text,
Paladar text,
Lengua text,
Carrillos text,
Proceso_Residual text,
Áreas_Edéntulas text,
Mucosa_Bucal text,
Articulación_Temporomandibular text
);

-- Examen dientes pilares
create table Dientes_pilares(
id_Dientes_pilares int not null auto_increment primary key,
Cariados text,
Ausentes text,
Obturados text,
Extracciones_Indicadas text,
Raíces text,
Amalgamas text,
Resinas text,
Incrustaciones text,
Prótesis_fija text,
Prótesis_Removible text
);

-- Examen radiográfico dientes pilares
create table exm_radio_DP(
id_exm_radio_DP int not null auto_increment primary key,
CP_Normal boolean,
CP_Amplio boolean,
CP_Estrecho boolean,
CP_Nódulos boolean,
CP_Calcificada boolean,
ZA_Periodonto_Norm boolean,
ZA_Periodonto_Ensanchado boolean,
ZA_Reabsorción_Apical boolean,
ZA_Cementosis boolean,
ZA_Osteoesclerosis boolean,
CR_Normal boolean,
CR_Amplio boolean,
CR_Estrecho boolean,
CR_Agujas_Cálcicas boolean,
CR_Calcificado boolean
);

-- Examen de organo dentario
create table Organo_Dentario(
id_Organo_Dentario int not null auto_increment primary key,
Num_de_Conductos int not null,
PC_R_1a3 boolean,
PC_R_1a2 boolean,
PC_R_1a1 boolean,
Reabsorción_I boolean,
Reabsorción_E boolean,
Obturado boolean
);

-- Plan de tratamiento
create table Plan_tratamiento(
id_Plan_tratamiento int not null auto_increment primary key,
Fecha_ini date,
Fecha_fin date,
Observaciones text,
Ctrl_Post_operatorio text
);

create table protesis_bucal(
id_protesis_bucal int not null auto_increment primary key,
fk_paciente int,
fk_sigvital int,
fk_Interrogatorio int,
fk_Exam_Paradontal int,
fk_Expl_Bucal int,
fk_Dientes_pilares int,
fk_exm_radio_DP int,
fk_Organo_Dentario int,
fk_odontograma int,
fk_Plan_tratamiento int,
FOREIGN KEY(fk_paciente) references paciente(id_paciente),
FOREIGN KEY(fk_sigvital) references signos_vitales(id_signos_vitales),
FOREIGN KEY(fk_Interrogatorio) references Interrogatorio(id_Interrogatorio),
FOREIGN KEY(fk_Exam_Paradontal) references Exam_Paradontal(id_Exam_Paradontal),
FOREIGN KEY(fk_Expl_Bucal) references Expl_Bucal(id_Expl_Bucal),
FOREIGN KEY(fk_Dientes_pilares) references Dientes_pilares(id_Dientes_pilares),
FOREIGN KEY(fk_exm_radio_DP) references exm_radio_DP(id_exm_radio_DP),
FOREIGN KEY(fk_Organo_Dentario) references Organo_Dentario(id_Organo_Dentario),
FOREIGN KEY(fk_odontograma) references odontograma(id_odontograma),
FOREIGN KEY(fk_Plan_tratamiento) references Plan_tratamiento(id_Plan_tratamiento)
);

-- *************************  HISTORIA CLÍNICA DE OPERATORIA DENTAL *************************

create table Historia_Clininca (
NO_Expediente int, 
Fecha datetime
);

create table Fecha_Identificacion(
id_Fecha_Identificacion int not null auto_increment primary key,
Nombre_del_Paciente varchar(50),
Direccion varchar(50),
Edad integer not null,
sexo varchar(20), -- char(1)
Estado_Civil varchar(20),
Profesion varchar(30),
Telefono varchar(10),
nombre_del_responsable varchar(50)
);

create table Signos_Vitales(
id_Signos_Vitales int not null auto_increment primary key,
Peso double,
T_A varchar(20),
Pulso double, 
Temperatura double, 
Glucosa double
);

/*
create table Interrogatorio(
id_Interrogatorio int not null auto_increment primary key,
Motivo_de_la_consulta text,
Padecimiento_Actual text,
Goza_de_Buena_salud text,
Está_siendo_atendido_actualmente_por_un_médico text,
mencione_las_razones_de_su_tratamiento text,
Fecha_de_su_último_examen_físico text,
Está_recibiendo_en_este_momento_cualquier_tipo_de_medicación_o_droga text,
Indique_los_nombres_de_los_medicamentos_y_las_razones_por_las_cuales_las_usa text,
Hay_alguna_medicina_que_usted_no_pueda_tomar text,
Usa_usted_marca_paso_cardiaco text,
Alguna_vez_ha_sufrido_una_reacción_inusual_a_una_droga_medicamento text,
Existe_alguna_otra_información_que_deba_ser_conocida_acerca_de_su_salud text,
Acerca_de_sus_consultas_odontológicas_previas text,
En_caso_de_ser_mujer_usted_está_embarazada text,
Mes text
); */

create table Interrogatorio(
id_Interrogatorio int not null auto_increment primary key,
Motivo_consulta text,
Padecimiento_Actual text,
Buena_salud text,
actualmente_es_atendido_por_un_médico text,
razones_de_su_tratamiento text,
Fecha_examen_físico text,
Está_recibiendo_actualmente_medicamentos_o_droga text,
Indique_los_nombres_y_porque_las_usa text,
Alergias_de_alguna_medicina text,
Usa_usted_marca_paso_cardiaco text,
reacción_inusual_a_una_droga_medicamento text,
Otra_información_que_deba_ser_conocida_acerca_de_su_salud text,
Acerca_de_sus_consultas_odontológicas_previas text,
En_caso_de_ser_mujer_usted_está_embarazada text,
Mes text
);

create table Antecedentes_Patologicos(
id_Antecedentes_Patologicos int not null auto_increment primary key,
Alcoholismo boolean,
Alergias boolean,
Anemias boolean,
Artritis boolean,
Asma boolean,
Cáncer boolean,
Dependencia_de_Drogas_o_Narcóticos boolean,
Diabetes boolean,
Enfermedades_Venéreas boolean,
Epilepsia boolean,
Trastorno_del_Riñón_o_Hígado boolean,
SIDA boolean,
Lesiones_en_cabeza_o_cuello boolean,
Migraña boolean,
Problemas_Cardiacos boolean,
Sinusitis boolean,
Trastornos_Metales boolean,
Trastornos_Respiratorios boolean,
Tuberculosis boolean,
Ulceras_del_Estómago boolean,
Fiebre_Reumática boolean,
otras text
);

create table EXPLORACIÓN_DE_LA_CAVIDAD_BUCAL_Y_ANEXOS (
id_EXPLORACIÓN_DE_LA_CAVIDAD_BUCAL_Y_ANEXOS int not null auto_increment primary key,
Tejidos_Blandos text,
Tejidos_Óseos text,
Articulación_Temporomandibular text,
Diagnóstico text,
Estudio_de_Laboratorio_y_Gabinete text,
Indicaciones_de_interconsulta_Médica_u_Odontológica text
);





















-- ******************************************ESQUEMAS DE LAS CONSULTAS **********************************


-- lista de procedimientos o tratamientos que puede realizar la clinica odontologica
create table procedimiento_tipo(
id_procedimiento_tipo int not null auto_increment primary key,
procedimiento varchar(50)
);

create table consulta(
id_consulta int not null auto_increment primary key,
diagnostico text,
pronostico text,
tratamiento text,
manejo_integral text,
motivo_de_la_consulta text,
fecha_de_consulta date,
fk_id_signos_vitales int not null,
fk_id_paciente int not null,
fk_id_clinica int not null,
fk_id_alumno int not null,
fk_id_procedimiento_realizado int not null,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente),
FOREIGN KEY(fk_id_clinica) references clinica(id_clinica),
FOREIGN KEY(fk_id_alumno) references usuarios(id_usuario),
FOREIGN KEY(fk_id_signos_vitales) references signos_vitales(id_signos_vitales),
FOREIGN KEY(fk_id_procedimiento_realizado) references procedimiento_tipo(id_procedimiento_tipo)
);



-- ********************************* LOGS **********************************************************************
create table movimientosUsuarios(
id_movimientos int not null auto_increment primary key,
entidad varchar(30),
id_entidad int,
fecha_de_realizacion datetime,
tipo_movimiento char
);





