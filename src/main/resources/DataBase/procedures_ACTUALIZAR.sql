use unsis_smile;

-- ACTUALIZAR ALUMNOS
DELIMITER $$
DROP PROCEDURE IF EXISTS actualizarAlumno$$
CREATE PROCEDURE actualizarAlumno
(
in id_alumno int,
in nombre varchar(50),
in nombre2 varchar(50),
in apellido varchar(50),
in apellido2 varchar(50),
in sexo char,
in curp varchar(20),
in fk_id_semestre_grupo int,
in matricula varchar(10),
in telefono varchar(10),
in mail varchar(100),
in f_id_catedratico_responsable int
)
BEGIN   
    -- actualizamos al nuevo alumno
	update alumnos set nombre=nombre, nombre2=nombre2,apellido=apellido,apellido2=apellido2,curp=curp,fk_id_semestre_grupo=fk_id_semestre_grupo,matricula=matricula
		,telefono=telefono,email_alumno=mail,estatus=estatus,f_id_catedratico_responsable=f_id_catedratico_responsable
		where id_alumno=id_alumno;
end
$$
DELIMITER ;

-- ACTUALIZAR CATEDRATICOS
DELIMITER $$
DROP PROCEDURE IF EXISTS actualizarCatedraticos$$
CREATE PROCEDURE actualizarCatedraticos
(
  id_catedratico int,
  nombre varchar(50),
  nombre2 varchar(50),
  apellido varchar(50),
  apellido2 varchar(50),
  curp varchar(20),
  telefono varchar(10),
  sexo char,
  fecha_nacimiento date,
  numero_trabajador varchar(15),
  mail varchar(100)
)
BEGIN   
    -- actualizamos al nuevo alumno
	update catedraticos set nombre=nombre,nombre2=nombre2,apellido=apellido,apellido2=apellido2,curp=curp,telefono=telefono,sexo=sexo,
		fecha_nacimiento=fecha_nacimiento,numero_trabajador=numero_trabajador,email_catedratico=mail where id_catedratico=id_catedratico;
end
$$
DELIMITER ;


-- ACTUALIZAR ADMINISTRADORES
delimiter $$
drop procedure if exists actualizarAdministrador$$
create procedure actualizarAdministrador(
  id_admin int,
  nombre1 varchar(50),
  nombre2 varchar(50),
  apellido1 varchar(50),
  apellido2 varchar(50),
  curp varchar(20),
  telefono varchar(10),
  numero_trabajador varchar(15),
  fecha_nacimiento date,
  sexo char,
  mail varchar(100))
begin
    update administradores set nombre1=nombre1,nombre2=nombre2,apellido1=apellido1,apellido2=apellido2,curp=curp,
		telefono=telefono,numero_trabajador=numero_trabajador,fecha_nacimiento=fecha_nacimiento,sexo=sexo,email_admin=mail
        where id_administrador=id_admin;	
end
$$
DELIMITER ;














