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



