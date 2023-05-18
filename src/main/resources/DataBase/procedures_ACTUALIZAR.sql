use unsis_smile;

-- ACTUALIZAR ALUMNOS
DELIMITER $$
DROP PROCEDURE IF EXISTS actualizarAlumno$$
CREATE PROCEDURE actualizarAlumno
(
in id_alumnoAux int,
in nombreAux varchar(50),
in nombre2Aux varchar(50),
in apellidoAux varchar(50),
in apellido2Aux varchar(50),
in sexoAux char,
in curpAux varchar(20),
in fk_id_semestre_grupoAux int,
in matriculaAux varchar(10),
in telefonoAux varchar(10),
in mailAux varchar(100)
)
BEGIN   
    -- actualizamos al nuevo alumno
	update alumnos set nombre=nombreAux, nombre2=nombre2Aux,apellido=apellidoAux,apellido2=apellido2Aux,curp=curpAux,fk_id_semestre_grupo=fk_id_semestre_grupoAux,matricula=matriculaAux
		,telefono=telefonoAux,email_alumno=mailAux
		where id_alumno=id_alumnoAux;
end
$$
DELIMITER ;

-- ACTUALIZAR CATEDRATICOS
DELIMITER $$
DROP PROCEDURE IF EXISTS actualizarCatedraticos$$
CREATE PROCEDURE actualizarCatedraticos
(
  id_catedraticoAux int,
  nombreAux varchar(50),
  nombre2Aux varchar(50),
  apellidoAux varchar(50),
  apellido2Aux varchar(50),
  curpAux varchar(20),
  telefonoAux varchar(10),
  sexoAux char,
  fecha_nacimientoAux date,
  numero_trabajadorAux varchar(15),
  mailAux varchar(100)
)
BEGIN   
    -- actualizamos al nuevo alumno
	update catedraticos set nombre=nombreAux,nombre2=nombre2Aux,apellido=apellidoAux,apellido2=apellido2Aux,curp=curpAux,telefono=telefonoAux,sexo=sexoAux,
		fecha_nacimiento=fecha_nacimientoAux,numero_trabajador=numero_trabajadorAux,email_catedratico=mailAux where id_catedratico=id_catedraticoAux;
end
$$
DELIMITER ;


-- ACTUALIZAR ADMINISTRADORES
delimiter $$
drop procedure if exists actualizarAdministrador$$
create procedure actualizarAdministrador(
  id_adminAux int,
  nombre1Aux varchar(50),
  nombre2Aux varchar(50),
  apellido1Aux varchar(50),
  apellido2Aux varchar(50),
  curpAux varchar(20),
  telefonoAux varchar(10),
  numero_trabajadorAux varchar(15),
  fecha_nacimientoAux date,
  sexoAux char,
  mailAux varchar(100))
begin
    update administradores set nombre1=nombre1Aux,nombre2=nombre2Aux,apellido1=apellido1Aux,apellido2=apellido2Aux,curp=curpAux,
		telefono=telefonoAux,numero_trabajador=numero_trabajadorAux,fecha_nacimiento=fecha_nacimientoAux,sexo=sexoAux,email_admin=mailAux
        where id_administrador=id_adminAux;	
end
$$
DELIMITER ;

